rootProject.name = "gradle-dependency-version-catalog"
include(":demo")
include(":lib")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("kotlin") {
            from(files("gradle/kotlin.versions.toml"))
        }

        create("androidX") {
            version("core", "1.6.0")
            version("lifecycle", "2.3.1")

            alias("core").to("androidx.core:core:1.6.0")
            alias("core.ktx").to("androidx.core", "core-ktx").versionRef("core")

            bundle("core.ktx", listOf("core", "core.ktx"))
        }
    }
}