package com.bocloud.spring.annotation.f_typefilter.filter;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;

@FunctionalInterface   // 函数式接口
public interface TypeFilter {
    boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException;
// metadataReader: 通过这个 Reader, 可以读取到正在扫描的类的信息（包括类的信息、类上标注的注解等）
//metadataReaderFactory: 借助这个 Factory, 可以获取到其他类的 Reader 进而获取到那些类的信息
//可以这样理解: 借助 ReaderFactory 可以获取到 Reader, 借助 Reader 可以获取到指定类的信息
}
