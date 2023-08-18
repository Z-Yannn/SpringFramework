package com.bocloud.spring.protocolresolver;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ProtocolResolverApplication {
    public static void main(String[] args) throws IOException {
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        DogProtocolResolver dogProtocolResolver = new DogProtocolResolver();
        defaultResourceLoader.addProtocolResolver(dogProtocolResolver);

        Resource resource = defaultResourceLoader.getResource("dog:Dog.txt");
        InputStream inputStream = resource.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String readLine;
        while ((readLine = bufferedReader.readLine()) != null){
            System.out.println(readLine);
        }
        bufferedReader.close();

    }
}
