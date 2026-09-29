package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 implements InterfaceC3571se {

    /* JADX INFO: renamed from: a */
    public final float f35373a;

    public dc0(float f) {
        this.f35373a = f;
    }

    @Override // p000.InterfaceC3571se
    /* JADX INFO: renamed from: a */
    public final long mo10276a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f)) & 4294967295L) | (((long) Math.round((1.0f + this.f35373a) * (((int) (j3 >> 32)) / 2.0f))) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && Float.compare(this.f35373a, ((dc0) obj).f35373a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f35373a) * 31);
    }

    public final String toString() {
        return wq1.m24121q(new StringBuilder("BiasAbsoluteAlignment(horizontalBias="), this.f35373a, ", verticalBias=-1.0)");
    }
}
