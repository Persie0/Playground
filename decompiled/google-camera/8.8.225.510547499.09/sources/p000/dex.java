package p000;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dex {

    /* JADX INFO: renamed from: a */
    public static final dew f10752a = new dew() { // from class: deu
        @Override // p000.dew
        /* JADX INFO: renamed from: a */
        public final void mo6027a(Long l) {
        }
    };

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f10755d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f10756e;

    /* JADX INFO: renamed from: c */
    public dew f10754c = f10752a;

    /* JADX INFO: renamed from: b */
    public final HashMap f10753b = new HashMap();

    public dex(ScheduledExecutorService scheduledExecutorService) {
        this.f10756e = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: b */
    public static final void m6028b(ScheduledFuture scheduledFuture) {
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6029a(long j) {
        lku.m15657k(this.f10754c != f10752a);
        if (this.f10755d == null) {
            this.f10755d = this.f10756e.scheduleAtFixedRate(new czx(this, 20), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        this.f10753b.put(Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
