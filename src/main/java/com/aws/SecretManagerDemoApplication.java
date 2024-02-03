package com.aws;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWS3Signer;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.AwsRegionProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SecretManagerDemoApplication {
	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SecretManagerDemoApplication.class, args);
	}
}
