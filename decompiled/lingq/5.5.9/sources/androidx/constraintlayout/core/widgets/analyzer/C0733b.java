package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0730a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import p083e2.InterfaceC5356d;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0733b extends WidgetRun {
    public C0733b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        C0730a c0730a = (C0730a) this.f4929b;
        int i10 = c0730a.f4914y0;
        DependencyNode dependencyNode = this.f4935h;
        Iterator it = dependencyNode.f4927l.iterator();
        int i11 = 0;
        int i12 = -1;
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                int i13 = ((DependencyNode) it.next()).f4922g;
                if (i12 == -1 || i13 < i12) {
                    i12 = i13;
                }
                if (i11 < i13) {
                    i11 = i13;
                }
            }
        }
        if (i10 == 0 || i10 == 2) {
            dependencyNode.mo2746d(i12 + c0730a.f4912A0);
        } else {
            dependencyNode.mo2746d(i11 + c0730a.f4912A0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo2751d() {
        ConstraintWidget constraintWidget = this.f4929b;
        if (constraintWidget instanceof C0730a) {
            DependencyNode dependencyNode = this.f4935h;
            dependencyNode.f4917b = true;
            C0730a c0730a = (C0730a) constraintWidget;
            int i10 = c0730a.f4914y0;
            boolean z10 = c0730a.f4915z0;
            ArrayList arrayList = dependencyNode.f4927l;
            int i11 = 0;
            if (i10 == 0) {
                dependencyNode.f4920e = DependencyNode.Type.LEFT;
                while (i11 < c0730a.f32871x0) {
                    ConstraintWidget constraintWidget2 = c0730a.f32870w0[i11];
                    if (z10 || constraintWidget2.f4881j0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f4868d.f4935h;
                        dependencyNode2.f4926k.add(dependencyNode);
                        arrayList.add(dependencyNode2);
                    }
                    i11++;
                }
                m2758m(this.f4929b.f4868d.f4935h);
                m2758m(this.f4929b.f4868d.f4936i);
                return;
            }
            if (i10 == 1) {
                dependencyNode.f4920e = DependencyNode.Type.RIGHT;
                while (i11 < c0730a.f32871x0) {
                    ConstraintWidget constraintWidget3 = c0730a.f32870w0[i11];
                    if (z10 || constraintWidget3.f4881j0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f4868d.f4936i;
                        dependencyNode3.f4926k.add(dependencyNode);
                        arrayList.add(dependencyNode3);
                    }
                    i11++;
                }
                m2758m(this.f4929b.f4868d.f4935h);
                m2758m(this.f4929b.f4868d.f4936i);
                return;
            }
            if (i10 == 2) {
                dependencyNode.f4920e = DependencyNode.Type.TOP;
                while (i11 < c0730a.f32871x0) {
                    ConstraintWidget constraintWidget4 = c0730a.f32870w0[i11];
                    if (z10 || constraintWidget4.f4881j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f4870e.f4935h;
                        dependencyNode4.f4926k.add(dependencyNode);
                        arrayList.add(dependencyNode4);
                    }
                    i11++;
                }
                m2758m(this.f4929b.f4870e.f4935h);
                m2758m(this.f4929b.f4870e.f4936i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            dependencyNode.f4920e = DependencyNode.Type.BOTTOM;
            while (i11 < c0730a.f32871x0) {
                ConstraintWidget constraintWidget5 = c0730a.f32870w0[i11];
                if (z10 || constraintWidget5.f4881j0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f4870e.f4936i;
                    dependencyNode5.f4926k.add(dependencyNode);
                    arrayList.add(dependencyNode5);
                }
                i11++;
            }
            m2758m(this.f4929b.f4870e.f4935h);
            m2758m(this.f4929b.f4870e.f4936i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo2752e() {
        ConstraintWidget constraintWidget = this.f4929b;
        if (constraintWidget instanceof C0730a) {
            int i10 = ((C0730a) constraintWidget).f4914y0;
            DependencyNode dependencyNode = this.f4935h;
            if (i10 != 0 && i10 != 1) {
                constraintWidget.f4867c0 = dependencyNode.f4922g;
                return;
            }
            constraintWidget.f4865b0 = dependencyNode.f4922g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo2753f() {
        this.f4930c = null;
        this.f4935h.m2745c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo2756k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2758m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f4935h;
        dependencyNode2.f4926k.add(dependencyNode);
        dependencyNode.f4927l.add(dependencyNode2);
    }
}
