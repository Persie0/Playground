package androidx.compose.foundation;

import p000.d16;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.rh8;
import p000.thb;
import p000.ui3;
import p000.v56;
import p000.w34;
import p000.y64;
import p000.z91;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends i16 {

    /* JADX INFO: renamed from: b */
    public final v56 f1658b;

    /* JADX INFO: renamed from: c */
    public final w34 f1659c;

    /* JADX INFO: renamed from: d */
    public final ui3 f1660d;

    /* JADX INFO: renamed from: e */
    public final String f1661e;

    /* JADX INFO: renamed from: f */
    public final ui3 f1662f;

    public CombinedClickableElement(v56 v56Var, rh8 rh8Var, ui3 ui3Var, String str, ui3 ui3Var2) {
        this.f1658b = v56Var;
        this.f1659c = rh8Var;
        this.f1660d = ui3Var;
        this.f1661e = str;
        this.f1662f = ui3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return fa4.m11650l(this.f1658b, combinedClickableElement.f1658b) && fa4.m11650l(this.f1659c, combinedClickableElement.f1659c) && this.f1660d == combinedClickableElement.f1660d && fa4.m11650l(this.f1661e, combinedClickableElement.f1661e) && this.f1662f == combinedClickableElement.f1662f;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0081g(this.f1660d, this.f1661e, this.f1662f, this.f1658b, this.f1659c);
    }

    public final int hashCode() {
        v56 v56Var = this.f1658b;
        int iHashCode = (v56Var != null ? v56Var.hashCode() : 0) * 31;
        w34 w34Var = this.f1659c;
        int iHashCode2 = (this.f1660d.hashCode() + g9a.m12428e(g9a.m12428e((iHashCode + (w34Var != null ? w34Var.hashCode() : 0)) * 31, 31, false), 29791, true)) * 31;
        String str = this.f1661e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ui3 ui3Var = this.f1662f;
        return Boolean.hashCode(true) + ((iHashCode3 + (ui3Var != null ? ui3Var.hashCode() : 0)) * 961);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "combinedClickable";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f1659c, "indicationNodeFactory");
        z91Var.m25511b(this.f1658b, "interactionSource");
        Boolean bool = Boolean.TRUE;
        z91Var.m25511b(bool, "enabled");
        z91Var.m25511b(null, "onClickLabel");
        z91Var.m25511b(null, "role");
        z91Var.m25511b(this.f1660d, "onClick");
        z91Var.m25511b(null, "onDoubleClick");
        z91Var.m25511b(this.f1662f, "onLongClick");
        z91Var.m25511b(this.f1661e, "onLongClickLabel");
        z91Var.m25511b(bool, "hapticFeedbackEnabled");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        boolean z;
        C0081g c0081g = (C0081g) d16Var;
        c0081g.f1757h0 = true;
        String str = c0081g.f1755f0;
        String str2 = this.f1661e;
        if (!fa4.m11650l(str, str2)) {
            c0081g.f1755f0 = str2;
            thb.m22062u(c0081g);
        }
        boolean z2 = c0081g.f1756g0 == null;
        ui3 ui3Var = this.f1662f;
        if (z2 != (ui3Var == null)) {
            c0081g.m792e1();
            thb.m22062u(c0081g);
            z = true;
        } else {
            z = false;
        }
        c0081g.f1756g0 = ui3Var;
        boolean z3 = !c0081g.f1722Q ? true : z;
        c0081g.m803o1(this.f1658b, this.f1659c, false, true, null, null, this.f1660d);
        if (z3) {
            c0081g.m821p1(false);
            c0081g.m821p1(true);
        }
    }
}
