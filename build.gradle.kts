plugins {
    id("java-library")
}

group = "net.reed.rumor"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api:2.24.1")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.24.1")

    // Source: https://mvnrepository.com/artifact/io.netty/netty-all
    api("io.netty:netty-all:4.1.108.Final")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}