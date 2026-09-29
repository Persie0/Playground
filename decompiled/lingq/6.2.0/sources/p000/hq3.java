package p000;

import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import androidx.constraintlayout.core.widgets.analyzer.C0466a;

/* JADX INFO: loaded from: classes2.dex */
public final class hq3 extends AbstractC0473h {
    public hq3(gq3 gq3Var) {
        super(gq3Var);
        gq3Var.f65464d.mo1917f();
        gq3Var.f65466e.mo1917f();
        this.f5355f = gq3Var.f41183x0;
    }

    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        C0466a c0466a = this.f5357h;
        if (c0466a.f5334c && !c0466a.f5341j) {
            c0466a.mo1914d((int) ((((C0466a) c0466a.f5343l.get(0)).f5338g * ((gq3) this.f5351b).f41179t0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: d */
    public final void mo1915d() {
        vj1 vj1Var = this.f5351b;
        gq3 gq3Var = (gq3) vj1Var;
        int i = gq3Var.f41180u0;
        int i2 = gq3Var.f41181v0;
        int i3 = gq3Var.f41183x0;
        C0466a c0466a = this.f5357h;
        if (i3 == 1) {
            if (i != -1) {
                c0466a.f5343l.add(vj1Var.f65452U.f65464d.f5357h);
                this.f5351b.f65452U.f65464d.f5357h.f5342k.add(c0466a);
                c0466a.f5337f = i;
            } else if (i2 != -1) {
                c0466a.f5343l.add(vj1Var.f65452U.f65464d.f5358i);
                this.f5351b.f65452U.f65464d.f5358i.f5342k.add(c0466a);
                c0466a.f5337f = -i2;
            } else {
                c0466a.f5333b = true;
                c0466a.f5343l.add(vj1Var.f65452U.f65464d.f5358i);
                this.f5351b.f65452U.f65464d.f5358i.f5342k.add(c0466a);
            }
            m13429m(this.f5351b.f65464d.f5357h);
            m13429m(this.f5351b.f65464d.f5358i);
            return;
        }
        if (i != -1) {
            c0466a.f5343l.add(vj1Var.f65452U.f65466e.f5357h);
            this.f5351b.f65452U.f65466e.f5357h.f5342k.add(c0466a);
            c0466a.f5337f = i;
        } else if (i2 != -1) {
            c0466a.f5343l.add(vj1Var.f65452U.f65466e.f5358i);
            this.f5351b.f65452U.f65466e.f5358i.f5342k.add(c0466a);
            c0466a.f5337f = -i2;
        } else {
            c0466a.f5333b = true;
            c0466a.f5343l.add(vj1Var.f65452U.f65466e.f5358i);
            this.f5351b.f65452U.f65466e.f5358i.f5342k.add(c0466a);
        }
        m13429m(this.f5351b.f65466e.f5357h);
        m13429m(this.f5351b.f65466e.f5358i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: e */
    public final void mo1916e() {
        vj1 vj1Var = this.f5351b;
        int i = ((gq3) vj1Var).f41183x0;
        C0466a c0466a = this.f5357h;
        if (i == 1) {
            vj1Var.f65457Z = c0466a.f5338g;
        } else {
            vj1Var.f65459a0 = c0466a.f5338g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: f */
    public final void mo1917f() {
        this.f5357h.m1913c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h
    /* JADX INFO: renamed from: k */
    public final boolean mo1918k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m13429m(C0466a c0466a) {
        C0466a c0466a2 = this.f5357h;
        c0466a2.f5342k.add(c0466a);
        c0466a.f5343l.add(c0466a2);
    }
}
