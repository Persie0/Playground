package p000;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tv5 implements ov5, gm2 {

    /* JADX INFO: renamed from: a */
    public final vv5 f62947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wv5 f62948b;

    public tv5(wv5 wv5Var, vv5 vv5Var) {
        this.f62948b = wv5Var;
        this.f62947a = vv5Var;
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: C */
    public final void mo11804C(int i, jv5 jv5Var, final eh5 eh5Var, final ru5 ru5Var, final int i2) {
        final Pair pairM22313a = m22313a(i, jv5Var);
        if (pairM22313a != null) {
            ((qp9) this.f62948b.f67362j).m20098c(new Runnable() { // from class: rv5
                @Override // java.lang.Runnable
                public final void run() {
                    l52 l52Var = (l52) this.f59860a.f62948b.f67361i;
                    Pair pair = pairM22313a;
                    l52Var.mo11804C(((Integer) pair.first).intValue(), (jv5) pair.second, eh5Var, ru5Var, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair m22313a(int i, jv5 jv5Var) {
        jv5 jv5VarM14689a;
        vv5 vv5Var = this.f62947a;
        jv5 jv5Var2 = null;
        if (jv5Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= vv5Var.f65984c.size()) {
                    jv5VarM14689a = null;
                    break;
                }
                if (((jv5) vv5Var.f65984c.get(i2)).f46229d == jv5Var.f46229d) {
                    Object obj = jv5Var.f46226a;
                    Object obj2 = vv5Var.f65983b;
                    int i3 = ve7.f65274k;
                    jv5VarM14689a = jv5Var.m14689a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (jv5VarM14689a == null) {
                return null;
            }
            jv5Var2 = jv5VarM14689a;
        }
        return Pair.create(Integer.valueOf(i + vv5Var.f65985d), jv5Var2);
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: c */
    public final void mo11807c(int i, jv5 jv5Var, ru5 ru5Var) {
        Pair pairM22313a = m22313a(i, jv5Var);
        if (pairM22313a != null) {
            ((qp9) this.f62948b.f67362j).m20098c(new RunnableC3725wk(this, pairM22313a, ru5Var, 14));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: g */
    public final void mo11808g(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        Pair pairM22313a = m22313a(i, jv5Var);
        if (pairM22313a != null) {
            ((qp9) this.f62948b.f67362j).m20098c(new qv5(this, pairM22313a, eh5Var, ru5Var, 0));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: j */
    public final void mo11809j(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        Pair pairM22313a = m22313a(i, jv5Var);
        if (pairM22313a != null) {
            ((qp9) this.f62948b.f67362j).m20098c(new qv5(this, pairM22313a, eh5Var, ru5Var, 1));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: l */
    public final void mo11810l(int i, jv5 jv5Var, final eh5 eh5Var, final ru5 ru5Var, final IOException iOException, final boolean z) {
        final Pair pairM22313a = m22313a(i, jv5Var);
        if (pairM22313a != null) {
            ((qp9) this.f62948b.f67362j).m20098c(new Runnable() { // from class: sv5
                @Override // java.lang.Runnable
                public final void run() {
                    l52 l52Var = (l52) this.f61485a.f62948b.f67361i;
                    Pair pair = pairM22313a;
                    l52Var.mo11810l(((Integer) pair.first).intValue(), (jv5) pair.second, eh5Var, ru5Var, iOException, z);
                }
            });
        }
    }
}
