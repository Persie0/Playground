package androidx.constraintlayout.core.widgets.analyzer;

import p083e2.InterfaceC5356d;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.a */
/* JADX INFO: loaded from: classes.dex */
public class C0732a extends DependencyNode {

    /* JADX INFO: renamed from: m */
    public int f4939m;

    public C0732a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof C0734c) {
            this.f4920e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f4920e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    /* JADX INFO: renamed from: d */
    public final void mo2746d(int i10) {
        if (this.f4925j) {
            return;
        }
        this.f4925j = true;
        this.f4922g = i10;
        for (InterfaceC5356d interfaceC5356d : this.f4926k) {
            interfaceC5356d.mo2743a(interfaceC5356d);
        }
    }
}
