package p000;

import androidx.compose.foundation.text.input.internal.C0187a;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
final class sw4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0187a f61511b;

    /* JADX INFO: renamed from: c */
    public final yw4 f61512c;

    /* JADX INFO: renamed from: d */
    public final C0205f f61513d;

    public sw4(C0187a c0187a, yw4 yw4Var, C0205f c0205f) {
        this.f61511b = c0187a;
        this.f61512c = yw4Var;
        this.f61513d = c0205f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sw4) {
            sw4 sw4Var = (sw4) obj;
            return fa4.m11650l(this.f61511b, sw4Var.f61511b) && this.f61512c == sw4Var.f61512c && this.f61513d == sw4Var.f61513d;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new tw4(this.f61511b, this.f61512c, this.f61513d);
    }

    public final int hashCode() {
        return this.f61513d.hashCode() + ((this.f61512c.hashCode() + (this.f61511b.hashCode() * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        tw4 tw4Var = (tw4) d16Var;
        if (tw4Var.f34836I) {
            tw4Var.f63006J.mo1081c();
            tw4Var.f63006J.m1089k(tw4Var);
        }
        C0187a c0187a = this.f61511b;
        tw4Var.f63006J = c0187a;
        if (tw4Var.f34836I) {
            if (c0187a.f2940a != null) {
                l54.m15816c("Expected textInputModifierNode to be null");
            }
            c0187a.f2940a = tw4Var;
        }
        tw4Var.f63007K = this.f61512c;
        tw4Var.f63008L = this.f61513d;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f61511b + ", legacyTextFieldState=" + this.f61512c + ", textFieldSelectionManager=" + this.f61513d + ')';
    }
}
