package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements InterfaceC3571se {

    /* JADX INFO: renamed from: a */
    public final float f40513a;

    /* JADX INFO: renamed from: b */
    public final float f40514b;

    public gc0(float f, float f2) {
        this.f40513a = f;
        this.f40514b = f2;
    }

    @Override // p000.InterfaceC3571se
    /* JADX INFO: renamed from: a */
    public final long mo10276a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.f40513a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f40514b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        return Float.compare(this.f40513a, gc0Var.f40513a) == 0 && Float.compare(this.f40514b, gc0Var.f40514b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40514b) + (Float.hashCode(this.f40513a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f40513a);
        sb.append(", verticalBias=");
        return AbstractC3393o1.m17737l(sb, this.f40514b, ')');
    }
}
