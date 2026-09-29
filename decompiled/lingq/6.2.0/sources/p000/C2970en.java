package p000;

/* JADX INFO: renamed from: en */
/* JADX INFO: loaded from: classes.dex */
public final class C2970en extends AbstractC3081hn {

    /* JADX INFO: renamed from: a */
    public float f37539a;

    /* JADX INFO: renamed from: b */
    public float f37540b;

    public C2970en(float f, float f2) {
        this.f37539a = f;
        this.f37540b = f2;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: a */
    public final float mo10483a(int i) {
        if (i == 0) {
            return this.f37539a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f37540b;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: b */
    public final int mo10484b() {
        return 2;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: c */
    public final AbstractC3081hn mo10485c() {
        return new C2970en(0.0f, 0.0f);
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: d */
    public final void mo10486d() {
        this.f37539a = 0.0f;
        this.f37540b = 0.0f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: e */
    public final void mo10487e(int i, float f) {
        if (i == 0) {
            this.f37539a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f37540b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2970en)) {
            return false;
        }
        C2970en c2970en = (C2970en) obj;
        return c2970en.f37539a == this.f37539a && c2970en.f37540b == this.f37540b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37540b) + (Float.hashCode(this.f37539a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f37539a + ", v2 = " + this.f37540b;
    }
}
