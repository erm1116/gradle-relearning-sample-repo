repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "2.0.0"
}

dependencies {
    implementation("org.apache.commons:commons-text:1.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}