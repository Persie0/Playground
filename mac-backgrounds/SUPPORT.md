# Living Desktop — Support

Living Desktop is a menu-bar macOS app that decorates the edges of visible windows and the desktop with small animated scenes.

## Getting started

1. Launch the app and look for the **Living Desktop sparkle icon** in the macOS menu bar.
2. Open **Scenes** to select one of 15 effects. The preview is intentionally static so it does not use unnecessary battery.
3. Use the main switch to pause or resume effects. Open **Settings** to change effect density, placement or energy profile.
4. If you want automatic launch, explicitly enable **Open automatically at login** in Settings.

## Common questions

**I can't see the effects.** Confirm the menu-bar switch is on and at least one of the Desktop or Window placements is enabled. Scenes may be hidden under full-screen apps or when no suitable window edges are visible.

**My Mac is on battery.** Select **Battery saver** in Settings, or turn off effects temporarily. The app follows Reduce Motion and sleep settings.

**I can't find the app in the Dock.** This is expected: Living Desktop runs from the menu bar.

**The music scene doesn't react.** Microphone input is opt-in and may require permission in System Settings → Privacy & Security → Microphone. The visualizer does not read other apps' internal audio.

**A window edge is missing.** Some fullscreen, special, or occluded windows intentionally don't receive overlays. The app uses public window geometry APIs only.

**How do I remove the app?** Quit from its menu-bar panel, disable Launch at Login if enabled, then delete the application from Applications.

## Report a problem

[Create a public support issue](https://github.com/Persie0/Playground/issues/new?title=%5BLiving%20Desktop%5D%20Support) and include your macOS version, Mac type, the selected effect, and steps to reproduce. Never post passwords, private screenshots, audio recordings, or other sensitive personal information in a public issue. If you don't use GitHub, you can access basic help in the app's About tab.

## Privacy

[Read the Living Desktop Privacy Policy](PRIVACY.md).
