package p000;

import com.google.googlex.gcam.creativecamera.skysegmentation.SkySegmenterManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsv implements kba {

    /* JADX INFO: renamed from: a */
    private long f44453a;

    public nsv(String str) {
        this.f44453a = SkySegmenterManager.getReservation(str);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        long j = this.f44453a;
        if (j != 0) {
            SkySegmenterManager.releaseReservation(j);
            this.f44453a = 0L;
        }
    }
}
