package com.services.emailService.infra.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSesConfig {
    String accessKey = "xxxxxxxxx";
    String secretKey = "xxxxxxx";


    // Create AWS credentials using access key and secret key
    BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard().withRegion("us-east-2").withCredentials(new AWSStaticCredentialsProvider(awsCredentials) {
        }).build();
    }
}
