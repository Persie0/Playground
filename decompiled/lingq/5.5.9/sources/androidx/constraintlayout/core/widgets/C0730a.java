package androidx.constraintlayout.core.widgets;

import android.support.v4.media.session.C0166e;
import androidx.constraintlayout.core.C0725b;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;
import p003a2.C0009a;
import p061d2.C5039b;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0730a extends C5039b {

    /* JADX INFO: renamed from: y0 */
    public int f4914y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public boolean f4915z0 = true;

    /* JADX INFO: renamed from: A0 */
    public int f4912A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public boolean f4913B0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: E */
    public final boolean mo2706E() {
        return this.f4913B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: F */
    public final boolean mo2707F() {
        return this.f4913B0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX INFO: renamed from: V */
    public final boolean m2741V() {
        int i10;
        int i11;
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            i10 = this.f32871x0;
            if (i12 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.f32870w0[i12];
            if (this.f4915z0 || constraintWidget.mo2722f()) {
                int i13 = this.f4914y0;
                if (i13 != 0 && i13 != 1) {
                    i11 = this.f4914y0;
                    z10 = i11 != 2 ? false : false;
                } else if (constraintWidget.mo2706E()) {
                    i11 = this.f4914y0;
                    if ((i11 != 2 || i11 == 3) && !constraintWidget.mo2707F()) {
                    }
                }
            }
            i12++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f32871x0; i14++) {
            ConstraintWidget constraintWidget2 = this.f32870w0[i14];
            if (this.f4915z0 || constraintWidget2.mo2722f()) {
                if (!z11) {
                    int i15 = this.f4914y0;
                    if (i15 == 0) {
                        iMax = constraintWidget2.mo2729m(ConstraintAnchor.Type.LEFT).m2689d();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.mo2729m(ConstraintAnchor.Type.RIGHT).m2689d();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.mo2729m(ConstraintAnchor.Type.TOP).m2689d();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.mo2729m(ConstraintAnchor.Type.BOTTOM).m2689d();
                    }
                    z11 = true;
                }
                int i16 = this.f4914y0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.mo2729m(ConstraintAnchor.Type.LEFT).m2689d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.mo2729m(ConstraintAnchor.Type.RIGHT).m2689d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.mo2729m(ConstraintAnchor.Type.TOP).m2689d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.mo2729m(ConstraintAnchor.Type.BOTTOM).m2689d());
                }
            }
        }
        int i17 = iMax + this.f4912A0;
        int i18 = this.f4914y0;
        if (i18 == 0 || i18 == 1) {
            m2712M(i17, i17);
        } else {
            m2713N(i17, i17);
        }
        this.f4913B0 = true;
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final int m2742W() {
        int i10 = this.f4914y0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public final void mo2721e(C0726c c0726c, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        ConstraintAnchor[] constraintAnchorArr = this.f4854S;
        ConstraintAnchor constraintAnchor = this.f4846K;
        constraintAnchorArr[0] = constraintAnchor;
        int i12 = 2;
        ConstraintAnchor constraintAnchor2 = this.f4847L;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f4848M;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f4849N;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f4834i = c0726c.m2675k(constraintAnchor5);
        }
        int i13 = this.f4914y0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i13];
        if (!this.f4913B0) {
            m2741V();
        }
        if (this.f4913B0) {
            this.f4913B0 = false;
            int i14 = this.f4914y0;
            if (i14 == 0 || i14 == 1) {
                c0726c.m2668d(constraintAnchor.f4834i, this.f4865b0);
                c0726c.m2668d(constraintAnchor3.f4834i, this.f4865b0);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    c0726c.m2668d(constraintAnchor2.f4834i, this.f4867c0);
                    c0726c.m2668d(constraintAnchor4.f4834i, this.f4867c0);
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.f32871x0) {
                z11 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f32870w0[i15];
            if ((this.f4915z0 || constraintWidget.mo2722f()) && ((((i11 = this.f4914y0) == 0 || i11 == 1) && constraintWidget.f4857V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4846K.f4831f != null && constraintWidget.f4848M.f4831f != null) || ((i11 == 2 || i11 == 3) && constraintWidget.f4857V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4847L.f4831f != null && constraintWidget.f4849N.f4831f != null))) {
                z11 = true;
                break;
            }
            i15++;
        }
        boolean z12 = constraintAnchor.m2692g() || constraintAnchor3.m2692g();
        boolean z13 = constraintAnchor2.m2692g() || constraintAnchor4.m2692g();
        int i16 = !(!z11 && (((i10 = this.f4914y0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f32871x0) {
            ConstraintWidget constraintWidget2 = this.f32870w0[i17];
            if (this.f4915z0 || constraintWidget2.mo2722f()) {
                SolverVariable solverVariableM2675k = c0726c.m2675k(constraintWidget2.f4854S[this.f4914y0]);
                int i18 = this.f4914y0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f4854S[i18];
                constraintAnchor7.f4834i = solverVariableM2675k;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f4831f;
                int i19 = (constraintAnchor8 == null || constraintAnchor8.f4829d != this) ? 0 : constraintAnchor7.f4832g + 0;
                if (i18 == 0 || i18 == i12) {
                    SolverVariable solverVariable = constraintAnchor6.f4834i;
                    int i20 = this.f4912A0 - i19;
                    C0725b c0725bM2676l = c0726c.m2676l();
                    SolverVariable solverVariableM2677m = c0726c.m2677m();
                    solverVariableM2677m.f4779d = 0;
                    c0725bM2676l.m2658d(solverVariable, solverVariableM2675k, solverVariableM2677m, i20);
                    c0726c.m2667c(c0725bM2676l);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.f4834i;
                    int i21 = this.f4912A0 + i19;
                    C0725b c0725bM2676l2 = c0726c.m2676l();
                    SolverVariable solverVariableM2677m2 = c0726c.m2677m();
                    solverVariableM2677m2.f4779d = 0;
                    c0725bM2676l2.m2657c(solverVariable2, solverVariableM2675k, solverVariableM2677m2, i21);
                    c0726c.m2667c(c0725bM2676l2);
                }
                c0726c.m2669e(constraintAnchor6.f4834i, solverVariableM2675k, this.f4912A0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f4914y0;
        if (i22 == 0) {
            c0726c.m2669e(constraintAnchor3.f4834i, constraintAnchor.f4834i, 0, 8);
            c0726c.m2669e(constraintAnchor.f4834i, this.f4858W.f4848M.f4834i, 0, 4);
            c0726c.m2669e(constraintAnchor.f4834i, this.f4858W.f4846K.f4834i, 0, 0);
            return;
        }
        if (i22 == 1) {
            c0726c.m2669e(constraintAnchor.f4834i, constraintAnchor3.f4834i, 0, 8);
            c0726c.m2669e(constraintAnchor.f4834i, this.f4858W.f4846K.f4834i, 0, 4);
            c0726c.m2669e(constraintAnchor.f4834i, this.f4858W.f4848M.f4834i, 0, 0);
        } else if (i22 == 2) {
            c0726c.m2669e(constraintAnchor4.f4834i, constraintAnchor2.f4834i, 0, 8);
            c0726c.m2669e(constraintAnchor2.f4834i, this.f4858W.f4849N.f4834i, 0, 4);
            c0726c.m2669e(constraintAnchor2.f4834i, this.f4858W.f4847L.f4834i, 0, 0);
        } else if (i22 == 3) {
            c0726c.m2669e(constraintAnchor2.f4834i, constraintAnchor4.f4834i, 0, 8);
            c0726c.m2669e(constraintAnchor2.f4834i, this.f4858W.f4847L.f4834i, 0, 4);
            c0726c.m2669e(constraintAnchor2.f4834i, this.f4858W.f4849N.f4834i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: f */
    public final boolean mo2722f() {
        return true;
    }

    @Override // p061d2.C5039b, androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: j */
    public final void mo2726j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.mo2726j(constraintWidget, map);
        C0730a c0730a = (C0730a) constraintWidget;
        this.f4914y0 = c0730a.f4914y0;
        this.f4915z0 = c0730a.f4915z0;
        this.f4912A0 = c0730a.f4912A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strM23l = C0009a.m23l(new StringBuilder("[Barrier] "), this.f4885l0, " {");
        for (int i10 = 0; i10 < this.f32871x0; i10++) {
            ConstraintWidget constraintWidget = this.f32870w0[i10];
            if (i10 > 0) {
                strM23l = C0166e.m765k(strM23l, ", ");
            }
            StringBuilder sbM771r = C0166e.m771r(strM23l);
            sbM771r.append(constraintWidget.f4885l0);
            strM23l = sbM771r.toString();
        }
        return C0166e.m765k(strM23l, "}");
    }
}
