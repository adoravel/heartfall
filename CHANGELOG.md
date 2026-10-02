# Changelog

All notable changes to this project will be documented in this file. See [conventional commits](https://www.conventionalcommits.org/) for commit guidelines.

---
## [0.4.1](%%%repo_url%%%/compare/0.4.0..v0.4.1) - 2026-10-02

### Chores



- update `CHANGELOG.md` - ([6489845](%%%repo_url%%%/commit/6489845eaaf81338309c452682c2c00bd61a92ea)) - lívia
- oopsie - ([4c5e3e6](%%%repo_url%%%/commit/4c5e3e68fa38e8f2ce5caba3a44057a7afea148a)) - lívia
- bump Gradle wrapper to 9.8.0 - ([bed2cb1](%%%repo_url%%%/commit/bed2cb12e106bdef8b3ab915e4d4f65fc41446b9)) - lívia

### Features



- add Minecraft 26.3 targets - ([a7c3a98](%%%repo_url%%%/commit/a7c3a9892e07b249df19565887faeb2d57149bc2)) - lívia

### Fixes



- only hostile mobs drop heart shards - ([8a84e93](%%%repo_url%%%/commit/8a84e93f6b748700001c9aeea478e61ca542d74e)) - lívia

### Other



- bump dep versions - ([5c52619](%%%repo_url%%%/commit/5c52619a5a809a9781213fc51ed1624cac5942c6)) - lívia
- derive Minecraft version range from Stonecutter targets - ([6dcd267](%%%repo_url%%%/commit/6dcd2671d3faa4d865e706fff8dde03986bac49e)) - lívia
- drop fletching-table, stonecutter-postprocess and KSP - ([288a38c](%%%repo_url%%%/commit/288a38c22482379ea2249d9fff3b3cbcd17c4dea)) - lívia




## Contributors

- lívia
---
## [0.4.0](%%%repo_url%%%/compare/0.3.1..v0.4.0) - 2026-09-08

### Chores



- bump version to `0.4.0` - ([539085d](%%%repo_url%%%/commit/539085de0aacf101f903773e80cb020005896136)) - lívia
- update git links to codeberg - ([2e5cdc6](%%%repo_url%%%/commit/2e5cdc6d1c4a5da8a3800b282a6627989c6a3790)) - lívia

### Features


- **(stonecutter)** add 1.21.1 version support for both fabric and neoforge - ([2300556](%%%repo_url%%%/commit/2300556a6370d8e4c4b62fa84fa9bb30a321fcec)) - lívia

- **(drops)** add creative player drop chance and improve spawn logic - ([2981704](%%%repo_url%%%/commit/2981704f2807a0b23bac6f6988bcad1623c49a14)) - lívia

- **(assets)** add heart shard item model and textures - ([9f81fe4](%%%repo_url%%%/commit/9f81fe4774ccb2d40648f006983d3be3ae8ca76c)) - lívia

- **(registry)** add item registry with platform-specific implementations - ([6feb570](%%%repo_url%%%/commit/6feb570e305fb255303f348e2f1c6ff4831e9bb2)) - lívia

- **(sounds)** add pickup sound - ([f1a2fa0](%%%repo_url%%%/commit/f1a2fa0b6fb0605731c36924d0cff7b6eb847814)) - lívia

- **(registry)** add sound registry with platform-specific implementations - ([0c4ae83](%%%repo_url%%%/commit/0c4ae83e3d42fdefe2a323e6a6863f1b4f721a61)) - lívia

- **(sounds)** improve sound effects with better pitch and volume - ([51a7994](%%%repo_url%%%/commit/51a7994b5f32e28237d6f1ae502d34e46f9b586f)) - lívia


- add logger and improve `Identifier` compatibility across versions - ([125af26](%%%repo_url%%%/commit/125af26b8c9fd40d950c1a07199f064eb8fd372b)) - lívia

### Fixes


- **(neoforge)** add version-specific dist check for 1.21.1 compatibility - ([f42f68d](%%%repo_url%%%/commit/f42f68d1a07df569d0769fdb5a18000522b98bcb)) - lívia

- **(registry)** add version-specific entity type building for 1.21.1 - ([f16b8d2](%%%repo_url%%%/commit/f16b8d20d3a315e77803853b44b75f2b4e8b325f)) - lívia

- **(renderer)** add version-specific render state for 1.21.1 compatibility - ([c9912ec](%%%repo_url%%%/commit/c9912ec5662dc301a17b6b3c66f62deddb1c8328)) - lívia

- **(entity)** improve ground collision - ([fcbcef4](%%%repo_url%%%/commit/fcbcef45313a95f5dc1c9bb6b336589b98516756)) - lívia

- **(fabric)** register items and sounds in fabric entrypoint - ([8bec362](%%%repo_url%%%/commit/8bec362e03e27bb21fae30c7ef37bb3d2f3719c9)) - lívia



### Other



- update gradle to 9.7.1 - ([dfe16a7](%%%repo_url%%%/commit/dfe16a7f08f37e6a3745ba278b44a75f61c58dff)) - lívia
- add support for Minecraft 26.2 - ([cf84877](%%%repo_url%%%/commit/cf848779461dbbd8e8c2ee3cb8f4bf250e65a8c1)) - lívia

### Performance


- **(build)** enable gradle caching and increase memory allocation - ([1563803](%%%repo_url%%%/commit/1563803395b8886e974ed403ea377ca096635ec9)) - lívia



### Refactoring


- **(config)** extract default values to constants for better maintainability - ([dfb40fc](%%%repo_url%%%/commit/dfb40fc15c09729c81ab4184d7b80cf7f1245e9e)) - lívia

- **(physics)** improve smooth attraction behaviour - ([403d77a](%%%repo_url%%%/commit/403d77abde85ba6725cdec1217fb1dfce5f12545)) - lívia

- **(build)** use configured minecraft version ranges instead of hardcoded values - ([0876117](%%%repo_url%%%/commit/08761171800a2e5515fe34d07836c4b1355b5350)) - lívia

- **(renderer)** use fabric API entity renderer registry for compatibility - ([4638c04](%%%repo_url%%%/commit/4638c04550906d21fb728b40f59352587341e2a5)) - lívia

- **(renderer)** use item stack rendering instead of custom plane geometry - ([08d523e](%%%repo_url%%%/commit/08d523e0b137b85207d7877276be2091239d6b3a)) - lívia






## Contributors

- lívia
---
## [0.3.1](%%%repo_url%%%/compare/0.3.0..0.3.1) - 2026-06-11

### Fixes



- parchment neoforge dependency - ([64049aa](%%%repo_url%%%/commit/64049aaf9f4b029d653856ffd8f176595616f90b)) - Lívia
- commit descriptions - ([28dcc56](%%%repo_url%%%/commit/28dcc566d1c8ffc3bd7b82e67ed080fc5c54a764)) - Lívia

### Other



- parchment neoforge dependency - ([64049aa](%%%repo_url%%%/commit/64049aaf9f4b029d653856ffd8f176595616f90b)) - Lívia




## Contributors

- Lívia
---
## [0.3.0] - 2026-06-11

### Chores



- version bump - ([4b61fb2](%%%repo_url%%%/commit/4b61fb2bcbd7daa15a02e5ded01078f711d742a9)) - Lívia
- migrate build system to stonecutter and refactor CI/CD - ([61fe5af](%%%repo_url%%%/commit/61fe5af15de255e2c0f2f9a18b51718a9e7868b9)) - Lívia
- remove old architectury multi-project structure - ([d0dd87e](%%%repo_url%%%/commit/d0dd87e01688157f83aa21caf2f03921ff447234)) - Lívia
- branding - ([66e46e0](%%%repo_url%%%/commit/66e46e00496ac3b68d0dd7e78427c92dd703e912)) - Lívia

### Documentation



- changelog™ - ([f5ad728](%%%repo_url%%%/commit/f5ad728e0c735f697c722858037ec8d05188bef3)) - Lívia

### Features



- smoother heart animation - ([c5adbfe](%%%repo_url%%%/commit/c5adbfe1e70f346b0a16729070afb0e10321cdd9)) - Lívia
- more satisfying spawn sound - ([dd603cf](%%%repo_url%%%/commit/dd603cff3be5f33fb28486a79b814b19c07c92a7)) - Lívia
- scale drop chance inversely with killer's health - ([447c178](%%%repo_url%%%/commit/447c1784ccc8fd27f89d1dfc6bc2b8f94ef044d0)) - Lívia
- integrate YetAnotherConfigLib (YACL) for mod configuration - ([05e1a8b](%%%repo_url%%%/commit/05e1a8bc92d4763f3f0926626b95f4601a456ebe)) - Lívia

### Fixes



- pickup animation flickering - ([ea56982](%%%repo_url%%%/commit/ea5698236d9b5b577eeb62528721973bf6c0548f)) - Lívia
- correct neoforge package name - ([3eb6452](%%%repo_url%%%/commit/3eb64524527204dbf825a62dc456361a87bcbc77)) - Lívia
- remove red tint by switching to `itemTranslucent` render type - ([d40f5c8](%%%repo_url%%%/commit/d40f5c8a01d0c99847d32bda14e2f2429c405b94)) - Lívia

### Other



- initial commit - ([5297628](%%%repo_url%%%/commit/529762888e1660bf3e164bdbeb4d9a1f8a9824e9)) - Lívia
- migrate to loom-no-remap 1.14, NeoForge 26.1.2, Gradle 9.5.1, Java 25 - ([6a7a930](%%%repo_url%%%/commit/6a7a930b04d728289d506c6896ce7ac699fb3de4)) - Lívia
- update mod metadata and dependency ranges for 26.1 - ([302b099](%%%repo_url%%%/commit/302b099f91b1474d21aefc7a05506e21e6f2b2d1)) - Lívia
- add stonecutter platform buildscripts - ([bb89d4b](%%%repo_url%%%/commit/bb89d4b02ba076ff8f95c5c471e8204b059f7597)) - Lívia
- dumb girl award - ([fb75c93](%%%repo_url%%%/commit/fb75c933e6d502bae633f4fc7231caa96eb86b3f)) - Lívia
- add `workflow_dispatch` for manual releases - ([3f1fee8](%%%repo_url%%%/commit/3f1fee8c04adecab3c07455d730954037e933962)) - Lívia

### Refactoring



- 26.1 API changes - ([b0a2f58](%%%repo_url%%%/commit/b0a2f586e654efafcec74d8d2286238a31c9e6f6)) - Lívia
- come up with a proper structure insteaad of whatever this was before - ([74fe7b0](%%%repo_url%%%/commit/74fe7b0da695963d83bd0014ee377c8f65a84aff)) - Lívia
- restructure client renderers - ([9156cec](%%%repo_url%%%/commit/9156cec133d5c3c440011d55a50ccf8c1fda3527)) - Lívia
- platform-agnostic initialisation entrypoints - ([b31d8e1](%%%repo_url%%%/commit/b31d8e17b245176de5fcff13181b6314317337c7)) - Lívia
- stonecutter-aware registries and config - ([998e471](%%%repo_url%%%/commit/998e471158ac7c615ec3dfe1517c7f1e6c8d227f)) - Lívia
- multi-version rendering - ([dc10a15](%%%repo_url%%%/commit/dc10a157e2279d0f199334bc2602b0be1420d742)) - Lívia




## Contributors

- Lívia

<!-- generated by git-cliff -->
