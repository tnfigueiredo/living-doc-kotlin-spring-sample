package com.tnfigueiredo.docsample.resources

import io.cucumber.junit.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith

@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
    features = ["classpath:features/department"]
)
class DepartmentsResourceTest{

}