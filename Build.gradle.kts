plugins {
    kotlin("jvm") version "1.9.0"
    application
}

dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.3")
    implementation("io.ktor:ktor-server-websockets:2.3.3")
}

application {
    mainClass.set("MainKt")
}
