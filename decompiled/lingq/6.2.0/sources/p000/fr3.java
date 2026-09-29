package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class fr3 {

    /* JADX INFO: renamed from: a */
    public final hh0 f39517a;

    /* JADX INFO: renamed from: b */
    public final gp0 f39518b;

    /* JADX INFO: renamed from: c */
    public final C3404oc f39519c;

    public fr3(hh0 hh0Var, gp0 gp0Var, C3404oc c3404oc) {
        this.f39517a = hh0Var;
        this.f39518b = gp0Var;
        this.f39519c = c3404oc;
        if (hh0Var.m13238b() == 0 && hh0Var.m13237a() == 0) {
            C3386nv.m17626m("Bounds must be non zero");
            throw null;
        }
        if (hh0Var.f42343a == 0 || hh0Var.f42344b == 0) {
            return;
        }
        C3386nv.m17626m("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m12006a() {
        return this.f39517a.m13239c();
    }

    /* JADX INFO: renamed from: b */
    public final C2920da m12007b() {
        hh0 hh0Var = this.f39517a;
        return (hh0Var.m13238b() == 0 || hh0Var.m13237a() == 0) ? C2920da.f35228g : C2920da.f35229h;
    }

    /* JADX INFO: renamed from: c */
    public final C3366nb m12008c() {
        hh0 hh0Var = this.f39517a;
        return hh0Var.m13238b() > hh0Var.m13237a() ? C3366nb.f52553g : C3366nb.f52552f;
    }

    /* JADX INFO: renamed from: d */
    public final C3404oc m12009d() {
        return this.f39519c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12010e() {
        gp0 gp0Var = gp0.f41122g;
        gp0 gp0Var2 = this.f39518b;
        return gp0Var2 == gp0Var || (gp0Var2 == gp0.f41121f && this.f39519c == C3404oc.f54160g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (fr3.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            fr3 fr3Var = (fr3) obj;
            return this.f39517a.equals(fr3Var.f39517a) && this.f39518b == fr3Var.f39518b && this.f39519c == fr3Var.f39519c;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39519c.hashCode() + ((this.f39518b.hashCode() + (this.f39517a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return fr3.class.getSimpleName() + " { " + this.f39517a + ", type=" + this.f39518b + ", state=" + this.f39519c + " }";
    }
}
