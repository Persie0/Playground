package p445w1;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: w1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9800j {

    /* JADX INFO: renamed from: c */
    public static final C9800j f49916c = new C9800j(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f49917a;

    /* JADX INFO: renamed from: b */
    public final float f49918b;

    public C9800j() {
        this(1.0f, 0.0f);
    }

    public C9800j(float f3, float f10) {
        this.f49917a = f3;
        this.f49918b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9800j)) {
            return false;
        }
        C9800j c9800j = (C9800j) obj;
        if (this.f49917a == c9800j.f49917a) {
            return (this.f49918b > c9800j.f49918b ? 1 : (this.f49918b == c9800j.f49918b ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49918b) + (Float.hashCode(this.f49917a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f49917a);
        sb2.append(", skewX=");
        return C0141b.m612h(sb2, this.f49918b, ')');
    }
}
