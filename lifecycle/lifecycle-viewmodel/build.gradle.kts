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
            group("nonJvm") {
                group("native") {
                    group("unix") {
                        withOhosArm64()
                    }
                }
            }
        }
    }

    sourceSets {

        commonMain.dependencies {
            implementation(libs.kotlinx.coroutines.core)
        }

    }
}