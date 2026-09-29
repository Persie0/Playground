package p000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lmd {

    /* JADX INFO: renamed from: a */
    public static final kmd f49848a;

    static {
        kmd kmdVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            kmdVar = new kmd(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            kmdVar = new kmd(1);
        }
        f49848a = kmdVar;
    }
}
