import org.gradle.api.artifacts.VersionCatalogsExtension

allprojects {
    group = "dev.senadev.msbank"
    version = "0.1.0-SNAPSHOT"
}

subprojects {
    repositories {
        mavenCentral()
    }

    val catalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

    dependencies {
        "testImplementation"(platform(catalog.findLibrary("junit-bom").get()))
        "testImplementation"(catalog.findLibrary("junit-jupiter").get())
        "testRuntimeOnly"(catalog.findLibrary("junit-platform-launcher").get())
        "testImplementation"(catalog.findLibrary("assertj-core").get())
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
