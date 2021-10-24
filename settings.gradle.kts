rootProject.name = "gradle-dependency-version-catalog"
include(":demo")
include(":lib")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("kt") {
            from(files("gradle/kotlin.versions.toml"))
        }
    }
}