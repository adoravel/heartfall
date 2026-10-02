plugins {
	id("mod-platform")
}

platform {
	loader = "fabric"
	dependencies {
		required("minecraft") {
			versionRange(project.minecraftVersionRange())
		}
		required("fabric-entity-events-v1") {
			slug(modrinth = "fabric-api")
		}
		required("fabricloader") {
			requires atLeast configured("fabric-loader")
		}
		required("yet_another_config_lib_v3") {
			slug("yacl") atLeast "3.8"
		}
		optional("modmenu") {}
	}
}

loom {
	runs.named("client") {
		client()
		generateRunConfig.set(true)
	}
	runs.named("server") {
		server()
		generateRunConfig.set(true)
	}
}

repositories {
	mavenCentral()
	strictMaven("https://maven.terraformersmc.com/", "com.terraformersmc") { name = "TerraformersMC" }
	strictMaven("https://api.modrinth.com/maven", "maven.modrinth") { name = "Modrinth" }
	maven("https://maven.isxander.dev/releases") { name = "Xander Maven" }
}

dependencies {
	modImplementation("com.terraformersmc:modmenu:${versions.fabric.modMenu}")
	modImplementation("dev.isxander:yet-another-config-lib:${versions.yacl}")
	modImplementation(fabricApi.module("fabric-entity-events-v1", versions.fabric.api))
	modImplementation(fabricApi.module("fabric-rendering-v1", versions.fabric.api))
}
