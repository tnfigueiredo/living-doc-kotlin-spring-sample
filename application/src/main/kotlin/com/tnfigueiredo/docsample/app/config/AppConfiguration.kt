package com.tnfigueiredo.docsample.app.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableJpaRepositories("com.tnfigueiredo.docsample.adapters.dataprovider")
@EntityScan("com.tnfigueiredo.docsample.adapters.entities")
@ComponentScan(basePackages = ["com.tnfigueiredo.docsample.*"])
@EnableTransactionManagement
class AppConfiguration {
}