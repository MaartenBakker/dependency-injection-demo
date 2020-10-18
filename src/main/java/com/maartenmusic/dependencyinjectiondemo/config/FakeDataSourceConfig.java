package com.maartenmusic.dependencyinjectiondemo.config;

import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class FakeDataSourceConfig {

    @Autowired
    Environment env;

    @Value("${maartenmusic.username}")
    String user;
    @Value("${maartenmusic.password}")
    String password;
    @Value("${maartenmusic.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("USERNAME")); // Env variables override properties file variables
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
}
