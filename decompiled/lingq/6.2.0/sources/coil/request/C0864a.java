package coil.request;

import coil.C0855a;
import java.util.concurrent.CancellationException;
import p000.AbstractC3057h;
import p000.AbstractC3572sf;
import p000.c78;
import p000.cd4;
import p000.dp5;
import p000.e04;
import p000.mva;
import p000.pg9;
import p000.ph2;
import p000.t04;
import p000.ub5;
import p000.v72;
import p000.wfb;
import p000.wn3;

/* JADX INFO: renamed from: coil.request.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0864a implements c78 {

    /* JADX INFO: renamed from: a */
    public final C0855a f10567a;

    /* JADX INFO: renamed from: b */
    public final e04 f10568b;

    /* JADX INFO: renamed from: c */
    public final t04 f10569c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3572sf f10570d;

    /* JADX INFO: renamed from: e */
    public final cd4 f10571e;

    public C0864a(C0855a c0855a, e04 e04Var, t04 t04Var, AbstractC3572sf abstractC3572sf, cd4 cd4Var) {
        this.f10567a = c0855a;
        this.f10568b = e04Var;
        this.f10569c = t04Var;
        this.f10570d = abstractC3572sf;
        this.f10571e = cd4Var;
    }

    @Override // p000.c78
    /* JADX INFO: renamed from: b */
    public final void mo4394b() {
        t04 t04Var = this.f10569c;
        if (t04Var.f61703b.isAttachedToWindow()) {
            return;
        }
        mva mvaVarM12988c = AbstractC3057h.m12988c(t04Var.f61703b);
        C0864a c0864a = mvaVarM12988c.f51899c;
        if (c0864a != null) {
            AbstractC3572sf abstractC3572sf = c0864a.f10570d;
            c0864a.f10571e.mo4537a(null);
            t04 t04Var2 = c0864a.f10569c;
            if (t04Var2 != null) {
                abstractC3572sf.mo21331x(t04Var2);
            }
            abstractC3572sf.mo21331x(c0864a);
        }
        mvaVarM12988c.f51899c = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: r */
    public final void mo4381r(ub5 ub5Var) {
        mva mvaVarM12988c = AbstractC3057h.m12988c(this.f10569c.f61703b);
        synchronized (mvaVarM12988c) {
            try {
                pg9 pg9Var = mvaVarM12988c.f51898b;
                if (pg9Var != null) {
                    pg9Var.mo4537a(null);
                }
                wn3 wn3Var = wn3.f67092a;
                v72 v72Var = ph2.f56212a;
                mvaVarM12988c.f51898b = wfb.m23926u(wn3Var, dp5.f36000a.f68538f, null, new ViewTargetRequestManager$dispose$1(mvaVarM12988c, null), 2);
                mvaVarM12988c.f51897a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.c78
    public final void start() {
        AbstractC3572sf abstractC3572sf = this.f10570d;
        abstractC3572sf.mo21323g(this);
        t04 t04Var = this.f10569c;
        if (t04Var != null) {
            abstractC3572sf.mo21331x(t04Var);
            abstractC3572sf.mo21323g(t04Var);
        }
        mva mvaVarM12988c = AbstractC3057h.m12988c(t04Var.f61703b);
        C0864a c0864a = mvaVarM12988c.f51899c;
        if (c0864a != null) {
            AbstractC3572sf abstractC3572sf2 = c0864a.f10570d;
            c0864a.f10571e.mo4537a(null);
            t04 t04Var2 = c0864a.f10569c;
            if (t04Var2 != null) {
                abstractC3572sf2.mo21331x(t04Var2);
            }
            abstractC3572sf2.mo21331x(c0864a);
        }
        mvaVarM12988c.f51899c = this;
    }
}
