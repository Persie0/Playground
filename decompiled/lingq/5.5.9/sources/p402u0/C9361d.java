package p402u0;

import dm.C5207g;
import p385sf.C9000b;

/* JADX INFO: renamed from: u0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9361d {
    /* JADX INFO: renamed from: a */
    public static AbstractC9360c m17731a(AbstractC9360c abstractC9360c) {
        C9376s c9376s = C9000b.f47198c;
        AbstractC9358a.a aVar = AbstractC9358a.f48094b;
        C5207g.m11111f(abstractC9360c, "<this>");
        if (C9359b.m17721a(abstractC9360c.f48102b, C9359b.f48096a)) {
            C9374q c9374q = (C9374q) abstractC9360c;
            if (!m17733c(c9374q.f48149d, c9376s)) {
                float[] fArrM17746a = c9376s.m17746a();
                abstractC9360c = new C9374q(c9374q.f48101a, c9374q.f48153h, c9376s, m17735e(m17732b(aVar.f48095a, c9374q.f48149d.m17746a(), fArrM17746a), c9374q.f48154i), c9374q.f48156k, c9374q.f48158m, c9374q.f48150e, c9374q.f48151f, c9374q.f48152g, -1);
            }
        }
        return abstractC9360c;
    }

    /* JADX INFO: renamed from: b */
    public static final float[] m17732b(float[] fArr, float[] fArr2, float[] fArr3) {
        C5207g.m11111f(fArr, "matrix");
        m17737g(fArr, fArr2);
        m17737g(fArr, fArr3);
        return m17735e(m17734d(fArr), m17736f(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m17733c(C9376s c9376s, C9376s c9376s2) {
        C5207g.m11111f(c9376s, "a");
        C5207g.m11111f(c9376s2, "b");
        if (c9376s == c9376s2) {
            return true;
        }
        return Math.abs(c9376s.f48168a - c9376s2.f48168a) < 0.001f && Math.abs(c9376s.f48169b - c9376s2.f48169b) < 0.001f;
    }

    /* JADX INFO: renamed from: d */
    public static final float[] m17734d(float[] fArr) {
        C5207g.m11111f(fArr, "m");
        float f3 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f3 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f3) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f3)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f3)) / f21;
        fArr2[8] = ((f3 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final float[] m17735e(float[] fArr, float[] fArr2) {
        C5207g.m11111f(fArr, "lhs");
        C5207g.m11111f(fArr2, "rhs");
        float f3 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        float f14 = f12 * f13;
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = f11 * f17;
        float f19 = fArr[7];
        float f20 = f19 * f13;
        float f21 = fArr[2] * f16;
        float f22 = fArr[5];
        float f23 = (fArr2[1] * f22) + f21;
        float f24 = fArr[8];
        float f25 = fArr[0];
        float f26 = fArr2[3] * f25;
        float f27 = fArr2[4];
        float f28 = (f10 * f27) + f26;
        float f29 = fArr2[5];
        float f30 = fArr[1];
        float f31 = fArr2[3];
        float f32 = f17 * f27;
        float f33 = fArr[2];
        float f34 = f22 * fArr2[4];
        float f35 = f25 * fArr2[6];
        float f36 = fArr[3];
        float f37 = fArr2[7];
        float f38 = (f36 * f37) + f35;
        float f39 = fArr2[8];
        float f40 = fArr2[6];
        return new float[]{f14 + (f10 * f11) + f3, f20 + f18 + (f15 * f16), (f13 * f24) + f23, (f12 * f29) + f28, (f19 * f29) + f32 + (f30 * f31), (f29 * f24) + f34 + (f31 * f33), (f12 * f39) + f38, (f19 * f39) + (fArr[4] * f37) + (f30 * f40), (f24 * f39) + (fArr[5] * fArr2[7]) + (f33 * f40)};
    }

    /* JADX INFO: renamed from: f */
    public static final float[] m17736f(float[] fArr, float[] fArr2) {
        C5207g.m11111f(fArr2, "rhs");
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f3, fArr2[4] * f10, fArr2[5] * f11, f3 * fArr2[6], f10 * fArr2[7], f11 * fArr2[8]};
    }

    /* JADX INFO: renamed from: g */
    public static final void m17737g(float[] fArr, float[] fArr2) {
        C5207g.m11111f(fArr, "lhs");
        float f3 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
    }

    /* JADX INFO: renamed from: h */
    public static final float m17738h(float f3, float f10, float f11, float[] fArr) {
        C5207g.m11111f(fArr, "lhs");
        return (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
    }

    /* JADX INFO: renamed from: i */
    public static final float m17739i(float f3, float f10, float f11, float[] fArr) {
        C5207g.m11111f(fArr, "lhs");
        return (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
    }

    /* JADX INFO: renamed from: j */
    public static final float m17740j(float f3, float f10, float f11, float[] fArr) {
        C5207g.m11111f(fArr, "lhs");
        return (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
    }
}
