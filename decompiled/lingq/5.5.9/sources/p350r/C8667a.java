package p350r;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8667a {

    /* JADX INFO: renamed from: a */
    public static final float[] f46246a;

    /* JADX INFO: renamed from: r.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f46247a;

        /* JADX INFO: renamed from: b */
        public final float f46248b;

        public a(float f3, float f10) {
            this.f46247a = f3;
            this.f46248b = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f46247a, aVar.f46247a) == 0 && Float.compare(this.f46248b, aVar.f46248b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f46248b) + (Float.hashCode(this.f46247a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb2.append(this.f46247a);
            sb2.append(", velocityCoefficient=");
            return C0141b.m612h(sb2, this.f46248b, ')');
        }
    }

    static {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float[] fArr = new float[101];
        f46246a = fArr;
        float[] fArr2 = new float[101];
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f19 = i10 / 100;
            float f20 = 1.0f;
            while (true) {
                f3 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f3;
                f11 = f3 * 3.0f * f10;
                f12 = f3 * f3 * f3;
                float f21 = (((f3 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                if (Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                } else if (f21 > f19) {
                    f20 = f3;
                } else {
                    f17 = f3;
                }
            }
            float f22 = 0.5f;
            fArr[i10] = (((f10 * 0.5f) + f3) * f11) + f12;
            float f23 = 1.0f;
            while (true) {
                f13 = ((f23 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f24 = (((f14 * f22) + f13) * f15) + f16;
                if (Math.abs(f24 - f19) >= 1.0E-5d) {
                    if (f24 > f19) {
                        f23 = f13;
                    } else {
                        f18 = f13;
                    }
                    f22 = 0.5f;
                }
            }
            fArr2[i10] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static a m16924a(float f3) {
        float fM845d;
        float f10;
        float f11 = 100;
        int i10 = (int) (f11 * f3);
        if (i10 < 100) {
            float f12 = i10 / f11;
            int i11 = i10 + 1;
            float f13 = i11 / f11;
            float[] fArr = f46246a;
            float f14 = fArr[i10];
            f10 = (fArr[i11] - f14) / (f13 - f12);
            fM845d = C0204c.m845d(f3, f12, f10, f14);
        } else {
            fM845d = 1.0f;
            f10 = 0.0f;
        }
        return new a(fM845d, f10);
    }
}
