package com.tnfigueiredo.docsample.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableJpaRepositories("com.tnfigueiredo.docsample.domain.ports")
@EnableTransactionManagement
class AppConfiguration {
}