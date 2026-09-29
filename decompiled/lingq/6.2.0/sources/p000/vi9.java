package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vi9 extends d36 {

    /* JADX INFO: renamed from: a */
    public wi9 f65419a;

    /* JADX INFO: renamed from: b */
    public cg9 f65420b;

    /* JADX INFO: renamed from: c */
    public ui9 f65421c;

    @Override // p000.d36
    /* JADX INFO: renamed from: a */
    public final float mo10074a() {
        return this.f65421c.mo4642b();
    }

    /* JADX INFO: renamed from: b */
    public final void m23291b(float f, float f2, float f3, float f4, float f5, float f6) {
        wi9 wi9Var = this.f65419a;
        this.f65421c = wi9Var;
        wi9Var.f66873l = f;
        boolean z = f > f2;
        wi9Var.f66872k = z;
        if (z) {
            wi9Var.m23987d(-f3, f - f2, f5, f6, f4);
        } else {
            wi9Var.m23987d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f65421c.getInterpolation(f);
    }
}
