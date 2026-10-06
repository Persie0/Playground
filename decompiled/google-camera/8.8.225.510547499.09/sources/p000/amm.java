package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class amm {

    /* JADX INFO: renamed from: a */
    private static Handler f707a;

    /* JADX INFO: renamed from: f */
    public volatile int f711f = 1;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f709d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f710e = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final FutureTask f708c = new aml(this, new bdv(this, 1));

    /* JADX INFO: renamed from: a */
    public abstract Object mo945a();

    /* JADX INFO: renamed from: b */
    public void mo946b(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo947c() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m958d(Object obj) {
        Handler handler;
        synchronized (amm.class) {
            if (f707a == null) {
                f707a = new Handler(Looper.getMainLooper());
            }
            handler = f707a;
        }
        handler.post(new RunnableC0058bd(this, obj, 13));
    }

    /* JADX INFO: renamed from: e */
    final void m959e(Object obj) {
        if (this.f710e.get()) {
            return;
        }
        m958d(obj);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m960f() {
        return this.f709d.get();
    }
}
