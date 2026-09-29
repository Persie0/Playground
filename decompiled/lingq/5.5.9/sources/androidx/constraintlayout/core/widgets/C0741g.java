package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0726c;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0741g {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f5033a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static void m2780a(C0738d c0738d, C0726c c0726c, ConstraintWidget constraintWidget) {
        constraintWidget.f4892p = -1;
        constraintWidget.f4894q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = c0738d.f4857V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f4857V[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            ConstraintAnchor constraintAnchor = constraintWidget.f4846K;
            int i10 = constraintAnchor.f4832g;
            int iM2735u = c0738d.m2735u();
            ConstraintAnchor constraintAnchor2 = constraintWidget.f4848M;
            int i11 = iM2735u - constraintAnchor2.f4832g;
            constraintAnchor.f4834i = c0726c.m2675k(constraintAnchor);
            constraintAnchor2.f4834i = c0726c.m2675k(constraintAnchor2);
            c0726c.m2668d(constraintAnchor.f4834i, i10);
            c0726c.m2668d(constraintAnchor2.f4834i, i11);
            constraintWidget.f4892p = 2;
            constraintWidget.f4865b0 = i10;
            int i12 = i11 - i10;
            constraintWidget.f4859X = i12;
            int i13 = constraintWidget.f4871e0;
            if (i12 < i13) {
                constraintWidget.f4859X = i13;
            }
        }
        if (c0738d.f4857V[1] != dimensionBehaviour2 && constraintWidget.f4857V[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f4847L;
            int i14 = constraintAnchor3.f4832g;
            int iM2731o = c0738d.m2731o();
            ConstraintAnchor constraintAnchor4 = constraintWidget.f4849N;
            int i15 = iM2731o - constraintAnchor4.f4832g;
            constraintAnchor3.f4834i = c0726c.m2675k(constraintAnchor3);
            constraintAnchor4.f4834i = c0726c.m2675k(constraintAnchor4);
            c0726c.m2668d(constraintAnchor3.f4834i, i14);
            c0726c.m2668d(constraintAnchor4.f4834i, i15);
            if (constraintWidget.f4869d0 > 0 || constraintWidget.f4881j0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f4850O;
                constraintAnchor5.f4834i = c0726c.m2675k(constraintAnchor5);
                c0726c.m2668d(constraintAnchor5.f4834i, constraintWidget.f4869d0 + i14);
            }
            constraintWidget.f4894q = 2;
            constraintWidget.f4867c0 = i14;
            int i16 = i15 - i14;
            constraintWidget.f4860Y = i16;
            int i17 = constraintWidget.f4873f0;
            if (i16 < i17) {
                constraintWidget.f4860Y = i17;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m2781b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
