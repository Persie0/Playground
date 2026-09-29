package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC3208a;

/* JADX INFO: loaded from: classes.dex */
public final class xq3 extends nn1 implements ca2 {

    /* JADX INFO: renamed from: c */
    public final Handler f68535c;

    /* JADX INFO: renamed from: d */
    public final String f68536d;

    /* JADX INFO: renamed from: e */
    public final boolean f68537e;

    /* JADX INFO: renamed from: f */
    public final xq3 f68538f;

    public xq3(Handler handler, String str, boolean z) {
        this.f68535c = handler;
        this.f68536d = str;
        this.f68537e = z;
        this.f68538f = z ? this : new xq3(handler, str, true);
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: N */
    public final void mo4458N(long j, sm0 sm0Var) {
        RunnableC3470pr runnableC3470pr = new RunnableC3470pr(18, sm0Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f68535c.postDelayed(runnableC3470pr, j)) {
            sm0Var.m21470w(new C3704w(15, this, runnableC3470pr));
        } else {
            m24643g0(sm0Var.f61016e, runnableC3470pr);
        }
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        if (this.f68535c.post(runnable)) {
            return;
        }
        m24643g0(kn1Var, runnable);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: Y */
    public final boolean mo17503Y(kn1 kn1Var) {
        return (this.f68537e && fa4.m11650l(Looper.myLooper(), this.f68535c.getLooper())) ? false : true;
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: Z */
    public final nn1 mo387Z(int i) {
        l70.m15942e(1);
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xq3)) {
            return false;
        }
        xq3 xq3Var = (xq3) obj;
        return xq3Var.f68535c == this.f68535c && xq3Var.f68537e == this.f68537e;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m24643g0(kn1 kn1Var, Runnable runnable) {
        AbstractC3208a.m15436c(kn1Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        v72 v72Var = ph2.f56212a;
        t62.f61909c.mo385T(kn1Var, runnable);
    }

    public final int hashCode() {
        return (this.f68537e ? 1231 : 1237) ^ System.identityHashCode(this.f68535c);
    }

    @Override // p000.nn1
    public final String toString() {
        xq3 xq3Var;
        String str;
        v72 v72Var = ph2.f56212a;
        xq3 xq3Var2 = dp5.f36000a;
        if (this == xq3Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                xq3Var = xq3Var2.f68538f;
            } catch (UnsupportedOperationException unused) {
                xq3Var = null;
            }
            str = this == xq3Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f68536d;
        if (string == null) {
            string = this.f68535c.toString();
        }
        return this.f68537e ? ux5.m22990m(string, ".immediate") : string;
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: x */
    public final ci2 mo4459x(long j, Runnable runnable, kn1 kn1Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f68535c.postDelayed(runnable, j)) {
            return new wq3(0, this, runnable);
        }
        m24643g0(kn1Var, runnable);
        return yl6.f70031a;
    }

    public xq3(Handler handler) {
        this(handler, null, false);
    }
}
