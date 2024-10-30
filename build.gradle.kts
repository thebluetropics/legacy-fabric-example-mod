plugins {
  id("fabric-loom") version "1.8-SNAPSHOT"
  id("legacy-looming") version "1.8-SNAPSHOT"
}

val minecraftVersion = properties["minecraft_version"] as String

base {
  archivesName = "${properties["artifact_name"].toString()}-legacy-fabric-${minecraftVersion}"
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(8)
  }
}

loom { /* ... */ }

legacyLooming { /* ... */ }

dependencies {
  minecraft("com.mojang:minecraft:${minecraftVersion}")
  mappings("net.legacyfabric:yarn:${properties["mappings_version"].toString()}:v2")
  modImplementation("net.fabricmc:fabric-loader:${properties["fabric_loader_version"].toString()}")
  modImplementation("net.legacyfabric.legacy-fabric-api:legacy-fabric-api:${properties["legacy_fabric_api_version"].toString()}")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8

  withSourcesJar()
}
