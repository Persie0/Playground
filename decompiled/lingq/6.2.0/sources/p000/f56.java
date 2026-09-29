package p000;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class f56 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final n66 f38435b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f38436c;

    /* JADX INFO: renamed from: d */
    public final o66 f38437d;

    /* JADX INFO: renamed from: e */
    public final n66 f38438e;

    /* JADX INFO: renamed from: f */
    public final sd3 f38439f;

    public f56() {
        super(7);
        this.f38435b = fa4.m11654p();
        this.f38436c = new ArrayList();
        o66 o66Var = pm8.f56484a;
        this.f38437d = new o66();
        this.f38438e = new n66();
        wz2 wz2Var = new wz2(this, 22);
        nc9.m17353e(nc9.f52600a);
        synchronized (nc9.f52602c) {
            nc9.f52607h = u91.m22604V0(nc9.f52607h, wz2Var);
        }
        this.f38439f = new sd3(wz2Var);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: j */
    public final void mo11541j(yv8 yv8Var) {
        this.f38436c.add(new d56(yv8Var));
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: k */
    public final void mo11542k() {
        synchronized (this.f60774a) {
            try {
                ArrayList arrayList = this.f38436c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    e56 e56Var = (e56) arrayList.get(i);
                    if (e56Var instanceof c56) {
                        fa4.m11645g(this.f38435b, ((c56) e56Var).f9585a, ((c56) e56Var).f9586b);
                    } else {
                        if (!(e56Var instanceof d56)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fa4.m11633G(this.f38435b, ((d56) e56Var).f35012a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f38436c.clear();
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: n */
    public final void mo11543n() {
        this.f38439f.mo19438a();
        this.f38436c.clear();
        this.f38438e.m17249a();
        synchronized (this.f60774a) {
            this.f38435b.m17249a();
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: w */
    public final vi3 mo11544w(yv8 yv8Var) {
        n66 n66Var = this.f38438e;
        vi3 h85Var = (vi3) n66Var.m17255g(yv8Var);
        if (h85Var == null) {
            h85Var = new h85(12, this, yv8Var);
            int iM17254f = n66Var.m17254f(yv8Var);
            if (iM17254f < 0) {
                iM17254f = ~iM17254f;
            }
            Object[] objArr = n66Var.f52401c;
            Object obj = objArr[iM17254f];
            n66Var.f52400b[iM17254f] = yv8Var;
            objArr[iM17254f] = h85Var;
        }
        return h85Var;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: y */
    public final void mo11545y(cu0 cu0Var) {
        this.f38438e.m17259k(cu0Var);
        mo11541j(cu0Var);
        mo11542k();
    }
}
