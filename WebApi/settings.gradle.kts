rootProject.name = "WebApi"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots")
        }
    }

    versionCatalogs {
        create("libs") {
            from(files("./libs.versions.toml"))
        }
    }
}

include(
    "src",
    "src:domain",
    "src:application",
    "src:infrastructure"
)
