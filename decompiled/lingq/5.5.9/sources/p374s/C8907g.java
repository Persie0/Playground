package p374s;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8907g extends AbstractC8911i {

    /* JADX INFO: renamed from: a */
    public float f46809a;

    /* JADX INFO: renamed from: b */
    public float f46810b;

    /* JADX INFO: renamed from: c */
    public final int f46811c = 2;

    public C8907g(float f3, float f10) {
        this.f46809a = f3;
        this.f46810b = f10;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: a */
    public final float mo17135a(int i10) {
        if (i10 == 0) {
            return this.f46809a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f46810b;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: b */
    public final int mo17136b() {
        return this.f46811c;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: c */
    public final AbstractC8911i mo17137c() {
        return new C8907g(0.0f, 0.0f);
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: d */
    public final void mo17138d() {
        this.f46809a = 0.0f;
        this.f46810b = 0.0f;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: e */
    public final void mo17139e(int i10, float f3) {
        if (i10 == 0) {
            this.f46809a = f3;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f46810b = f3;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8907g) {
            C8907g c8907g = (C8907g) obj;
            if (c8907g.f46809a == this.f46809a) {
                if (c8907g.f46810b == this.f46810b) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46810b) + (Float.hashCode(this.f46809a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f46809a + ", v2 = " + this.f46810b;
    }
}
