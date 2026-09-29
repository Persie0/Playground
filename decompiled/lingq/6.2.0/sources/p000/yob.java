package p000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class yob {

    /* JADX INFO: renamed from: a */
    public static final sla f70177a;

    static {
        sla uobVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            uobVar = new pob();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            uobVar = new uob();
        }
        f70177a = uobVar;
    }
}
