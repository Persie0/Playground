package p000;

import androidx.compose.p002ui.draw.C0295b;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f63823b;

    /* JADX INFO: renamed from: c */
    public final pd9 f63824c;

    /* JADX INFO: renamed from: d */
    public final o39 f63825d;

    public uf0(float f, pd9 pd9Var, o39 o39Var) {
        this.f63823b = f;
        this.f63824c = pd9Var;
        this.f63825d = o39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        return xj2.m24560b(this.f63823b, uf0Var.f63823b) && this.f63824c.equals(uf0Var.f63824c) && fa4.m11650l(this.f63825d, uf0Var.f63825d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new tf0(this.f63823b, this.f63824c, this.f63825d);
    }

    public final int hashCode() {
        return this.f63825d.hashCode() + ((this.f63824c.hashCode() + (Float.hashCode(this.f63823b) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "border";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(new xj2(this.f63823b), "width");
        long j = this.f63824c.f55989a;
        z91Var.m25511b(new aa1(j), "color");
        y64Var.f69366b = new aa1(j);
        z91Var.m25511b(this.f63825d, "shape");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        tf0 tf0Var = (tf0) d16Var;
        float f = tf0Var.f62212M;
        C0295b c0295b = tf0Var.f62215P;
        float f2 = this.f63823b;
        if (!xj2.m24560b(f, f2)) {
            tf0Var.f62212M = f2;
            c0295b.m1345Z0();
        }
        pd9 pd9Var = tf0Var.f62213N;
        pd9 pd9Var2 = this.f63824c;
        if (!fa4.m11650l(pd9Var, pd9Var2)) {
            tf0Var.f62213N = pd9Var2;
            c0295b.m1345Z0();
        }
        o39 o39Var = tf0Var.f62214O;
        o39 o39Var2 = this.f63825d;
        if (fa4.m11650l(o39Var, o39Var2)) {
            return;
        }
        tf0Var.f62214O = o39Var2;
        c0295b.m1345Z0();
        thb.m22062u(tf0Var);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) xj2.m24561c(this.f63823b)) + ", brush=" + this.f63824c + ", shape=" + this.f63825d + ')';
    }
}
