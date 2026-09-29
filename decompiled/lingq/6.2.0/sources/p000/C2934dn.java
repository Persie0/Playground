package p000;

/* JADX INFO: renamed from: dn */
/* JADX INFO: loaded from: classes.dex */
public final class C2934dn extends AbstractC3081hn {

    /* JADX INFO: renamed from: a */
    public float f35886a;

    public C2934dn(float f) {
        this.f35886a = f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: a */
    public final float mo10483a(int i) {
        if (i == 0) {
            return this.f35886a;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: b */
    public final int mo10484b() {
        return 1;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: c */
    public final AbstractC3081hn mo10485c() {
        return new C2934dn(0.0f);
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: d */
    public final void mo10486d() {
        this.f35886a = 0.0f;
    }

    @Override // p000.AbstractC3081hn
    /* JADX INFO: renamed from: e */
    public final void mo10487e(int i, float f) {
        if (i == 0) {
            this.f35886a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2934dn) && ((C2934dn) obj).f35886a == this.f35886a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35886a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f35886a;
    }
}
