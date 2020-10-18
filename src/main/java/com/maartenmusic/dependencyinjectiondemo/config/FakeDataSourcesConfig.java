package com.maartenmusic.dependencyinjectiondemo.config;

import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeDataSource;
import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})

public class FakeDataSourcesConfig {

    @Autowired
    Environment env;

    @Value("${maartenmusic.username}")
    String user;
    @Value("${maartenmusic.password}")
    String password;
    @Value("${maartenmusic.dburl}")
    String url;

    @Value("${maartenmusic.jms.username}")
    String jmsUser;
    @Value("${maartenmusic.jms.password}")
    String jmsPassword;
    @Value("${maartenmusic.jms.dburl}")
    String jmsUrl;



    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("USERNAME")); // Env variables override properties file variables
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }
}
