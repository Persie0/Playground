package p000;

import android.graphics.Path;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes2.dex */
public final class C2940du extends k57 {

    /* JADX INFO: renamed from: d */
    public static final float f36228d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a */
    public float f36229a;

    /* JADX INFO: renamed from: b */
    public float f36230b;

    /* JADX INFO: renamed from: c */
    public float f36231c;

    /* JADX INFO: renamed from: b */
    public static float m10645b(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        C3386nv.m17626m("Arc must be between 0 and 90 degrees");
        return 0.0f;
    }

    @Override // p000.k57
    /* JADX INFO: renamed from: a */
    public final Path mo10646a(float f, float f2, float f3, float f4) {
        float fM17726a;
        float fM17726a2;
        float f5;
        Path path = new Path();
        path.moveTo(f, f2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = 0.25f * f8;
        boolean z = f2 > f4;
        if (Math.abs(f6) < Math.abs(f7)) {
            float fAbs = Math.abs(f8 / (f7 * 2.0f));
            if (z) {
                fM17726a2 = fAbs + f4;
                fM17726a = f3;
            } else {
                fM17726a2 = fAbs + f2;
                fM17726a = f;
            }
            f5 = this.f36230b;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fM17726a2 = f2;
                fM17726a = f12 + f;
            } else {
                fM17726a = f3 - f12;
                fM17726a2 = f4;
            }
            f5 = this.f36229a;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fM17726a;
        float f15 = f10 - fM17726a2;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f36231c;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fM17726a = AbstractC3393o1.m17726a(fM17726a, f9, fSqrt, f9);
            fM17726a2 = AbstractC3393o1.m17726a(fM17726a2, f10, fSqrt, f10);
        }
        path.cubicTo((f + fM17726a) / 2.0f, (f2 + fM17726a2) / 2.0f, (fM17726a + f3) / 2.0f, (fM17726a2 + f4) / 2.0f, f3, f4);
        return path;
    }
}
