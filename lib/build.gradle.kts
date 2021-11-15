plugins {
    `version-catalog`
    `maven-publish`
    signing
}

catalog {
    versionCatalog {
        version("kotlin", "1.5.31")
        version("kotlin-coroutines", "1.5.2")
        version("x-lifecycle", "2.4.0")

        // gradle
        alias("gradle")
            .to("com.android.tools.build:gradle:7.0.2")

        // kotlin
        alias("kotlin")
            .to("org.jetbrains.kotlin", "kotlin-stdlib")
            .versionRef("kotlin")
        alias("kotlin-plugin")
            .to("org.jetbrains.kotlin", "kotlin-gradle-plugin")
            .versionRef("kotlin")
        alias("kotlin-coroutines-core")
            .to("org.jetbrains.kotlinx", "kotlinx-coroutines-core-jvm")
            .versionRef("kotlin-coroutines")
        alias("kotlin-coroutines-android")
            .to("org.jetbrains.kotlinx", "kotlinx-coroutines-android")
            .versionRef("kotlin-coroutines")

        // androidX
        alias("x-annotation")
            .to("androidx.annotation:annotation:1.3.0")
        alias("x-core")
            .to("androidx.core:core:1.7.0")
        alias("x-core-ktx")
            .to("androidx.core:core-ktx:1.7.0")
        alias("x-appcompat")
            .to("androidx.appcompat:appcompat:1.3.1")
        alias("x-lifecycle-common")
            .to("androidx.lifecycle", "lifecycle-common")
            .versionRef("x-lifecycle")
        alias("x-lifecycle-livedata")
            .to("androidx.lifecycle", "lifecycle-livedata")
            .versionRef("x-lifecycle")
        alias("x-lifecycle-viewmodel")
            .to("androidx.lifecycle", "lifecycle-viewmodel")
            .versionRef("x-lifecycle")
        alias("x-activity")
            .to("androidx.activity:activity:1.4.0")
        alias("x-fragment")
            .to("androidx.fragment:fragment:1.3.6")
        alias("x-constraintlayout")
            .to("androidx.constraintlayout:constraintlayout:2.1.1")

        alias("x-junit")
            .to("androidx.test.ext:junit:1.1.2")
        alias("x-espresso-core")
            .to("androidx.test.espresso:espresso-core:3.3.0")

        // test
        alias("junit")
            .to("junit:junit:4.13.2")

        // daemon libraries
        alias("daemon-annotation")
            .to("io.github.daemon369:annotation:0.1.0")
        alias("daemon-infrastructure-application")
            .to("io.github.daemon369:android-infrastructure-application:0.1.1")
        alias("daemon-infrastructure")
            .to("io.github.daemon369:android-infrastructure:0.3.0")
        alias("daemon-view")
            .to("io.github.daemon369:android-view-common:0.3.0")
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
                version = "0.0.4"

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