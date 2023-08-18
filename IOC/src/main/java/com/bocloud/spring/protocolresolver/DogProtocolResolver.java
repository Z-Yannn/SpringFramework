package com.bocloud.spring.protocolresolver;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class DogProtocolResolver implements ProtocolResolver {

    public static final String DOG_PATH_PREFIX = "dog:";
    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {
        if (!location.startsWith(DOG_PATH_PREFIX)){
            return null;
        }
        String realPath = location.substring(DOG_PATH_PREFIX.length());
        String classPathLocation = "classpath:resource/" + realPath;
        return resourceLoader.getResource(classPathLocation);
    }
}
