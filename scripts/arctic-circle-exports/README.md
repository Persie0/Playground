# Arctic Circle Theorem – manual 1080p / 4K original-source export

Start the **[manual export workflow](https://github.com/Persie0/Playground/actions/workflows/arctic-circle-original-state-4k.yml)** and select:

| Setting | Choices | Default |
| --- | --- | --- |
| `resolution` | `1080p` (1920×1080), `4k` (3840×2160) | `4k` |
| `fps` | `30` or **`60`** | `30` |
| `source_ref` | Branch or exact SHA from `Persie0/manimVideos` | `main` |
| `crf` | `20` (better/larger), `22`, `24` (smaller) | `22` |

The workflow is **manual only**. It runs entirely on the **public Playground repository** and checks out the private renderer source using `secrets.PRIVATE_REPO_TOKEN || secrets.GH_TOKEN || secrets.GH_RELEASE_TOKEN` (falling back to the workflow token if permitted). No private repository GitHub Actions minutes are consumed.

**Real 60fps:** `shared_engine/render.py --fps 60` renders the original 15 Python scene functions at **1/60-second intervals**. This is **not** an FFmpeg `-r 60` conversion of an already rendered 30fps video and does not copy each old frame twice. 30fps remains supported and the default.

The **440.8-second** paced film contains:

- **30fps:** 13,224 individually calculated frames.
- **60fps:** 26,448 individually calculated frames.
- The same separate 101-cue SRT, original instrumental soundtrack and 15 chapter markers.

All six source-rendering groups use the same commit. The assembly job checks each segment's native pixel dimensions, exact FPS, decoded frame count, merged 13,224/26,448 frame count, AAC audio, chapter and subtitle metadata and fully decodes the complete film before publishing.

Output names are distinct across all four variants:

```text
Arctic_Circle_Original_State_1080p30.mp4
Arctic_Circle_Original_State_1080p60.mp4
Arctic_Circle_Original_State_2160p30.mp4
Arctic_Circle_Original_State_2160p60.mp4
```

The resulting verified files are saved in **Actions → Run → Artifacts** before the release upload. Release tags include resolution, FPS and run number.

GitHub Releases limit individual file sizes to 2 GiB. If a rendered file exceeds that limit (more likely in 4K60), the full MP4 remains available as an Actions artifact; the public release contains `*.mp4.part-000`, `*.mp4.part-001`, etc., plus instructions. Download all parts into one directory and reassemble:

```bash
cat Arctic_Circle_Original_State_2160p60.mp4.part-* > Arctic_Circle_Original_State_2160p60.mp4
sha256sum --check SHA256SUMS.txt
```

Rendering at 4K60 can be significantly more resource-intensive than 1080p30. Scene artwork that was initially rasterized at 720p is not automatically given additional underlying detail by choosing 4K. A 4K60 render is not guaranteed to complete within GitHub runner CPU, memory or time limits.

A short [native 30/60fps smoke test](https://github.com/Persie0/Playground/actions/workflows/arctic-original-60fps-smoke.yml) verifies source-rendered motion and timestamps without generating a full-length film.
