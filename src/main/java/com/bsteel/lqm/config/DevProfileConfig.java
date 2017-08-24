package com.bsteel.lqm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by luoliyan on 2017/8/22.
 */
@Configuration
public class DevProfileConfig {

    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public String dataSource() {
        return null;
    }

    @Bean
    @Profile("prod")
    public String jndiDataSource() {
        return null;
    }


}
