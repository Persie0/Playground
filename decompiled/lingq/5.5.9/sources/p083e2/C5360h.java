package p083e2;

import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* JADX INFO: renamed from: e2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5360h extends WidgetRun {
    public C5360h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f4868d.mo2753f();
        constraintWidget.f4870e.mo2753f();
        this.f4933f = ((C0740f) constraintWidget).f5026A0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        DependencyNode dependencyNode = this.f4935h;
        if (dependencyNode.f4918c && !dependencyNode.f4925j) {
            dependencyNode.mo2746d((int) ((((DependencyNode) dependencyNode.f4927l.get(0)).f4922g * ((C0740f) this.f4929b).f5028w0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: d */
    public final void mo2751d() {
        ConstraintWidget constraintWidget = this.f4929b;
        C0740f c0740f = (C0740f) constraintWidget;
        int i10 = c0740f.f5029x0;
        int i11 = c0740f.f5030y0;
        int i12 = c0740f.f5026A0;
        DependencyNode dependencyNode = this.f4935h;
        if (i12 == 1) {
            if (i10 != -1) {
                dependencyNode.f4927l.add(constraintWidget.f4858W.f4868d.f4935h);
                this.f4929b.f4858W.f4868d.f4935h.f4926k.add(dependencyNode);
                dependencyNode.f4921f = i10;
            } else if (i11 != -1) {
                dependencyNode.f4927l.add(constraintWidget.f4858W.f4868d.f4936i);
                this.f4929b.f4858W.f4868d.f4936i.f4926k.add(dependencyNode);
                dependencyNode.f4921f = -i11;
            } else {
                dependencyNode.f4917b = true;
                dependencyNode.f4927l.add(constraintWidget.f4858W.f4868d.f4936i);
                this.f4929b.f4858W.f4868d.f4936i.f4926k.add(dependencyNode);
            }
            m11498m(this.f4929b.f4868d.f4935h);
            m11498m(this.f4929b.f4868d.f4936i);
            return;
        }
        if (i10 != -1) {
            dependencyNode.f4927l.add(constraintWidget.f4858W.f4870e.f4935h);
            this.f4929b.f4858W.f4870e.f4935h.f4926k.add(dependencyNode);
            dependencyNode.f4921f = i10;
        } else if (i11 != -1) {
            dependencyNode.f4927l.add(constraintWidget.f4858W.f4870e.f4936i);
            this.f4929b.f4858W.f4870e.f4936i.f4926k.add(dependencyNode);
            dependencyNode.f4921f = -i11;
        } else {
            dependencyNode.f4917b = true;
            dependencyNode.f4927l.add(constraintWidget.f4858W.f4870e.f4936i);
            this.f4929b.f4858W.f4870e.f4936i.f4926k.add(dependencyNode);
        }
        m11498m(this.f4929b.f4870e.f4935h);
        m11498m(this.f4929b.f4870e.f4936i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: e */
    public final void mo2752e() {
        ConstraintWidget constraintWidget = this.f4929b;
        int i10 = ((C0740f) constraintWidget).f5026A0;
        DependencyNode dependencyNode = this.f4935h;
        if (i10 == 1) {
            constraintWidget.f4865b0 = dependencyNode.f4922g;
        } else {
            constraintWidget.f4867c0 = dependencyNode.f4922g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: f */
    public final void mo2753f() {
        this.f4935h.m2745c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* JADX INFO: renamed from: k */
    public final boolean mo2756k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m11498m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f4935h;
        dependencyNode2.f4926k.add(dependencyNode);
        dependencyNode.f4927l.add(dependencyNode2);
    }
}
