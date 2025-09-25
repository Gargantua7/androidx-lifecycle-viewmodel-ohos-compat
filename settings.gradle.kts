enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        maven(url = "https://mirrors.tencent.com/nexus/repository/maven-tencent")
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven(url = "https://mirrors.tencent.com/nexus/repository/maven-tencent")
        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "androidx-lifecycle"
include(":lifecycle:lifecycle-viewmodel")
include(":lifecycle:lifecycle-viewmodel-compose")