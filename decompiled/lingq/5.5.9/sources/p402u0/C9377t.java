package p402u0;

import ae.C0062b;
import dm.C5207g;
import p338qd.C8584v;

/* JADX INFO: renamed from: u0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9377t extends AbstractC9360c {
    public C9377t() {
        super("Generic XYZ", C9359b.f48097b, 14);
    }

    /* JADX INFO: renamed from: i */
    public static float m17747i(float f3) {
        return C0062b.m357j0(f3, -2.0f, 2.0f);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: a */
    public final float[] mo17723a(float[] fArr) {
        fArr[0] = m17747i(fArr[0]);
        fArr[1] = m17747i(fArr[1]);
        fArr[2] = m17747i(fArr[2]);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: b */
    public final float mo17724b(int i10) {
        return 2.0f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: c */
    public final float mo17725c(int i10) {
        return -2.0f;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: e */
    public final long mo17727e(float f3, float f10, float f11) {
        float fM17747i = m17747i(f3);
        return (((long) Float.floatToIntBits(m17747i(f10))) & 4294967295L) | (Float.floatToIntBits(fM17747i) << 32);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: f */
    public final float[] mo17728f(float[] fArr) {
        fArr[0] = m17747i(fArr[0]);
        fArr[1] = m17747i(fArr[1]);
        fArr[2] = m17747i(fArr[2]);
        return fArr;
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: g */
    public final float mo17729g(float f3, float f10, float f11) {
        return m17747i(f11);
    }

    @Override // p402u0.AbstractC9360c
    /* JADX INFO: renamed from: h */
    public final long mo17730h(float f3, float f10, float f11, float f12, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        return C8584v.m16782g(m17747i(f3), m17747i(f10), m17747i(f11), f12, abstractC9360c);
    }
}
