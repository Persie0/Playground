package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p061d2.InterfaceC5038a;
import p083e2.InterfaceC5356d;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0734c extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public static final int[] f4940k = new int[2];

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4941a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f4941a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4941a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4941a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0734c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f4935h.f4920e = DependencyNode.Type.LEFT;
        this.f4936i.f4920e = DependencyNode.Type.RIGHT;
        this.f4933f = 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m2759m(int[] iArr, int i10, int i11, int i12, int i13, float f3, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f3) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f3) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f3) + 0.5f);
        int i18 = (int) ((i15 / f3) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else {
            if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026e  */
    /* JADX WARN: Code duplicated, block: B:120:0x027d  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        int iM2754g;
        int i10;
        int iM2754g2;
        float f3;
        float f10;
        float f11;
        int i11;
        if (a.f4941a[this.f4937j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.f4929b;
            m2757l(constraintWidget.f4846K, constraintWidget.f4848M, 0);
            return;
        }
        C0732a c0732a = this.f4932e;
        boolean z10 = c0732a.f4925j;
        DependencyNode dependencyNode = this.f4935h;
        DependencyNode dependencyNode2 = this.f4936i;
        if (!z10 && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f4929b;
            int i12 = constraintWidget2.f4898s;
            if (i12 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f4858W;
                if (constraintWidget3 != null) {
                    C0732a c0732a2 = constraintWidget3.f4868d.f4932e;
                    if (c0732a2.f4925j) {
                        c0732a.mo2746d((int) ((c0732a2.f4922g * constraintWidget2.f4907x) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = constraintWidget2.f4900t;
                if (i13 == 0 || i13 == 3) {
                    C0735d c0735d = constraintWidget2.f4870e;
                    DependencyNode dependencyNode3 = c0735d.f4935h;
                    DependencyNode dependencyNode4 = c0735d.f4936i;
                    boolean z11 = constraintWidget2.f4846K.f4831f != null;
                    boolean z12 = constraintWidget2.f4847L.f4831f != null;
                    boolean z13 = constraintWidget2.f4848M.f4831f != null;
                    boolean z14 = constraintWidget2.f4849N.f4831f != null;
                    int i14 = constraintWidget2.f4863a0;
                    if (z11 && z12 && z13 && z14) {
                        float f12 = constraintWidget2.f4861Z;
                        boolean z15 = dependencyNode3.f4925j;
                        int[] iArr = f4940k;
                        if (z15 && dependencyNode4.f4925j) {
                            if (dependencyNode.f4918c && dependencyNode2.f4918c) {
                                m2759m(iArr, ((DependencyNode) dependencyNode.f4927l.get(0)).f4922g + dependencyNode.f4921f, ((DependencyNode) dependencyNode2.f4927l.get(0)).f4922g - dependencyNode2.f4921f, dependencyNode3.f4922g + dependencyNode3.f4921f, dependencyNode4.f4922g - dependencyNode4.f4921f, f12, i14);
                                c0732a.mo2746d(iArr[0]);
                                this.f4929b.f4870e.f4932e.mo2746d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z16 = dependencyNode.f4925j;
                        ArrayList arrayList = dependencyNode3.f4927l;
                        if (z16 && dependencyNode2.f4925j) {
                            if (!dependencyNode3.f4918c || !dependencyNode4.f4918c) {
                                return;
                            }
                            m2759m(iArr, dependencyNode.f4922g + dependencyNode.f4921f, dependencyNode2.f4922g - dependencyNode2.f4921f, ((DependencyNode) arrayList.get(0)).f4922g + dependencyNode3.f4921f, ((DependencyNode) dependencyNode4.f4927l.get(0)).f4922g - dependencyNode4.f4921f, f12, i14);
                            c0732a.mo2746d(iArr[0]);
                            this.f4929b.f4870e.f4932e.mo2746d(iArr[1]);
                        }
                        if (!dependencyNode.f4918c || !dependencyNode2.f4918c || !dependencyNode3.f4918c || !dependencyNode4.f4918c) {
                            return;
                        }
                        m2759m(iArr, ((DependencyNode) dependencyNode.f4927l.get(0)).f4922g + dependencyNode.f4921f, ((DependencyNode) dependencyNode2.f4927l.get(0)).f4922g - dependencyNode2.f4921f, ((DependencyNode) arrayList.get(0)).f4922g + dependencyNode3.f4921f, ((DependencyNode) dependencyNode4.f4927l.get(0)).f4922g - dependencyNode4.f4921f, f12, i14);
                        c0732a.mo2746d(iArr[0]);
                        this.f4929b.f4870e.f4932e.mo2746d(iArr[1]);
                    } else if (z11 && z13) {
                        if (!dependencyNode.f4918c || !dependencyNode2.f4918c) {
                            return;
                        }
                        float f13 = constraintWidget2.f4861Z;
                        int i15 = ((DependencyNode) dependencyNode.f4927l.get(0)).f4922g + dependencyNode.f4921f;
                        int i16 = ((DependencyNode) dependencyNode2.f4927l.get(0)).f4922g - dependencyNode2.f4921f;
                        if (i14 == -1 || i14 == 0) {
                            int iM2754g3 = m2754g(i16 - i15, 0);
                            int i17 = (int) ((iM2754g3 * f13) + 0.5f);
                            int iM2754g4 = m2754g(i17, 1);
                            if (i17 != iM2754g4) {
                                iM2754g3 = (int) ((iM2754g4 / f13) + 0.5f);
                            }
                            c0732a.mo2746d(iM2754g3);
                            this.f4929b.f4870e.f4932e.mo2746d(iM2754g4);
                        } else if (i14 == 1) {
                            int iM2754g5 = m2754g(i16 - i15, 0);
                            int i18 = (int) ((iM2754g5 / f13) + 0.5f);
                            int iM2754g6 = m2754g(i18, 1);
                            if (i18 != iM2754g6) {
                                iM2754g5 = (int) ((iM2754g6 * f13) + 0.5f);
                            }
                            c0732a.mo2746d(iM2754g5);
                            this.f4929b.f4870e.f4932e.mo2746d(iM2754g6);
                        }
                    } else if (z12 && z14) {
                        if (!dependencyNode3.f4918c || !dependencyNode4.f4918c) {
                            return;
                        }
                        float f14 = constraintWidget2.f4861Z;
                        int i19 = ((DependencyNode) dependencyNode3.f4927l.get(0)).f4922g + dependencyNode3.f4921f;
                        int i20 = ((DependencyNode) dependencyNode4.f4927l.get(0)).f4922g - dependencyNode4.f4921f;
                        if (i14 == -1) {
                            iM2754g = m2754g(i20 - i19, 1);
                            i10 = (int) ((iM2754g / f14) + 0.5f);
                            iM2754g2 = m2754g(i10, 0);
                            if (i10 != iM2754g2) {
                                iM2754g = (int) ((iM2754g2 * f14) + 0.5f);
                            }
                            c0732a.mo2746d(iM2754g2);
                            this.f4929b.f4870e.f4932e.mo2746d(iM2754g);
                        } else if (i14 == 0) {
                            int iM2754g7 = m2754g(i20 - i19, 1);
                            int i21 = (int) ((iM2754g7 * f14) + 0.5f);
                            int iM2754g8 = m2754g(i21, 0);
                            if (i21 != iM2754g8) {
                                iM2754g7 = (int) ((iM2754g8 / f14) + 0.5f);
                            }
                            c0732a.mo2746d(iM2754g8);
                            this.f4929b.f4870e.f4932e.mo2746d(iM2754g7);
                        } else if (i14 == 1) {
                            iM2754g = m2754g(i20 - i19, 1);
                            i10 = (int) ((iM2754g / f14) + 0.5f);
                            iM2754g2 = m2754g(i10, 0);
                            if (i10 != iM2754g2) {
                                iM2754g = (int) ((iM2754g2 * f14) + 0.5f);
                            }
                            c0732a.mo2746d(iM2754g2);
                            this.f4929b.f4870e.f4932e.mo2746d(iM2754g);
                        }
                    }
                } else {
                    int i22 = constraintWidget2.f4863a0;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f11 = constraintWidget2.f4870e.f4932e.f4922g / constraintWidget2.f4861Z;
                            i11 = (int) (f11 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f3 = constraintWidget2.f4870e.f4932e.f4922g;
                            f10 = constraintWidget2.f4861Z;
                        }
                        c0732a.mo2746d(i11);
                    } else {
                        f3 = constraintWidget2.f4870e.f4932e.f4922g;
                        f10 = constraintWidget2.f4861Z;
                    }
                    f11 = f3 * f10;
                    i11 = (int) (f11 + 0.5f);
                    c0732a.mo2746d(i11);
                }
            }
        }
        if (dependencyNode.f4918c && dependencyNode2.f4918c) {
            if (dependencyNode.f4925j && dependencyNode2.f4925j && c0732a.f4925j) {
                return;
            }
            boolean z17 = c0732a.f4925j;
            ArrayList arrayList2 = dependencyNode.f4927l;
            ArrayList arrayList3 = dependencyNode2.f4927l;
            if (!z17 && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget4 = this.f4929b;
                if (constraintWidget4.f4898s == 0 && !constraintWidget4.m2703B()) {
                    DependencyNode dependencyNode5 = (DependencyNode) arrayList2.get(0);
                    DependencyNode dependencyNode6 = (DependencyNode) arrayList3.get(0);
                    int i23 = dependencyNode5.f4922g + dependencyNode.f4921f;
                    int i24 = dependencyNode6.f4922g + dependencyNode2.f4921f;
                    dependencyNode.mo2746d(i23);
                    dependencyNode2.mo2746d(i24);
                    c0732a.mo2746d(i24 - i23);
                    return;
                }
            }
            if (!c0732a.f4925j && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f4928a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                int iMin = Math.min((((DependencyNode) arrayList3.get(0)).f4922g + dependencyNode2.f4921f) - (((DependencyNode) arrayList2.get(0)).f4922g + dependencyNode.f4921f), c0732a.f4939m);
                ConstraintWidget constraintWidget5 = this.f4929b;
                int i25 = constraintWidget5.f4906w;
                int iMax = Math.max(constraintWidget5.f4904v, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                c0732a.mo2746d(iMax);
            }
            if (c0732a.f4925j) {
                DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                DependencyNode dependencyNode8 = (DependencyNode) arrayList3.get(0);
                int i26 = dependencyNode7.f4922g;
                int i27 = dependencyNode.f4921f + i26;
                int i28 = dependencyNode8.f4922g;
                int i29 = dependencyNode2.f4921f + i28;
                float f15 = this.f4929b.f4875g0;
                if (dependencyNode7 == dependencyNode8) {
                    f15 = 0.5f;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                dependencyNode.mo2746d((int) ((((i28 - i26) - c0732a.f4922g) * f15) + i26 + 0.5f));
                dependencyNode2.mo2746d(dependencyNode.f4922g + c0732a.f4922g);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0358  */
    /* JADX WARN: Code duplicated, block: B:106:0x035f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0372  */
    /* JADX WARN: Code duplicated, block: B:109:0x0378  */
    /* JADX WARN: Code duplicated, block: B:111:0x037f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0395  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x0200  */
    /* JADX WARN: Code duplicated, block: B:78:0x021e  */
    /* JADX WARN: Code duplicated, block: B:79:0x026d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0275  */
    /* JADX WARN: Code duplicated, block: B:82:0x028e  */
    /* JADX WARN: Code duplicated, block: B:83:0x029b  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x02db  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f0  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo2751d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget4;
        DependencyNode dependencyNodeM2748h;
        DependencyNode dependencyNodeM2748h2;
        ConstraintWidget constraintWidget5;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ConstraintWidget constraintWidget6;
        ConstraintWidget constraintWidget7;
        ConstraintAnchor[] constraintAnchorArr2;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        ConstraintAnchor constraintAnchor6;
        DependencyNode dependencyNodeM2748h3;
        DependencyNode dependencyNodeM2748h4;
        ConstraintWidget constraintWidget8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget9 = this.f4929b;
        boolean z10 = constraintWidget9.f4862a;
        C0732a c0732a = this.f4932e;
        if (z10) {
            c0732a.mo2746d(constraintWidget9.m2735u());
        }
        boolean z11 = c0732a.f4925j;
        DependencyNode dependencyNode = this.f4936i;
        DependencyNode dependencyNode2 = this.f4935h;
        if (!z11) {
            ConstraintWidget constraintWidget10 = this.f4929b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget10.f4857V[0];
            this.f4931d = dimensionBehaviour3;
            if (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget8 = constraintWidget10.f4858W) != null && ((dimensionBehaviour2 = constraintWidget8.f4857V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == dimensionBehaviour4)) {
                    int iM2735u = (constraintWidget8.m2735u() - this.f4929b.f4846K.m2690e()) - this.f4929b.f4848M.m2690e();
                    WidgetRun.m2747b(dependencyNode2, constraintWidget8.f4868d.f4935h, this.f4929b.f4846K.m2690e());
                    WidgetRun.m2747b(dependencyNode, constraintWidget8.f4868d.f4936i, -this.f4929b.f4848M.m2690e());
                    c0732a.mo2746d(iM2735u);
                    return;
                }
                if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    c0732a.mo2746d(constraintWidget10.m2735u());
                }
            }
            if (c0732a.f4925j) {
                constraintWidget7 = this.f4929b;
                if (constraintWidget7.f4862a) {
                    constraintAnchorArr2 = constraintWidget7.f4854S;
                    constraintAnchor4 = constraintAnchorArr2[0];
                    constraintAnchor5 = constraintAnchor4.f4831f;
                    if (constraintAnchor5 == null && constraintAnchorArr2[1].f4831f != null) {
                        if (constraintWidget7.m2703B()) {
                            dependencyNode2.f4921f = this.f4929b.f4854S[0].m2690e();
                            dependencyNode.f4921f = -this.f4929b.f4854S[1].m2690e();
                            return;
                        }
                        DependencyNode dependencyNodeM2748h5 = WidgetRun.m2748h(this.f4929b.f4854S[0]);
                        if (dependencyNodeM2748h5 != null) {
                            WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h5, this.f4929b.f4854S[0].m2690e());
                        }
                        DependencyNode dependencyNodeM2748h6 = WidgetRun.m2748h(this.f4929b.f4854S[1]);
                        if (dependencyNodeM2748h6 != null) {
                            WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h6, -this.f4929b.f4854S[1].m2690e());
                        }
                        dependencyNode2.f4917b = true;
                        dependencyNode.f4917b = true;
                        return;
                    }
                    if (constraintAnchor5 != null) {
                        dependencyNodeM2748h4 = WidgetRun.m2748h(constraintAnchor4);
                        if (dependencyNodeM2748h4 != null) {
                            WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h4, this.f4929b.f4854S[0].m2690e());
                            WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                            return;
                        }
                        return;
                    }
                    constraintAnchor6 = constraintAnchorArr2[1];
                    if (constraintAnchor6.f4831f == null) {
                        dependencyNodeM2748h3 = WidgetRun.m2748h(constraintAnchor6);
                        if (dependencyNodeM2748h3 != null) {
                            WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h3, -this.f4929b.f4854S[1].m2690e());
                            WidgetRun.m2747b(dependencyNode2, dependencyNode, -c0732a.f4922g);
                            return;
                        }
                        return;
                    }
                    if ((constraintWidget7 instanceof InterfaceC5038a) && constraintWidget7.f4858W != null && constraintWidget7.mo2729m(ConstraintAnchor.Type.CENTER).f4831f == null) {
                        ConstraintWidget constraintWidget11 = this.f4929b;
                        WidgetRun.m2747b(dependencyNode2, constraintWidget11.f4858W.f4868d.f4935h, constraintWidget11.m2736v());
                        WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                        return;
                    }
                    return;
                }
            }
            if (this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                constraintWidget5 = this.f4929b;
                i10 = constraintWidget5.f4898s;
                arrayList = c0732a.f4926k;
                arrayList2 = c0732a.f4927l;
                if (i10 != 2) {
                    constraintWidget6 = constraintWidget5.f4858W;
                    if (constraintWidget6 != null) {
                        C0732a c0732a2 = constraintWidget6.f4870e.f4932e;
                        arrayList2.add(c0732a2);
                        c0732a2.f4926k.add(c0732a);
                        c0732a.f4917b = true;
                        arrayList.add(dependencyNode2);
                        arrayList.add(dependencyNode);
                    }
                } else if (i10 == 3) {
                    if (constraintWidget5.f4900t == 3) {
                        dependencyNode2.f4916a = this;
                        dependencyNode.f4916a = this;
                        C0735d c0735d = constraintWidget5.f4870e;
                        c0735d.f4935h.f4916a = this;
                        c0735d.f4936i.f4916a = this;
                        c0732a.f4916a = this;
                        if (constraintWidget5.m2704C()) {
                            arrayList2.add(this.f4929b.f4870e.f4932e);
                            this.f4929b.f4870e.f4932e.f4926k.add(c0732a);
                            C0735d c0735d2 = this.f4929b.f4870e;
                            c0735d2.f4932e.f4916a = this;
                            arrayList2.add(c0735d2.f4935h);
                            arrayList2.add(this.f4929b.f4870e.f4936i);
                            this.f4929b.f4870e.f4935h.f4926k.add(c0732a);
                            this.f4929b.f4870e.f4936i.f4926k.add(c0732a);
                        } else if (this.f4929b.m2703B()) {
                            this.f4929b.f4870e.f4932e.f4927l.add(c0732a);
                            arrayList.add(this.f4929b.f4870e.f4932e);
                        } else {
                            this.f4929b.f4870e.f4932e.f4927l.add(c0732a);
                        }
                    } else {
                        C0732a c0732a3 = constraintWidget5.f4870e.f4932e;
                        arrayList2.add(c0732a3);
                        c0732a3.f4926k.add(c0732a);
                        this.f4929b.f4870e.f4935h.f4926k.add(c0732a);
                        this.f4929b.f4870e.f4936i.f4926k.add(c0732a);
                        c0732a.f4917b = true;
                        arrayList.add(dependencyNode2);
                        arrayList.add(dependencyNode);
                        dependencyNode2.f4927l.add(c0732a);
                        dependencyNode.f4927l.add(c0732a);
                    }
                }
            }
            constraintWidget3 = this.f4929b;
            constraintAnchorArr = constraintWidget3.f4854S;
            constraintAnchor = constraintAnchorArr[0];
            constraintAnchor2 = constraintAnchor.f4831f;
            if (constraintAnchor2 == null && constraintAnchorArr[1].f4831f != null) {
                if (constraintWidget3.m2703B()) {
                    dependencyNode2.f4921f = this.f4929b.f4854S[0].m2690e();
                    dependencyNode.f4921f = -this.f4929b.f4854S[1].m2690e();
                    return;
                }
                DependencyNode dependencyNodeM2748h7 = WidgetRun.m2748h(this.f4929b.f4854S[0]);
                DependencyNode dependencyNodeM2748h8 = WidgetRun.m2748h(this.f4929b.f4854S[1]);
                if (dependencyNodeM2748h7 != null) {
                    dependencyNodeM2748h7.m2744b(this);
                }
                if (dependencyNodeM2748h8 != null) {
                    dependencyNodeM2748h8.m2744b(this);
                }
                this.f4937j = WidgetRun.RunType.CENTER;
                return;
            }
            if (constraintAnchor2 != null) {
                dependencyNodeM2748h2 = WidgetRun.m2748h(constraintAnchor);
                if (dependencyNodeM2748h2 != null) {
                    WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h2, this.f4929b.f4854S[0].m2690e());
                    m2750c(dependencyNode, dependencyNode2, 1, c0732a);
                    return;
                }
                return;
            }
            constraintAnchor3 = constraintAnchorArr[1];
            if (constraintAnchor3.f4831f == null) {
                dependencyNodeM2748h = WidgetRun.m2748h(constraintAnchor3);
                if (dependencyNodeM2748h != null) {
                    WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h, -this.f4929b.f4854S[1].m2690e());
                    m2750c(dependencyNode2, dependencyNode, -1, c0732a);
                }
            }
            if (!(constraintWidget3 instanceof InterfaceC5038a) || (constraintWidget4 = constraintWidget3.f4858W) == null) {
                return;
            }
            WidgetRun.m2747b(dependencyNode2, constraintWidget4.f4868d.f4935h, constraintWidget3.m2736v());
            m2750c(dependencyNode, dependencyNode2, 1, c0732a);
            return;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = this.f4931d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        if (dimensionBehaviour5 == dimensionBehaviour6 && (constraintWidget2 = (constraintWidget = this.f4929b).f4858W) != null && ((dimensionBehaviour = constraintWidget2.f4857V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == dimensionBehaviour6)) {
            WidgetRun.m2747b(dependencyNode2, constraintWidget2.f4868d.f4935h, constraintWidget.f4846K.m2690e());
            WidgetRun.m2747b(dependencyNode, constraintWidget2.f4868d.f4936i, -this.f4929b.f4848M.m2690e());
            return;
        }
        if (c0732a.f4925j) {
            constraintWidget7 = this.f4929b;
            if (constraintWidget7.f4862a) {
                constraintAnchorArr2 = constraintWidget7.f4854S;
                constraintAnchor4 = constraintAnchorArr2[0];
                constraintAnchor5 = constraintAnchor4.f4831f;
                if (constraintAnchor5 == null) {
                }
                if (constraintAnchor5 != null) {
                    dependencyNodeM2748h4 = WidgetRun.m2748h(constraintAnchor4);
                    if (dependencyNodeM2748h4 != null) {
                        WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h4, this.f4929b.f4854S[0].m2690e());
                        WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                        return;
                    }
                    return;
                }
                constraintAnchor6 = constraintAnchorArr2[1];
                if (constraintAnchor6.f4831f == null) {
                    if (constraintWidget7 instanceof InterfaceC5038a) {
                        return;
                    } else {
                        return;
                    }
                }
                dependencyNodeM2748h3 = WidgetRun.m2748h(constraintAnchor6);
                if (dependencyNodeM2748h3 != null) {
                    WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h3, -this.f4929b.f4854S[1].m2690e());
                    WidgetRun.m2747b(dependencyNode2, dependencyNode, -c0732a.f4922g);
                    return;
                }
                return;
            }
        }
        if (this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            constraintWidget5 = this.f4929b;
            i10 = constraintWidget5.f4898s;
            arrayList = c0732a.f4926k;
            arrayList2 = c0732a.f4927l;
            if (i10 != 2) {
                constraintWidget6 = constraintWidget5.f4858W;
                if (constraintWidget6 != null) {
                    C0732a c0732a4 = constraintWidget6.f4870e.f4932e;
                    arrayList2.add(c0732a4);
                    c0732a4.f4926k.add(c0732a);
                    c0732a.f4917b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i10 == 3) {
                if (constraintWidget5.f4900t == 3) {
                    dependencyNode2.f4916a = this;
                    dependencyNode.f4916a = this;
                    C0735d c0735d3 = constraintWidget5.f4870e;
                    c0735d3.f4935h.f4916a = this;
                    c0735d3.f4936i.f4916a = this;
                    c0732a.f4916a = this;
                    if (constraintWidget5.m2704C()) {
                        arrayList2.add(this.f4929b.f4870e.f4932e);
                        this.f4929b.f4870e.f4932e.f4926k.add(c0732a);
                        C0735d c0735d4 = this.f4929b.f4870e;
                        c0735d4.f4932e.f4916a = this;
                        arrayList2.add(c0735d4.f4935h);
                        arrayList2.add(this.f4929b.f4870e.f4936i);
                        this.f4929b.f4870e.f4935h.f4926k.add(c0732a);
                        this.f4929b.f4870e.f4936i.f4926k.add(c0732a);
                    } else if (this.f4929b.m2703B()) {
                        this.f4929b.f4870e.f4932e.f4927l.add(c0732a);
                        arrayList.add(this.f4929b.f4870e.f4932e);
                    } else {
                        this.f4929b.f4870e.f4932e.f4927l.add(c0732a);
                    }
                } else {
                    C0732a c0732a5 = constraintWidget5.f4870e.f4932e;
                    arrayList2.add(c0732a5);
                    c0732a5.f4926k.add(c0732a);
                    this.f4929b.f4870e.f4935h.f4926k.add(c0732a);
                    this.f4929b.f4870e.f4936i.f4926k.add(c0732a);
                    c0732a.f4917b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                    dependencyNode2.f4927l.add(c0732a);
                    dependencyNode.f4927l.add(c0732a);
                }
            }
        }
        constraintWidget3 = this.f4929b;
        constraintAnchorArr = constraintWidget3.f4854S;
        constraintAnchor = constraintAnchorArr[0];
        constraintAnchor2 = constraintAnchor.f4831f;
        if (constraintAnchor2 == null) {
        }
        if (constraintAnchor2 != null) {
            dependencyNodeM2748h2 = WidgetRun.m2748h(constraintAnchor);
            if (dependencyNodeM2748h2 != null) {
                WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h2, this.f4929b.f4854S[0].m2690e());
                m2750c(dependencyNode, dependencyNode2, 1, c0732a);
                return;
            }
            return;
        }
        constraintAnchor3 = constraintAnchorArr[1];
        if (constraintAnchor3.f4831f == null) {
            if (constraintWidget3 instanceof InterfaceC5038a) {
                return;
            } else {
                return;
            }
        }
        dependencyNodeM2748h = WidgetRun.m2748h(constraintAnchor3);
        if (dependencyNodeM2748h != null) {
            WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h, -this.f4929b.f4854S[1].m2690e());
            m2750c(dependencyNode2, dependencyNode, -1, c0732a);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo2752e() {
        DependencyNode dependencyNode = this.f4935h;
        if (dependencyNode.f4925j) {
            this.f4929b.f4865b0 = dependencyNode.f4922g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo2753f() {
        this.f4930c = null;
        this.f4935h.m2745c();
        this.f4936i.m2745c();
        this.f4932e.m2745c();
        this.f4934g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo2756k() {
        if (this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f4929b.f4898s != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m2760n() {
        this.f4934g = false;
        DependencyNode dependencyNode = this.f4935h;
        dependencyNode.m2745c();
        dependencyNode.f4925j = false;
        DependencyNode dependencyNode2 = this.f4936i;
        dependencyNode2.m2745c();
        dependencyNode2.f4925j = false;
        this.f4932e.f4925j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4929b.f4885l0;
    }
}
