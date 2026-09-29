package p000;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final class pv9 implements xt9 {

    /* JADX INFO: renamed from: b */
    public cx9 f56866b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0205f f56868d;

    /* JADX INFO: renamed from: a */
    public boolean f56865a = true;

    /* JADX INFO: renamed from: c */
    public ij6 f56867c = p84.f55747i;

    public pv9(C0205f c0205f) {
        this.f56868d = c0205f;
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: a */
    public final void mo17644a() {
        m19492f();
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: b */
    public final void mo17645b() {
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: c */
    public final void mo17646c(long j, ij6 ij6Var) {
        long j2;
        sw9 sw9VarM25363d;
        sw9 sw9VarM25363d2;
        C0205f c0205f = this.f56868d;
        t66 t66Var = c0205f.f3093r;
        if (c0205f.m1111l() && ((Handle) ((xc9) t66Var).getValue()) == null) {
            ((xc9) t66Var).setValue(Handle.SelectionEnd);
            c0205f.f3095t = -1;
            this.f56865a = true;
            this.f56867c = ij6Var;
            c0205f.m1115p();
            yw4 yw4Var = c0205f.f3079d;
            if (yw4Var == null || (sw9VarM25363d2 = yw4Var.m25363d()) == null || !sw9VarM25363d2.m21755c(j)) {
                j2 = j;
                yw4 yw4Var2 = c0205f.f3079d;
                if (yw4Var2 != null && (sw9VarM25363d = yw4Var2.m25363d()) != null) {
                    int iMo13407j = c0205f.f3077b.mo13407j(sw9VarM25363d.m21754b(j2, true));
                    vv9 vv9VarM1103e = C0205f.m1103e(c0205f.m1114o().f65990a, eh0.m11127g(iMo13407j, iMo13407j));
                    c0205f.m1107h(false);
                    dr3 dr3Var = c0205f.f3086k;
                    if (dr3Var != null) {
                        ((x87) dr3Var).m24403a(0);
                    }
                    c0205f.f3078c.invoke(vv9VarM1103e);
                    c0205f.f3098w = new cx9(vv9VarM1103e.f65991b);
                }
                this.f56865a = false;
            } else {
                if (c0205f.m1114o().f65990a.f54604b.length() == 0) {
                    return;
                }
                c0205f.m1107h(false);
                long jM1102c = C0205f.m1102c(c0205f, vv9.m23560a(c0205f.m1114o(), null, cx9.f34692b, 5), j, true, false, this.f56867c, true, new er3(0));
                j2 = j;
                c0205f.f3091p = new cx9(jM1102c);
                this.f56866b = new cx9(jM1102c);
            }
            c0205f.m1117r(HandleState.None);
            c0205f.f3090o = j2;
            ((xc9) c0205f.f3094s).setValue(new gq6(j2));
            c0205f.f3092q = 0L;
        }
    }

    @Override // p000.xt9
    /* JADX INFO: renamed from: d */
    public final void mo17647d() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    @Override // p000.xt9
    /* JADX INFO: renamed from: e */
    public final void mo17648e(long j) {
        sw9 sw9VarM25363d;
        cx9 cx9Var;
        int iM21754b;
        long jM1102c;
        C0205f c0205f = this.f56868d;
        if (!c0205f.m1111l() || c0205f.m1114o().f65990a.f54604b.length() == 0) {
            return;
        }
        c0205f.f3092q = gq6.m12825f(c0205f.f3092q, j);
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var != null && (sw9VarM25363d = yw4Var.m25363d()) != null) {
            ((xc9) c0205f.f3094s).setValue(new gq6(gq6.m12825f(c0205f.f3090o, c0205f.f3092q)));
            if (c0205f.f3091p == null) {
                gq6 gq6VarM1109j = c0205f.m1109j();
                gq6VarM1109j.getClass();
                if (sw9VarM25363d.m21755c(gq6VarM1109j.f41189a)) {
                    cx9Var = c0205f.f3091p;
                    if (cx9Var != null) {
                        iM21754b = (int) (cx9Var.f34694a >> 32);
                    } else {
                        iM21754b = sw9VarM25363d.m21754b(c0205f.f3090o, false);
                    }
                    gq6 gq6VarM1109j2 = c0205f.m1109j();
                    gq6VarM1109j2.getClass();
                    int iM21754b2 = sw9VarM25363d.m21754b(gq6VarM1109j2.f41189a, false);
                    if (c0205f.f3091p != null && iM21754b == iM21754b2) {
                        return;
                    }
                    vv9 vv9VarM1114o = c0205f.m1114o();
                    gq6 gq6VarM1109j3 = c0205f.m1109j();
                    gq6VarM1109j3.getClass();
                    jM1102c = C0205f.m1102c(c0205f, vv9VarM1114o, gq6VarM1109j3.f41189a, false, false, this.f56867c, true, new er3(9));
                } else {
                    int iMo13407j = c0205f.f3077b.mo13407j(sw9VarM25363d.m21754b(c0205f.f3090o, true));
                    mq6 mq6Var = c0205f.f3077b;
                    gq6 gq6VarM1109j4 = c0205f.m1109j();
                    gq6VarM1109j4.getClass();
                    ij6 ij6Var = iMo13407j == mq6Var.mo13407j(sw9VarM25363d.m21754b(gq6VarM1109j4.f41189a, true)) ? p84.f55747i : p84.f55748j;
                    vv9 vv9VarM1114o2 = c0205f.m1114o();
                    gq6 gq6VarM1109j5 = c0205f.m1109j();
                    gq6VarM1109j5.getClass();
                    jM1102c = C0205f.m1102c(c0205f, vv9VarM1114o2, gq6VarM1109j5.f41189a, false, false, ij6Var, true, new er3(9));
                }
            } else {
                cx9Var = c0205f.f3091p;
                if (cx9Var != null) {
                    iM21754b = (int) (cx9Var.f34694a >> 32);
                } else {
                    iM21754b = sw9VarM25363d.m21754b(c0205f.f3090o, false);
                }
                gq6 gq6VarM1109j6 = c0205f.m1109j();
                gq6VarM1109j6.getClass();
                int iM21754b3 = sw9VarM25363d.m21754b(gq6VarM1109j6.f41189a, false);
                if (c0205f.f3091p != null) {
                }
                vv9 vv9VarM1114o3 = c0205f.m1114o();
                gq6 gq6VarM1109j7 = c0205f.m1109j();
                gq6VarM1109j7.getClass();
                jM1102c = C0205f.m1102c(c0205f, vv9VarM1114o3, gq6VarM1109j7.f41189a, false, false, this.f56867c, true, new er3(9));
            }
            this.f56866b = new cx9(jM1102c);
            if (!cx9.m9919a(c0205f.f3091p, jM1102c)) {
                this.f56865a = false;
            }
        }
        c0205f.m1120u(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m19492f() {
        C0205f c0205f = this.f56868d;
        ((xc9) c0205f.f3093r).setValue(null);
        ((xc9) c0205f.f3094s).setValue(null);
        this.f56867c = p84.f55747i;
        c0205f.m1120u(true);
        cx9 cx9Var = this.f56866b;
        boolean zM9921c = cx9.m9921c(cx9Var != null ? cx9Var.f34694a : c0205f.m1114o().f65991b);
        c0205f.m1117r(zM9921c ? HandleState.Cursor : HandleState.Selection);
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var != null) {
            ((xc9) yw4Var.f70581m).setValue(Boolean.valueOf(!zM9921c && AbstractC3695vr.m23515z(c0205f, true)));
        }
        yw4 yw4Var2 = c0205f.f3079d;
        if (yw4Var2 != null) {
            ((xc9) yw4Var2.f70582n).setValue(Boolean.valueOf(!zM9921c && AbstractC3695vr.m23515z(c0205f, false)));
        }
        yw4 yw4Var3 = c0205f.f3079d;
        if (yw4Var3 != null) {
            ((xc9) yw4Var3.f70583o).setValue(Boolean.valueOf(zM9921c && AbstractC3695vr.m23515z(c0205f, true)));
        }
        if (this.f56865a) {
            C0205f.m1101b(c0205f, c0205f.f3091p);
        }
        c0205f.f3091p = null;
    }

    @Override // p000.xt9
    public final void onCancel() {
        m19492f();
    }
}
