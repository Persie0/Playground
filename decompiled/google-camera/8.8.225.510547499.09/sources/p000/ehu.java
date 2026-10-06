package p000;

import android.content.Context;
import android.system.ErrnoException;
import android.system.Os;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehu {

    /* JADX INFO: renamed from: b */
    private static final nbh f14103b = nbh.m17259h("com/google/android/apps/camera/hexagon/HexagonLibPathInitializer");

    /* JADX INFO: renamed from: a */
    public final String f14104a;

    public ehu(Context context) {
        jvd.m13538a();
        String str = context.getApplicationInfo().dataDir;
        try {
            Os.setenv("ADSP_LIBRARY_PATH", str + ";/dsp", true);
        } catch (ErrnoException e) {
            ((nbe) ((nbe) f14103b.m17252c()).mo17276G((char) 1482)).mo17293r("Failed to set ADSP_LIBRARY_PATH: %s", e);
        }
        this.f14104a = str;
    }
}
