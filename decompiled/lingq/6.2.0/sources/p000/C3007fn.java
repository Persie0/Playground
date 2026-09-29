package p000;

/* JADX INFO: renamed from: fn */
/* JADX INFO: loaded from: classes.dex */
public final class C3007fn extends AbstractC3081hn {

    /* JADX INFO: renamed from: a */
    public float f39319a;

    /* JADX INFO: renamed from: b */
    public float f39320b;

    /* JADX INFO: renamed from: c */
    public float f39321c;

    public C3007fn(float f, float f2, float f3) {
        this.f39319a = f;
        this.f39320b = f2;
        this.f39321c = f3;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: a */
    public final float mo10483a(int i) {
        if (i == 0) {
            return this.f39319a;
        }
        if (i == 1) {
            return this.f39320b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f39321c;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: b */
    public final int mo10484b() {
        return 3;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: c */
    public final AbstractC3081hn mo10485c() {
        return new C3007fn(0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: d */
    public final void mo10486d() {
        this.f39319a = 0.0f;
        this.f39320b = 0.0f;
        this.f39321c = 0.0f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: e */
    public final void mo10487e(int i, float f) {
        if (i == 0) {
            this.f39319a = f;
        } else if (i == 1) {
            this.f39320b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f39321c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3007fn)) {
            return false;
        }
        C3007fn c3007fn = (C3007fn) obj;
        return c3007fn.f39319a == this.f39319a && c3007fn.f39320b == this.f39320b && c3007fn.f39321c == this.f39321c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39321c) + wq1.m24105a(Float.hashCode(this.f39319a) * 31, this.f39320b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f39319a + ", v2 = " + this.f39320b + ", v3 = " + this.f39321c;
    }
}
