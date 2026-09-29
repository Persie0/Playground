package p000;

import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
final class zn8 extends i16 {

    /* JADX INFO: renamed from: b */
    public final do8 f71799b;

    /* JADX INFO: renamed from: c */
    public final Orientation f71800c;

    /* JADX INFO: renamed from: d */
    public final boolean f71801d;

    /* JADX INFO: renamed from: e */
    public final boolean f71802e;

    /* JADX INFO: renamed from: f */
    public final x63 f71803f;

    /* JADX INFO: renamed from: g */
    public final v56 f71804g;

    /* JADX INFO: renamed from: h */
    public final ni0 f71805h;

    /* JADX INFO: renamed from: i */
    public final boolean f71806i;

    /* JADX INFO: renamed from: j */
    public final C0077c f71807j;

    public zn8(ni0 ni0Var, x63 x63Var, v56 v56Var, do8 do8Var, C0077c c0077c, Orientation orientation, boolean z, boolean z2, boolean z3) {
        this.f71799b = do8Var;
        this.f71800c = orientation;
        this.f71801d = z;
        this.f71802e = z2;
        this.f71803f = x63Var;
        this.f71804g = v56Var;
        this.f71805h = ni0Var;
        this.f71806i = z3;
        this.f71807j = c0077c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn8.class != obj.getClass()) {
            return false;
        }
        zn8 zn8Var = (zn8) obj;
        return fa4.m11650l(this.f71799b, zn8Var.f71799b) && this.f71800c == zn8Var.f71800c && this.f71801d == zn8Var.f71801d && this.f71802e == zn8Var.f71802e && fa4.m11650l(this.f71803f, zn8Var.f71803f) && fa4.m11650l(this.f71804g, zn8Var.f71804g) && fa4.m11650l(this.f71805h, zn8Var.f71805h) && this.f71806i == zn8Var.f71806i && fa4.m11650l(this.f71807j, zn8Var.f71807j);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ao8 ao8Var = new ao8();
        ao8Var.f7293L = this.f71799b;
        ao8Var.f7294M = this.f71800c;
        ao8Var.f7295N = this.f71801d;
        ao8Var.f7296O = this.f71802e;
        ao8Var.f7297P = this.f71803f;
        ao8Var.f7298Q = this.f71804g;
        ao8Var.f7299R = this.f71805h;
        ao8Var.f7300S = this.f71806i;
        ao8Var.f7301T = this.f71807j;
        return ao8Var;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e((this.f71800c.hashCode() + (this.f71799b.hashCode() * 31)) * 31, 31, this.f71801d), 31, this.f71802e);
        x63 x63Var = this.f71803f;
        int iHashCode = (iM12428e + (x63Var != null ? x63Var.hashCode() : 0)) * 31;
        v56 v56Var = this.f71804g;
        int iHashCode2 = (iHashCode + (v56Var != null ? v56Var.hashCode() : 0)) * 31;
        ni0 ni0Var = this.f71805h;
        int iM12428e2 = g9a.m12428e((iHashCode2 + (ni0Var != null ? ni0Var.hashCode() : 0)) * 31, 31, this.f71806i);
        C0077c c0077c = this.f71807j;
        return iM12428e2 + (c0077c != null ? c0077c.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "scrollableArea";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f71799b, "state");
        z91Var.m25511b(this.f71800c, "orientation");
        if (!this.f71806i) {
            z91Var.m25511b(this.f71807j, "overscrollEffect");
        }
        z91Var.m25511b(Boolean.valueOf(this.f71801d), "enabled");
        z91Var.m25511b(Boolean.valueOf(this.f71802e), "reverseScrolling");
        z91Var.m25511b(this.f71803f, "flingBehavior");
        z91Var.m25511b(this.f71804g, "interactionSource");
        z91Var.m25511b(this.f71805h, "bringIntoViewSpec");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((ao8) d16Var).m2958e1(this.f71805h, this.f71803f, this.f71804g, this.f71799b, this.f71807j, this.f71800c, this.f71806i, this.f71801d, this.f71802e);
    }
}
