package androidx.compose.foundation.gestures;

import androidx.compose.material3.C0227e;
import p000.d16;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.a */
/* JADX INFO: loaded from: classes.dex */
final class C0093a<T> extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0097e f2217b;

    /* JADX INFO: renamed from: c */
    public final Orientation f2218c;

    /* JADX INFO: renamed from: d */
    public final boolean f2219d;

    /* JADX INFO: renamed from: e */
    public final Boolean f2220e;

    /* JADX INFO: renamed from: f */
    public final C0227e f2221f;

    public C0093a(C0097e c0097e, Orientation orientation, boolean z, Boolean bool, C0227e c0227e) {
        this.f2217b = c0097e;
        this.f2218c = orientation;
        this.f2219d = z;
        this.f2220e = bool;
        this.f2221f = c0227e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093a)) {
            return false;
        }
        C0093a c0093a = (C0093a) obj;
        return fa4.m11650l(this.f2217b, c0093a.f2217b) && this.f2218c == c0093a.f2218c && this.f2219d == c0093a.f2219d && fa4.m11650l(this.f2220e, c0093a.f2220e) && fa4.m11650l(this.f2221f, c0093a.f2221f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0096d c0096d = new C0096d(AbstractC0095c.f2225a, this.f2219d, null, this.f2218c);
        c0096d.f2227e0 = this.f2217b;
        c0096d.f2228f0 = this.f2220e;
        c0096d.f2229g0 = this.f2221f;
        return c0096d;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f2218c.hashCode() + (this.f2217b.hashCode() * 31)) * 31, 31, this.f2219d);
        Boolean bool = this.f2220e;
        int iHashCode = (iM12428e + (bool != null ? bool.hashCode() : 0)) * 923521;
        C0227e c0227e = this.f2221f;
        return iHashCode + (c0227e != null ? c0227e.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "anchoredDraggable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f2217b, "state");
        z91Var.m25511b(this.f2218c, "orientation");
        z91Var.m25511b(Boolean.valueOf(this.f2219d), "enabled");
        z91Var.m25511b(this.f2220e, "reverseDirection");
        z91Var.m25511b(null, "interactionSource");
        z91Var.m25511b(null, "startDragImmediately");
        z91Var.m25511b(null, "overscrollEffect");
        z91Var.m25511b(this.f2221f, "flingBehavior");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        boolean z2;
        C0096d c0096d = (C0096d) d16Var;
        C0227e c0227e = this.f2221f;
        c0096d.f2229g0 = c0227e;
        C0097e c0097e = c0096d.f2227e0;
        C0097e c0097e2 = this.f2217b;
        if (fa4.m11650l(c0097e, c0097e2)) {
            z = false;
        } else {
            c0096d.f2227e0 = c0097e2;
            c0096d.m846w1(c0227e);
            z = true;
        }
        Orientation orientation = c0096d.f2267L;
        Orientation orientation2 = this.f2218c;
        if (orientation != orientation2) {
            c0096d.f2267L = orientation2;
            z = true;
        }
        Boolean bool = c0096d.f2228f0;
        Boolean bool2 = this.f2220e;
        if (fa4.m11650l(bool, bool2)) {
            z2 = z;
        } else {
            c0096d.f2228f0 = bool2;
            z2 = true;
        }
        c0096d.m890t1(c0096d.f2268M, this.f2219d, null, orientation2, z2);
    }
}
