package androidx.constraintlayout.core.widgets.analyzer;

import p000.nb2;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
/* JADX INFO: loaded from: classes2.dex */
public class C0467b extends C0466a {

    /* JADX INFO: renamed from: m */
    public int f5344m;

    public C0467b(AbstractC0473h abstractC0473h) {
        super(abstractC0473h);
        if (abstractC0473h instanceof C0470e) {
            this.f5336e = DependencyNode$Type.HORIZONTAL_DIMENSION;
        } else {
            this.f5336e = DependencyNode$Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C0466a
    /* JADX INFO: renamed from: d */
    public final void mo1914d(int i) {
        if (this.f5341j) {
            return;
        }
        this.f5341j = true;
        this.f5338g = i;
        for (nb2 nb2Var : this.f5342k) {
            nb2Var.mo1911a(nb2Var);
        }
    }
}
