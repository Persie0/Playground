package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ksk {

    /* JADX INFO: renamed from: a */
    public static final boolean f37116a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable th) {
            z = false;
        }
        f37116a = z;
    }
}
