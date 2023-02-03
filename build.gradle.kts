import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

defaultTasks("clean", "test", "aggregate")

plugins {
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.graalvm.buildtools.native") version "0.9.18"
	id("net.serenity-bdd.serenity-gradle-plugin") version "3.5.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
	kotlin("plugin.jpa") version "1.7.22"
}

group = "com.tnfigueiredo"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

buildscript {
	dependencies {
		classpath("net.serenity-bdd:serenity-gradle-plugin:3.5.0")
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.flywaydb:flyway-core")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("net.serenity-bdd:serenity-core:3.6.0")
	testImplementation("net.serenity-bdd:serenity-cucumber:3.6.0")
	testImplementation("org.junit.vintage:junit-vintage-engine:5.9.2")
	testImplementation("org.seleniumhq.selenium:selenium-api:4.1.3")
	testImplementation("io.cucumber:cucumber-spring:7.11.0")
	testImplementation("com.h2database:h2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
	testLogging.showStandardStreams = true
	finalizedBy("aggregate")
}