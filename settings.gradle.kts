pluginManagement {
  repositories {
    maven {
      name = "Fabric"
      url = uri("https://maven.fabricmc.net/")
    }
    maven {
      name = "legacy-fabric"
      url = uri("https://repo.legacyfabric.net/repository/legacyfabric/")
    }
    gradlePluginPortal()
  }
}
