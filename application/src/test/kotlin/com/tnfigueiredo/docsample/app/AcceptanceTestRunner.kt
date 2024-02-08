package com.tnfigueiredo.docsample.app

import io.cucumber.junit.CucumberOptions
import io.cucumber.spring.SpringFactory
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith


@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
    features=["classpath:features"],
    objectFactory = SpringFactory::class
)
class AcceptanceTestRunner