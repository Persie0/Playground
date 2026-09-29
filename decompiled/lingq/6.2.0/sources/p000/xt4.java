package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final class xt4 {

    /* JADX INFO: renamed from: a */
    public final fl8 f68702a;

    /* JADX INFO: renamed from: b */
    public final kb0 f68703b;

    /* JADX INFO: renamed from: c */
    public final n66 f68704c;

    public xt4(fl8 fl8Var, kb0 kb0Var) {
        this.f68702a = fl8Var;
        this.f68703b = kb0Var;
        long[] jArr = om8.f54590a;
        this.f68704c = new n66();
    }

    /* JADX INFO: renamed from: a */
    public final zi3 m24674a(int i, Object obj, Object obj2) {
        n66 n66Var = this.f68704c;
        wt4 wt4Var = (wt4) n66Var.m17255g(obj);
        int i2 = 10;
        if (wt4Var != null && wt4Var.f67273c == i && fa4.m11650l(wt4Var.f67272b, obj2)) {
            C0282a c0282a = wt4Var.f67274d;
            if (c0282a != null) {
                return c0282a;
            }
            C0282a c0282a2 = new C0282a(818252804, true, new C3794yf(i2, wt4Var.f67275e, wt4Var));
            wt4Var.f67274d = c0282a2;
            return c0282a2;
        }
        wt4 wt4Var2 = new wt4(this, i, obj, obj2);
        n66Var.m17261m(obj, wt4Var2);
        C0282a c0282a3 = wt4Var2.f67274d;
        if (c0282a3 != null) {
            return c0282a3;
        }
        C0282a c0282a4 = new C0282a(818252804, true, new C3794yf(i2, this, wt4Var2));
        wt4Var2.f67274d = c0282a4;
        return c0282a4;
    }

    /* JADX INFO: renamed from: b */
    public final Object m24675b(Object obj) {
        if (obj == null) {
            return null;
        }
        wt4 wt4Var = (wt4) this.f68704c.m17255g(obj);
        if (wt4Var != null) {
            return wt4Var.f67272b;
        }
        yt4 yt4Var = (yt4) this.f68703b.mo0a();
        int iMo15748e = yt4Var.mo15748e(obj);
        if (iMo15748e != -1) {
            return yt4Var.mo16527d(iMo15748e);
        }
        return null;
    }
}
