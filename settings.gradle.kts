rootProject.name = "android-version-catalog"
include(":demo")
include(":lib")

dependencyResolutionManagement {
    repositories {
//        mavenLocal()
        mavenCentral()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases/") }
    }
    versionCatalogs {
        create("libs") {
            from("io.github.daemon369:android-version-catalog:1.0.2")
        }
//        create("libs2") {
//            from(files("gradle/libs.versions.toml"))
//        }
    }
}