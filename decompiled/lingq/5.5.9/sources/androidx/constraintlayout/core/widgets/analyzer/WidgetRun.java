package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p083e2.C5361i;
import p083e2.InterfaceC5356d;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements InterfaceC5356d {

    /* JADX INFO: renamed from: a */
    public int f4928a;

    /* JADX INFO: renamed from: b */
    public ConstraintWidget f4929b;

    /* JADX INFO: renamed from: c */
    public C5361i f4930c;

    /* JADX INFO: renamed from: d */
    public ConstraintWidget.DimensionBehaviour f4931d;

    /* JADX INFO: renamed from: e */
    public final C0732a f4932e = new C0732a(this);

    /* JADX INFO: renamed from: f */
    public int f4933f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f4934g = false;

    /* JADX INFO: renamed from: h */
    public final DependencyNode f4935h = new DependencyNode(this);

    /* JADX INFO: renamed from: i */
    public final DependencyNode f4936i = new DependencyNode(this);

    /* JADX INFO: renamed from: j */
    public RunType f4937j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$a */
    public static /* synthetic */ class C0731a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4938a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f4938a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4938a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4938a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4938a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4938a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f4929b = constraintWidget;
    }

    /* JADX INFO: renamed from: b */
    public static void m2747b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f4927l.add(dependencyNode2);
        dependencyNode.f4921f = i10;
        dependencyNode2.f4926k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: h */
    public static DependencyNode m2748h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4831f;
        if (constraintAnchor2 == null) {
            return null;
        }
        int i10 = C0731a.f4938a[constraintAnchor2.f4830e.ordinal()];
        ConstraintWidget constraintWidget = constraintAnchor2.f4829d;
        if (i10 == 1) {
            return constraintWidget.f4868d.f4935h;
        }
        if (i10 == 2) {
            return constraintWidget.f4868d.f4936i;
        }
        if (i10 == 3) {
            return constraintWidget.f4870e.f4935h;
        }
        if (i10 == 4) {
            return constraintWidget.f4870e.f4942k;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.f4870e.f4936i;
    }

    /* JADX INFO: renamed from: i */
    public static DependencyNode m2749i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4831f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f4829d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f4868d : constraintWidget.f4870e;
        int i11 = C0731a.f4938a[constraintAnchor2.f4830e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f4936i;
        }
        return widgetRun.f4935h;
    }

    @Override // p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public void mo2743a(InterfaceC5356d interfaceC5356d) {
    }

    /* JADX INFO: renamed from: c */
    public final void m2750c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, C0732a c0732a) {
        dependencyNode.f4927l.add(dependencyNode2);
        dependencyNode.f4927l.add(this.f4932e);
        dependencyNode.f4923h = i10;
        dependencyNode.f4924i = c0732a;
        dependencyNode2.f4926k.add(dependencyNode);
        c0732a.f4926k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2751d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2752e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2753f();

    /* JADX INFO: renamed from: g */
    public final int m2754g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f4929b;
            int i12 = constraintWidget.f4906w;
            iMax = Math.max(constraintWidget.f4904v, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f4929b;
            int i13 = constraintWidget2.f4909z;
            iMax = Math.max(constraintWidget2.f4908y, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: j */
    public long mo2755j() {
        C0732a c0732a = this.f4932e;
        if (c0732a.f4925j) {
            return c0732a.f4922g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2756k();

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX INFO: renamed from: l */
    public final void m2757l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        C0732a c0732a;
        float f3;
        int i11;
        DependencyNode dependencyNodeM2748h = m2748h(constraintAnchor);
        DependencyNode dependencyNodeM2748h2 = m2748h(constraintAnchor2);
        if (dependencyNodeM2748h.f4925j && dependencyNodeM2748h2.f4925j) {
            int iM2690e = constraintAnchor.m2690e() + dependencyNodeM2748h.f4922g;
            int iM2690e2 = dependencyNodeM2748h2.f4922g - constraintAnchor2.m2690e();
            int i12 = iM2690e2 - iM2690e;
            C0732a c0732a2 = this.f4932e;
            if (!c0732a2.f4925j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f4931d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i13 = this.f4928a;
                    if (i13 == 0) {
                        c0732a2.mo2746d(m2754g(i12, i10));
                    } else if (i13 == 1) {
                        c0732a2.mo2746d(Math.min(m2754g(c0732a2.f4939m, i10), i12));
                    } else if (i13 == 2) {
                        ConstraintWidget constraintWidget = this.f4929b;
                        ConstraintWidget constraintWidget2 = constraintWidget.f4858W;
                        if (constraintWidget2 != null) {
                            C0732a c0732a3 = (i10 == 0 ? constraintWidget2.f4868d : constraintWidget2.f4870e).f4932e;
                            if (c0732a3.f4925j) {
                                c0732a2.mo2746d(m2754g((int) ((c0732a3.f4922g * (i10 == 0 ? constraintWidget.f4907x : constraintWidget.f4836A)) + 0.5f), i10));
                            }
                        }
                    } else if (i13 == 3) {
                        ConstraintWidget constraintWidget3 = this.f4929b;
                        WidgetRun widgetRun = constraintWidget3.f4868d;
                        if (widgetRun.f4931d == dimensionBehaviour2 && widgetRun.f4928a == 3) {
                            C0735d c0735d = constraintWidget3.f4870e;
                            if (c0735d.f4931d != dimensionBehaviour2 || c0735d.f4928a != 3) {
                                if (i10 == 0) {
                                    widgetRun = constraintWidget3.f4870e;
                                }
                                c0732a = widgetRun.f4932e;
                                if (c0732a.f4925j) {
                                    f3 = constraintWidget3.f4861Z;
                                    if (i10 == 1) {
                                        i11 = (int) ((c0732a.f4922g / f3) + 0.5f);
                                    } else {
                                        i11 = (int) ((f3 * c0732a.f4922g) + 0.5f);
                                    }
                                    c0732a2.mo2746d(i11);
                                }
                            }
                        } else {
                            if (i10 == 0) {
                                widgetRun = constraintWidget3.f4870e;
                            }
                            c0732a = widgetRun.f4932e;
                            if (c0732a.f4925j) {
                                f3 = constraintWidget3.f4861Z;
                                if (i10 == 1) {
                                    i11 = (int) ((c0732a.f4922g / f3) + 0.5f);
                                } else {
                                    i11 = (int) ((f3 * c0732a.f4922g) + 0.5f);
                                }
                                c0732a2.mo2746d(i11);
                            }
                        }
                    }
                }
            }
            if (c0732a2.f4925j) {
                int i14 = c0732a2.f4922g;
                DependencyNode dependencyNode = this.f4936i;
                DependencyNode dependencyNode2 = this.f4935h;
                if (i14 == i12) {
                    dependencyNode2.mo2746d(iM2690e);
                    dependencyNode.mo2746d(iM2690e2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f4929b;
                float f10 = i10 == 0 ? constraintWidget4.f4875g0 : constraintWidget4.f4877h0;
                if (dependencyNodeM2748h == dependencyNodeM2748h2) {
                    iM2690e = dependencyNodeM2748h.f4922g;
                    iM2690e2 = dependencyNodeM2748h2.f4922g;
                    f10 = 0.5f;
                }
                dependencyNode2.mo2746d((int) ((((iM2690e2 - iM2690e) - i14) * f10) + iM2690e + 0.5f));
                dependencyNode.mo2746d(dependencyNode2.f4922g + c0732a2.f4922g);
            }
        }
    }
}
