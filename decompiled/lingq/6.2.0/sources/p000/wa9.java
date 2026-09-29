package p000;

import androidx.compose.material3.AbstractC0226d0;

/* JADX INFO: loaded from: classes2.dex */
public final class wa9 {

    /* JADX INFO: renamed from: b */
    public static final long f66567b = AbstractC0226d0.m1136g(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f66568c = 0;

    /* JADX INFO: renamed from: a */
    public final long f66569a;

    /* JADX INFO: renamed from: a */
    public static final float m23824a(long j) {
        if (j != f66567b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        C3386nv.m17633t("SliderRange is unspecified");
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static final float m23825b(long j) {
        if (j != f66567b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        C3386nv.m17633t("SliderRange is unspecified");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wa9) {
            return this.f66569a == ((wa9) obj).f66569a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66569a);
    }

    public final String toString() {
        float f = AbstractC0226d0.f3389a;
        long j = f66567b;
        long j2 = this.f66569a;
        if (j2 == j) {
            return "FloatRange.Unspecified";
        }
        return m23825b(j2) + ".." + m23824a(j2);
    }
}
