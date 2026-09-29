package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0726c;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0742h extends C0743i {
    @Override // androidx.constraintlayout.core.widgets.C0743i
    /* JADX INFO: renamed from: V */
    public final void mo2769V(int i10, int i11, int i12, int i13) {
        int iM2735u = this.f5036C0 + this.f5037D0 + 0;
        int iM2731o = this.f5043y0 + this.f5044z0 + 0;
        if (this.f32871x0 > 0) {
            iM2735u += this.f32870w0[0].m2735u();
            iM2731o += this.f32870w0[0].m2731o();
        }
        int iMax = Math.max(this.f4871e0, iM2735u);
        int iMax2 = Math.max(this.f4873f0, iM2731o);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(iMax, i11);
            } else {
                i11 = i10 == 0 ? iMax : 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(iMax2, i13);
            } else {
                i13 = i12 == 0 ? iMax2 : 0;
            }
        }
        this.f5039F0 = i11;
        this.f5040G0 = i13;
        m2717R(i11);
        m2714O(i13);
        this.f5038E0 = this.f32871x0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public final void mo2721e(C0726c c0726c, boolean z10) {
        super.mo2721e(c0726c, z10);
        if (this.f32871x0 > 0) {
            ConstraintWidget constraintWidget = this.f32870w0[0];
            constraintWidget.m2709H();
            constraintWidget.f4877h0 = 0.5f;
            constraintWidget.f4875g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.m2724h(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.m2724h(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.m2724h(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.m2724h(type4, this, type4, 0);
        }
    }
}
