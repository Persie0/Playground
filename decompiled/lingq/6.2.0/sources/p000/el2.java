package p000;

import androidx.compose.foundation.gestures.C0105m;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class el2 extends i16 {

    /* JADX INFO: renamed from: j */
    public static final C2951e4 f37409j = new C2951e4(21);

    /* JADX INFO: renamed from: b */
    public final hl2 f37410b;

    /* JADX INFO: renamed from: c */
    public final Orientation f37411c;

    /* JADX INFO: renamed from: d */
    public final boolean f37412d;

    /* JADX INFO: renamed from: e */
    public final v56 f37413e;

    /* JADX INFO: renamed from: f */
    public final boolean f37414f;

    /* JADX INFO: renamed from: g */
    public final aj3 f37415g;

    /* JADX INFO: renamed from: h */
    public final aj3 f37416h;

    /* JADX INFO: renamed from: i */
    public final boolean f37417i;

    public el2(hl2 hl2Var, Orientation orientation, boolean z, v56 v56Var, boolean z2, aj3 aj3Var, aj3 aj3Var2, boolean z3) {
        this.f37410b = hl2Var;
        this.f37411c = orientation;
        this.f37412d = z;
        this.f37413e = v56Var;
        this.f37414f = z2;
        this.f37415g = aj3Var;
        this.f37416h = aj3Var2;
        this.f37417i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || el2.class != obj.getClass()) {
            return false;
        }
        el2 el2Var = (el2) obj;
        return fa4.m11650l(this.f37410b, el2Var.f37410b) && this.f37411c == el2Var.f37411c && this.f37412d == el2Var.f37412d && fa4.m11650l(this.f37413e, el2Var.f37413e) && this.f37414f == el2Var.f37414f && fa4.m11650l(this.f37415g, el2Var.f37415g) && fa4.m11650l(this.f37416h, el2Var.f37416h) && this.f37417i == el2Var.f37417i;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0105m c0105m = new C0105m(f37409j, this.f37412d, this.f37413e, this.f37411c);
        c0105m.f2288e0 = this.f37410b;
        c0105m.f2289f0 = this.f37414f;
        c0105m.f2290g0 = this.f37415g;
        c0105m.f2291h0 = this.f37416h;
        c0105m.f2292i0 = this.f37417i;
        return c0105m;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f37411c.hashCode() + (this.f37410b.hashCode() * 31)) * 31, 31, this.f37412d);
        v56 v56Var = this.f37413e;
        return Boolean.hashCode(this.f37417i) + ((this.f37416h.hashCode() + ((this.f37415g.hashCode() + g9a.m12428e((iM12428e + (v56Var != null ? v56Var.hashCode() : 0)) * 31, 31, this.f37414f)) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "draggable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f37411c, "orientation");
        z91Var.m25511b(Boolean.valueOf(this.f37412d), "enabled");
        z91Var.m25511b(Boolean.valueOf(this.f37417i), "reverseDirection");
        z91Var.m25511b(this.f37413e, "interactionSource");
        z91Var.m25511b(Boolean.valueOf(this.f37414f), "startDragImmediately");
        z91Var.m25511b(this.f37415g, "onDragStarted");
        z91Var.m25511b(this.f37416h, "onDragStopped");
        z91Var.m25511b(this.f37410b, "state");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        boolean z2;
        C0105m c0105m = (C0105m) d16Var;
        hl2 hl2Var = c0105m.f2288e0;
        hl2 hl2Var2 = this.f37410b;
        if (fa4.m11650l(hl2Var, hl2Var2)) {
            z = false;
        } else {
            c0105m.f2288e0 = hl2Var2;
            z = true;
        }
        boolean z3 = c0105m.f2292i0;
        boolean z4 = this.f37417i;
        if (z3 != z4) {
            c0105m.f2292i0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        c0105m.f2290g0 = this.f37415g;
        c0105m.f2291h0 = this.f37416h;
        c0105m.f2289f0 = this.f37414f;
        c0105m.m890t1(f37409j, this.f37412d, this.f37413e, this.f37411c, z2);
    }
}
