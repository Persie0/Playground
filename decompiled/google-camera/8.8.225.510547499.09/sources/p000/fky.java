package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fky {

    /* JADX INFO: renamed from: a */
    public volatile boolean f22442a;

    public fky() {
        this.f22442a = false;
    }

    public fky(byte[] bArr) {
    }

    /* JADX INFO: renamed from: d */
    public static fky m8534d() {
        return new fky(null);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m8535a() {
        if (this.f22442a) {
            return 4611686018427387903L;
        }
        return SystemClock.elapsedRealtimeNanos();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8536b() {
        this.f22442a = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m8537c() {
        if (this.f22442a) {
            throw new IllegalStateException("Already released");
        }
    }
}
