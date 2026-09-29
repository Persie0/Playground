package p470x1;

import android.support.v4.media.C0141b;

/* JADX INFO: renamed from: x1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10016d implements InterfaceC10015c {

    /* JADX INFO: renamed from: a */
    public final float f50964a;

    /* JADX INFO: renamed from: b */
    public final float f50965b;

    public C10016d(float f3, float f10) {
        this.f50964a = f3;
        this.f50965b = f10;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f50965b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10016d)) {
            return false;
        }
        C10016d c10016d = (C10016d) obj;
        return Float.compare(this.f50964a, c10016d.f50964a) == 0 && Float.compare(this.f50965b, c10016d.f50965b) == 0;
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f50964a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50965b) + (Float.hashCode(this.f50964a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f50964a);
        sb2.append(", fontScale=");
        return C0141b.m612h(sb2, this.f50965b, ')');
    }
}
