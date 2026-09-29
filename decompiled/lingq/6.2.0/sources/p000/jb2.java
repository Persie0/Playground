package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements fb2 {

    /* JADX INFO: renamed from: a */
    public final float f45374a;

    /* JADX INFO: renamed from: b */
    public final float f45375b;

    /* JADX INFO: renamed from: c */
    public final sb3 f45376c;

    public jb2(float f, float f2, sb3 sb3Var) {
        this.f45374a = f;
        this.f45375b = f2;
        this.f45376c = sb3Var;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        if (ay9.m3127a(zx9.m25847b(j), 4294967296L)) {
            return this.f45376c.mo21206b(zx9.m25848c(j));
        }
        C3386nv.m17633t("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f45374a;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f45375b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb2)) {
            return false;
        }
        jb2 jb2Var = (jb2) obj;
        return Float.compare(this.f45374a, jb2Var.f45374a) == 0 && Float.compare(this.f45375b, jb2Var.f45375b) == 0 && this.f45376c.equals(jb2Var.f45376c);
    }

    public final int hashCode() {
        return this.f45376c.hashCode() + wq1.m24105a(Float.hashCode(this.f45374a) * 31, this.f45375b, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f45374a + ", fontScale=" + this.f45375b + ", converter=" + this.f45376c + ')';
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return d32.m10032c0(this.f45376c.mo21205a(f), 4294967296L);
    }
}
