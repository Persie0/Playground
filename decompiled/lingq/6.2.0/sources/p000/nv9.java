package p000;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final class nv9 implements xt9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f53302a;

    public nv9(C0205f c0205f) {
        this.f53302a = c0205f;
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: a */
    public final void mo17644a() {
        C0205f c0205f = this.f53302a;
        ((xc9) c0205f.f3093r).setValue(null);
        ((xc9) c0205f.f3094s).setValue(null);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: b */
    public final void mo17645b() {
        C0205f c0205f = this.f53302a;
        ((xc9) c0205f.f3093r).setValue(null);
        ((xc9) c0205f.f3094s).setValue(null);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: c */
    public final void mo17646c(long j, ij6 ij6Var) {
        sw9 sw9VarM25363d;
        C0205f c0205f = this.f53302a;
        long jM10686a = dv8.m10686a(c0205f.m1112m(true));
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
            return;
        }
        long jM21757e = sw9VarM25363d.m21757e(jM10686a);
        c0205f.f3090o = jM21757e;
        ((xc9) c0205f.f3094s).setValue(new gq6(jM21757e));
        c0205f.f3092q = 0L;
        ((xc9) c0205f.f3093r).setValue(Handle.Cursor);
        c0205f.m1120u(false);
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: d */
    public final void mo17647d() {
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: e */
    public final void mo17648e(long j) {
        sw9 sw9VarM25363d;
        dr3 dr3Var;
        C0205f c0205f = this.f53302a;
        c0205f.f3092q = gq6.m12825f(c0205f.f3092q, j);
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
            return;
        }
        ((xc9) c0205f.f3094s).setValue(new gq6(gq6.m12825f(c0205f.f3090o, c0205f.f3092q)));
        mq6 mq6Var = c0205f.f3077b;
        gq6 gq6VarM1109j = c0205f.m1109j();
        gq6VarM1109j.getClass();
        int iMo13407j = mq6Var.mo13407j(sw9VarM25363d.m21754b(gq6VarM1109j.f41189a, true));
        long jM11127g = eh0.m11127g(iMo13407j, iMo13407j);
        if (cx9.m9920b(jM11127g, c0205f.m1114o().f65991b)) {
            return;
        }
        yw4 yw4Var2 = c0205f.f3079d;
        if ((yw4Var2 == null || ((Boolean) ((xc9) yw4Var2.f70585q).getValue()).booleanValue()) && (dr3Var = c0205f.f3086k) != null) {
            ((x87) dr3Var).m24403a(9);
        }
        c0205f.f3078c.invoke(C0205f.m1103e(c0205f.m1114o().f65990a, jM11127g));
        c0205f.f3098w = new cx9(jM11127g);
    }

    @Override // p000.xt9
    public final void onCancel() {
    }
}
