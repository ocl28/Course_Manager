plugins {
    id("java")
    id("org.openjfx.javafxplugin") version "0.0.8"
}

javafx {
    version = "17"
    modules("javafx.controls", "javafx.fxml", "javafx.graphics", "javafx.base")
}

group = "ocl28"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.openjfx:javafx-controls:17")
    implementation("org.openjfx:javafx-fxml:17")
    implementation("org.openjfx:javafx-graphics:17")
    implementation("org.openjfx:javafx-base:17")

    // JUnit dependencies
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

