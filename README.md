# TPSpawn

A lightweight plugin that adds a `/spawn` command with a configurable cooldown and optional teleport sound. Works on Paper, Purpur and Folia.

## Features

- **`/spawn`** teleports players to the world spawn instantly.
- **Cooldown** to prevent spam, with a permission to bypass it.
- **Teleport sound** (enderman warp), off by default.
- **In-game configuration** with `/tpspawn`, with no restart needed.
- **Folia support** using region-aware schedulers.

## Installation

1. Download the latest jar from [Modrinth](https://modrinth.com/plugin/GDhdsO6S) or [GitHub Releases](https://github.com/HoneyBerries/TPSpawn/releases).
2. Drop it into your server's `plugins` folder.
3. Start the server. `plugins/TPspawn/config.yml` is created on first launch.

## Commands

| Command | Description | Permission |
|---|---|---|
| `/spawn` | Teleport to the world spawn | `tpspawn.command.spawn` |
| `/tpspawn reload` | Reload the config | `tpspawn.command.edit` |
| `/tpspawn cooldown <seconds>` | Set the `/spawn` cooldown | `tpspawn.command.edit` |
| `/tpspawn sound <true/false>` | Toggle the teleport sound | `tpspawn.command.edit` |
| `/tpspawn help` | List commands | `tpspawn.command.edit` |

## Permissions

| Permission | Description | Default |
|---|---|---|
| `tpspawn.command.spawn` | Use `/spawn` | everyone |
| `tpspawn.command.edit` | Use `/tpspawn` admin commands | op |
| `tpspawn.cooldown.bypass` | Ignore the cooldown | op |

## Configuration

```yaml
# Seconds between /spawn uses. 0 disables the cooldown.
cooldown: 0

# Play an enderman warp sound on teleport.
teleport-sound: false
```

These can also be changed in-game with `/tpspawn cooldown` and `/tpspawn sound`.

## Compatibility

- **Minecraft:** 26.3+
- **Java:** 25+
- **Platforms:** Paper, Purpur and Folia. Plain Spigot and Bukkit are untested and likely unsupported, since the plugin uses Paper APIs.

## Building

```sh
mvn package
```

The jar is written to `target/`.

## License

[MIT](LICENSE)
