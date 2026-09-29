package p000;

import androidx.compose.p002ui.C0288c;

/* JADX INFO: loaded from: classes2.dex */
public final class xbb extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f68046b;

    public xbb(float f) {
        this.f68046b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbb) && Float.compare(this.f68046b, ((xbb) obj).f68046b) == 0;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0288c c0288c = new C0288c();
        c0288c.f3817J = this.f68046b;
        return c0288c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f68046b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "zIndex";
        y64Var.f69367c.m25511b(Float.valueOf(this.f68046b), "zIndex");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0288c) d16Var).f3817J = this.f68046b;
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("ZIndexElement(zIndex="), this.f68046b, ')');
    }
}
