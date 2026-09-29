package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 implements InterfaceC3457pe {

    /* JADX INFO: renamed from: a */
    public final float f36988a;

    public ec0(float f) {
        this.f36988a = f;
    }

    @Override // p000.InterfaceC3457pe
    /* JADX INFO: renamed from: a */
    public final int mo4499a(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f2 = this.f36988a;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec0) && Float.compare(this.f36988a, ((ec0) obj).f36988a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36988a);
    }

    public final String toString() {
        return AbstractC3393o1.m17737l(new StringBuilder("Horizontal(bias="), this.f36988a, ')');
    }
}
