package p000;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;

/* JADX INFO: loaded from: classes2.dex */
public final class o87 extends ewa {
    @Override // p000.ewa
    /* JADX INFO: renamed from: V */
    public final void mo10146V(int i, int i2, int i3, int i4) {
        int iM23326r = this.f38009z0 + this.f37999A0;
        int iM23322l = this.f38005v0 + this.f38006w0;
        if (this.f54931u0 > 0) {
            iM23326r += this.f54930t0[0].m23326r();
            iM23322l += this.f54930t0[0].m23322l();
        }
        int iMax = Math.max(this.f65463c0, iM23326r);
        int iMax2 = Math.max(this.f65465d0, iM23322l);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.f38001C0 = i2;
        this.f38002D0 = i4;
        m23313P(i2);
        m23310M(i4);
        this.f38000B0 = this.f54931u0 > 0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: b */
    public final void mo10149b(gd5 gd5Var, boolean z) {
        super.mo10149b(gd5Var, z);
        if (this.f54931u0 > 0) {
            vj1 vj1Var = this.f54930t0[0];
            vj1Var.m23304E();
            vj1Var.f65469f0 = 0.5f;
            vj1Var.f65467e0 = 0.5f;
            ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.LEFT;
            vj1Var.m23318f(constraintAnchor$Type, this, constraintAnchor$Type, 0);
            ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.RIGHT;
            vj1Var.m23318f(constraintAnchor$Type2, this, constraintAnchor$Type2, 0);
            ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.TOP;
            vj1Var.m23318f(constraintAnchor$Type3, this, constraintAnchor$Type3, 0);
            ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.BOTTOM;
            vj1Var.m23318f(constraintAnchor$Type4, this, constraintAnchor$Type4, 0);
        }
    }
}
