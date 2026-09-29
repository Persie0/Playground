package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class o4b implements bx5 {

    /* JADX INFO: renamed from: a */
    public final cc0 f53854a;

    public o4b(cc0 cc0Var) {
        this.f53854a = cc0Var;
    }

    @Override // p000.bx5
    /* JADX INFO: renamed from: a */
    public final int mo4220a(j84 j84Var, long j, int i, LayoutDirection layoutDirection) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return l70.m15945h(this.f53854a.mo4499a(i, i2, layoutDirection), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4b) && this.f53854a.equals(((o4b) obj).f53854a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f53854a.f9873a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f53854a + ", margin=0)";
    }
}
