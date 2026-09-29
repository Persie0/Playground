package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends d32 {

    /* JADX INFO: renamed from: h */
    public final InterfaceC3457pe f61292h;

    public sr1(ec0 ec0Var) {
        this.f61292h = ec0Var;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: A */
    public final int mo10067A(int i, int i2, LayoutDirection layoutDirection, l87 l87Var, int i3) {
        return this.f61292h.mo4499a(i2, i, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr1) && fa4.m11650l(this.f61292h, ((sr1) obj).f61292h);
    }

    public final int hashCode() {
        return this.f61292h.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f61292h + ')';
    }
}
