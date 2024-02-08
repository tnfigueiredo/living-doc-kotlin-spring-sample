

buildscript {
    extra.apply {
        set("springBootVersion", "3.2.2")
    }
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:3.2.2")
        classpath("io.spring.gradle:dependency-management-plugin:1.1.4")
    }
}

allprojects {
    group = "com.tnfigueiredo"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
}

subprojects{
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }
}