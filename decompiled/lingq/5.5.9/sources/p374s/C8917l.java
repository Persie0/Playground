package p374s;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: s.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8917l implements InterfaceC8925p {

    /* JADX INFO: renamed from: a */
    public final float f46823a;

    /* JADX INFO: renamed from: c */
    public final float f46825c;

    /* JADX INFO: renamed from: b */
    public final float f46824b = 0.0f;

    /* JADX INFO: renamed from: d */
    public final float f46826d = 1.0f;

    public C8917l(float f3, float f10) {
        this.f46823a = f3;
        this.f46825c = f10;
        if ((Float.isNaN(f3) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) ? false : true) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", 0.0, " + f10 + ", 1.0.").toString());
    }

    @Override // p374s.InterfaceC8925p
    /* JADX INFO: renamed from: a */
    public final float mo17150a(float f3) {
        float f10 = 0.0f;
        if (f3 > 0.0f) {
            float f11 = 1.0f;
            if (f3 < 1.0f) {
                while (true) {
                    float f12 = (f10 + f11) / 2;
                    float f13 = 3;
                    float f14 = 1 - f12;
                    float f15 = f12 * f12 * f12;
                    float f16 = (this.f46825c * f13 * f14 * f12 * f12) + (this.f46823a * f13 * f14 * f14 * f12) + f15;
                    if (Math.abs(f3 - f16) < 0.001f) {
                        return (f13 * this.f46826d * f14 * f12 * f12) + (this.f46824b * f13 * f14 * f14 * f12) + f15;
                    }
                    if (f16 < f3) {
                        f10 = f12;
                    } else {
                        f11 = f12;
                    }
                }
            }
        }
        return f3;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8917l) {
            C8917l c8917l = (C8917l) obj;
            if (this.f46823a == c8917l.f46823a) {
                if (this.f46824b == c8917l.f46824b) {
                    if (this.f46825c == c8917l.f46825c) {
                        if (this.f46826d == c8917l.f46826d) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46826d) + C0204c.m846e(this.f46825c, C0204c.m846e(this.f46824b, Float.hashCode(this.f46823a) * 31, 31), 31);
    }
}
