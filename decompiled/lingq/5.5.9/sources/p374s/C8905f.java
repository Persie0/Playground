package p374s;

/* JADX INFO: renamed from: s.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8905f extends AbstractC8911i {

    /* JADX INFO: renamed from: a */
    public float f46807a;

    /* JADX INFO: renamed from: b */
    public final int f46808b = 1;

    public C8905f(float f3) {
        this.f46807a = f3;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: a */
    public final float mo17135a(int i10) {
        if (i10 == 0) {
            return this.f46807a;
        }
        return 0.0f;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: b */
    public final int mo17136b() {
        return this.f46808b;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: c */
    public final AbstractC8911i mo17137c() {
        return new C8905f(0.0f);
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: d */
    public final void mo17138d() {
        this.f46807a = 0.0f;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: e */
    public final void mo17139e(int i10, float f3) {
        if (i10 == 0) {
            this.f46807a = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8905f) {
            return (((C8905f) obj).f46807a > this.f46807a ? 1 : (((C8905f) obj).f46807a == this.f46807a ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46807a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f46807a;
    }
}
