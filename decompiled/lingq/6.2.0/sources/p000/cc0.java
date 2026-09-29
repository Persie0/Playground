package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class cc0 implements InterfaceC3457pe {

    /* JADX INFO: renamed from: a */
    public final float f9873a;

    public cc0(float f) {
        this.f9873a = f;
    }

    @Override // p000.InterfaceC3457pe
    /* JADX INFO: renamed from: a */
    public final int mo4499a(int i, int i2, LayoutDirection layoutDirection) {
        return Math.round((1.0f + this.f9873a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc0) && Float.compare(this.f9873a, ((cc0) obj).f9873a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9873a);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("Horizontal(bias="), this.f9873a, ')');
    }
}
