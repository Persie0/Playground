#!/usr/bin/env python3
from pathlib import Path

workflow = Path('.github/workflows/toiletcompass-monthly-databases.yml').read_text(encoding='utf-8')

required = [
    "cron: '17 3 1 * *'",
    'workflow_dispatch:',
    'Persie0/toiletcompass',
    'Persie0/toilets',
    'release/countries/*.db',
    'release/continents/*.db',
    'manifest.json',
    'SHA256SUMS',
    'AS.db',
    'BQ.db',
    'BH.db',
    'ID.db',
    'IE.db',
    'MY.db',
    'africa.db',
    'antarctica.db',
    'asia.db',
    'australia-oceania.db',
    'central-america.db',
    'europe.db',
    'north-america.db',
    'south-america.db',
    'repos/Persie0/toilets/releases/latest',
]
for needle in required:
    assert needle in workflow, f'missing workflow contract: {needle}'

for forbidden in [
    'Persie0/OnnxModels',
    'toilets-latest',
    "contains(github.event.head_commit.message, '[full-db]')",
]:
    assert forbidden not in workflow, f'forbidden workflow behavior remains: {forbidden}'

# Full publication must be gated only by schedule or explicit manual full_build.
full_block = workflow.split('- name: Decide full build', 1)[1].split('- name:', 1)[0]
assert 'github.event_name' in full_block and 'schedule' in full_block
assert 'workflow_dispatch' in full_block and 'inputs.full_build' in full_block
assert 'push' not in full_block

# Release collision checks must protect both private and public repositories.
collision_block = workflow.split('- name: Choose collision-safe release version', 1)[1].split('- name:', 1)[0]
assert 'Persie0/toiletcompass' in collision_block
assert 'Persie0/toilets' in collision_block

print('ToiletCompass monthly workflow contract OK')
