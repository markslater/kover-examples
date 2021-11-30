plugins {
    kotlin("jvm") version "1.6.0"
    id("org.jetbrains.kotlinx.kover") version "0.4.4"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter")

    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform {}
}
