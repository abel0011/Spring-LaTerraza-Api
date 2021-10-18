package com.idat.laterraza.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "file")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileStorageProperties {
    private String uploadDir;


}
    
