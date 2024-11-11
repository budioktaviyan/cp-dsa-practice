plugins {
  kotlin("jvm") version "1.9.24"
}

group = "id.kotlin.exercise"
version = "0.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}