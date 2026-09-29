package p083e2;

import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p061d2.C5039b;

/* JADX INFO: renamed from: e2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5359g {
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:46:0x0070  */
    /* JADX WARN: Code duplicated, block: B:49:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[LOOP:2: B:47:0x0071->B:52:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0083 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C5362j m11496a(ConstraintWidget constraintWidget, int i10, ArrayList<C5362j> arrayList, C5362j c5362j) {
        ArrayList<ConstraintWidget> arrayList2;
        boolean z10;
        int i11;
        C5039b c5039b;
        int i12;
        int i13;
        int i14;
        C5362j c5362j2;
        int i15 = i10 == 0 ? constraintWidget.f4903u0 : constraintWidget.f4905v0;
        if (i15 != -1 && (c5362j == null || i15 != c5362j.f33686b)) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList.size()) {
                    C5362j c5362j3 = arrayList.get(i16);
                    if (c5362j3.f33686b == i15) {
                        if (c5362j != null) {
                            c5362j.m11503c(i10, c5362j3);
                            arrayList.remove(c5362j);
                        }
                        c5362j = c5362j3;
                        break;
                    }
                    i16++;
                }
            }
            if (c5362j == null) {
                if (constraintWidget instanceof C5039b) {
                    c5039b = (C5039b) constraintWidget;
                    i12 = 0;
                    while (true) {
                        if (i12 < c5039b.f32871x0) {
                            i13 = -1;
                            break;
                        }
                        ConstraintWidget constraintWidget2 = c5039b.f32870w0[i12];
                        if ((i10 != 0 && (i13 = constraintWidget2.f4903u0) != -1) || (i10 == 1 && (i13 = constraintWidget2.f4905v0) != -1)) {
                            break;
                        }
                    }
                    if (i13 != -1) {
                        for (i14 = 0; i14 < arrayList.size(); i14++) {
                            c5362j2 = arrayList.get(i14);
                            if (c5362j2.f33686b == i13) {
                                c5362j = c5362j2;
                                break;
                            }
                        }
                    }
                }
                if (c5362j == null) {
                    c5362j = new C5362j(i10);
                }
                arrayList.add(c5362j);
            }
            arrayList2 = c5362j.f33685a;
            if (arrayList2.contains(constraintWidget)) {
                z10 = false;
            } else {
                arrayList2.add(constraintWidget);
                z10 = true;
            }
            if (z10) {
                if (constraintWidget instanceof C0740f) {
                    C0740f c0740f = (C0740f) constraintWidget;
                    c0740f.f5031z0.m2688c(c0740f.f5026A0 == 0 ? 1 : 0, c5362j, arrayList);
                }
                i11 = c5362j.f33686b;
                if (i10 == 0) {
                    constraintWidget.f4903u0 = i11;
                    constraintWidget.f4846K.m2688c(i10, c5362j, arrayList);
                    constraintWidget.f4848M.m2688c(i10, c5362j, arrayList);
                } else {
                    constraintWidget.f4905v0 = i11;
                    constraintWidget.f4847L.m2688c(i10, c5362j, arrayList);
                    constraintWidget.f4850O.m2688c(i10, c5362j, arrayList);
                    constraintWidget.f4849N.m2688c(i10, c5362j, arrayList);
                }
                constraintWidget.f4853R.m2688c(i10, c5362j, arrayList);
            }
            return c5362j;
        }
        if (i15 != -1) {
            return c5362j;
        }
        if (c5362j == null) {
            if (constraintWidget instanceof C5039b) {
                c5039b = (C5039b) constraintWidget;
                i12 = 0;
                while (true) {
                    if (i12 < c5039b.f32871x0) {
                        i13 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget3 = c5039b.f32870w0[i12];
                    i12 = i10 != 0 ? i12 + 1 : i12 + 1;
                }
                if (i13 != -1) {
                    while (i14 < arrayList.size()) {
                        c5362j2 = arrayList.get(i14);
                        if (c5362j2.f33686b == i13) {
                            c5362j = c5362j2;
                            break;
                        }
                    }
                }
            }
            if (c5362j == null) {
                c5362j = new C5362j(i10);
            }
            arrayList.add(c5362j);
        }
        arrayList2 = c5362j.f33685a;
        if (arrayList2.contains(constraintWidget)) {
            z10 = false;
        } else {
            arrayList2.add(constraintWidget);
            z10 = true;
        }
        if (z10) {
            if (constraintWidget instanceof C0740f) {
                C0740f c0740f2 = (C0740f) constraintWidget;
                c0740f2.f5031z0.m2688c(c0740f2.f5026A0 == 0 ? 1 : 0, c5362j, arrayList);
            }
            i11 = c5362j.f33686b;
            if (i10 == 0) {
                constraintWidget.f4903u0 = i11;
                constraintWidget.f4846K.m2688c(i10, c5362j, arrayList);
                constraintWidget.f4848M.m2688c(i10, c5362j, arrayList);
            } else {
                constraintWidget.f4905v0 = i11;
                constraintWidget.f4847L.m2688c(i10, c5362j, arrayList);
                constraintWidget.f4850O.m2688c(i10, c5362j, arrayList);
                constraintWidget.f4849N.m2688c(i10, c5362j, arrayList);
            }
            constraintWidget.f4853R.m2688c(i10, c5362j, arrayList);
        }
        return c5362j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    /* JADX INFO: renamed from: b */
    public static boolean m11497b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && dimensionBehaviour3 != (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            if (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == dimensionBehaviour6) {
                z10 = false;
            }
            if (dimensionBehaviour4 != dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5)) {
                z11 = true;
            } else {
                z11 = false;
            }
            return !z10 || z11;
        }
        z10 = true;
        if (dimensionBehaviour4 != dimensionBehaviour7) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (z10) {
        }
    }
}
