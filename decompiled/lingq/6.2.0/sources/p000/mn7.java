package p000;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.source.C0717b;

/* JADX INFO: loaded from: classes2.dex */
public final class mn7 extends q90 {

    /* JADX INFO: renamed from: h */
    public final i02 f51576h;

    /* JADX INFO: renamed from: i */
    public final dw6 f51577i;

    /* JADX INFO: renamed from: j */
    public final mkd f51578j;

    /* JADX INFO: renamed from: k */
    public final my5 f51579k;

    /* JADX INFO: renamed from: l */
    public final int f51580l;

    /* JADX INFO: renamed from: m */
    public boolean f51581m;

    /* JADX INFO: renamed from: n */
    public long f51582n;

    /* JADX INFO: renamed from: o */
    public boolean f51583o;

    /* JADX INFO: renamed from: p */
    public boolean f51584p;

    /* JADX INFO: renamed from: q */
    public boolean f51585q;

    /* JADX INFO: renamed from: r */
    public u52 f51586r;

    /* JADX INFO: renamed from: s */
    public pu5 f51587s;

    public mn7(pu5 pu5Var, i02 i02Var, dw6 dw6Var, my5 my5Var, int i) {
        mkd mkdVar = mkd.f51458b;
        this.f51587s = pu5Var;
        this.f51576h = i02Var;
        this.f51577i = dw6Var;
        this.f51578j = mkdVar;
        this.f51579k = my5Var;
        this.f51580l = i;
        this.f51581m = true;
        this.f51582n = -9223372036854775807L;
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: c */
    public final xu5 mo16936c(jv5 jv5Var, gv5 gv5Var, long j) {
        j02 j02VarMo10703p = this.f51576h.mo10703p();
        u52 u52Var = this.f51586r;
        if (u52Var != null) {
            j02VarMo10703p.mo10002l(u52Var);
        }
        mu5 mu5Var = mo16937i().f56811b;
        mu5Var.getClass();
        Uri uri = mu5Var.f51852a;
        this.f57438g.getClass();
        return new C0717b(uri, j02VarMo10703p, new gv5((i62) this.f51577i.f36323b, 10), this.f51578j, new fm2(this.f57435d.f39279c, 0, jv5Var), this.f51579k, new fm2(this.f57434c.f39279c, 0, jv5Var), this, gv5Var, this.f51580l, uma.m22797B(mu5Var.f51856e), null);
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: i */
    public final synchronized pu5 mo16937i() {
        return this.f51587s;
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: k */
    public final void mo16938k() {
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: m */
    public final void mo16939m(u52 u52Var) {
        this.f51586r = u52Var;
        Looper.myLooper().getClass();
        this.f57438g.getClass();
        this.f51578j.getClass();
        m16943u();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: o */
    public final void mo16940o(xu5 xu5Var) {
        C0717b c0717b = (C0717b) xu5Var;
        if (c0717b.f6477R) {
            for (yk8 yk8Var : c0717b.f6474O) {
                yk8Var.m25170i();
                web webVar = yk8Var.f69947h;
                if (webVar != null) {
                    webVar.m23874L(yk8Var.f69944e);
                    yk8Var.f69947h = null;
                    yk8Var.f69946g = null;
                }
            }
        }
        gv5 gv5Var = c0717b.f6506k;
        t48 t48Var = (t48) gv5Var.f41392b;
        hh5 hh5Var = (hh5) gv5Var.f41393c;
        if (hh5Var != null) {
            hh5Var.m13240a(true);
        }
        t48Var.execute(new RunnableC3468pp(c0717b, 12));
        t48Var.f61861b.accept(t48Var.f61860a);
        c0717b.f6470K.removeCallbacksAndMessages(null);
        c0717b.f6471L = null;
        c0717b.f6507k0 = true;
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: q */
    public final void mo16941q() {
        this.f51578j.getClass();
    }

    @Override // p000.q90
    /* JADX INFO: renamed from: t */
    public final synchronized void mo16942t(pu5 pu5Var) {
        this.f51587s = pu5Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m16943u() {
        z0a n89Var = new n89(this.f51582n, this.f51583o, this.f51584p, mo16937i());
        if (this.f51581m) {
            n89Var = new ln7(n89Var);
        }
        m19802n(n89Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m16944v(long j, st8 st8Var, boolean z) {
        if (this.f51585q && st8Var.mo21741e()) {
            return;
        }
        this.f51585q = !st8Var.mo21741e();
        if (j == -9223372036854775807L) {
            j = this.f51582n;
        }
        boolean zMo3541c = st8Var.mo3541c();
        if (!this.f51581m && this.f51582n == j && this.f51583o == zMo3541c && this.f51584p == z) {
            return;
        }
        this.f51582n = j;
        this.f51583o = zMo3541c;
        this.f51584p = z;
        this.f51581m = false;
        m16943u();
    }
}
