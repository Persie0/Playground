package androidx.compose.foundation.lazy.layout;

import p000.AbstractC3081hn;
import p000.C0817bn;
import p000.fb2;
import p000.jc9;
import p000.jda;
import p000.lda;
import p000.pg9;
import p000.pk9;
import p000.r46;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0136e {

    /* JADX INFO: renamed from: a */
    public pg9 f2564a;

    /* JADX INFO: renamed from: b */
    public C0817bn f2565b;

    public C0136e() {
        jda jdaVar = pk9.f56363h;
        Float fValueOf = Float.valueOf(0.0f);
        this.f2565b = new C0817bn(jdaVar, fValueOf, (AbstractC3081hn) jdaVar.f45442a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1015a() {
        return !(((Number) ((xc9) this.f2565b.f8704b).getValue()).floatValue() == 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m1016b() {
        pg9 pg9Var = this.f2564a;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f2565b = new C0817bn(pk9.f56363h, Float.valueOf(0.0f), null, 60);
    }

    /* JADX INFO: renamed from: c */
    public final void m1017c(float f, fb2 fb2Var, un1 un1Var) {
        if (f <= fb2Var.mo912g0(1.0f)) {
            return;
        }
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            float fFloatValue = ((Number) ((xc9) this.f2565b.f8704b).getValue()).floatValue();
            pg9 pg9Var = this.f2564a;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            C0817bn c0817bn = this.f2565b;
            if (c0817bn.f8708f) {
                this.f2565b = r46.m20392r(c0817bn, fFloatValue - f, 0.0f, 30);
            } else {
                this.f2565b = new C0817bn(pk9.f56363h, Float.valueOf(-f), null, 60);
            }
            this.f2564a = wfb.m23926u(un1Var, null, null, new C0131x63fe01d4(this, null), 3);
        } finally {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        }
    }
}
