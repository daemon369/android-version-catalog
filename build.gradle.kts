buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
//        classpath(libs.gradle)
        classpath(libs.kotlin.plugin)
        classpath("com.android.tools.build:gradle:7.1.1")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

ext["ossrhUsername"] = ""
ext["ossrhPassword"] = ""
ext["sonatypeStagingProfileId"] = ""
ext["signing.keyId"] = ""
ext["signing.password"] = ""
ext["signing.secretKeyRingFile"] = ""

val secretPropsFile = file("local.properties")
if (secretPropsFile.exists()) {
    val p: java.util.Properties = java.util.Properties()
    val i = java.io.FileInputStream(secretPropsFile)
    p.load(i)
    p.forEach { name, value ->
        println("[$name]->[$value]")
        ext[name.toString()] = value
    }
}