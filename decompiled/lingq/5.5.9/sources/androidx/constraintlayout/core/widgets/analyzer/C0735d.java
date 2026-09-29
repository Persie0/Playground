package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p061d2.InterfaceC5038a;
import p083e2.C5353a;
import p083e2.InterfaceC5356d;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0735d extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public final DependencyNode f4942k;

    /* JADX INFO: renamed from: l */
    public C5353a f4943l;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4944a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f4944a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4944a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4944a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0735d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f4942k = dependencyNode;
        this.f4943l = null;
        this.f4935h.f4920e = DependencyNode.Type.TOP;
        this.f4936i.f4920e = DependencyNode.Type.BOTTOM;
        dependencyNode.f4920e = DependencyNode.Type.BASELINE;
        this.f4933f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        float f3;
        float f10;
        float f11;
        int i10;
        if (a.f4944a[this.f4937j.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.f4929b;
            m2757l(constraintWidget.f4847L, constraintWidget.f4849N, 1);
            return;
        }
        C0732a c0732a = this.f4932e;
        if (c0732a.f4918c && !c0732a.f4925j && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f4929b;
            int i11 = constraintWidget2.f4900t;
            if (i11 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f4858W;
                if (constraintWidget3 != null) {
                    C0732a c0732a2 = constraintWidget3.f4870e.f4932e;
                    if (c0732a2.f4925j) {
                        c0732a.mo2746d((int) ((c0732a2.f4922g * constraintWidget2.f4836A) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                C0732a c0732a3 = constraintWidget2.f4868d.f4932e;
                if (c0732a3.f4925j) {
                    int i12 = constraintWidget2.f4863a0;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f11 = c0732a3.f4922g * constraintWidget2.f4861Z;
                            i10 = (int) (f11 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f3 = c0732a3.f4922g;
                            f10 = constraintWidget2.f4861Z;
                        }
                        c0732a.mo2746d(i10);
                    } else {
                        f3 = c0732a3.f4922g;
                        f10 = constraintWidget2.f4861Z;
                    }
                    f11 = f3 / f10;
                    i10 = (int) (f11 + 0.5f);
                    c0732a.mo2746d(i10);
                }
            }
        }
        DependencyNode dependencyNode = this.f4935h;
        if (dependencyNode.f4918c) {
            DependencyNode dependencyNode2 = this.f4936i;
            if (dependencyNode2.f4918c) {
                if (dependencyNode.f4925j && dependencyNode2.f4925j && c0732a.f4925j) {
                    return;
                }
                boolean z10 = c0732a.f4925j;
                ArrayList arrayList = dependencyNode.f4927l;
                ArrayList arrayList2 = dependencyNode2.f4927l;
                if (!z10 && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.f4929b;
                    if (constraintWidget4.f4898s == 0 && !constraintWidget4.m2704C()) {
                        DependencyNode dependencyNode3 = (DependencyNode) arrayList.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) arrayList2.get(0);
                        int i13 = dependencyNode3.f4922g + dependencyNode.f4921f;
                        int i14 = dependencyNode4.f4922g + dependencyNode2.f4921f;
                        dependencyNode.mo2746d(i13);
                        dependencyNode2.mo2746d(i14);
                        c0732a.mo2746d(i14 - i13);
                        return;
                    }
                }
                if (!c0732a.f4925j && this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f4928a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) arrayList.get(0);
                    int i15 = (((DependencyNode) arrayList2.get(0)).f4922g + dependencyNode2.f4921f) - (dependencyNode5.f4922g + dependencyNode.f4921f);
                    int i16 = c0732a.f4939m;
                    if (i15 < i16) {
                        c0732a.mo2746d(i15);
                    } else {
                        c0732a.mo2746d(i16);
                    }
                }
                if (c0732a.f4925j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) arrayList.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                    int i17 = dependencyNode6.f4922g;
                    int i18 = dependencyNode.f4921f + i17;
                    int i19 = dependencyNode7.f4922g;
                    int i20 = dependencyNode2.f4921f + i19;
                    float f12 = this.f4929b.f4877h0;
                    if (dependencyNode6 == dependencyNode7) {
                        f12 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    dependencyNode.mo2746d((int) ((((i19 - i17) - c0732a.f4922g) * f12) + i17 + 0.5f));
                    dependencyNode2.mo2746d(dependencyNode.f4922g + c0732a.f4922g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo2751d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f4929b;
        boolean z10 = constraintWidget5.f4862a;
        C0732a c0732a = this.f4932e;
        if (z10) {
            c0732a.mo2746d(constraintWidget5.m2731o());
        }
        boolean z11 = c0732a.f4925j;
        DependencyNode dependencyNode = this.f4936i;
        DependencyNode dependencyNode2 = this.f4935h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f4929b;
            this.f4931d = constraintWidget6.f4857V[1];
            if (constraintWidget6.f4841F) {
                this.f4943l = new C5353a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f4931d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.f4929b.f4858W) != null && constraintWidget4.f4857V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iM2731o = (constraintWidget4.m2731o() - this.f4929b.f4847L.m2690e()) - this.f4929b.f4849N.m2690e();
                    WidgetRun.m2747b(dependencyNode2, constraintWidget4.f4870e.f4935h, this.f4929b.f4847L.m2690e());
                    WidgetRun.m2747b(dependencyNode, constraintWidget4.f4870e.f4936i, -this.f4929b.f4849N.m2690e());
                    c0732a.mo2746d(iM2731o);
                    return;
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    c0732a.mo2746d(this.f4929b.m2731o());
                }
            }
        } else if (this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.f4929b).f4858W) != null && constraintWidget2.f4857V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            WidgetRun.m2747b(dependencyNode2, constraintWidget2.f4870e.f4935h, constraintWidget.f4847L.m2690e());
            WidgetRun.m2747b(dependencyNode, constraintWidget2.f4870e.f4936i, -this.f4929b.f4849N.m2690e());
            return;
        }
        boolean z12 = c0732a.f4925j;
        DependencyNode dependencyNode3 = this.f4942k;
        if (z12) {
            ConstraintWidget constraintWidget7 = this.f4929b;
            if (constraintWidget7.f4862a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f4854S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f4831f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f4831f != null) {
                    if (constraintWidget7.m2704C()) {
                        dependencyNode2.f4921f = this.f4929b.f4854S[2].m2690e();
                        dependencyNode.f4921f = -this.f4929b.f4854S[3].m2690e();
                    } else {
                        DependencyNode dependencyNodeM2748h = WidgetRun.m2748h(this.f4929b.f4854S[2]);
                        if (dependencyNodeM2748h != null) {
                            WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h, this.f4929b.f4854S[2].m2690e());
                        }
                        DependencyNode dependencyNodeM2748h2 = WidgetRun.m2748h(this.f4929b.f4854S[3]);
                        if (dependencyNodeM2748h2 != null) {
                            WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h2, -this.f4929b.f4854S[3].m2690e());
                        }
                        dependencyNode2.f4917b = true;
                        dependencyNode.f4917b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f4929b;
                    if (constraintWidget8.f4841F) {
                        WidgetRun.m2747b(dependencyNode3, dependencyNode2, constraintWidget8.f4869d0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeM2748h3 = WidgetRun.m2748h(constraintAnchor);
                    if (dependencyNodeM2748h3 != null) {
                        WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h3, this.f4929b.f4854S[2].m2690e());
                        WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                        ConstraintWidget constraintWidget9 = this.f4929b;
                        if (constraintWidget9.f4841F) {
                            WidgetRun.m2747b(dependencyNode3, dependencyNode2, constraintWidget9.f4869d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f4831f != null) {
                    DependencyNode dependencyNodeM2748h4 = WidgetRun.m2748h(constraintAnchor3);
                    if (dependencyNodeM2748h4 != null) {
                        WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h4, -this.f4929b.f4854S[3].m2690e());
                        WidgetRun.m2747b(dependencyNode2, dependencyNode, -c0732a.f4922g);
                    }
                    ConstraintWidget constraintWidget10 = this.f4929b;
                    if (constraintWidget10.f4841F) {
                        WidgetRun.m2747b(dependencyNode3, dependencyNode2, constraintWidget10.f4869d0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f4831f != null) {
                    DependencyNode dependencyNodeM2748h5 = WidgetRun.m2748h(constraintAnchor4);
                    if (dependencyNodeM2748h5 != null) {
                        WidgetRun.m2747b(dependencyNode3, dependencyNodeM2748h5, 0);
                        WidgetRun.m2747b(dependencyNode2, dependencyNode3, -this.f4929b.f4869d0);
                        WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof InterfaceC5038a) || constraintWidget7.f4858W == null || constraintWidget7.mo2729m(ConstraintAnchor.Type.CENTER).f4831f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f4929b;
                WidgetRun.m2747b(dependencyNode2, constraintWidget11.f4858W.f4870e.f4935h, constraintWidget11.m2737w());
                WidgetRun.m2747b(dependencyNode, dependencyNode2, c0732a.f4922g);
                ConstraintWidget constraintWidget12 = this.f4929b;
                if (constraintWidget12.f4841F) {
                    WidgetRun.m2747b(dependencyNode3, dependencyNode2, constraintWidget12.f4869d0);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = c0732a.f4927l;
        if (z12 || this.f4931d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            c0732a.m2744b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f4929b;
            int i10 = constraintWidget13.f4900t;
            ArrayList arrayList2 = c0732a.f4926k;
            if (i10 == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.f4858W;
                if (constraintWidget14 != null) {
                    C0732a c0732a2 = constraintWidget14.f4870e.f4932e;
                    arrayList.add(c0732a2);
                    c0732a2.f4926k.add(c0732a);
                    c0732a.f4917b = true;
                    arrayList2.add(dependencyNode2);
                    arrayList2.add(dependencyNode);
                }
            } else if (i10 == 3 && !constraintWidget13.m2704C()) {
                ConstraintWidget constraintWidget15 = this.f4929b;
                if (constraintWidget15.f4898s != 3) {
                    C0732a c0732a3 = constraintWidget15.f4868d.f4932e;
                    arrayList.add(c0732a3);
                    c0732a3.f4926k.add(c0732a);
                    c0732a.f4917b = true;
                    arrayList2.add(dependencyNode2);
                    arrayList2.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f4929b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.f4854S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4831f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f4831f != null) {
            if (constraintWidget16.m2704C()) {
                dependencyNode2.f4921f = this.f4929b.f4854S[2].m2690e();
                dependencyNode.f4921f = -this.f4929b.f4854S[3].m2690e();
            } else {
                DependencyNode dependencyNodeM2748h6 = WidgetRun.m2748h(this.f4929b.f4854S[2]);
                DependencyNode dependencyNodeM2748h7 = WidgetRun.m2748h(this.f4929b.f4854S[3]);
                if (dependencyNodeM2748h6 != null) {
                    dependencyNodeM2748h6.m2744b(this);
                }
                if (dependencyNodeM2748h7 != null) {
                    dependencyNodeM2748h7.m2744b(this);
                }
                this.f4937j = WidgetRun.RunType.CENTER;
            }
            if (this.f4929b.f4841F) {
                m2750c(dependencyNode3, dependencyNode2, 1, this.f4943l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeM2748h8 = WidgetRun.m2748h(constraintAnchor5);
            if (dependencyNodeM2748h8 != null) {
                WidgetRun.m2747b(dependencyNode2, dependencyNodeM2748h8, this.f4929b.f4854S[2].m2690e());
                m2750c(dependencyNode, dependencyNode2, 1, c0732a);
                if (this.f4929b.f4841F) {
                    m2750c(dependencyNode3, dependencyNode2, 1, this.f4943l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f4931d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f4929b;
                    if (constraintWidget17.f4861Z > 0.0f) {
                        C0734c c0734c = constraintWidget17.f4868d;
                        if (c0734c.f4931d == dimensionBehaviour3) {
                            c0734c.f4932e.f4926k.add(c0732a);
                            arrayList.add(this.f4929b.f4868d.f4932e);
                            c0732a.f4916a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f4831f != null) {
                DependencyNode dependencyNodeM2748h9 = WidgetRun.m2748h(constraintAnchor7);
                if (dependencyNodeM2748h9 != null) {
                    WidgetRun.m2747b(dependencyNode, dependencyNodeM2748h9, -this.f4929b.f4854S[3].m2690e());
                    m2750c(dependencyNode2, dependencyNode, -1, c0732a);
                    if (this.f4929b.f4841F) {
                        m2750c(dependencyNode3, dependencyNode2, 1, this.f4943l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f4831f != null) {
                    DependencyNode dependencyNodeM2748h10 = WidgetRun.m2748h(constraintAnchor8);
                    if (dependencyNodeM2748h10 != null) {
                        WidgetRun.m2747b(dependencyNode3, dependencyNodeM2748h10, 0);
                        m2750c(dependencyNode2, dependencyNode3, -1, this.f4943l);
                        m2750c(dependencyNode, dependencyNode2, 1, c0732a);
                    }
                } else if (!(constraintWidget16 instanceof InterfaceC5038a) && (constraintWidget3 = constraintWidget16.f4858W) != null) {
                    WidgetRun.m2747b(dependencyNode2, constraintWidget3.f4870e.f4935h, constraintWidget16.m2737w());
                    m2750c(dependencyNode, dependencyNode2, 1, c0732a);
                    if (this.f4929b.f4841F) {
                        m2750c(dependencyNode3, dependencyNode2, 1, this.f4943l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f4931d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        ConstraintWidget constraintWidget18 = this.f4929b;
                        if (constraintWidget18.f4861Z > 0.0f) {
                            C0734c c0734c2 = constraintWidget18.f4868d;
                            if (c0734c2.f4931d == dimensionBehaviour5) {
                                c0734c2.f4932e.f4926k.add(c0732a);
                                arrayList.add(this.f4929b.f4868d.f4932e);
                                c0732a.f4916a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            c0732a.f4918c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo2752e() {
        DependencyNode dependencyNode = this.f4935h;
        if (dependencyNode.f4925j) {
            this.f4929b.f4867c0 = dependencyNode.f4922g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo2753f() {
        this.f4930c = null;
        this.f4935h.m2745c();
        this.f4936i.m2745c();
        this.f4942k.m2745c();
        this.f4932e.m2745c();
        this.f4934g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo2756k() {
        if (this.f4931d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f4929b.f4900t != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m2761m() {
        this.f4934g = false;
        DependencyNode dependencyNode = this.f4935h;
        dependencyNode.m2745c();
        dependencyNode.f4925j = false;
        DependencyNode dependencyNode2 = this.f4936i;
        dependencyNode2.m2745c();
        dependencyNode2.f4925j = false;
        DependencyNode dependencyNode3 = this.f4942k;
        dependencyNode3.m2745c();
        dependencyNode3.f4925j = false;
        this.f4932e.f4925j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4929b.f4885l0;
    }
}
