rootProject.name = "gradle-dependency-version-catalog"
include(":demo")
enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("androidX") {
            alias("core").to("androidx.core:core:1.6.0")
        }
    }
}