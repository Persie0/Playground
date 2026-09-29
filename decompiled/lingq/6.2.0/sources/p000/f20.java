package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f20 {

    /* JADX INFO: renamed from: a */
    public int f38288a;

    /* JADX INFO: renamed from: b */
    public int f38289b;

    /* JADX INFO: renamed from: c */
    public float f38290c;

    /* JADX INFO: renamed from: d */
    public float f38291d;

    /* JADX INFO: renamed from: e */
    public long f38292e;

    /* JADX INFO: renamed from: f */
    public long f38293f;

    /* JADX INFO: renamed from: g */
    public long f38294g;

    /* JADX INFO: renamed from: h */
    public float f38295h;

    /* JADX INFO: renamed from: i */
    public int f38296i;

    /* JADX INFO: renamed from: a */
    public final float m11504a(long j) {
        long j2 = this.f38292e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f38294g;
        if (j3 < 0 || j < j3) {
            return ig5.m13895b((j - j2) / this.f38288a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f38295h;
        return (ig5.m13895b((j - j3) / this.f38296i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
