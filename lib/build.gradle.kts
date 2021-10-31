plugins {
    `version-catalog`
    `maven-publish`
    signing
}

catalog {
    versionCatalog {
        version("kotlin-std", "1.5.31")
        version("kotlin-coroutines", "1.5.1")

        alias("kotlin-std")
            .to("org.jetbrains.kotlin", "kotlin-stdlib")
            .versionRef("kotlin-std")
        alias("kotlin-plugin")
            .to("org.jetbrains.kotlin", "kotlin-gradle-plugin")
            .versionRef("kotlin-std")
        alias("kotlin-coroutines")
            .to("org.jetbrains.kotlinx", "kotlinx-coroutines-android")
            .versionRef("kotlin-coroutines")
    }
}

afterEvaluate {
    publishing {
        publications {
            repositories {
                maven {
                    url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")

                    credentials {
                        username = rootProject.ext["ossrhUsername"]?.toString()
                        password = rootProject.ext["ossrhPassword"]?.toString()
                    }
                }
            }

            create<MavenPublication>("maven") {
                groupId = "me.daemon"
                artifactId = "android-version-catalog"
                version = "0.0.1"


                from(components["versionCatalog"])
            }
        }
    }
}

ext["signing.keyId"] = rootProject.ext["signing.keyId"]
ext["signing.password"] = rootProject.ext["signing.password"]
ext["signing.secretKeyRingFile"] = rootProject.ext["signing.secretKeyRingFile"]

signing {
    sign(publishing.publications)
}