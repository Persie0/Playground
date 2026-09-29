package p402u0;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: u0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9376s {

    /* JADX INFO: renamed from: a */
    public final float f48168a;

    /* JADX INFO: renamed from: b */
    public final float f48169b;

    public C9376s(float f3, float f10) {
        this.f48168a = f3;
        this.f48169b = f10;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m17746a() {
        float f3 = this.f48168a;
        float f10 = this.f48169b;
        return new float[]{f3 / f10, 1.0f, ((1.0f - f3) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9376s)) {
            return false;
        }
        C9376s c9376s = (C9376s) obj;
        if (Float.compare(this.f48168a, c9376s.f48168a) == 0 && Float.compare(this.f48169b, c9376s.f48169b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f48169b) + (Float.hashCode(this.f48168a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f48168a);
        sb2.append(", y=");
        return C0141b.m612h(sb2, this.f48169b, ')');
    }
}
