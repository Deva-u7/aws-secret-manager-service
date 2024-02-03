package com.aws;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class SecretManagerDemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void test(){
		String abc="abcabdabc";

		HashMap<Character, Long> collect = new HashMap<>();
		for(int i=0; i<abc.length();i++){
			if(collect.containsKey(abc.charAt(i))){
              collect.put(abc.charAt(i),collect.get(abc.charAt(i))+1);
			}else collect.put(abc.charAt(i),1L);
		}
		System.out.println(collect.values().size()==collect.values().stream().distinct().count());

	}
}
