package p000;

import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public final class le5 extends pk9 {

    /* JADX INFO: renamed from: A */
    public final z21 f49543A;

    /* JADX INFO: renamed from: B */
    public final Object f49544B;

    /* JADX INFO: renamed from: C */
    public final pk9 f49545C;

    public le5(z21 z21Var, Object obj, pk9 pk9Var) {
        obj.getClass();
        pk9Var.getClass();
        this.f49543A = z21Var;
        this.f49544B = obj;
        this.f49545C = pk9Var;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: n */
    public final Object mo16143n(z21 z21Var) {
        if (!z21Var.equals(this.f49543A)) {
            return this.f49545C.mo16143n(z21Var);
        }
        Class cls = z21Var.f70781a;
        cls.getClass();
        return cls.cast(this.f49544B);
    }

    public final String toString() {
        return u91.m22596N0(u91.m22610b1(AbstractC3204c.m15421q0(AbstractC3204c.m15418n0(this, new ry4(16)))), null, "{", "}", new ry4(17), 25);
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: v */
    public final pk9 mo16144v(z21 z21Var, Object obj) {
        z21 z21Var2 = this.f49543A;
        boolean zEquals = z21Var.equals(z21Var2);
        pk9 pk9Var = this.f49545C;
        if (!zEquals) {
            pk9 pk9VarMo16144v = pk9Var.mo16144v(z21Var, null);
            if (pk9VarMo16144v != pk9Var) {
                this = new le5(z21Var2, this.f49544B, pk9VarMo16144v);
            }
            pk9Var = this;
        }
        return obj != null ? new le5(z21Var, obj, pk9Var) : pk9Var;
    }
}
