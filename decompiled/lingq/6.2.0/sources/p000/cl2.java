package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes2.dex */
final class cl2<T> extends i16 {

    /* JADX INFO: renamed from: b */
    public final C0097e f10222b;

    /* JADX INFO: renamed from: c */
    public final zi3 f10223c;

    /* JADX INFO: renamed from: d */
    public final Orientation f10224d;

    public cl2(C0097e c0097e, zi3 zi3Var, Orientation orientation) {
        this.f10222b = c0097e;
        this.f10223c = zi3Var;
        this.f10224d = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl2)) {
            return false;
        }
        cl2 cl2Var = (cl2) obj;
        return fa4.m11650l(this.f10222b, cl2Var.f10222b) && this.f10223c == cl2Var.f10223c && this.f10224d == cl2Var.f10224d;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        dl2 dl2Var = new dl2();
        dl2Var.f35777J = this.f10222b;
        dl2Var.f35778K = this.f10223c;
        dl2Var.f35779L = this.f10224d;
        return dl2Var;
    }

    public final int hashCode() {
        return this.f10224d.hashCode() + ((this.f10223c.hashCode() + (this.f10222b.hashCode() * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        dl2 dl2Var = (dl2) d16Var;
        C0097e c0097e = dl2Var.f35777J;
        C0097e c0097e2 = this.f10222b;
        boolean zM11650l = fa4.m11650l(c0097e, c0097e2);
        dl2Var.f35777J = c0097e2;
        dl2Var.f35778K = this.f10223c;
        dl2Var.f35779L = this.f10224d;
        if (zM11650l) {
            return;
        }
        dl2Var.f35780M = false;
        d32.m10020R(dl2Var);
    }
}
