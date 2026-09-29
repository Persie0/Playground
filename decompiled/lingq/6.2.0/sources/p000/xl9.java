package p000;

import androidx.compose.foundation.style.C0159d;

/* JADX INFO: loaded from: classes.dex */
public final class xl9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final v66 f68331b;

    /* JADX INFO: renamed from: c */
    public final vl9 f68332c;

    public xl9(v66 v66Var, vl9 vl9Var) {
        this.f68331b = v66Var;
        this.f68332c = vl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl9)) {
            return false;
        }
        xl9 xl9Var = (xl9) obj;
        return fa4.m11650l(xl9Var.f68332c, this.f68332c) && fa4.m11650l(xl9Var.f68331b, this.f68331b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0159d(this.f68331b, this.f68332c);
    }

    public final int hashCode() {
        return this.f68332c.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "style";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f68332c, "style");
        z91Var.m25511b(this.f68331b, "styleState");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0159d c0159d = (C0159d) d16Var;
        c0159d.f2752M = this.f68332c;
        c0159d.m1061f1(false);
        v66 v66Var = this.f68331b;
        if (v66Var == null) {
            v66Var = new v66(null);
        }
        if (fa4.m11650l(c0159d.f2759T, v66Var)) {
            return;
        }
        c0159d.f2759T = v66Var;
        c0159d.m1061f1(false);
        am9 am9Var = c0159d.f2751L;
        if (am9Var != null) {
            d32.m10019Q(am9Var);
        } else {
            C3386nv.m17633t("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.f68331b + ", style=" + this.f68332c + ')';
    }
}
