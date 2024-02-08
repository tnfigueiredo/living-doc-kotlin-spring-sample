package com.tnfigueiredo.docsample.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinLivingDocumentationSampleApplication

fun main(args: Array<String>) {
	runApplication<KotlinLivingDocumentationSampleApplication>(*args)
}
