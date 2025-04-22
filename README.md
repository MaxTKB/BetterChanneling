# Better Channeling

**Better Channeling** is a lightweight Fabric mod that enhances the Channeling enchantment by introducing multiple levels with distinct behaviours, while staying as close to vanilla gameplay as possible.

## ✨ Channeling Enchantment Levels:

1. **Channeling I** 
    - Behaves exactly like vanilla: tridents summon lightning **only during thunderstorms**.
2. **Channeling II**
    - Allows lightning strikes **during any rain**, not just thunderstorms.
    - **Rare**: Appears in about **5-6% of all Channeling enchantments** at level 30.
3. **Channeling III**
    - Enables lightning strikes **at any time**, regardless of weather.
    - **Not obtainable via enchanting table**. Can only be acquired by **combining Channeling II** tridents or books using an **anvil**.

## 🛠️ How to Install
1. **Download the mod**
    - Head to the [releases](https://github.com/MaxTKB/BetterChanneling/releases) section of this GitHub repository.
   - Find the version that matches your Minecraft version.
     - Format: `1.0-1.16.1` → Mod version 1.0 for Minecraft 1.16.1
   - Download the `BetterChanneling-<version>.jar` file.
2. **Install Fabric Loader**
    - Download and run the [Fabric installer](https://fabricmc.net/use/installer/).
    - Fabric **API is not required** for this mod.
3. **Install Better Channeling**
   - Place the downloaded `.jar` file into your `mods` folder:
     - `~/.minecraft/mods` (or your instance folder if using a launcher like MultiMC or Prism)
   - If you don’t have a `mods` folder, launch Minecraft with Fabric once to generate it.
4. **Verify Installation**
   - Launch Minecraft with Fabric.
   - In a creative world:
      - Search for "Channeling" in the creative inventory.
      - You should see three enchanted books (Channeling I, II, III).
   - You can also use `/enchant @p channeling 3` to test tridents directly.

## 🧪 Mod Compatibility

- Works in both **single-player** and **multiplayer**.
- When **installed on a Fabric server**, it should function correctly, **even if players do not have the mod installed client-side**.
- However, it is **recommended** that both **client and server have the mod installed** to ensure proper enchantment visibility (e.g., seeing Channeling II and III in creative menus or enchanting tables).
- Does **not** require the Fabric API.
- Should be compatible with **any mod that does not directly modify Trident or Channeling behaviour**.
- If you discover an incompatibility with another mod, please [open an issue](https://github.com/MaxTKB/BetterChanneling/issues) so it can be investigated and resolved if possible.

## 🔄 Uninstalling the Mod

- This mod **should be safe to remove from existing worlds**, uninstalling Better Channeling will **not corrupt** your world or cause issues.
- Any tridents enchanted with Channeling I, II or III will **retain their enchantments**, but will behave like standard **vanilla Channeling** tridents after the mod is removed.
- This makes the mod **safe to add or remove** from modpacks and multiplayer servers without permanent impact.
- If you experience any issues after uninstalling, feel free to [open an issue](https://github.com/MaxTKB/BetterChanneling/issues) so it can be looked into and resolved.

## 📚 About the Mod

This mod uses Mixins to adjust the behaviour of:
- The `TridentEntity` class
- The `ChannelingEnchantment` class

Its goal is to offer a more interesting experience for the Channeling Enchantment without deviating much from the core mechanics of the game.

## 🙌 Special Thanks
Shoutout to the chatter in [Feinberg's](https://www.twitch.tv/feinberg) Twitch chat who originally suggested the idea for this mod, your spark of inspiration made this possible!

Additional thanks to [Nischhelm](https://www.curseforge.com/members/nischhelm/projects) for advice and suggestions about enchantment power.
