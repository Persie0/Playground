package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p000.l80;
import p000.nb2;
import p000.vj1;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0468c extends AbstractC0473h {
    public C0468c(vj1 vj1Var) {
        super(vj1Var);
    }

    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        l80 l80Var = (l80) this.f5351b;
        int i = l80Var.f49285v0;
        C0466a c0466a = this.f5357h;
        Iterator it = c0466a.f5343l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0466a) it.next()).f5338g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0466a.mo1914d(i3 + l80Var.f49287x0);
        } else {
            c0466a.mo1914d(i2 + l80Var.f49287x0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: d */
    public final void mo1915d() {
        vj1 vj1Var = this.f5351b;
        if (vj1Var instanceof l80) {
            C0466a c0466a = this.f5357h;
            c0466a.f5333b = true;
            ArrayList arrayList = c0466a.f5343l;
            l80 l80Var = (l80) vj1Var;
            int i = l80Var.f49285v0;
            boolean z = l80Var.f49286w0;
            int i2 = 0;
            if (i == 0) {
                c0466a.f5336e = DependencyNode$Type.LEFT;
                while (i2 < l80Var.f54931u0) {
                    vj1 vj1Var2 = l80Var.f54930t0[i2];
                    if (z || vj1Var2.f65473h0 != 8) {
                        C0466a c0466a2 = vj1Var2.f65464d.f5357h;
                        c0466a2.f5342k.add(c0466a);
                        arrayList.add(c0466a2);
                    }
                    i2++;
                }
                m1919m(this.f5351b.f65464d.f5357h);
                m1919m(this.f5351b.f65464d.f5358i);
                return;
            }
            if (i == 1) {
                c0466a.f5336e = DependencyNode$Type.RIGHT;
                while (i2 < l80Var.f54931u0) {
                    vj1 vj1Var3 = l80Var.f54930t0[i2];
                    if (z || vj1Var3.f65473h0 != 8) {
                        C0466a c0466a3 = vj1Var3.f65464d.f5358i;
                        c0466a3.f5342k.add(c0466a);
                        arrayList.add(c0466a3);
                    }
                    i2++;
                }
                m1919m(this.f5351b.f65464d.f5357h);
                m1919m(this.f5351b.f65464d.f5358i);
                return;
            }
            if (i == 2) {
                c0466a.f5336e = DependencyNode$Type.TOP;
                while (i2 < l80Var.f54931u0) {
                    vj1 vj1Var4 = l80Var.f54930t0[i2];
                    if (z || vj1Var4.f65473h0 != 8) {
                        C0466a c0466a4 = vj1Var4.f65466e.f5357h;
                        c0466a4.f5342k.add(c0466a);
                        arrayList.add(c0466a4);
                    }
                    i2++;
                }
                m1919m(this.f5351b.f65466e.f5357h);
                m1919m(this.f5351b.f65466e.f5358i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0466a.f5336e = DependencyNode$Type.BOTTOM;
            while (i2 < l80Var.f54931u0) {
                vj1 vj1Var5 = l80Var.f54930t0[i2];
                if (z || vj1Var5.f65473h0 != 8) {
                    C0466a c0466a5 = vj1Var5.f65466e.f5358i;
                    c0466a5.f5342k.add(c0466a);
                    arrayList.add(c0466a5);
                }
                i2++;
            }
            m1919m(this.f5351b.f65466e.f5357h);
            m1919m(this.f5351b.f65466e.f5358i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: e */
    public final void mo1916e() {
        vj1 vj1Var = this.f5351b;
        if (vj1Var instanceof l80) {
            int i = ((l80) vj1Var).f49285v0;
            C0466a c0466a = this.f5357h;
            if (i == 0 || i == 1) {
                vj1Var.f65457Z = c0466a.f5338g;
            } else {
                vj1Var.f65459a0 = c0466a.f5338g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: f */
    public final void mo1917f() {
        this.f5352c = null;
        this.f5357h.m1913c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: k */
    public final boolean mo1918k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1919m(C0466a c0466a) {
        C0466a c0466a2 = this.f5357h;
        c0466a2.f5342k.add(c0466a);
        c0466a.f5343l.add(c0466a2);
    }
}
