package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kju {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36309a = 0;

    /* JADX INFO: renamed from: b */
    private static final kpa f36310b = kpa.m14659a();

    /* JADX INFO: renamed from: a */
    public static OutputConfiguration m14397a(kky kkyVar, Surface surface) {
        try {
            OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
            m14398b(kkyVar, outputConfiguration);
            return outputConfiguration;
        } catch (IllegalArgumentException e) {
            Log.w("OutputConfigs", "The illegal argument may be caused by invalid surface.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14398b(kky kkyVar, OutputConfiguration outputConfiguration) {
        if (kkyVar.f36446g) {
            lku.m15614I(true, "Physical camera ids are only available on Android P and greater.");
            outputConfiguration.setPhysicalCameraId(kkyVar.f36445f.f36540a);
        }
        long j = kkyVar.f36447h.f35910l;
        if (j >= 0) {
            boolean z = f36310b.f36763f;
            outputConfiguration.setDynamicRangeProfile(j);
        }
    }
}
