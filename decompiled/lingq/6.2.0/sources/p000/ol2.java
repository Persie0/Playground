package p000;

import androidx.compose.p002ui.draw.C0295b;
import androidx.compose.p002ui.draw.C0296c;

/* JADX INFO: loaded from: classes.dex */
final class ol2 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f54527b;

    public ol2(vi3 vi3Var) {
        this.f54527b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ol2) {
            return this.f54527b == ((ol2) obj).f54527b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0295b(new C0296c(), this.f54527b);
    }

    public final int hashCode() {
        return this.f54527b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "drawWithCache";
        y64Var.f69367c.m25511b(this.f54527b, "onBuildDrawCache");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0295b c0295b = (C0295b) d16Var;
        c0295b.f3863L = this.f54527b;
        c0295b.m1345Z0();
    }
}
