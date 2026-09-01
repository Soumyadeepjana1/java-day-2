#!/bin/bash

echo "========================================"
echo "   Fixing Code Runner for Antigravity"
echo "========================================"

echo "[1/6] Closing Antigravity..."
pkill -f antigravity 2>/dev/null
pkill -f "Antigravity IDE" 2>/dev/null

sleep 2

echo "[2/6] Backing up settings..."
mkdir -p ~/antigravity-backup

[ -d ~/.config/Antigravity ] && cp -r ~/.config/Antigravity ~/antigravity-backup/
[ -d ~/.config/"Antigravity IDE" ] && cp -r ~/.config/"Antigravity IDE" ~/antigravity-backup/
[ -d ~/.vscode ] && cp -r ~/.vscode ~/antigravity-backup/

echo "[3/6] Removing Code Runner extension..."

rm -rf ~/.vscode/extensions/formulahendry.code-runner*
rm -rf ~/.antigravity/extensions/formulahendry.code-runner*
rm -rf ~/.local/share/antigravity/extensions/formulahendry.code-runner*

echo "[4/6] Clearing cache..."

rm -rf ~/.config/Antigravity/Cache
rm -rf ~/.config/Antigravity/CachedData
rm -rf ~/.config/"Antigravity IDE"/Cache
rm -rf ~/.config/"Antigravity IDE"/CachedData

echo "[5/6] Fixing settings..."

mkdir -p ~/.config/"Antigravity IDE"/User

cat > ~/.config/"Antigravity IDE"/User/settings.json <<EOF
{
    "code-runner.showRunIconInEditorTitleMenu": true,
    "code-runner.showStopIconInEditorTitleMenu": true,
    "code-runner.runInTerminal": true,
    "code-runner.clearPreviousOutput": true,
    "code-runner.saveFileBeforeRun": true
}
EOF

echo "[6/6] Done."

echo ""
echo "========================================"
echo "Finished!"
echo "========================================"
echo ""
echo "Now:"
echo "1. Open Antigravity IDE"
echo "2. Install Code Runner again"
echo "3. Reload Window"
