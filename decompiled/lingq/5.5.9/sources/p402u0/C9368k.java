package p402u0;

import ae.C0062b;
import dm.C5207g;
import p338qd.C8584v;

/* JADX INFO: renamed from: u0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9368k extends AbstractC9360c {

    /* JADX INFO: renamed from: d */
    public static final float[] f48136d;

    /* JADX INFO: renamed from: e */
    public static final float[] f48137e;

    /* JADX INFO: renamed from: f */
    public static final float[] f48138f;

    /* JADX INFO: renamed from: g */
    public static final float[] f48139g;

    static {
        float[] fArrM17735e = C9361d.m17735e(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C9361d.m17732b(AbstractC9358a.f48094b.f48095a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f48136d = fArrM17735e;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f48137e = fArr;
        f48138f = C9361d.m17734d(fArrM17735e);
        f48139g = C9361d.m17734d(fArr);
    }

    public C9368k() {
        super("Oklab", C9359b.f48098c, 17);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: a */
    public final float[] mo17723a(float[] fArr) {
        C9361d.m17737g(f48136d, fArr);
        double d10 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d10));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d10));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d10));
        C9361d.m17737g(f48137e, fArr);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: b */
    public final float mo17724b(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: c */
    public final float mo17725c(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: e */
    public final long mo17727e(float f3, float f10, float f11) {
        float fM357j0 = C0062b.m357j0(f3, 0.0f, 1.0f);
        float fM357j1 = C0062b.m357j0(f10, -0.5f, 0.5f);
        float fM357j2 = C0062b.m357j0(f11, -0.5f, 0.5f);
        float[] fArr = f48139g;
        float fM17738h = C9361d.m17738h(fM357j0, fM357j1, fM357j2, fArr);
        float fM17739i = C9361d.m17739i(fM357j0, fM357j1, fM357j2, fArr);
        float fM17740j = C9361d.m17740j(fM357j0, fM357j1, fM357j2, fArr);
        float f12 = fM17738h * fM17738h * fM17738h;
        float f13 = fM17739i * fM17739i * fM17739i;
        float f14 = fM17740j * fM17740j * fM17740j;
        float[] fArr2 = f48138f;
        float fM17738h2 = C9361d.m17738h(f12, f13, f14, fArr2);
        float fM17739i2 = C9361d.m17739i(f12, f13, f14, fArr2);
        return (((long) Float.floatToIntBits(fM17738h2)) << 32) | (((long) Float.floatToIntBits(fM17739i2)) & 4294967295L);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: f */
    public final float[] mo17728f(float[] fArr) {
        fArr[0] = C0062b.m357j0(fArr[0], 0.0f, 1.0f);
        fArr[1] = C0062b.m357j0(fArr[1], -0.5f, 0.5f);
        fArr[2] = C0062b.m357j0(fArr[2], -0.5f, 0.5f);
        C9361d.m17737g(f48139g, fArr);
        float f3 = fArr[0];
        fArr[0] = f3 * f3 * f3;
        float f10 = fArr[1];
        fArr[1] = f10 * f10 * f10;
        float f11 = fArr[2];
        fArr[2] = f11 * f11 * f11;
        C9361d.m17737g(f48138f, fArr);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: g */
    public final float mo17729g(float f3, float f10, float f11) {
        float fM357j0 = C0062b.m357j0(f3, 0.0f, 1.0f);
        float fM357j1 = C0062b.m357j0(f10, -0.5f, 0.5f);
        float fM357j2 = C0062b.m357j0(f11, -0.5f, 0.5f);
        float[] fArr = f48139g;
        float fM17738h = C9361d.m17738h(fM357j0, fM357j1, fM357j2, fArr);
        float fM17739i = C9361d.m17739i(fM357j0, fM357j1, fM357j2, fArr);
        float fM17740j = C9361d.m17740j(fM357j0, fM357j1, fM357j2, fArr);
        return C9361d.m17740j(fM17738h * fM17738h * fM17738h, fM17739i * fM17739i * fM17739i, fM17740j * fM17740j * fM17740j, f48138f);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: h */
    public final long mo17730h(float f3, float f10, float f11, float f12, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        float[] fArr = f48136d;
        float fM17738h = C9361d.m17738h(f3, f10, f11, fArr);
        float fM17739i = C9361d.m17739i(f3, f10, f11, fArr);
        float fM17740j = C9361d.m17740j(f3, f10, f11, fArr);
        double d10 = 0.33333334f;
        float fSignum = Math.signum(fM17738h) * ((float) Math.pow(Math.abs(fM17738h), d10));
        float fSignum2 = Math.signum(fM17739i) * ((float) Math.pow(Math.abs(fM17739i), d10));
        float fSignum3 = Math.signum(fM17740j) * ((float) Math.pow(Math.abs(fM17740j), d10));
        float[] fArr2 = f48137e;
        return C8584v.m16782g(C9361d.m17738h(fSignum, fSignum2, fSignum3, fArr2), C9361d.m17739i(fSignum, fSignum2, fSignum3, fArr2), C9361d.m17740j(fSignum, fSignum2, fSignum3, fArr2), f12, abstractC9360c);
    }
}
