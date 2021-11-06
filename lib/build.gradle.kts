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
                groupId = "io.github.daemon369"
                artifactId = "android-version-catalog"
                version = "0.0.1"

                from(components["versionCatalog"])

                pom {
                    name.set("android-version-catalog")
                    description.set("Android gradle version catalog")
                    url.set("https://github.com/daemon369/gradle-dependency-version-catalog")
                    licenses {
                        license {
                            name.set("The Apache Software License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("daemon")
                            name.set("Daemon")
                            email.set("daemon336699@gmail.com")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/daemon369/gradle-dependency-version-catalog.git")
                        developerConnection.set("scm:git:ssh://github.com/daemon369/gradle-dependency-version-catalog.git")
                        url.set("https://github.com/daemon369/gradle-dependency-version-catalog/tree/main")
                    }
                }
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