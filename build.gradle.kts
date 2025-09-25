plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.jetbrains.compose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.maven.publish) apply false
}

val composeUiVersion: String by properties

allprojects {
    configurations.all {
        resolutionStrategy {
            eachDependency {
                if (requested.group in listOf("org.jetbrains.compose.ui")) {
                    useVersion(composeUiVersion)
                } else if (requested.version == composeUiVersion) {
                    useVersion("1.6.1-KBA-006")
                }
            }
        }
    }
}