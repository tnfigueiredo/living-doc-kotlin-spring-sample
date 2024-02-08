import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

defaultTasks("clean", "test", "aggregate")

plugins {
	id("org.graalvm.buildtools.native") version "0.9.18"
	id("net.serenity-bdd.serenity-gradle-plugin") version "4.0.14"
	kotlin("jvm") version "1.9.22"
	kotlin("plugin.spring") version "1.9.22"
	kotlin("plugin.jpa") version "1.9.22"
}

dependencies {
	implementation(project(":adapters"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.flywaydb:flyway-core")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("net.serenity-bdd:serenity-core:4.0.21")
	testImplementation("net.serenity-bdd:serenity-cucumber:4.0.21")
	testImplementation("net.serenity-bdd:serenity-junit5:4.0.21")
	testImplementation("net.serenity-bdd:serenity-spring:4.0.21")
	testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
	testImplementation("io.cucumber:cucumber-spring:7.14.0")
	testImplementation("com.h2database:h2")
}

tasks.withType<Test> {
	useJUnitPlatform()
	testLogging.showStandardStreams = true
	finalizedBy("aggregate")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}