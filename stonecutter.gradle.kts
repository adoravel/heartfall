@file:OptIn(dev.kikugie.stonecutter.StonecutterExperimentalAPI::class)

plugins {
	alias(libs.plugins.stonecutter)
	alias(libs.plugins.dotenv)
	alias(libs.plugins.neoforged.moddev).apply(false)
	alias(libs.plugins.mod.publish.plugin).apply(false)
	alias(libs.plugins.kotlin.jvm).apply(false)
	alias(libs.plugins.legacyforge.moddev).apply(false)
}

stonecutter active file(".version")

tasks.register("runActiveClient") {
	group = "stonecutter"
	description = "Run client of the active Stonecutter version"
	dependsOn(stonecutter.active!!.project + ":runClient")
}

tasks.register("runActiveServer") {
	group = "stonecutter"
	description = "Run server of the active Stonecutter version"
	dependsOn(stonecutter.active!!.project + ":runServer")
}

stonecutter parameters {
	constants.match(current.project.substringAfterLast('-'), "fabric", "neoforge")
	swaps["mod_version"] = "\"${properties.get("mod.version")}\";"
	swaps["mod_id"] = "\"${properties.get("mod.id")}\";"
	swaps["mod_name"] = "\"${properties.get("mod.name")}\";"
	swaps["mod_group"] = "\"${properties.get("mod.group")}\";"
	swaps["minecraft"] = "\"${current.version}\";"
	constants["release"] = true
}

for (version in stonecutter.versions.map { it.version }.distinct())
	tasks.register("publish$version") {
		description = "Publishes $version"
		group = "publishing"
		dependsOn(stonecutter.tasks.named("publishMods") { metadata.version == version })
	}
