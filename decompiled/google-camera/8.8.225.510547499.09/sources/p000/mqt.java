package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqt {

    /* JADX INFO: renamed from: a */
    public static final msn f41449a;

    static {
        msn mqsVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            mqsVar = new mqr();
        } catch (Throwable th) {
            SystemClock.elapsedRealtime();
            mqsVar = new mqs();
        }
        f41449a = mqsVar;
    }
}
