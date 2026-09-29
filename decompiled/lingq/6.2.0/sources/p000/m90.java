package p000;

import android.view.animation.Interpolator;
import com.airbnb.lottie.AsyncUpdates;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m90 {

    /* JADX INFO: renamed from: c */
    public final j90 f50798c;

    /* JADX INFO: renamed from: e */
    public p33 f50800e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f50796a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f50797b = false;

    /* JADX INFO: renamed from: d */
    public float f50799d = 0.0f;

    /* JADX INFO: renamed from: f */
    public Object f50801f = null;

    /* JADX INFO: renamed from: g */
    public float f50802g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f50803h = -1.0f;

    public m90(List list) {
        j90 l90Var;
        if (list.isEmpty()) {
            l90Var = new q41(5);
        } else {
            l90Var = list.size() == 1 ? new l90(list) : new k90(list);
        }
        this.f50798c = l90Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m16687a(i90 i90Var) {
        this.f50796a.add(i90Var);
    }

    /* JADX INFO: renamed from: b */
    public final kj4 m16688b() {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        return this.f50798c.mo14349b();
    }

    /* JADX INFO: renamed from: c */
    public float mo16689c() {
        if (this.f50803h == -1.0f) {
            this.f50803h = this.f50798c.mo14351d();
        }
        return this.f50803h;
    }

    /* JADX INFO: renamed from: d */
    public final float m16690d() {
        Interpolator interpolator;
        kj4 kj4VarM16688b = m16688b();
        if (kj4VarM16688b == null || kj4VarM16688b.m15271c() || (interpolator = kj4VarM16688b.f47380d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(m16691e());
    }

    /* JADX INFO: renamed from: e */
    public final float m16691e() {
        if (this.f50797b) {
            return 0.0f;
        }
        kj4 kj4VarM16688b = m16688b();
        if (kj4VarM16688b.m15271c()) {
            return 0.0f;
        }
        return (this.f50799d - kj4VarM16688b.m15270b()) / (kj4VarM16688b.m15269a() - kj4VarM16688b.m15270b());
    }

    /* JADX INFO: renamed from: f */
    public Object mo16692f() {
        float fM16691e = m16691e();
        if (this.f50800e == null && this.f50798c.mo14348a(fM16691e) && !mo3294l()) {
            return this.f50801f;
        }
        kj4 kj4VarM16688b = m16688b();
        Interpolator interpolator = kj4VarM16688b.f47381e;
        Interpolator interpolator2 = kj4VarM16688b.f47382f;
        Object objMo3293g = (interpolator == null || interpolator2 == null) ? mo3293g(kj4VarM16688b, m16690d()) : mo4028h(kj4VarM16688b, fM16691e, interpolator.getInterpolation(fM16691e), interpolator2.getInterpolation(fM16691e));
        this.f50801f = objMo3293g;
        return objMo3293g;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo3293g(kj4 kj4Var, float f);

    /* JADX INFO: renamed from: h */
    public Object mo4028h(kj4 kj4Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: i */
    public void mo16693i() {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f50796a;
            if (i >= arrayList.size()) {
                AsyncUpdates asyncUpdates2 = wk4.f66962a;
                return;
            } else {
                ((i90) arrayList.get(i)).mo9827a();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo16694j(float f) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        j90 j90Var = this.f50798c;
        if (j90Var.isEmpty()) {
            return;
        }
        if (this.f50802g == -1.0f) {
            this.f50802g = j90Var.mo14352e();
        }
        float f2 = this.f50802g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f50802g = j90Var.mo14352e();
            }
            f = this.f50802g;
        } else if (f > mo16689c()) {
            f = mo16689c();
        }
        if (f == this.f50799d) {
            return;
        }
        this.f50799d = f;
        if (j90Var.mo14350c(f)) {
            mo16693i();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16695k(p33 p33Var) {
        p33 p33Var2 = this.f50800e;
        if (p33Var2 != null) {
            p33Var2.getClass();
        }
        this.f50800e = p33Var;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo3294l() {
        return false;
    }
}
