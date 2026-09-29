package p258m6;

import android.os.SystemClock;

/* JADX INFO: renamed from: m6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7488h {

    /* JADX INFO: renamed from: a */
    public static final double f41372a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f41373b = 0;

    /* JADX INFO: renamed from: a */
    public static double m14872a(long j10) {
        return (SystemClock.elapsedRealtimeNanos() - j10) * f41372a;
    }
}
