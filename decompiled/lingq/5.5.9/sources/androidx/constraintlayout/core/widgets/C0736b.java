package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0725b;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0736b {
    /* JADX WARN: Code duplicated, block: B:177:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:201:0x0300  */
    /* JADX WARN: Code duplicated, block: B:203:0x0321  */
    /* JADX WARN: Code duplicated, block: B:291:0x0509  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX INFO: renamed from: a */
    public static void m2762a(C0738d c0738d, C0726c c0726c, ArrayList<ConstraintWidget> arrayList, int i10) {
        int i11;
        C0737c[] c0737cArr;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ConstraintAnchor[] constraintAnchorArr;
        C0737c[] c0737cArr2;
        int i15;
        int i16;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable4;
        int size;
        float f3;
        boolean z17;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget3;
        int i17;
        boolean z18;
        ConstraintWidget constraintWidget4;
        C0738d c0738d2 = c0738d;
        if (i10 == 0) {
            i11 = c0738d2.f4967F0;
            c0737cArr = c0738d2.f4970I0;
            i12 = 0;
        } else {
            i11 = c0738d2.f4968G0;
            c0737cArr = c0738d2.f4969H0;
            i12 = 2;
        }
        int i18 = 0;
        while (i18 < i11) {
            C0737c c0737c = c0737cArr[i18];
            boolean z19 = c0737c.f4961q;
            int i19 = 8;
            int i20 = 1;
            ConstraintWidget constraintWidget5 = c0737c.f4945a;
            if (z19) {
                i13 = i18;
                i14 = i11;
                z10 = true;
            } else {
                int i21 = c0737c.f4956l;
                int i22 = i21 * 2;
                ConstraintWidget constraintWidget6 = constraintWidget5;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                boolean z20 = false;
                while (!z20) {
                    c0737c.f4953i += i20;
                    constraintWidget6.f4897r0[i21] = null;
                    constraintWidget6.f4895q0[i21] = null;
                    int i23 = constraintWidget6.f4881j0;
                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget6.f4854S;
                    if (i23 != i19) {
                        constraintWidget6.m2730n(i21);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        constraintAnchorArr2[i22].m2690e();
                        int i24 = i22 + 1;
                        constraintAnchorArr2[i24].m2690e();
                        constraintAnchorArr2[i22].m2690e();
                        constraintAnchorArr2[i24].m2690e();
                        if (c0737c.f4946b == null) {
                            c0737c.f4946b = constraintWidget6;
                        }
                        c0737c.f4948d = constraintWidget6;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.f4857V[i21];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i25 = constraintWidget6.f4902u[i21];
                            z18 = z20;
                            if (i25 == 0 || i25 == 3 || i25 == 2) {
                                c0737c.f4954j++;
                                float f10 = constraintWidget6.f4893p0[i21];
                                if (f10 > 0.0f) {
                                    c0737c.f4955k += f10;
                                }
                                if (constraintWidget6.f4881j0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i25 == 0 || i25 == 3)) {
                                    if (f10 < 0.0f) {
                                        c0737c.f4958n = true;
                                    } else {
                                        c0737c.f4959o = true;
                                    }
                                    if (c0737c.f4952h == null) {
                                        c0737c.f4952h = new ArrayList<>();
                                    }
                                    c0737c.f4952h.add(constraintWidget6);
                                }
                                if (c0737c.f4950f == null) {
                                    c0737c.f4950f = constraintWidget6;
                                }
                                ConstraintWidget constraintWidget8 = c0737c.f4951g;
                                if (constraintWidget8 != null) {
                                    constraintWidget8.f4895q0[i21] = constraintWidget6;
                                }
                                c0737c.f4951g = constraintWidget6;
                            }
                        } else {
                            z18 = z20;
                        }
                        i18 = i18;
                    } else {
                        z18 = z20;
                        i18 = i18;
                    }
                    ConstraintWidget constraintWidget9 = constraintWidget7;
                    if (constraintWidget9 != constraintWidget6) {
                        constraintWidget9.f4897r0[i21] = constraintWidget6;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[i22 + 1].f4831f;
                    if (constraintAnchor4 != null) {
                        constraintWidget4 = constraintAnchor4.f4829d;
                        ConstraintAnchor constraintAnchor5 = constraintWidget4.f4854S[i22].f4831f;
                        if (constraintAnchor5 == null || constraintAnchor5.f4829d != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 != null) {
                        z20 = z18;
                    } else {
                        constraintWidget4 = constraintWidget6;
                        z20 = true;
                    }
                    constraintWidget7 = constraintWidget6;
                    i18 = i18;
                    i11 = i11;
                    i20 = 1;
                    i19 = 8;
                    constraintWidget6 = constraintWidget4;
                }
                i13 = i18;
                i14 = i11;
                ConstraintWidget constraintWidget10 = c0737c.f4946b;
                if (constraintWidget10 != null) {
                    constraintWidget10.f4854S[i22].m2690e();
                }
                ConstraintWidget constraintWidget11 = c0737c.f4948d;
                if (constraintWidget11 != null) {
                    constraintWidget11.f4854S[i22 + 1].m2690e();
                }
                c0737c.f4947c = constraintWidget6;
                if (i21 == 0 && c0737c.f4957m) {
                    c0737c.f4949e = constraintWidget6;
                } else {
                    c0737c.f4949e = constraintWidget5;
                }
                c0737c.f4960p = c0737c.f4959o && c0737c.f4958n;
                z10 = true;
            }
            c0737c.f4961q = z10;
            if (arrayList == 0 || arrayList.contains(constraintWidget5)) {
                ConstraintWidget constraintWidget12 = c0737c.f4947c;
                ConstraintWidget constraintWidget13 = c0737c.f4946b;
                ConstraintWidget constraintWidget14 = c0737c.f4948d;
                ConstraintWidget constraintWidget15 = c0737c.f4949e;
                float f11 = c0737c.f4955k;
                boolean z21 = c0738d2.f4857V[i10] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i10 == 0) {
                    int i26 = constraintWidget15.f4889n0;
                    boolean z22 = i26 == 0;
                    z12 = i26 == 1;
                    if (i26 == 2) {
                        z13 = z22;
                        z14 = z13;
                        z15 = z12;
                        z16 = true;
                    } else {
                        z11 = z22;
                        z14 = z11;
                        z15 = z12;
                        z16 = false;
                    }
                } else {
                    int i27 = constraintWidget15.f4891o0;
                    boolean z23 = i27 == 0;
                    boolean z24 = i27 == 1;
                    if (i27 == 2) {
                        z13 = z23;
                        z12 = z24;
                        z14 = z13;
                        z15 = z12;
                        z16 = true;
                    } else {
                        z11 = z23;
                        z12 = z24;
                        z14 = z11;
                        z15 = z12;
                        z16 = false;
                    }
                }
                ConstraintWidget constraintWidget16 = constraintWidget5;
                boolean z25 = false;
                while (true) {
                    constraintAnchorArr = c0738d2.f4854S;
                    if (z25) {
                        break;
                    }
                    float f12 = f11;
                    ConstraintAnchor constraintAnchor6 = constraintWidget16.f4854S[i12];
                    int i28 = z16 ? 1 : 4;
                    int iM2690e = constraintAnchor6.m2690e();
                    boolean z26 = z25;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget16.f4857V[i10];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z27 = dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget16.f4902u[i10] == 0;
                    ConstraintAnchor constraintAnchor7 = constraintAnchor6.f4831f;
                    if (constraintAnchor7 != null && constraintWidget16 != constraintWidget5) {
                        iM2690e = constraintAnchor7.m2690e() + iM2690e;
                    }
                    int i29 = iM2690e;
                    if (z16 && constraintWidget16 != constraintWidget5 && constraintWidget16 != constraintWidget13) {
                        i28 = 8;
                    }
                    ConstraintAnchor constraintAnchor8 = constraintAnchor6.f4831f;
                    if (constraintAnchor8 != null) {
                        if (constraintWidget16 == constraintWidget13) {
                            c0726c.m2670f(constraintAnchor6.f4834i, constraintAnchor8.f4834i, i29, 6);
                        } else {
                            c0726c.m2670f(constraintAnchor6.f4834i, constraintAnchor8.f4834i, i29, 8);
                        }
                        if (z27 && !z16) {
                            i28 = 5;
                        }
                        c0726c.m2669e(constraintAnchor6.f4834i, constraintAnchor6.f4831f.f4834i, i29, (constraintWidget16 == constraintWidget13 && z16 && constraintWidget16.f4856U[i10]) ? 5 : i28);
                    } else {
                        c0737c = c0737c;
                        constraintWidget5 = constraintWidget5;
                    }
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget16.f4854S;
                    if (z21) {
                        if (constraintWidget16.f4881j0 == 8 || constraintWidget16.f4857V[i10] != dimensionBehaviour4) {
                            i17 = 0;
                        } else {
                            i17 = 0;
                            c0726c.m2670f(constraintAnchorArr3[i12 + 1].f4834i, constraintAnchorArr3[i12].f4834i, 0, 5);
                        }
                        c0726c.m2670f(constraintAnchorArr3[i12].f4834i, constraintAnchorArr[i12].f4834i, i17, 8);
                    }
                    ConstraintAnchor constraintAnchor9 = constraintAnchorArr3[i12 + 1].f4831f;
                    if (constraintAnchor9 != null) {
                        constraintWidget3 = constraintAnchor9.f4829d;
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.f4854S[i12].f4831f;
                        if (constraintAnchor10 == null || constraintAnchor10.f4829d != constraintWidget16) {
                            constraintWidget3 = null;
                        }
                    } else {
                        constraintWidget3 = null;
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget16 = constraintWidget3;
                        z25 = z26;
                    } else {
                        z25 = true;
                    }
                    f11 = f12;
                    constraintWidget15 = constraintWidget15;
                    c0737cArr = c0737cArr;
                    constraintWidget5 = constraintWidget5;
                    c0737c = c0737c;
                }
                C0737c c0737c2 = c0737c;
                ConstraintWidget constraintWidget17 = constraintWidget15;
                float f13 = f11;
                ConstraintWidget constraintWidget18 = constraintWidget5;
                c0737cArr2 = c0737cArr;
                if (constraintWidget14 != null) {
                    int i30 = i12 + 1;
                    if (constraintWidget12.f4854S[i30].f4831f != null) {
                        ConstraintAnchor constraintAnchor11 = constraintWidget14.f4854S[i30];
                        if ((constraintWidget14.f4857V[i10] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget14.f4902u[i10] == 0) && !z16) {
                            ConstraintAnchor constraintAnchor12 = constraintAnchor11.f4831f;
                            if (constraintAnchor12.f4829d == c0738d2) {
                                c0726c.m2669e(constraintAnchor11.f4834i, constraintAnchor12.f4834i, -constraintAnchor11.m2690e(), 5);
                            } else if (z16) {
                                constraintAnchor3 = constraintAnchor11.f4831f;
                                if (constraintAnchor3.f4829d == c0738d2) {
                                    c0726c.m2669e(constraintAnchor11.f4834i, constraintAnchor3.f4834i, -constraintAnchor11.m2690e(), 4);
                                }
                            }
                        } else if (z16) {
                            constraintAnchor3 = constraintAnchor11.f4831f;
                            if (constraintAnchor3.f4829d == c0738d2) {
                                c0726c.m2669e(constraintAnchor11.f4834i, constraintAnchor3.f4834i, -constraintAnchor11.m2690e(), 4);
                            }
                        }
                        c0726c.m2671g(constraintAnchor11.f4834i, constraintWidget12.f4854S[i30].f4831f.f4834i, -constraintAnchor11.m2690e(), 6);
                    }
                }
                if (z21) {
                    int i31 = i12 + 1;
                    SolverVariable solverVariable5 = constraintAnchorArr[i31].f4834i;
                    ConstraintAnchor constraintAnchor13 = constraintWidget12.f4854S[i31];
                    c0726c.m2670f(solverVariable5, constraintAnchor13.f4834i, constraintAnchor13.m2690e(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = c0737c2.f4952h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    if (c0737c2.f4958n && !c0737c2.f4960p) {
                        f13 = c0737c2.f4954j;
                    }
                    ConstraintWidget constraintWidget19 = null;
                    float f14 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        ConstraintWidget constraintWidget20 = arrayList2.get(i32);
                        float f15 = constraintWidget20.f4893p0[i10];
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget20.f4854S;
                        if (f15 < 0.0f) {
                            if (c0737c2.f4960p) {
                                c0726c.m2669e(constraintAnchorArr4[i12 + 1].f4834i, constraintAnchorArr4[i12].f4834i, 0, 4);
                                z17 = false;
                            } else {
                                f15 = 1.0f;
                                f3 = 0.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i32++;
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            f3 = 0.0f;
                        }
                        if (f15 == f3) {
                            z17 = false;
                            c0726c.m2669e(constraintAnchorArr4[i12 + 1].f4834i, constraintAnchorArr4[i12].f4834i, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (constraintWidget19 != null) {
                                ConstraintAnchor[] constraintAnchorArr5 = constraintWidget19.f4854S;
                                SolverVariable solverVariable6 = constraintAnchorArr5[i12].f4834i;
                                int i33 = i12 + 1;
                                SolverVariable solverVariable7 = constraintAnchorArr5[i33].f4834i;
                                SolverVariable solverVariable8 = constraintAnchorArr4[i12].f4834i;
                                SolverVariable solverVariable9 = constraintAnchorArr4[i33].f4834i;
                                C0725b c0725bM2676l = c0726c.m2676l();
                                c0725bM2676l.f4799b = 0.0f;
                                if (f13 == 0.0f || f14 == f15) {
                                    c0725bM2676l.f4801d.mo2647d(solverVariable6, 1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable7, -1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable9, 1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable8, -1.0f);
                                } else if (f14 == 0.0f) {
                                    c0725bM2676l.f4801d.mo2647d(solverVariable6, 1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable7, -1.0f);
                                } else if (f15 == f3) {
                                    c0725bM2676l.f4801d.mo2647d(solverVariable8, 1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable9, -1.0f);
                                } else {
                                    float f16 = (f14 / f13) / (f15 / f13);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable6, 1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable7, -1.0f);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable9, f16);
                                    c0725bM2676l.f4801d.mo2647d(solverVariable8, -f16);
                                }
                                c0726c.m2667c(c0725bM2676l);
                            } else {
                                constraintWidget20 = constraintWidget20;
                            }
                            f14 = f15;
                            constraintWidget19 = constraintWidget20;
                        }
                        i32++;
                        arrayList2 = arrayList2;
                        size = size;
                    }
                }
                int i34 = 4;
                if (constraintWidget13 == null || !(constraintWidget13 == constraintWidget14 || z16)) {
                    i15 = i13;
                    ConstraintWidget constraintWidget21 = constraintWidget18;
                    if (!z14 || constraintWidget13 == null) {
                        i13 = i15;
                        int i35 = 8;
                        if (z15 && constraintWidget13 != null) {
                            int i36 = c0737c2.f4954j;
                            boolean z28 = i36 > 0 && c0737c2.f4953i == i36;
                            ConstraintWidget constraintWidget22 = constraintWidget13;
                            ConstraintWidget constraintWidget23 = constraintWidget22;
                            while (constraintWidget22 != null) {
                                ConstraintWidget constraintWidget24 = constraintWidget22.f4897r0[i10];
                                while (constraintWidget24 != null && constraintWidget24.f4881j0 == i35) {
                                    constraintWidget24 = constraintWidget24.f4897r0[i10];
                                }
                                if (constraintWidget22 == constraintWidget13 || constraintWidget22 == constraintWidget14 || constraintWidget24 == null) {
                                    i16 = i35;
                                    i34 = i34;
                                    constraintWidget = constraintWidget23;
                                } else {
                                    ConstraintWidget constraintWidget25 = constraintWidget24 == constraintWidget14 ? null : constraintWidget24;
                                    ConstraintAnchor[] constraintAnchorArr6 = constraintWidget22.f4854S;
                                    ConstraintAnchor constraintAnchor14 = constraintAnchorArr6[i12];
                                    SolverVariable solverVariable10 = constraintAnchor14.f4834i;
                                    int i37 = i12 + 1;
                                    SolverVariable solverVariable11 = constraintWidget23.f4854S[i37].f4834i;
                                    int iM2690e2 = constraintAnchor14.m2690e();
                                    int iM2690e3 = constraintAnchorArr6[i37].m2690e();
                                    if (constraintWidget25 != null) {
                                        constraintAnchor = constraintWidget25.f4854S[i12];
                                        solverVariable2 = constraintAnchor.f4834i;
                                        ConstraintAnchor constraintAnchor15 = constraintAnchor.f4831f;
                                        solverVariable = constraintAnchor15 != null ? constraintAnchor15.f4834i : null;
                                    } else {
                                        ConstraintAnchor constraintAnchor16 = constraintWidget14.f4854S[i12];
                                        SolverVariable solverVariable12 = constraintAnchor16 != null ? constraintAnchor16.f4834i : null;
                                        solverVariable = constraintAnchorArr6[i37].f4834i;
                                        constraintAnchor = constraintAnchor16;
                                        solverVariable2 = solverVariable12;
                                    }
                                    int iM2690e4 = constraintAnchor != null ? constraintAnchor.m2690e() + iM2690e3 : iM2690e3;
                                    int iM2690e5 = constraintWidget23.f4854S[i37].m2690e() + iM2690e2;
                                    int i38 = z28 ? 8 : i34;
                                    if (solverVariable10 == null || solverVariable11 == null || solverVariable2 == null || solverVariable == null) {
                                        i16 = 8;
                                        constraintWidget = constraintWidget23;
                                    } else {
                                        SolverVariable solverVariable13 = solverVariable;
                                        constraintWidget = constraintWidget23;
                                        i16 = 8;
                                        c0726c.m2666b(solverVariable10, solverVariable11, iM2690e5, 0.5f, solverVariable2, solverVariable13, iM2690e4, i38);
                                    }
                                    constraintWidget24 = constraintWidget25;
                                }
                                constraintWidget23 = constraintWidget22.f4881j0 != i16 ? constraintWidget22 : constraintWidget;
                                constraintWidget22 = constraintWidget24;
                                i35 = i16;
                                i34 = i34;
                            }
                            ConstraintAnchor constraintAnchor17 = constraintWidget13.f4854S[i12];
                            ConstraintAnchor constraintAnchor18 = constraintWidget21.f4854S[i12].f4831f;
                            int i39 = i12 + 1;
                            ConstraintAnchor constraintAnchor19 = constraintWidget14.f4854S[i39];
                            ConstraintAnchor constraintAnchor20 = constraintWidget12.f4854S[i39].f4831f;
                            if (constraintAnchor18 != null) {
                                if (constraintWidget13 != constraintWidget14) {
                                    c0726c.m2669e(constraintAnchor17.f4834i, constraintAnchor18.f4834i, constraintAnchor17.m2690e(), 5);
                                } else if (constraintAnchor20 != null) {
                                    c0726c.m2666b(constraintAnchor17.f4834i, constraintAnchor18.f4834i, constraintAnchor17.m2690e(), 0.5f, constraintAnchor19.f4834i, constraintAnchor20.f4834i, constraintAnchor19.m2690e(), 5);
                                }
                            }
                            if (constraintAnchor20 != null && constraintWidget13 != constraintWidget14) {
                                c0726c.m2669e(constraintAnchor19.f4834i, constraintAnchor20.f4834i, -constraintAnchor19.m2690e(), 5);
                            }
                        }
                    } else {
                        int i40 = c0737c2.f4954j;
                        boolean z29 = i40 > 0 && c0737c2.f4953i == i40;
                        ConstraintWidget constraintWidget26 = constraintWidget13;
                        ConstraintWidget constraintWidget27 = constraintWidget26;
                        while (constraintWidget27 != null) {
                            ConstraintWidget constraintWidget28 = constraintWidget27.f4897r0[i10];
                            while (constraintWidget28 != null && constraintWidget28.f4881j0 == 8) {
                                constraintWidget28 = constraintWidget28.f4897r0[i10];
                            }
                            if (constraintWidget28 != null || constraintWidget27 == constraintWidget14) {
                                ConstraintAnchor[] constraintAnchorArr7 = constraintWidget27.f4854S;
                                ConstraintAnchor constraintAnchor21 = constraintAnchorArr7[i12];
                                SolverVariable solverVariable14 = constraintAnchor21.f4834i;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor21.f4831f;
                                SolverVariable solverVariable15 = constraintAnchor22 != null ? constraintAnchor22.f4834i : null;
                                if (constraintWidget26 != constraintWidget27) {
                                    solverVariable15 = constraintWidget26.f4854S[i12 + 1].f4834i;
                                } else if (constraintWidget27 == constraintWidget13) {
                                    ConstraintAnchor constraintAnchor23 = constraintWidget21.f4854S[i12].f4831f;
                                    solverVariable15 = constraintAnchor23 != null ? constraintAnchor23.f4834i : null;
                                }
                                int iM2690e6 = constraintAnchor21.m2690e();
                                int i41 = i12 + 1;
                                int iM2690e7 = constraintAnchorArr7[i41].m2690e();
                                if (constraintWidget28 != null) {
                                    constraintAnchor2 = constraintWidget28.f4854S[i12];
                                    solverVariable3 = constraintAnchor2.f4834i;
                                } else {
                                    constraintAnchor2 = constraintWidget12.f4854S[i41].f4831f;
                                    solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f4834i : null;
                                }
                                SolverVariable solverVariable16 = constraintAnchorArr7[i41].f4834i;
                                if (constraintAnchor2 != null) {
                                    iM2690e7 = constraintAnchor2.m2690e() + iM2690e7;
                                }
                                int iM2690e8 = constraintWidget26.f4854S[i41].m2690e() + iM2690e6;
                                if (solverVariable14 == null || solverVariable15 == null || solverVariable3 == null || solverVariable16 == null) {
                                    constraintWidget2 = constraintWidget28;
                                } else {
                                    if (constraintWidget27 == constraintWidget13) {
                                        iM2690e8 = constraintWidget13.f4854S[i12].m2690e();
                                    }
                                    if (constraintWidget27 == constraintWidget14) {
                                        iM2690e7 = constraintWidget14.f4854S[i41].m2690e();
                                    }
                                    int i42 = iM2690e7;
                                    constraintWidget2 = constraintWidget28;
                                    c0726c.m2666b(solverVariable14, solverVariable15, iM2690e8, 0.5f, solverVariable3, solverVariable16, i42, z29 ? 8 : 5);
                                }
                            } else {
                                constraintWidget2 = constraintWidget28;
                            }
                            constraintWidget26 = constraintWidget27.f4881j0 != 8 ? constraintWidget27 : constraintWidget26;
                            constraintWidget21 = constraintWidget21;
                            constraintWidget27 = constraintWidget2;
                            i15 = i15;
                        }
                        i13 = i15;
                    }
                } else {
                    ConstraintAnchor constraintAnchor24 = constraintWidget18.f4854S[i12];
                    int i43 = i12 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget12.f4854S[i43];
                    ConstraintAnchor constraintAnchor26 = constraintAnchor24.f4831f;
                    SolverVariable solverVariable17 = constraintAnchor26 != null ? constraintAnchor26.f4834i : null;
                    ConstraintAnchor constraintAnchor27 = constraintAnchor25.f4831f;
                    SolverVariable solverVariable18 = constraintAnchor27 != null ? constraintAnchor27.f4834i : null;
                    ConstraintAnchor constraintAnchor28 = constraintWidget13.f4854S[i12];
                    if (constraintWidget14 != null) {
                        constraintAnchor25 = constraintWidget14.f4854S[i43];
                    }
                    if (solverVariable17 == null || solverVariable18 == null) {
                        i15 = i13;
                        i13 = i15;
                    } else {
                        c0726c.m2666b(constraintAnchor28.f4834i, solverVariable17, constraintAnchor28.m2690e(), i10 == 0 ? constraintWidget17.f4875g0 : constraintWidget17.f4877h0, solverVariable18, constraintAnchor25.f4834i, constraintAnchor25.m2690e(), 7);
                    }
                }
                if ((z14 || z15) && constraintWidget13 != null && constraintWidget13 != constraintWidget14) {
                    ConstraintAnchor[] constraintAnchorArr8 = constraintWidget13.f4854S;
                    ConstraintAnchor constraintAnchor29 = constraintAnchorArr8[i12];
                    if (constraintWidget14 == null) {
                        constraintWidget14 = constraintWidget13;
                    }
                    int i44 = i12 + 1;
                    ConstraintAnchor constraintAnchor30 = constraintWidget14.f4854S[i44];
                    ConstraintAnchor constraintAnchor31 = constraintAnchor29.f4831f;
                    SolverVariable solverVariable19 = constraintAnchor31 != null ? constraintAnchor31.f4834i : null;
                    ConstraintAnchor constraintAnchor32 = constraintAnchor30.f4831f;
                    SolverVariable solverVariable20 = constraintAnchor32 != null ? constraintAnchor32.f4834i : null;
                    if (constraintWidget12 != constraintWidget14) {
                        ConstraintAnchor constraintAnchor33 = constraintWidget12.f4854S[i44].f4831f;
                        solverVariable4 = constraintAnchor33 != null ? constraintAnchor33.f4834i : null;
                    } else {
                        solverVariable4 = solverVariable20;
                    }
                    if (constraintWidget13 == constraintWidget14) {
                        constraintAnchor30 = constraintAnchorArr8[i44];
                    }
                    if (solverVariable19 != null && solverVariable4 != null) {
                        c0726c.m2666b(constraintAnchor29.f4834i, solverVariable19, constraintAnchor29.m2690e(), 0.5f, solverVariable4, constraintAnchor30.f4834i, constraintWidget14.f4854S[i44].m2690e(), 5);
                    }
                }
            } else {
                c0737cArr2 = c0737cArr;
            }
            i18 = i13 + 1;
            c0738d2 = c0738d;
            i11 = i14;
            c0737cArr = c0737cArr2;
        }
    }
}
