package p000;

/* JADX INFO: renamed from: gn */
/* JADX INFO: loaded from: classes.dex */
public final class C3044gn extends AbstractC3081hn {

    /* JADX INFO: renamed from: a */
    public float f41033a;

    /* JADX INFO: renamed from: b */
    public float f41034b;

    /* JADX INFO: renamed from: c */
    public float f41035c;

    /* JADX INFO: renamed from: d */
    public float f41036d;

    public C3044gn(float f, float f2, float f3, float f4) {
        this.f41033a = f;
        this.f41034b = f2;
        this.f41035c = f3;
        this.f41036d = f4;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: a */
    public final float mo10483a(int i) {
        if (i == 0) {
            return this.f41033a;
        }
        if (i == 1) {
            return this.f41034b;
        }
        if (i == 2) {
            return this.f41035c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f41036d;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: b */
    public final int mo10484b() {
        return 4;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: c */
    public final AbstractC3081hn mo10485c() {
        return new C3044gn(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: d */
    public final void mo10486d() {
        this.f41033a = 0.0f;
        this.f41034b = 0.0f;
        this.f41035c = 0.0f;
        this.f41036d = 0.0f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: e */
    public final void mo10487e(int i, float f) {
        if (i == 0) {
            this.f41033a = f;
            return;
        }
        if (i == 1) {
            this.f41034b = f;
        } else if (i == 2) {
            this.f41035c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f41036d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3044gn)) {
            return false;
        }
        C3044gn c3044gn = (C3044gn) obj;
        return c3044gn.f41033a == this.f41033a && c3044gn.f41034b == this.f41034b && c3044gn.f41035c == this.f41035c && c3044gn.f41036d == this.f41036d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41036d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f41033a) * 31, this.f41034b, 31), this.f41035c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f41033a + ", v2 = " + this.f41034b + ", v3 = " + this.f41035c + ", v4 = " + this.f41036d;
    }
}
