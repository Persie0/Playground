package p402u0;

import ae.C0062b;
import dm.C5207g;
import p338qd.C8584v;
import p385sf.C9000b;

/* JADX INFO: renamed from: u0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9367j extends AbstractC9360c {
    public C9367j() {
        super("Generic L*a*b*", C9359b.f48098c, 15);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: a */
    public final float[] mo17723a(float[] fArr) {
        float f3 = fArr[0];
        float[] fArr2 = C9000b.f47201f;
        float f10 = f3 / fArr2[0];
        float f11 = fArr[1] / fArr2[1];
        float f12 = fArr[2] / fArr2[2];
        float fPow = f10 > 0.008856452f ? (float) Math.pow(f10, 0.33333334f) : (f10 * 7.787037f) + 0.13793103f;
        float fPow2 = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float fPow3 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        fArr[0] = C0062b.m357j0((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = C0062b.m357j0((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = C0062b.m357j0((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: b */
    public final float mo17724b(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: c */
    public final float mo17725c(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: e */
    public final long mo17727e(float f3, float f10, float f11) {
        float fM357j0 = (C0062b.m357j0(f3, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fM357j1 = (C0062b.m357j0(f3, -128.0f, 128.0f) * 0.002f) + fM357j0;
        float f12 = fM357j1 > 0.20689656f ? fM357j1 * fM357j1 * fM357j1 : (fM357j1 - 0.13793103f) * 0.12841855f;
        float f13 = fM357j0 > 0.20689656f ? fM357j0 * fM357j0 * fM357j0 : (fM357j0 - 0.13793103f) * 0.12841855f;
        float[] fArr = C9000b.f47201f;
        return (((long) Float.floatToIntBits(f12 * fArr[0])) << 32) | (((long) Float.floatToIntBits(f13 * fArr[1])) & 4294967295L);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: f */
    public final float[] mo17728f(float[] fArr) {
        fArr[0] = C0062b.m357j0(fArr[0], 0.0f, 100.0f);
        fArr[1] = C0062b.m357j0(fArr[1], -128.0f, 128.0f);
        float fM357j0 = C0062b.m357j0(fArr[2], -128.0f, 128.0f);
        fArr[2] = fM357j0;
        float f3 = (fArr[0] + 16.0f) / 116.0f;
        float f10 = (fArr[1] * 0.002f) + f3;
        float f11 = f3 - (fM357j0 * 0.005f);
        float f12 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f13 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float f14 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = C9000b.f47201f;
        fArr[0] = f12 * fArr2[0];
        fArr[1] = f13 * fArr2[1];
        fArr[2] = f14 * fArr2[2];
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: g */
    public final float mo17729g(float f3, float f10, float f11) {
        float fM357j0 = ((C0062b.m357j0(f3, 0.0f, 100.0f) + 16.0f) / 116.0f) - (C0062b.m357j0(f11, -128.0f, 128.0f) * 0.005f);
        return (fM357j0 > 0.20689656f ? fM357j0 * fM357j0 * fM357j0 : 0.12841855f * (fM357j0 - 0.13793103f)) * C9000b.f47201f[2];
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: h */
    public final long mo17730h(float f3, float f10, float f11, float f12, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        float[] fArr = C9000b.f47201f;
        float f13 = f3 / fArr[0];
        float f14 = f10 / fArr[1];
        float f15 = f11 / fArr[2];
        float fPow = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        float fPow2 = f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        return C8584v.m16782g(C0062b.m357j0((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), C0062b.m357j0((fPow - fPow2) * 500.0f, -128.0f, 128.0f), C0062b.m357j0((fPow2 - (f15 > 0.008856452f ? (float) Math.pow(f15, 0.33333334f) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f12, abstractC9360c);
    }
}
