import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val arianeGraphQLVersion = "0.0.5"

plugins {
    kotlin("jvm") version "1.5.30"
    application
}

group = "com.arianegraphql"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation("com.arianegraphql:server:$arianeGraphQLVersion")
    //implementation("com.arianegraphql:graphql-ktx:$arianeGraphQLVersion")
    implementation("com.arianegraphql:server-ktor:$arianeGraphQLVersion")
}

tasks.withType<KotlinCompile>{
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("com.arianegraphql.example.ServerKt")
}