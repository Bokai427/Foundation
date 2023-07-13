<a href="https://bit.ly/3GHdIQI">
  <img src="https://i.imgur.com/AeprAug.jpg" />
</a>

[![](https://jitpack.io/v/kangarko/Foundation.svg)](https://jitpack.io/#kangarko/Foundation)
[![](https://javadoc.jitpack.io/v/kangarko/Foundation.svg)](https://javadoc.jitpack.io/#kangarko/Foundation)

Foundation enables people develop Minecraft plugins faster, saving boilerplate code and so that you can focus on what matters the most, putting your ideas into reality.

Some features include:

- GUI menu APIs
- Compatibility wrappers: Example: Send title/animations/packets on multiple MC versions with a single call
- Advanced command system without the need of editing plugin.yml
- Localization support
- Third party hooks: Packets, Discord, Citizens, Towny, etc.
- Auto-updating configuration with comments support
- Time-saving wrappers: Databases (flatfile SQL, HikariCP, MySQL), holograms API, custom items and skulls API, and so much more! 

Thousands of servers are running on Foundation since 2013. It has been battle tested and proven in plugins ChatControl, Boss, CoreArena, Confiscate, AutoPlay, Puncher, Winter, AnimeX and others.

# Quick Start

1. Import Foundation using Maven/Gradle (see the Importing section).
2. Change "**extends JavaPlugin**" to "**extends SimplePlugin**" (we need that to register things and listeners on our end automatically)
3. Change **onEnable()** to **onPluginStart()** and **onDisable()** to **onPluginStop()** (we occupy these methods to perform logic)
4. If you use a **static getInstance()** method in your main plugin's class, change it to return **(T) SimplePlugin.getInstance()** where T is your plugin instead. Delete the instance of your plugin from your class if you use it (if you have myPlugin = this anywhere, remove it).

For a sample plugin, see [PluginTemplate](https://github.com/kangarko/plugintemplate).

A complete tutorial on how to use this library is a part of our Project Orion training available [here](https://mineacademy.org/project-orion)

## Importing

We use JitPack to automatically compile and host the latest release of Foundation for you.

### a) Method 1 - (Recommended) JitPack:

To install Foundation with Maven, open your pom.xml, locate the `<repositories>` section and place this repository within it:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

Then locate the `<dependencies>` section of your pom.xml and place the following inside of it. Replace the "REPLACE_WITH_LATEST_VERSION" string with the latest version from: https://github.com/kangarko/Foundation/releases

```xml
<dependency>
    <groupId>com.github.kangarko</groupId>
    <artifactId>Foundation</artifactId>
    <version>REPLACE_WITH_LATEST_VERSION</version>
</dependency>
```

For more information, including how to use Foundation with other tools than Maven, please visit: https://jitpack.io/#kangarko/Foundation/

### b) Method 2 - Downloading to disk:

This is great if you want to make changes to Foundation to suit your needs. After you downloaded and compiled Foundation (run maven "clean install" goal), do not place any repository to your pom.xml file, instead, only place the following dependency. Notice the groupId is different. You can use the LATEST keyword to automatically synchronize changes you make to your local copy of Foundation with your plugin source code.

```xml
<dependency>
    <groupId>org.mineacademy</groupId>
    <artifactId>Foundation</artifactId>
    <version>LATEST</version>
</dependency>
```

# Compatibility

We aim to provide broad compatibility layer enabling the below Minecraft versions to work:

- 1.2.5 (from 2012) - Limited, see mineacademy.org/oldmcsupport for setup instructions.
- 1.3.2, 1.4.7, 1.5.2, 1.6.4 - Many APIs are missing due to lack of features/access.
- 1.7.10
- 1.8.8
- 1.9.x, 1.10.x, 1.11.x, 1.12.x
- 1.13.x, 1.14.x, 1.15.x, 1.16.x, 1.17.x, 1.18.x, 1.19.x, 1.20.x
- We continously update for newer versions but sometimes forget to update it here, but it does not mean that the library is incompatible!
