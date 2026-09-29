package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0725b;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0740f extends ConstraintWidget {

    /* JADX INFO: renamed from: B0 */
    public boolean f5027B0;

    /* JADX INFO: renamed from: w0 */
    public float f5028w0 = -1.0f;

    /* JADX INFO: renamed from: x0 */
    public int f5029x0 = -1;

    /* JADX INFO: renamed from: y0 */
    public int f5030y0 = -1;

    /* JADX INFO: renamed from: z0 */
    public ConstraintAnchor f5031z0 = this.f4847L;

    /* JADX INFO: renamed from: A0 */
    public int f5026A0 = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5032a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f5032a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5032a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5032a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5032a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5032a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5032a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5032a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5032a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5032a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0740f() {
        this.f4855T.clear();
        this.f4855T.add(this.f5031z0);
        int length = this.f4854S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f4854S[i10] = this.f5031z0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: E */
    public final boolean mo2706E() {
        return this.f5027B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: F */
    public final boolean mo2707F() {
        return this.f5027B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: T */
    public final void mo2719T(C0726c c0726c, boolean z10) {
        if (this.f4858W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f5031z0;
        c0726c.getClass();
        int iM2664n = C0726c.m2664n(constraintAnchor);
        if (this.f5026A0 == 1) {
            this.f4865b0 = iM2664n;
            this.f4867c0 = 0;
            m2714O(this.f4858W.m2731o());
            m2717R(0);
            return;
        }
        this.f4865b0 = 0;
        this.f4867c0 = iM2664n;
        m2717R(this.f4858W.m2735u());
        m2714O(0);
    }

    /* JADX INFO: renamed from: U */
    public final void m2778U(int i10) {
        this.f5031z0.m2697l(i10);
        this.f5027B0 = true;
    }

    /* JADX INFO: renamed from: V */
    public final void m2779V(int i10) {
        if (this.f5026A0 == i10) {
            return;
        }
        this.f5026A0 = i10;
        ArrayList<ConstraintAnchor> arrayList = this.f4855T;
        arrayList.clear();
        if (this.f5026A0 == 1) {
            this.f5031z0 = this.f4846K;
        } else {
            this.f5031z0 = this.f4847L;
        }
        arrayList.add(this.f5031z0);
        ConstraintAnchor[] constraintAnchorArr = this.f4854S;
        int length = constraintAnchorArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            constraintAnchorArr[i11] = this.f5031z0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public final void mo2721e(C0726c c0726c, boolean z10) {
        C0738d c0738d = (C0738d) this.f4858W;
        if (c0738d == null) {
            return;
        }
        Object objMo2729m = c0738d.mo2729m(ConstraintAnchor.Type.LEFT);
        Object objMo2729m2 = c0738d.mo2729m(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f4858W;
        boolean z11 = true;
        boolean z12 = constraintWidget != null && constraintWidget.f4857V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f5026A0 == 0) {
            objMo2729m = c0738d.mo2729m(ConstraintAnchor.Type.TOP);
            objMo2729m2 = c0738d.mo2729m(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f4858W;
            if (constraintWidget2 == null || constraintWidget2.f4857V[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z11 = false;
            }
            z12 = z11;
        }
        if (this.f5027B0) {
            ConstraintAnchor constraintAnchor = this.f5031z0;
            if (constraintAnchor.f4828c) {
                SolverVariable solverVariableM2675k = c0726c.m2675k(constraintAnchor);
                c0726c.m2668d(solverVariableM2675k, this.f5031z0.m2689d());
                if (this.f5029x0 != -1) {
                    if (z12) {
                        c0726c.m2670f(c0726c.m2675k(objMo2729m2), solverVariableM2675k, 0, 5);
                    }
                    this.f5027B0 = false;
                    return;
                } else if (this.f5030y0 != -1 && z12) {
                    SolverVariable solverVariableM2675k2 = c0726c.m2675k(objMo2729m2);
                    c0726c.m2670f(solverVariableM2675k, c0726c.m2675k(objMo2729m), 0, 5);
                    c0726c.m2670f(solverVariableM2675k2, solverVariableM2675k, 0, 5);
                }
                this.f5027B0 = false;
                return;
            }
        }
        if (this.f5029x0 != -1) {
            SolverVariable solverVariableM2675k3 = c0726c.m2675k(this.f5031z0);
            c0726c.m2669e(solverVariableM2675k3, c0726c.m2675k(objMo2729m), this.f5029x0, 8);
            if (z12) {
                c0726c.m2670f(c0726c.m2675k(objMo2729m2), solverVariableM2675k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f5030y0 != -1) {
            SolverVariable solverVariableM2675k4 = c0726c.m2675k(this.f5031z0);
            SolverVariable solverVariableM2675k5 = c0726c.m2675k(objMo2729m2);
            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k5, -this.f5030y0, 8);
            if (z12) {
                c0726c.m2670f(solverVariableM2675k4, c0726c.m2675k(objMo2729m), 0, 5);
                c0726c.m2670f(solverVariableM2675k5, solverVariableM2675k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f5028w0 != -1.0f) {
            SolverVariable solverVariableM2675k6 = c0726c.m2675k(this.f5031z0);
            SolverVariable solverVariableM2675k7 = c0726c.m2675k(objMo2729m2);
            float f3 = this.f5028w0;
            C0725b c0725bM2676l = c0726c.m2676l();
            c0725bM2676l.f4801d.mo2647d(solverVariableM2675k6, -1.0f);
            c0725bM2676l.f4801d.mo2647d(solverVariableM2675k7, f3);
            c0726c.m2667c(c0725bM2676l);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: f */
    public final boolean mo2722f() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: j */
    public final void mo2726j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.mo2726j(constraintWidget, map);
        C0740f c0740f = (C0740f) constraintWidget;
        this.f5028w0 = c0740f.f5028w0;
        this.f5029x0 = c0740f.f5029x0;
        this.f5030y0 = c0740f.f5030y0;
        m2779V(c0740f.f5026A0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: m */
    public final ConstraintAnchor mo2729m(ConstraintAnchor.Type type) {
        int i10 = a.f5032a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f5026A0 == 1) {
                return this.f5031z0;
            }
        } else if ((i10 == 3 || i10 == 4) && this.f5026A0 == 0) {
            return this.f5031z0;
        }
        return null;
    }
}
