package p000;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final class ov9 implements xt9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f55039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f55040b;

    public ov9(C0205f c0205f, boolean z) {
        this.f55039a = c0205f;
        this.f55040b = z;
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: a */
    public final void mo17644a() {
        C0205f c0205f = this.f55039a;
        ((xc9) c0205f.f3093r).setValue(null);
        ((xc9) c0205f.f3094s).setValue(null);
        c0205f.m1120u(true);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: b */
    public final void mo17645b() {
        C0205f c0205f = this.f55039a;
        ((xc9) c0205f.f3093r).setValue(null);
        ((xc9) c0205f.f3094s).setValue(null);
        c0205f.m1120u(true);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: c */
    public final void mo17646c(long j, ij6 ij6Var) {
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: d */
    public final void mo17647d() {
        sw9 sw9VarM25363d;
        boolean z = this.f55040b;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        C0205f c0205f = this.f55039a;
        ((xc9) c0205f.f3093r).setValue(handle);
        long jM10686a = dv8.m10686a(c0205f.m1112m(z));
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
            return;
        }
        long jM21757e = sw9VarM25363d.m21757e(jM10686a);
        c0205f.f3090o = jM21757e;
        ((xc9) c0205f.f3094s).setValue(new gq6(jM21757e));
        c0205f.f3092q = 0L;
        c0205f.f3095t = -1;
        yw4 yw4Var2 = c0205f.f3079d;
        if (yw4Var2 != null) {
            ((xc9) yw4Var2.f70585q).setValue(Boolean.TRUE);
        }
        c0205f.m1120u(false);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: e */
    public final void mo17648e(long j) {
        C0205f c0205f = this.f55039a;
        long jM12825f = gq6.m12825f(c0205f.f3092q, j);
        c0205f.f3092q = jM12825f;
        ((xc9) c0205f.f3094s).setValue(new gq6(gq6.m12825f(c0205f.f3090o, jM12825f)));
        vv9 vv9VarM1114o = c0205f.m1114o();
        gq6 gq6VarM1109j = c0205f.m1109j();
        gq6VarM1109j.getClass();
        C0205f.m1102c(c0205f, vv9VarM1114o, gq6VarM1109j.f41189a, false, this.f55040b, p84.f55750l, true, new er3(9));
        c0205f.m1120u(false);
    }

    @Override // p000.xt9
    public final void onCancel() {
    }
}
