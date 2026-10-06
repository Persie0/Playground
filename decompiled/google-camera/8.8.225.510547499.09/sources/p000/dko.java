package p000;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dko implements hjk, fbp, faq {

    /* JADX INFO: renamed from: a */
    private final dhv f11897a;

    public dko(dhv dhvVar) {
        this.f11897a = dhvVar;
    }

    @Override // p000.faq
    /* JADX INFO: renamed from: b */
    public final void mo5928b() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ExecutorService executorServiceM13824l = jzn.m13824l("leak-checker");
        executorServiceM13824l.execute(new eqd(jElapsedRealtimeNanos, executorServiceM13824l, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhv dhvVar = this.f11897a;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
    }
}
