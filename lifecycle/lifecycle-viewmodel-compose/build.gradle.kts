plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.maven.publish)
}

kotlin {
    ohosArm64()

    applyDefaultHierarchyTemplate {

        common {
            group("nonAndroid") {
                group("native") {
                    withOhosArm64()
                }
            }
        }
    }

    sourceSets {

        commonMain.dependencies {

            implementation(compose.runtime)
            implementation(compose.ui)
        }

    }
}

mavenPublishing {
    coordinates("org.jetbrains.androidx.lifecycle", "lifecycle-viewmodel-compose", "2.9.4-KBA-001")

    pom {
        name = "Lifecycle Runtime Compose"
        description = "Compose integration with Lifecycle"
        inceptionYear = "2020"
        url = "https://github.com/JetBrains/compose-jb"

        licenses {
            license {
                name = "The Apache Software License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0"
                distribution = "repo"
            }
        }

        developers {
            developer {
                name = "Compose Multiplatform Team"
                organization = "JetBrains"
                organizationUrl = "https://www.jetbrains.com"
            }

            developer {
                id = "Gargantua7"
                url = "https://github.com/Gargantua7"
                email = "gargantua7@qq.com"
            }
        }

        scm {
            url = "https://github.com/JetBrains/compose-jb"
            connection = "scm:git:https://github.com/JetBrains/compose-jb.git"
            developerConnection = "scm:git:https://github.com/JetBrains/compose-jb.git"
        }
    }
}