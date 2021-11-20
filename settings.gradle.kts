rootProject.name = "android-version-catalog"
include(":demo")
include(":lib")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
//        mavenLocal()
        mavenCentral()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases/") }
    }
    versionCatalogs {
        create("libs") {
            from("io.github.daemon369:android-version-catalog:0.0.5")
        }
//        create("libs2") {
//            from(files("gradle/libs.versions.toml"))
//        }
    }
}