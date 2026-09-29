package androidx.compose.foundation;

import p000.d16;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.o31;
import p000.rh8;
import p000.uh8;
import p000.ui3;
import p000.v56;
import p000.w34;
import p000.y64;
import p000.z91;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f1651b;

    /* JADX INFO: renamed from: c */
    public final w34 f1652c;

    /* JADX INFO: renamed from: d */
    public final boolean f1653d;

    /* JADX INFO: renamed from: e */
    public final boolean f1654e;

    /* JADX INFO: renamed from: f */
    public final String f1655f;

    /* JADX INFO: renamed from: g */
    public final uh8 f1656g;

    /* JADX INFO: renamed from: h */
    public final ui3 f1657h;

    public ClickableElement(v56 v56Var, rh8 rh8Var, boolean z, boolean z2, String str, uh8 uh8Var, ui3 ui3Var) {
        this.f1651b = v56Var;
        this.f1652c = rh8Var;
        this.f1653d = z;
        this.f1654e = z2;
        this.f1655f = str;
        this.f1656g = uh8Var;
        this.f1657h = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return fa4.m11650l(this.f1651b, clickableElement.f1651b) && fa4.m11650l(this.f1652c, clickableElement.f1652c) && this.f1653d == clickableElement.f1653d && this.f1654e == clickableElement.f1654e && fa4.m11650l(this.f1655f, clickableElement.f1655f) && fa4.m11650l(this.f1656g, clickableElement.f1656g) && this.f1657h == clickableElement.f1657h;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new o31(this.f1651b, this.f1652c, this.f1653d, this.f1654e, this.f1655f, this.f1656g, this.f1657h);
    }

    public final int hashCode() {
        v56 v56Var = this.f1651b;
        int iHashCode = (v56Var != null ? v56Var.hashCode() : 0) * 31;
        w34 w34Var = this.f1652c;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode + (w34Var != null ? w34Var.hashCode() : 0)) * 31, 31, this.f1653d), 31, this.f1654e);
        String str = this.f1655f;
        int iHashCode2 = (iM12428e + (str != null ? str.hashCode() : 0)) * 31;
        uh8 uh8Var = this.f1656g;
        return this.f1657h.hashCode() + ((iHashCode2 + (uh8Var != null ? Integer.hashCode(uh8Var.f63934a) : 0)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "clickable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Boolean.valueOf(this.f1654e), "enabled");
        z91Var.m25511b(this.f1657h, "onClick");
        z91Var.m25511b(this.f1655f, "onClickLabel");
        z91Var.m25511b(this.f1656g, "role");
        z91Var.m25511b(this.f1651b, "interactionSource");
        z91Var.m25511b(this.f1652c, "indicationNodeFactory");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((o31) d16Var).m803o1(this.f1651b, this.f1652c, this.f1653d, this.f1654e, this.f1655f, this.f1656g, this.f1657h);
    }
}
