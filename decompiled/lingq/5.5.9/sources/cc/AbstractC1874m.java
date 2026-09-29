package cc;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC2737l0;
import p176ib.C6272i;
import p260m8.C7499b;

/* JADX INFO: renamed from: cc.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1874m {

    /* JADX INFO: renamed from: d */
    public static volatile HandlerC2737l0 f9985d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1781b5 f9986a;

    /* JADX INFO: renamed from: b */
    public final RunnableC1865l f9987b;

    /* JADX INFO: renamed from: c */
    public volatile long f9988c;

    public AbstractC1874m(InterfaceC1781b5 interfaceC1781b5) {
        C6272i.m12915i(interfaceC1781b5);
        this.f9986a = interfaceC1781b5;
        this.f9987b = new RunnableC1865l(this, 0, interfaceC1781b5);
    }

    /* JADX INFO: renamed from: a */
    public final void m5745a() {
        this.f9988c = 0L;
        m5747d().removeCallbacks(this.f9987b);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo5591b();

    /* JADX INFO: renamed from: c */
    public final void m5746c(long j10) {
        m5745a();
        if (j10 >= 0) {
            ((C7499b) this.f9986a.mo5514b()).getClass();
            this.f9988c = System.currentTimeMillis();
            if (!m5747d().postDelayed(this.f9987b, j10)) {
                this.f9986a.mo5517e().f9942f.m5624b(Long.valueOf(j10), "Failed to schedule delayed post. time");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Handler m5747d() {
        HandlerC2737l0 handlerC2737l0;
        if (f9985d != null) {
            return f9985d;
        }
        synchronized (AbstractC1874m.class) {
            if (f9985d == null) {
                f9985d = new HandlerC2737l0(this.f9986a.mo5516d().getMainLooper());
            }
            handlerC2737l0 = f9985d;
        }
        return handlerC2737l0;
    }
}
