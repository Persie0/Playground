package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksl implements ksi {
    @Override // p000.ksi
    /* JADX INFO: renamed from: a */
    public final long mo14815a() {
        return System.currentTimeMillis();
    }

    @Override // p000.ksi
    /* JADX INFO: renamed from: b */
    public final long mo14816b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.ksi
    /* JADX INFO: renamed from: c */
    public final long mo14817c() {
        return ksk.f37116a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }
}
