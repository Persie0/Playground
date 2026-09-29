package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0726c;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0739e extends C0743i {

    /* JADX INFO: renamed from: g1 */
    public ConstraintWidget[] f5006g1;

    /* JADX INFO: renamed from: J0 */
    public int f4983J0 = -1;

    /* JADX INFO: renamed from: K0 */
    public int f4984K0 = -1;

    /* JADX INFO: renamed from: L0 */
    public int f4985L0 = -1;

    /* JADX INFO: renamed from: M0 */
    public int f4986M0 = -1;

    /* JADX INFO: renamed from: N0 */
    public int f4987N0 = -1;

    /* JADX INFO: renamed from: O0 */
    public int f4988O0 = -1;

    /* JADX INFO: renamed from: P0 */
    public float f4989P0 = 0.5f;

    /* JADX INFO: renamed from: Q0 */
    public float f4990Q0 = 0.5f;

    /* JADX INFO: renamed from: R0 */
    public float f4991R0 = 0.5f;

    /* JADX INFO: renamed from: S0 */
    public float f4992S0 = 0.5f;

    /* JADX INFO: renamed from: T0 */
    public float f4993T0 = 0.5f;

    /* JADX INFO: renamed from: U0 */
    public float f4994U0 = 0.5f;

    /* JADX INFO: renamed from: V0 */
    public int f4995V0 = 0;

    /* JADX INFO: renamed from: W0 */
    public int f4996W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f4997X0 = 2;

    /* JADX INFO: renamed from: Y0 */
    public int f4998Y0 = 2;

    /* JADX INFO: renamed from: Z0 */
    public int f4999Z0 = 0;

    /* JADX INFO: renamed from: a1 */
    public int f5000a1 = -1;

    /* JADX INFO: renamed from: b1 */
    public int f5001b1 = 0;

    /* JADX INFO: renamed from: c1 */
    public final ArrayList<a> f5002c1 = new ArrayList<>();

    /* JADX INFO: renamed from: d1 */
    public ConstraintWidget[] f5003d1 = null;

    /* JADX INFO: renamed from: e1 */
    public ConstraintWidget[] f5004e1 = null;

    /* JADX INFO: renamed from: f1 */
    public int[] f5005f1 = null;

    /* JADX INFO: renamed from: h1 */
    public int f5007h1 = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.e$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f5008a;

        /* JADX INFO: renamed from: d */
        public ConstraintAnchor f5011d;

        /* JADX INFO: renamed from: e */
        public ConstraintAnchor f5012e;

        /* JADX INFO: renamed from: f */
        public ConstraintAnchor f5013f;

        /* JADX INFO: renamed from: g */
        public ConstraintAnchor f5014g;

        /* JADX INFO: renamed from: h */
        public int f5015h;

        /* JADX INFO: renamed from: i */
        public int f5016i;

        /* JADX INFO: renamed from: j */
        public int f5017j;

        /* JADX INFO: renamed from: k */
        public int f5018k;

        /* JADX INFO: renamed from: q */
        public int f5024q;

        /* JADX INFO: renamed from: b */
        public ConstraintWidget f5009b = null;

        /* JADX INFO: renamed from: c */
        public int f5010c = 0;

        /* JADX INFO: renamed from: l */
        public int f5019l = 0;

        /* JADX INFO: renamed from: m */
        public int f5020m = 0;

        /* JADX INFO: renamed from: n */
        public int f5021n = 0;

        /* JADX INFO: renamed from: o */
        public int f5022o = 0;

        /* JADX INFO: renamed from: p */
        public int f5023p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f5015h = 0;
            this.f5016i = 0;
            this.f5017j = 0;
            this.f5018k = 0;
            this.f5024q = 0;
            this.f5008a = i10;
            this.f5011d = constraintAnchor;
            this.f5012e = constraintAnchor2;
            this.f5013f = constraintAnchor3;
            this.f5014g = constraintAnchor4;
            this.f5015h = C0739e.this.f5036C0;
            this.f5016i = C0739e.this.f5043y0;
            this.f5017j = C0739e.this.f5037D0;
            this.f5018k = C0739e.this.f5044z0;
            this.f5024q = i11;
        }

        /* JADX INFO: renamed from: a */
        public final void m2772a(ConstraintWidget constraintWidget) {
            int i10 = this.f5008a;
            int i11 = 0;
            C0739e c0739e = C0739e.this;
            if (i10 == 0) {
                int iM2771Y = c0739e.m2771Y(this.f5024q, constraintWidget);
                if (constraintWidget.f4857V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f5023p++;
                    iM2771Y = 0;
                }
                this.f5019l = iM2771Y + (constraintWidget.f4881j0 != 8 ? c0739e.f4995V0 : 0) + this.f5019l;
                int iM2770X = c0739e.m2770X(this.f5024q, constraintWidget);
                if (this.f5009b == null || this.f5010c < iM2770X) {
                    this.f5009b = constraintWidget;
                    this.f5010c = iM2770X;
                    this.f5020m = iM2770X;
                }
            } else {
                int iM2771Y2 = c0739e.m2771Y(this.f5024q, constraintWidget);
                int iM2770X2 = c0739e.m2770X(this.f5024q, constraintWidget);
                if (constraintWidget.f4857V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f5023p++;
                    iM2770X2 = 0;
                }
                int i12 = c0739e.f4996W0;
                if (constraintWidget.f4881j0 != 8) {
                    i11 = i12;
                }
                this.f5020m = iM2770X2 + i11 + this.f5020m;
                if (this.f5009b == null || this.f5010c < iM2771Y2) {
                    this.f5009b = constraintWidget;
                    this.f5010c = iM2771Y2;
                    this.f5019l = iM2771Y2;
                }
            }
            this.f5022o++;
        }

        /* JADX INFO: renamed from: b */
        public final void m2773b(int i10, boolean z10, boolean z11) {
            C0739e c0739e;
            int i11;
            int i12;
            ConstraintWidget constraintWidget;
            char c10;
            int i13;
            float f3;
            int i14;
            int i15;
            int i16 = this.f5022o;
            int i17 = 0;
            while (true) {
                c0739e = C0739e.this;
                if (i17 >= i16 || (i15 = this.f5021n + i17) >= c0739e.f5007h1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = c0739e.f5006g1[i15];
                if (constraintWidget2 != null) {
                    constraintWidget2.m2709H();
                }
                i17++;
            }
            if (i16 == 0 || this.f5009b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < i16; i20++) {
                int i21 = this.f5021n + (z10 ? (i16 - 1) - i20 : i20);
                if (i21 >= c0739e.f5007h1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = c0739e.f5006g1[i21];
                if (constraintWidget3 != null && constraintWidget3.f4881j0 == 0) {
                    if (i18 == -1) {
                        i18 = i20;
                    }
                    i19 = i20;
                }
            }
            if (this.f5008a != 0) {
                ConstraintWidget constraintWidget4 = this.f5009b;
                constraintWidget4.f4889n0 = c0739e.f4983J0;
                int i22 = this.f5015h;
                if (i10 > 0) {
                    i22 += c0739e.f4995V0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget4.f4848M;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.f4846K;
                if (z10) {
                    constraintAnchor.m2686a(this.f5013f, i22);
                    if (z11) {
                        constraintAnchor2.m2686a(this.f5011d, this.f5017j);
                    }
                    if (i10 > 0) {
                        this.f5013f.f4829d.f4846K.m2686a(constraintAnchor, 0);
                    }
                } else {
                    constraintAnchor2.m2686a(this.f5011d, i22);
                    if (z11) {
                        constraintAnchor.m2686a(this.f5013f, this.f5017j);
                    }
                    if (i10 > 0) {
                        this.f5011d.f4829d.f4848M.m2686a(constraintAnchor2, 0);
                    }
                }
                int i23 = 0;
                ConstraintWidget constraintWidget5 = null;
                while (i23 < i16) {
                    int i24 = this.f5021n + i23;
                    if (i24 >= c0739e.f5007h1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = c0739e.f5006g1[i24];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget5;
                    } else {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.f4847L;
                        if (i23 == 0) {
                            constraintWidget6.m2725i(constraintAnchor3, this.f5012e, this.f5016i);
                            int i25 = c0739e.f4984K0;
                            float f10 = c0739e.f4990Q0;
                            if (this.f5021n == 0) {
                                i12 = c0739e.f4986M0;
                                i11 = -1;
                                if (i12 != -1) {
                                    f10 = c0739e.f4992S0;
                                }
                                constraintWidget6.f4891o0 = i12;
                                constraintWidget6.f4877h0 = f10;
                            } else {
                                i11 = -1;
                            }
                            if (!z11 || (i12 = c0739e.f4988O0) == i11) {
                                i12 = i25;
                            } else {
                                f10 = c0739e.f4994U0;
                            }
                            constraintWidget6.f4891o0 = i12;
                            constraintWidget6.f4877h0 = f10;
                        }
                        if (i23 == i16 - 1) {
                            constraintWidget6.m2725i(constraintWidget6.f4849N, this.f5014g, this.f5018k);
                        }
                        if (constraintWidget5 != null) {
                            int i26 = c0739e.f4996W0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget5.f4849N;
                            constraintAnchor3.m2686a(constraintAnchor4, i26);
                            if (i23 == i18) {
                                int i27 = this.f5016i;
                                if (constraintAnchor3.m2693h()) {
                                    constraintAnchor3.f4833h = i27;
                                }
                            }
                            constraintAnchor4.m2686a(constraintAnchor3, 0);
                            if (i23 == i19 + 1) {
                                int i28 = this.f5018k;
                                if (constraintAnchor4.m2693h()) {
                                    constraintAnchor4.f4833h = i28;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget6.f4848M;
                            ConstraintAnchor constraintAnchor6 = constraintWidget6.f4846K;
                            if (z10) {
                                int i29 = c0739e.f4997X0;
                                if (i29 == 0) {
                                    constraintAnchor5.m2686a(constraintAnchor, 0);
                                } else if (i29 == 1) {
                                    constraintAnchor6.m2686a(constraintAnchor2, 0);
                                } else if (i29 == 2) {
                                    constraintAnchor6.m2686a(constraintAnchor2, 0);
                                    constraintAnchor5.m2686a(constraintAnchor, 0);
                                }
                            } else {
                                int i30 = c0739e.f4997X0;
                                if (i30 == 0) {
                                    constraintAnchor6.m2686a(constraintAnchor2, 0);
                                } else if (i30 == 1) {
                                    constraintAnchor5.m2686a(constraintAnchor, 0);
                                } else if (i30 == 2) {
                                    if (z12) {
                                        constraintAnchor6.m2686a(this.f5011d, this.f5015h);
                                        constraintAnchor5.m2686a(this.f5013f, this.f5017j);
                                    } else {
                                        constraintAnchor6.m2686a(constraintAnchor2, 0);
                                        constraintAnchor5.m2686a(constraintAnchor, 0);
                                    }
                                }
                            }
                        }
                        i23++;
                        constraintWidget5 = constraintWidget6;
                    }
                    i23++;
                    constraintWidget5 = constraintWidget6;
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f5009b;
            constraintWidget7.f4891o0 = c0739e.f4984K0;
            int i31 = this.f5016i;
            if (i10 > 0) {
                i31 += c0739e.f4996W0;
            }
            ConstraintAnchor constraintAnchor7 = this.f5012e;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.f4847L;
            constraintAnchor8.m2686a(constraintAnchor7, i31);
            ConstraintAnchor constraintAnchor9 = constraintWidget7.f4849N;
            if (z11) {
                constraintAnchor9.m2686a(this.f5014g, this.f5018k);
            }
            if (i10 > 0) {
                this.f5012e.f4829d.f4849N.m2686a(constraintAnchor8, 0);
            }
            if (c0739e.f4998Y0 != 3 || constraintWidget7.f4841F) {
                constraintWidget = constraintWidget7;
                break;
            }
            int i32 = 0;
            while (true) {
                if (i32 < i16) {
                    int i33 = this.f5021n + (z10 ? (i16 - 1) - i32 : i32);
                    if (i33 < c0739e.f5007h1) {
                        constraintWidget = c0739e.f5006g1[i33];
                        if (constraintWidget.f4841F) {
                            break;
                        } else {
                            i32++;
                        }
                    }
                }
                constraintWidget = constraintWidget7;
                break;
            }
            int i34 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (i34 < i16) {
                int i35 = z10 ? (i16 - 1) - i34 : i34;
                int i36 = this.f5021n + i35;
                if (i36 >= c0739e.f5007h1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = c0739e.f5006g1[i36];
                if (constraintWidget9 == null) {
                    i16 = i16;
                    c10 = 3;
                } else {
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.f4846K;
                    if (i34 == 0) {
                        constraintWidget9.m2725i(constraintAnchor10, this.f5011d, this.f5015h);
                    }
                    if (i35 == 0) {
                        int i37 = c0739e.f4983J0;
                        float f11 = z10 ? 1.0f - c0739e.f4989P0 : c0739e.f4989P0;
                        if (this.f5021n == 0 && (i14 = c0739e.f4985L0) != -1) {
                            f3 = z10 ? 1.0f - c0739e.f4991R0 : c0739e.f4991R0;
                            i13 = i14;
                        } else if (!z11 || (i13 = c0739e.f4987N0) == -1) {
                            i13 = i37;
                            f3 = f11;
                        } else {
                            f3 = z10 ? 1.0f - c0739e.f4993T0 : c0739e.f4993T0;
                        }
                        constraintWidget9.f4889n0 = i13;
                        constraintWidget9.f4875g0 = f3;
                    }
                    if (i34 == i16 - 1) {
                        constraintWidget9.m2725i(constraintWidget9.f4848M, this.f5013f, this.f5017j);
                    }
                    if (constraintWidget8 != null) {
                        int i38 = c0739e.f4995V0;
                        ConstraintAnchor constraintAnchor11 = constraintWidget8.f4848M;
                        constraintAnchor10.m2686a(constraintAnchor11, i38);
                        if (i34 == i18) {
                            int i39 = this.f5015h;
                            if (constraintAnchor10.m2693h()) {
                                constraintAnchor10.f4833h = i39;
                            }
                        }
                        constraintAnchor11.m2686a(constraintAnchor10, 0);
                        if (i34 == i19 + 1) {
                            int i40 = this.f5017j;
                            if (constraintAnchor11.m2693h()) {
                                constraintAnchor11.f4833h = i40;
                            }
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        int i41 = c0739e.f4998Y0;
                        c10 = 3;
                        if (i41 == 3 && constraintWidget.f4841F && constraintWidget9 != constraintWidget && constraintWidget9.f4841F) {
                            constraintWidget9.f4850O.m2686a(constraintWidget.f4850O, 0);
                        } else {
                            ConstraintAnchor constraintAnchor12 = constraintWidget9.f4847L;
                            if (i41 != 0) {
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.f4849N;
                                if (i41 == 1) {
                                    constraintAnchor13.m2686a(constraintAnchor9, 0);
                                } else if (z12) {
                                    constraintAnchor12.m2686a(this.f5012e, this.f5016i);
                                    constraintAnchor13.m2686a(this.f5014g, this.f5018k);
                                } else {
                                    constraintAnchor12.m2686a(constraintAnchor8, 0);
                                    constraintAnchor13.m2686a(constraintAnchor9, 0);
                                }
                            } else {
                                constraintAnchor12.m2686a(constraintAnchor8, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    constraintWidget8 = constraintWidget9;
                }
                i34++;
                i16 = i16;
            }
        }

        /* JADX INFO: renamed from: c */
        public final int m2774c() {
            return this.f5008a == 1 ? this.f5020m - C0739e.this.f4996W0 : this.f5020m;
        }

        /* JADX INFO: renamed from: d */
        public final int m2775d() {
            return this.f5008a == 0 ? this.f5019l - C0739e.this.f4995V0 : this.f5019l;
        }

        /* JADX INFO: renamed from: e */
        public final void m2776e(int i10) {
            int i11 = this.f5023p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f5022o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.f5021n;
                int i16 = i15 + i14;
                C0739e c0739e = C0739e.this;
                if (i16 >= c0739e.f5007h1) {
                    break;
                }
                ConstraintWidget constraintWidget = c0739e.f5006g1[i15 + i14];
                if (this.f5008a == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
                        if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4898s == 0) {
                            c0739e.m2782W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, dimensionBehaviourArr[1], constraintWidget.m2731o());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f4857V;
                    if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f4900t == 0) {
                        c0739e.m2782W(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.m2735u(), ConstraintWidget.DimensionBehaviour.FIXED, i13);
                    }
                }
            }
            this.f5019l = 0;
            this.f5020m = 0;
            this.f5009b = null;
            this.f5010c = 0;
            int i17 = this.f5022o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.f5021n + i18;
                C0739e c0739e2 = C0739e.this;
                if (i19 >= c0739e2.f5007h1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = c0739e2.f5006g1[i19];
                if (this.f5008a == 0) {
                    int iM2735u = constraintWidget2.m2735u();
                    int i20 = c0739e2.f4995V0;
                    if (constraintWidget2.f4881j0 == 8) {
                        i20 = 0;
                    }
                    this.f5019l = iM2735u + i20 + this.f5019l;
                    int iM2770X = c0739e2.m2770X(this.f5024q, constraintWidget2);
                    if (this.f5009b == null || this.f5010c < iM2770X) {
                        this.f5009b = constraintWidget2;
                        this.f5010c = iM2770X;
                        this.f5020m = iM2770X;
                    }
                } else {
                    int iM2771Y = c0739e2.m2771Y(this.f5024q, constraintWidget2);
                    int iM2770X2 = c0739e2.m2770X(this.f5024q, constraintWidget2);
                    int i21 = c0739e2.f4996W0;
                    if (constraintWidget2.f4881j0 == 8) {
                        i21 = 0;
                    }
                    this.f5020m = iM2770X2 + i21 + this.f5020m;
                    if (this.f5009b == null || this.f5010c < iM2771Y) {
                        this.f5009b = constraintWidget2;
                        this.f5010c = iM2771Y;
                        this.f5019l = iM2771Y;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m2777f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f5008a = i10;
            this.f5011d = constraintAnchor;
            this.f5012e = constraintAnchor2;
            this.f5013f = constraintAnchor3;
            this.f5014g = constraintAnchor4;
            this.f5015h = i11;
            this.f5016i = i12;
            this.f5017j = i13;
            this.f5018k = i14;
            this.f5024q = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:226:0x043a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x043c  */
    /* JADX WARN: Code duplicated, block: B:228:0x044b  */
    /* JADX WARN: Code duplicated, block: B:231:0x045d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0467  */
    /* JADX WARN: Code duplicated, block: B:238:0x0471  */
    /* JADX WARN: Code duplicated, block: B:242:0x047b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0482  */
    /* JADX WARN: Code duplicated, block: B:247:0x0486  */
    /* JADX WARN: Code duplicated, block: B:249:0x048f  */
    /* JADX WARN: Code duplicated, block: B:252:0x049a  */
    /* JADX WARN: Code duplicated, block: B:253:0x049d  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:260:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:270:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:278:0x0501  */
    /* JADX WARN: Code duplicated, block: B:280:0x0507 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x0509  */
    /* JADX WARN: Code duplicated, block: B:289:0x0526  */
    /* JADX WARN: Code duplicated, block: B:290:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:453:0x0538 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x0538 -> B:294:0x0546). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.constraintlayout.core.widgets.C0743i
    /* JADX INFO: renamed from: V */
    public final void mo2769V(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0739e.mo2769V(int, int, int, int):void");
    }

    /* JADX INFO: renamed from: X */
    public final int m2770X(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f4857V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f4900t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f4836A * i10);
                if (i12 != constraintWidget.m2731o()) {
                    constraintWidget.f4874g = true;
                    m2782W(constraintWidget, constraintWidget.f4857V[0], constraintWidget.m2735u(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.m2731o();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.m2735u() * constraintWidget.f4861Z) + 0.5f);
            }
        }
        return constraintWidget.m2731o();
    }

    /* JADX INFO: renamed from: Y */
    public final int m2771Y(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f4857V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f4898s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f4907x * i10);
                if (i12 != constraintWidget.m2735u()) {
                    constraintWidget.f4874g = true;
                    m2782W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.f4857V[1], constraintWidget.m2731o());
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.m2735u();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.m2731o() * constraintWidget.f4861Z) + 0.5f);
            }
        }
        return constraintWidget.m2735u();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public final void mo2721e(C0726c c0726c, boolean z10) {
        ConstraintWidget constraintWidget;
        float f3;
        int i10;
        super.mo2721e(c0726c, z10);
        ConstraintWidget constraintWidget2 = this.f4858W;
        boolean z11 = constraintWidget2 != null && ((C0738d) constraintWidget2).f4963B0;
        int i11 = this.f4999Z0;
        ArrayList<a> arrayList = this.f5002c1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            arrayList.get(i12).m2773b(i12, z11, i12 == size + (-1));
                            i12++;
                        }
                    }
                } else if (this.f5005f1 != null && this.f5004e1 != null && this.f5003d1 != null) {
                    for (int i13 = 0; i13 < this.f5007h1; i13++) {
                        this.f5006g1[i13].m2709H();
                    }
                    int[] iArr = this.f5005f1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f10 = this.f4989P0;
                    ConstraintWidget constraintWidget3 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f3 = 1.0f - this.f4989P0;
                        } else {
                            f3 = f10;
                            i10 = i16;
                        }
                        ConstraintWidget constraintWidget4 = this.f5004e1[i10];
                        if (constraintWidget4 != null && constraintWidget4.f4881j0 != 8) {
                            ConstraintAnchor constraintAnchor = constraintWidget4.f4846K;
                            if (i16 == 0) {
                                constraintWidget4.m2725i(constraintAnchor, this.f4846K, this.f5036C0);
                                constraintWidget4.f4889n0 = this.f4983J0;
                                constraintWidget4.f4875g0 = f3;
                            }
                            if (i16 == i14 - 1) {
                                constraintWidget4.m2725i(constraintWidget4.f4848M, this.f4848M, this.f5037D0);
                            }
                            if (i16 > 0 && constraintWidget3 != null) {
                                int i17 = this.f4995V0;
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.f4848M;
                                constraintWidget4.m2725i(constraintAnchor, constraintAnchor2, i17);
                                constraintWidget3.m2725i(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                        i16++;
                        f10 = f3;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        ConstraintWidget constraintWidget5 = this.f5003d1[i18];
                        if (constraintWidget5 != null) {
                            if (constraintWidget5.f4881j0 != 8) {
                                ConstraintAnchor constraintAnchor3 = constraintWidget5.f4847L;
                                if (i18 == 0) {
                                    constraintWidget5.m2725i(constraintAnchor3, this.f4847L, this.f5043y0);
                                    constraintWidget5.f4891o0 = this.f4984K0;
                                    constraintWidget5.f4877h0 = this.f4990Q0;
                                }
                                if (i18 == i15 - 1) {
                                    constraintWidget5.m2725i(constraintWidget5.f4849N, this.f4849N, this.f5044z0);
                                }
                                if (i18 > 0 && constraintWidget3 != null) {
                                    int i19 = this.f4996W0;
                                    ConstraintAnchor constraintAnchor4 = constraintWidget3.f4849N;
                                    constraintWidget5.m2725i(constraintAnchor3, constraintAnchor4, i19);
                                    constraintWidget3.m2725i(constraintAnchor4, constraintAnchor3, 0);
                                }
                                constraintWidget3 = constraintWidget5;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.f5001b1 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            ConstraintWidget[] constraintWidgetArr = this.f5006g1;
                            if (i22 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i22]) != null && constraintWidget.f4881j0 != 8) {
                                ConstraintWidget constraintWidget6 = this.f5004e1[i20];
                                ConstraintWidget constraintWidget7 = this.f5003d1[i21];
                                if (constraintWidget != constraintWidget6) {
                                    constraintWidget.m2725i(constraintWidget.f4846K, constraintWidget6.f4846K, 0);
                                    constraintWidget.m2725i(constraintWidget.f4848M, constraintWidget6.f4848M, 0);
                                }
                                if (constraintWidget != constraintWidget7) {
                                    constraintWidget.m2725i(constraintWidget.f4847L, constraintWidget7.f4847L, 0);
                                    constraintWidget.m2725i(constraintWidget.f4849N, constraintWidget7.f4849N, 0);
                                }
                            }
                        }
                    }
                }
                this.f5038E0 = false;
            }
            int size2 = arrayList.size();
            int i23 = 0;
            while (i23 < size2) {
                arrayList.get(i23).m2773b(i23, z11, i23 == size2 + (-1));
                i23++;
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).m2773b(0, z11, true);
        }
        this.f5038E0 = false;
    }

    @Override // p061d2.C5039b, androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: j */
    public final void mo2726j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.mo2726j(constraintWidget, map);
        C0739e c0739e = (C0739e) constraintWidget;
        this.f4983J0 = c0739e.f4983J0;
        this.f4984K0 = c0739e.f4984K0;
        this.f4985L0 = c0739e.f4985L0;
        this.f4986M0 = c0739e.f4986M0;
        this.f4987N0 = c0739e.f4987N0;
        this.f4988O0 = c0739e.f4988O0;
        this.f4989P0 = c0739e.f4989P0;
        this.f4990Q0 = c0739e.f4990Q0;
        this.f4991R0 = c0739e.f4991R0;
        this.f4992S0 = c0739e.f4992S0;
        this.f4993T0 = c0739e.f4993T0;
        this.f4994U0 = c0739e.f4994U0;
        this.f4995V0 = c0739e.f4995V0;
        this.f4996W0 = c0739e.f4996W0;
        this.f4997X0 = c0739e.f4997X0;
        this.f4998Y0 = c0739e.f4998Y0;
        this.f4999Z0 = c0739e.f4999Z0;
        this.f5000a1 = c0739e.f5000a1;
        this.f5001b1 = c0739e.f5001b1;
    }
}
