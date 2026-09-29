package p000;

import androidx.compose.foundation.lazy.layout.C0135d;

/* JADX INFO: loaded from: classes.dex */
final class vh2 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0135d f65370b;

    public vh2(C0135d c0135d) {
        this.f65370b = c0135d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh2) && fa4.m11650l(this.f65370b, ((vh2) obj).f65370b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        wh2 wh2Var = new wh2();
        wh2Var.f66815J = this.f65370b;
        return wh2Var;
    }

    public final int hashCode() {
        return this.f65370b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "DisplayingDisappearingItemsElement";
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        wh2 wh2Var = (wh2) d16Var;
        C0135d c0135d = wh2Var.f66815J;
        C0135d c0135d2 = this.f65370b;
        if (fa4.m11650l(c0135d, c0135d2) || !wh2Var.f34837a.f34836I) {
            return;
        }
        C0135d c0135d3 = wh2Var.f66815J;
        c0135d3.m1012e();
        c0135d3.f2555b = null;
        c0135d3.f2556c = -1;
        c0135d2.f2563j = wh2Var;
        wh2Var.f66815J = c0135d2;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f65370b + ')';
    }
}
