package p000;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n9b extends q90 {

    /* JADX INFO: renamed from: h */
    public final HashMap f52524h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f52525i;

    /* JADX INFO: renamed from: j */
    public u52 f52526j;

    /* JADX INFO: renamed from: k */
    public final q90 f52527k;

    public n9b(q90 q90Var) {
        this.f52527k = q90Var;
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: e */
    public final void mo17291e() {
        for (gf1 gf1Var : this.f52524h.values()) {
            gf1Var.f40694a.m19799d(gf1Var.f40695b);
        }
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: g */
    public final void mo17292g() {
        for (gf1 gf1Var : this.f52524h.values()) {
            gf1Var.f40694a.m19800f(gf1Var.f40695b);
        }
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: h */
    public final z0a mo17293h() {
        return this.f52527k.mo17293h();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: i */
    public final pu5 mo16937i() {
        return this.f52527k.mo16937i();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: j */
    public final boolean mo17294j() {
        return this.f52527k.mo17294j();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: k */
    public void mo16938k() {
        Iterator it = this.f52524h.values().iterator();
        while (it.hasNext()) {
            ((gf1) it.next()).f40694a.mo16938k();
        }
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: m */
    public final void mo16939m(u52 u52Var) {
        this.f52526j = u52Var;
        this.f52525i = uma.m22816k(null);
        mo17298x();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: q */
    public void mo16941q() {
        HashMap map = this.f52524h;
        for (gf1 gf1Var : map.values()) {
            q90 q90Var = gf1Var.f40694a;
            ff1 ff1Var = gf1Var.f40696c;
            q90Var.m19803p(gf1Var.f40695b);
            q90Var.m19805s(ff1Var);
            q90Var.m19804r(ff1Var);
        }
        map.clear();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: t */
    public void mo16942t(pu5 pu5Var) {
        this.f52527k.mo16942t(pu5Var);
    }

    /* JADX INFO: renamed from: u */
    public jv5 mo17295u(jv5 jv5Var) {
        return jv5Var;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo17296v(z0a z0aVar);

    /* JADX INFO: renamed from: w */
    public final void m17297w() {
        HashMap map = this.f52524h;
        bna.m3969q(!map.containsKey(null));
        ef1 ef1Var = new ef1(this, 0);
        ff1 ff1Var = new ff1(this);
        q90 q90Var = this.f52527k;
        map.put(null, new gf1(q90Var, ef1Var, ff1Var));
        Handler handler = this.f52525i;
        handler.getClass();
        q90Var.m19798b(handler, ff1Var);
        Handler handler2 = this.f52525i;
        handler2.getClass();
        q90Var.m19797a(handler2, ff1Var);
        u52 u52Var = this.f52526j;
        xb7 xb7Var = this.f57438g;
        xb7Var.getClass();
        q90Var.m19801l(ef1Var, u52Var, xb7Var);
        if (this.f57433b.isEmpty()) {
            q90Var.m19799d(ef1Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo17298x() {
        m17297w();
    }
}
