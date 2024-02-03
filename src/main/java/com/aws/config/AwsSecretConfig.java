package com.aws.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.fasterxml.jackson.databind.ObjectMapper;;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;
import java.util.logging.Logger;


@Configuration
public class AwsSecretConfig implements EnvironmentPostProcessor {
    Logger log = Logger.getLogger(this.getClass().getName());
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment env, SpringApplication application) {
        try{
                    String secretName = env.getProperty("aws.secret");
                    String region = env.getProperty("aws.region");
                    if(secretName!= null){
                    AWSSecretsManager client = AWSSecretsManagerClientBuilder
                                               .standard()
                                               .withRegion(region)
                                               .build();
                    GetSecretValueRequest req = new GetSecretValueRequest();
                    req.setSecretId(secretName);

                    String secretValue = client.getSecretValue(req).getSecretString();
                    Map values = new ObjectMapper().readValue(secretValue, Map.class);
                    env.getPropertySources().addFirst(new MapPropertySource("secrets-" + secretName, values));
                    log.info("In postProcessEnvironment class  ");
                    client.shutdown();
                }
        } catch ( Exception e){
            throw  new RuntimeException("Eror while getting the secrets from aws ."+e.getMessage());
        }
    }
}

