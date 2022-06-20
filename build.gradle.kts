import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("io.kotest.multiplatform") version "5.0.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.3.1") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.3.1") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property-jvm:5.3.1") // for kotest property test
}

//tasks.test {
//    useJUnitPlatform()
//}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}