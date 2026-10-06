package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum idk {
    FLASH_DISABLED(C0100R.string.thermal_flash_disabled_chip_text, false),
    POOR_VIDEO_QUALITY(C0100R.string.thermal_video_quality_chip_text, false),
    RECORDING_EARLY_STOPPED(C0100R.string.thermal_recording_early_stopped_chip_text, false),
    RECORDING_STOPPED(C0100R.string.thermal_recording_stopped_chip_text, false),
    RECORDING_DISABLED(C0100R.string.thermal_recording_disasbled_chip_text, true);


    /* JADX INFO: renamed from: f */
    public final int f30466f;

    /* JADX INFO: renamed from: g */
    public final boolean f30467g;

    idk(int i, boolean z) {
        this.f30466f = i;
        this.f30467g = z;
    }
}
