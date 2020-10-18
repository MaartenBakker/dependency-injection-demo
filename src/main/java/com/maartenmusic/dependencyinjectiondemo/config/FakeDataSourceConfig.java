package com.maartenmusic.dependencyinjectiondemo.config;

import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class FakeDataSourceConfig {

    @Value("${maartenmusic.username}")
    String user;
    @Value("${maartenmusic.password}")
    String password;
    @Value("${maartenmusic.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }
}
