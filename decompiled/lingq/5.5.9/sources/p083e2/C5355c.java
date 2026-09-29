package p083e2;

import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C0732a;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5355c extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public final ArrayList<WidgetRun> f33671k;

    /* JADX INFO: renamed from: l */
    public int f33672l;

    public C5355c(int i10, ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f33671k = new ArrayList<>();
        this.f4933f = i10;
        ConstraintWidget constraintWidget2 = this.f4929b;
        ConstraintWidget constraintWidgetM2733q = constraintWidget2.m2733q(i10);
        while (constraintWidgetM2733q != null) {
            constraintWidget2 = constraintWidgetM2733q;
            constraintWidgetM2733q = constraintWidgetM2733q.m2733q(this.f4933f);
        }
        this.f4929b = constraintWidget2;
        int i11 = this.f4933f;
        WidgetRun widgetRun = i11 == 0 ? constraintWidget2.f4868d : i11 == 1 ? constraintWidget2.f4870e : null;
        ArrayList<WidgetRun> arrayList = this.f33671k;
        arrayList.add(widgetRun);
        ConstraintWidget constraintWidgetM2732p = constraintWidget2.m2732p(this.f4933f);
        while (constraintWidgetM2732p != null) {
            int i12 = this.f4933f;
            arrayList.add(i12 == 0 ? constraintWidgetM2732p.f4868d : i12 == 1 ? constraintWidgetM2732p.f4870e : null);
            constraintWidgetM2732p = constraintWidgetM2732p.m2732p(this.f4933f);
        }
        for (WidgetRun widgetRun2 : arrayList) {
            int i13 = this.f4933f;
            if (i13 == 0) {
                widgetRun2.f4929b.f4864b = this;
            } else if (i13 == 1) {
                widgetRun2.f4929b.f4866c = this;
            }
        }
        if ((this.f4933f == 0 && ((C0738d) this.f4929b.f4858W).f4963B0) && arrayList.size() > 1) {
            this.f4929b = arrayList.get(arrayList.size() - 1).f4929b;
        }
        this.f33672l = this.f4933f == 0 ? this.f4929b.f4889n0 : this.f4929b.f4891o0;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:295:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8 A[ADDED_TO_REGION] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        int i10;
        ArrayList<WidgetRun> arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        float f3;
        int i15;
        boolean z10;
        ArrayList<WidgetRun> arrayList2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f10;
        DependencyNode dependencyNode = this.f4935h;
        if (dependencyNode.f4925j) {
            DependencyNode dependencyNode2 = this.f4936i;
            if (dependencyNode2.f4925j) {
                ConstraintWidget constraintWidget = this.f4929b.f4858W;
                boolean z11 = constraintWidget instanceof C0738d ? ((C0738d) constraintWidget).f4963B0 : false;
                int i24 = dependencyNode2.f4922g - dependencyNode.f4922g;
                ArrayList<WidgetRun> arrayList3 = this.f33671k;
                int size = arrayList3.size();
                int i25 = 0;
                while (true) {
                    i10 = -1;
                    if (i25 >= size) {
                        i25 = -1;
                        break;
                    } else if (arrayList3.get(i25).f4929b.f4881j0 != 8) {
                        break;
                    } else {
                        i25++;
                    }
                }
                int i26 = size - 1;
                for (int i27 = i26; i27 >= 0; i27--) {
                    if (arrayList3.get(i27).f4929b.f4881j0 != 8) {
                        i10 = i27;
                        break;
                    }
                }
                int i28 = 0;
                while (true) {
                    if (i28 >= 2) {
                        arrayList = arrayList3;
                        i11 = i25;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        f3 = 0.0f;
                        break;
                    }
                    int i29 = 0;
                    i14 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    f3 = 0.0f;
                    while (i29 < size) {
                        WidgetRun widgetRun = arrayList3.get(i29);
                        ConstraintWidget constraintWidget2 = widgetRun.f4929b;
                        ArrayList<WidgetRun> arrayList4 = arrayList3;
                        if (constraintWidget2.f4881j0 == 8) {
                            i22 = i25;
                        } else {
                            i31++;
                            if (i29 > 0 && i29 >= i25) {
                                i14 += widgetRun.f4935h.f4921f;
                            }
                            C0732a c0732a = widgetRun.f4932e;
                            int i32 = c0732a.f4922g;
                            i22 = i25;
                            boolean z12 = widgetRun.f4931d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z12) {
                                int i33 = this.f4933f;
                                if (i33 == 0 && !constraintWidget2.f4868d.f4932e.f4925j) {
                                    return;
                                }
                                if (i33 == 1 && !constraintWidget2.f4870e.f4932e.f4925j) {
                                    return;
                                }
                            } else {
                                if (widgetRun.f4928a == 1 && i28 == 0) {
                                    i23 = c0732a.f4939m;
                                    i30++;
                                } else {
                                    if (c0732a.f4925j) {
                                        i23 = i32;
                                    }
                                    if (z12) {
                                        i14 += i23;
                                    } else {
                                        i30++;
                                        f10 = constraintWidget2.f4893p0[this.f4933f];
                                        if (f10 >= 0.0f) {
                                            f3 += f10;
                                        }
                                    }
                                    if (i29 >= i26 && i29 < i10) {
                                        i14 += -widgetRun.f4936i.f4921f;
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    i30++;
                                    f10 = constraintWidget2.f4893p0[this.f4933f];
                                    if (f10 >= 0.0f) {
                                        f3 += f10;
                                    }
                                } else {
                                    i14 += i23;
                                }
                                if (i29 >= i26) {
                                }
                            }
                            i23 = i32;
                            if (z12) {
                                i30++;
                                f10 = constraintWidget2.f4893p0[this.f4933f];
                                if (f10 >= 0.0f) {
                                    f3 += f10;
                                }
                            } else {
                                i14 += i23;
                            }
                            if (i29 >= i26) {
                            }
                        }
                        i29++;
                        arrayList3 = arrayList4;
                        i25 = i22;
                    }
                    arrayList = arrayList3;
                    i11 = i25;
                    if (i14 < i24 || i30 == 0) {
                        i12 = i30;
                        i13 = i31;
                        break;
                    } else {
                        i28++;
                        arrayList3 = arrayList;
                        i25 = i11;
                    }
                }
                int i34 = dependencyNode.f4922g;
                if (z11) {
                    i34 = dependencyNode2.f4922g;
                }
                if (i14 > i24) {
                    i34 = z11 ? i34 + ((int) (((i14 - i24) / 2.0f) + 0.5f)) : i34 - ((int) (((i14 - i24) / 2.0f) + 0.5f));
                }
                if (i12 > 0) {
                    float f11 = i24 - i14;
                    int i35 = (int) ((f11 / i12) + 0.5f);
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < size) {
                        ArrayList<WidgetRun> arrayList5 = arrayList;
                        WidgetRun widgetRun2 = arrayList5.get(i36);
                        int i38 = i35;
                        ConstraintWidget constraintWidget3 = widgetRun2.f4929b;
                        int i39 = i14;
                        int i40 = i34;
                        if (constraintWidget3.f4881j0 != 8 && widgetRun2.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            C0732a c0732a2 = widgetRun2.f4932e;
                            if (c0732a2.f4925j) {
                                z11 = z11;
                            } else {
                                int i41 = f3 > 0.0f ? (int) (((constraintWidget3.f4893p0[this.f4933f] * f11) / f3) + 0.5f) : i38;
                                if (this.f4933f == 0) {
                                    i20 = constraintWidget3.f4906w;
                                    i21 = constraintWidget3.f4904v;
                                } else {
                                    i20 = constraintWidget3.f4909z;
                                    i21 = constraintWidget3.f4908y;
                                }
                                int iMax = Math.max(i21, widgetRun2.f4928a == 1 ? Math.min(i41, c0732a2.f4939m) : i41);
                                if (i20 > 0) {
                                    iMax = Math.min(i20, iMax);
                                }
                                if (iMax != i41) {
                                    i37++;
                                    i41 = iMax;
                                }
                                c0732a2.mo2746d(i41);
                            }
                        } else {
                            z11 = z11;
                        }
                        i36++;
                        i35 = i38;
                        i14 = i39;
                        i34 = i40;
                        z11 = z11;
                        f11 = f11;
                        arrayList = arrayList5;
                    }
                    i15 = i34;
                    z10 = z11;
                    arrayList2 = arrayList;
                    int i42 = i14;
                    if (i37 > 0) {
                        i12 -= i37;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < size) {
                            WidgetRun widgetRun3 = arrayList2.get(i43);
                            if (widgetRun3.f4929b.f4881j0 == 8) {
                                i19 = i11;
                            } else {
                                i19 = i11;
                                if (i43 > 0 && i43 >= i19) {
                                    i44 += widgetRun3.f4935h.f4921f;
                                }
                                i44 += widgetRun3.f4932e.f4922g;
                                if (i43 < i26 && i43 < i10) {
                                    i44 += -widgetRun3.f4936i.f4921f;
                                }
                            }
                            i43++;
                            i11 = i19;
                        }
                        i16 = i11;
                        i14 = i44;
                    } else {
                        i16 = i11;
                        i14 = i42;
                    }
                    i18 = 2;
                    if (this.f33672l == 2 && i37 == 0) {
                        i17 = 0;
                        this.f33672l = 0;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i15 = i34;
                    z10 = z11;
                    arrayList2 = arrayList;
                    i16 = i11;
                    i17 = 0;
                    i18 = 2;
                }
                if (i14 > i24) {
                    this.f33672l = i18;
                }
                if (i13 > 0 && i12 == 0 && i16 == i10) {
                    this.f33672l = i18;
                }
                int i45 = this.f33672l;
                if (i45 == 1) {
                    int i46 = i13 > 1 ? (i24 - i14) / (i13 - 1) : i13 == 1 ? (i24 - i14) / 2 : i17;
                    if (i12 > 0) {
                        i46 = i17;
                    }
                    int i47 = i15;
                    for (int i48 = i17; i48 < size; i48++) {
                        WidgetRun widgetRun4 = arrayList2.get(z10 ? size - (i48 + 1) : i48);
                        int i49 = widgetRun4.f4929b.f4881j0;
                        DependencyNode dependencyNode3 = widgetRun4.f4936i;
                        DependencyNode dependencyNode4 = widgetRun4.f4935h;
                        if (i49 == 8) {
                            dependencyNode4.mo2746d(i47);
                            dependencyNode3.mo2746d(i47);
                        } else {
                            if (i48 > 0) {
                                i47 = z10 ? i47 - i46 : i47 + i46;
                            }
                            if (i48 > 0 && i48 >= i16) {
                                i47 = z10 ? i47 - dependencyNode4.f4921f : i47 + dependencyNode4.f4921f;
                            }
                            if (z10) {
                                dependencyNode3.mo2746d(i47);
                            } else {
                                dependencyNode4.mo2746d(i47);
                            }
                            C0732a c0732a3 = widgetRun4.f4932e;
                            int i50 = c0732a3.f4922g;
                            if (widgetRun4.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.f4928a == 1) {
                                i50 = c0732a3.f4939m;
                            }
                            i47 = z10 ? i47 - i50 : i47 + i50;
                            if (z10) {
                                dependencyNode4.mo2746d(i47);
                            } else {
                                dependencyNode3.mo2746d(i47);
                            }
                            widgetRun4.f4934g = true;
                            if (i48 < i26 && i48 < i10) {
                                i47 = z10 ? i47 - (-dependencyNode3.f4921f) : i47 + (-dependencyNode3.f4921f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 0) {
                    int i51 = (i24 - i14) / (i13 + 1);
                    if (i12 > 0) {
                        i51 = i17;
                    }
                    int i52 = i15;
                    for (int i53 = i17; i53 < size; i53++) {
                        WidgetRun widgetRun5 = arrayList2.get(z10 ? size - (i53 + 1) : i53);
                        int i54 = widgetRun5.f4929b.f4881j0;
                        DependencyNode dependencyNode5 = widgetRun5.f4936i;
                        DependencyNode dependencyNode6 = widgetRun5.f4935h;
                        if (i54 == 8) {
                            dependencyNode6.mo2746d(i52);
                            dependencyNode5.mo2746d(i52);
                        } else {
                            int i55 = z10 ? i52 - i51 : i52 + i51;
                            if (i53 > 0 && i53 >= i16) {
                                i55 = z10 ? i55 - dependencyNode6.f4921f : i55 + dependencyNode6.f4921f;
                            }
                            if (z10) {
                                dependencyNode5.mo2746d(i55);
                            } else {
                                dependencyNode6.mo2746d(i55);
                            }
                            C0732a c0732a4 = widgetRun5.f4932e;
                            int iMin = c0732a4.f4922g;
                            if (widgetRun5.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.f4928a == 1) {
                                iMin = Math.min(iMin, c0732a4.f4939m);
                            }
                            i52 = z10 ? i55 - iMin : i55 + iMin;
                            if (z10) {
                                dependencyNode6.mo2746d(i52);
                            } else {
                                dependencyNode5.mo2746d(i52);
                            }
                            if (i53 < i26 && i53 < i10) {
                                i52 = z10 ? i52 - (-dependencyNode5.f4921f) : i52 + (-dependencyNode5.f4921f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 2) {
                    float f12 = this.f4933f == 0 ? this.f4929b.f4875g0 : this.f4929b.f4877h0;
                    if (z10) {
                        f12 = 1.0f - f12;
                    }
                    int i56 = (int) (((i24 - i14) * f12) + 0.5f);
                    if (i56 < 0 || i12 > 0) {
                        i56 = i17;
                    }
                    int i57 = z10 ? i15 - i56 : i15 + i56;
                    for (int i58 = i17; i58 < size; i58++) {
                        WidgetRun widgetRun6 = arrayList2.get(z10 ? size - (i58 + 1) : i58);
                        int i59 = widgetRun6.f4929b.f4881j0;
                        DependencyNode dependencyNode7 = widgetRun6.f4936i;
                        DependencyNode dependencyNode8 = widgetRun6.f4935h;
                        if (i59 == 8) {
                            dependencyNode8.mo2746d(i57);
                            dependencyNode7.mo2746d(i57);
                        } else {
                            if (i58 > 0 && i58 >= i16) {
                                i57 = z10 ? i57 - dependencyNode8.f4921f : i57 + dependencyNode8.f4921f;
                            }
                            if (z10) {
                                dependencyNode7.mo2746d(i57);
                            } else {
                                dependencyNode8.mo2746d(i57);
                            }
                            C0732a c0732a5 = widgetRun6.f4932e;
                            int i60 = c0732a5.f4922g;
                            if (widgetRun6.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.f4928a == 1) {
                                i60 = c0732a5.f4939m;
                            }
                            i57 = z10 ? i57 - i60 : i57 + i60;
                            if (z10) {
                                dependencyNode8.mo2746d(i57);
                            } else {
                                dependencyNode7.mo2746d(i57);
                            }
                            if (i58 < i26 && i58 < i10) {
                                i57 = z10 ? i57 - (-dependencyNode7.f4921f) : i57 + (-dependencyNode7.f4921f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo2751d() {
        ArrayList<WidgetRun> arrayList = this.f33671k;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo2751d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f4929b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f4929b;
        int i10 = this.f4933f;
        DependencyNode dependencyNode = this.f4936i;
        DependencyNode dependencyNode2 = this.f4935h;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f4846K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f4848M;
            DependencyNode dependencyNodeM2749i = WidgetRun.m2749i(constraintAnchor, 0);
            int iM2690e = constraintAnchor.m2690e();
            ConstraintWidget constraintWidgetM11480m = m11480m();
            if (constraintWidgetM11480m != null) {
                iM2690e = constraintWidgetM11480m.f4846K.m2690e();
            }
            if (dependencyNodeM2749i != null) {
                WidgetRun.m2747b(dependencyNode2, dependencyNodeM2749i, iM2690e);
            }
            DependencyNode dependencyNodeM2749i2 = WidgetRun.m2749i(constraintAnchor2, 0);
            int iM2690e2 = constraintAnchor2.m2690e();
            ConstraintWidget constraintWidgetM11481n = m11481n();
            if (constraintWidgetM11481n != null) {
                iM2690e2 = constraintWidgetM11481n.f4848M.m2690e();
            }
            if (dependencyNodeM2749i2 != null) {
                WidgetRun.m2747b(dependencyNode, dependencyNodeM2749i2, -iM2690e2);
            }
            dependencyNode2.f4916a = this;
            dependencyNode.f4916a = this;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f4847L;
        ConstraintAnchor constraintAnchor4 = constraintWidget2.f4849N;
        DependencyNode dependencyNodeM2749i3 = WidgetRun.m2749i(constraintAnchor3, 1);
        int iM2690e3 = constraintAnchor3.m2690e();
        ConstraintWidget constraintWidgetM11480m2 = m11480m();
        if (constraintWidgetM11480m2 != null) {
            iM2690e3 = constraintWidgetM11480m2.f4847L.m2690e();
        }
        if (dependencyNodeM2749i3 != null) {
            WidgetRun.m2747b(dependencyNode2, dependencyNodeM2749i3, iM2690e3);
        }
        DependencyNode dependencyNodeM2749i4 = WidgetRun.m2749i(constraintAnchor4, 1);
        int iM2690e4 = constraintAnchor4.m2690e();
        ConstraintWidget constraintWidgetM11481n2 = m11481n();
        if (constraintWidgetM11481n2 != null) {
            iM2690e4 = constraintWidgetM11481n2.f4849N.m2690e();
        }
        if (dependencyNodeM2749i4 != null) {
            WidgetRun.m2747b(dependencyNode, dependencyNodeM2749i4, -iM2690e4);
        }
        dependencyNode2.f4916a = this;
        dependencyNode.f4916a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo2752e() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f33671k;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.get(i10).mo2752e();
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo2753f() {
        this.f4930c = null;
        Iterator<WidgetRun> it = this.f33671k.iterator();
        while (it.hasNext()) {
            it.next().mo2753f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: j */
    public final long mo2755j() {
        ArrayList<WidgetRun> arrayList = this.f33671k;
        int size = arrayList.size();
        long jMo2755j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = arrayList.get(i10);
            jMo2755j = ((long) widgetRun.f4936i.f4921f) + widgetRun.mo2755j() + jMo2755j + ((long) widgetRun.f4935h.f4921f);
        }
        return jMo2755j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo2756k() {
        ArrayList<WidgetRun> arrayList = this.f33671k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).mo2756k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final ConstraintWidget m11480m() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f33671k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i10).f4929b;
            if (constraintWidget.f4881j0 != 8) {
                return constraintWidget;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final ConstraintWidget m11481n() {
        ArrayList<WidgetRun> arrayList = this.f33671k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f4929b;
            if (constraintWidget.f4881j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f4933f == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.f33671k) {
            sb2.append("<");
            sb2.append(widgetRun);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
