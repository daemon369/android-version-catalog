plugins {
    `version-catalog`
    `maven-publish`
    signing
}

catalog {
    versionCatalog {
        version("kotlin", "1.6.10")
        version("kotlin-coroutines", "1.6.0")
        version("x-lifecycle", "2.4.1")
        version("x-room", "2.4.2")

        // gradle
        library(
            "gradle",
            "com.android.tools.build:gradle:7.1.2"
        )

        // kotlin
        library(
            "kotlin",
            "org.jetbrains.kotlin",
            "kotlin-stdlib"
        ).versionRef("kotlin")
        library(
            "kotlin-plugin",
            "org.jetbrains.kotlin",
            "kotlin-gradle-plugin"
        ).versionRef("kotlin")
        library(
            "kotlin-coroutines-core",
            "org.jetbrains.kotlinx",
            "kotlinx-coroutines-core-jvm"
        ).versionRef("kotlin-coroutines")
        library(
            "kotlin-coroutines-android",
            "org.jetbrains.kotlinx",
            "kotlinx-coroutines-android"
        ).versionRef("kotlin-coroutines")

        // androidX
        library(
            "x-annotation",
            "androidx.annotation:annotation:1.3.0"
        )
        library(
            "x-core",
            "androidx.core:core:1.7.0"
        )
        library(
            "x-core-ktx",
            "androidx.core:core-ktx:1.7.0"
        )
        library(
            "x-appcompat",
            "androidx.appcompat:appcompat:1.4.1"
        )
        library(
            "x-lifecycle-common",
            "androidx.lifecycle",
            "lifecycle-common"
        ).versionRef("x-lifecycle")
        library(
            "x-lifecycle-livedata",
            "androidx.lifecycle",
            "lifecycle-livedata"
        ).versionRef("x-lifecycle")
        library(
            "x-lifecycle-livedata-ktx",
            "androidx.lifecycle",
            "lifecycle-livedata-ktx"
        ).versionRef("x-lifecycle")
        library(
            "x-lifecycle-viewmodel",
            "androidx.lifecycle",
            "lifecycle-viewmodel"
        ).versionRef("x-lifecycle")
        library(
            "x-lifecycle-viewmodel-ktx",
            "androidx.lifecycle",
            "lifecycle-viewmodel-ktx"
        ).versionRef("x-lifecycle")
        library(
            "x-activity",
            "androidx.activity:activity:1.4.0"
        )
        library(
            "x-activity-ktx",
            "androidx.activity:activity-ktx:1.4.0"
        )
        library(
            "x-fragment",
            "androidx.fragment:fragment:1.4.1"
        )
        library(
            "x-fragment-ktx",
            "androidx.fragment:fragment-ktx:1.4.1"
        )
        library(
            "x-room-runtime",
            "androidx.room",
            "room-runtime"
        ).versionRef("x-room")
        library(
            "x-room-compiler",
            "androidx.room",
            "room-compiler"
        ).versionRef("x-room")
        library(
            "x-constraintlayout",
            "androidx.constraintlayout:constraintlayout:2.1.3"
        )
        library(
            "x-recyclerview",
            "androidx.recyclerview:recyclerview:1.2.1"
        )

        library(
            "x-junit",
            "androidx.test.ext:junit:1.1.2"
        )
        library(
            "x-espresso-core",
            "androidx.test.espresso:espresso-core:3.3.0"
        )

        // test
        library(
            "junit",
            "junit:junit:4.13.2"
        )

        // daemon libraries
        library(
            "daemon-annotation",
            "io.github.daemon369:annotation:0.1.0"
        )
        library(
            "daemon-infrastructure-application",
            "io.github.daemon369:android-infrastructure-application:1.1.0"
        )
        library(
            "daemon-infrastructure",
            "io.github.daemon369:android-infrastructure:0.3.0"
        )
        library(
            "daemon-view",
            "io.github.daemon369:android-view-common:0.3.0"
        )
        library(
            "daemon-logger-api",
            "io.github.daemon369:logger-api:0.0.2"
        )
        library(
            "daemon-logger",
            "io.github.daemon369:android-logger:0.0.2"
        )
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
                version = "1.0.0"

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
