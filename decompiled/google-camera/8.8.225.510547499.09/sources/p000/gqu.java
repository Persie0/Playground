package p000;

import android.os.PowerManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqu {

    /* JADX INFO: renamed from: a */
    private final PowerManager f26088a;

    /* JADX INFO: renamed from: b */
    private final String f26089b = "ProcessingService";

    /* JADX INFO: renamed from: c */
    private final long f26090c;

    /* JADX INFO: renamed from: d */
    private PowerManager.WakeLock f26091d;

    public gqu(PowerManager powerManager, long j) {
        this.f26088a = powerManager;
        this.f26090c = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9654a(String str) {
        PowerManager.WakeLock wakeLockNewWakeLock = this.f26088a.newWakeLock(1, this.f26089b + ":" + str);
        wakeLockNewWakeLock.acquire(this.f26090c);
        PowerManager.WakeLock wakeLock = this.f26091d;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.f26091d = wakeLockNewWakeLock;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9655b() {
        PowerManager.WakeLock wakeLock = this.f26091d;
        if (wakeLock != null) {
            wakeLock.release();
            this.f26091d = null;
        }
    }
}
