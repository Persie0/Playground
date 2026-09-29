package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m66 {

    /* JADX INFO: renamed from: a */
    public float f50662a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f50663b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f50664c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f50665d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m16655a(float f, float f2, float f3, float f4) {
        this.f50662a = Math.max(f, this.f50662a);
        this.f50663b = Math.max(f2, this.f50663b);
        this.f50664c = Math.min(f3, this.f50664c);
        this.f50665d = Math.min(f4, this.f50665d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16656b() {
        return (this.f50662a >= this.f50664c) | (this.f50663b >= this.f50665d);
    }

    /* JADX INFO: renamed from: c */
    public final void m16657c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f50662a += fIntBitsToFloat;
        this.f50663b += fIntBitsToFloat2;
        this.f50664c += fIntBitsToFloat;
        this.f50665d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + do7.m10521H(this.f50662a) + ", " + do7.m10521H(this.f50663b) + ", " + do7.m10521H(this.f50664c) + ", " + do7.m10521H(this.f50665d) + ')';
    }
}
