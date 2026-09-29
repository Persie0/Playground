package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gp8 extends zyc implements bp8 {

    /* JADX INFO: renamed from: a */
    public final int f41160a;

    /* JADX INFO: renamed from: b */
    public final boolean f41161b;

    /* JADX INFO: renamed from: c */
    public final int f41162c;

    /* JADX INFO: renamed from: d */
    public final String f41163d;

    /* JADX INFO: renamed from: e */
    public final boolean f41164e;

    /* JADX INFO: renamed from: f */
    public final boolean f41165f;

    public gp8(int i, boolean z, int i2, String str, boolean z2, boolean z3) {
        this.f41160a = i;
        this.f41161b = z;
        this.f41162c = i2;
        this.f41163d = str;
        this.f41164e = z2;
        this.f41165f = z3;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: a */
    public final int mo2968a() {
        return this.f41160a;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: b */
    public final boolean mo2969b() {
        return this.f41164e;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: c */
    public final int mo2970c() {
        return this.f41162c;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: d */
    public final boolean mo2971d() {
        return this.f41165f;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: e */
    public final String mo2972e() {
        return this.f41163d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp8)) {
            return false;
        }
        gp8 gp8Var = (gp8) obj;
        return this.f41160a == gp8Var.f41160a && this.f41161b == gp8Var.f41161b && this.f41162c == gp8Var.f41162c && fa4.m11650l(this.f41163d, gp8Var.f41163d) && this.f41164e == gp8Var.f41164e && this.f41165f == gp8Var.f41165f;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f41162c, g9a.m12428e(Integer.hashCode(this.f41160a) * 31, 31, this.f41161b), 31);
        String str = this.f41163d;
        return Boolean.hashCode(this.f41165f) + g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f41164e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveLesson(lessonId=");
        sb.append(this.f41160a);
        sb.append(", save=");
        sb.append(this.f41161b);
        sb.append(", lessonPrice=");
        hn1.m13361k(this.f41162c, ", lessonSharedByName=", this.f41163d, ", isPremium=", sb);
        return e65.m10875g(sb, this.f41164e, ", checkPaidContent=", this.f41165f, ")");
    }
}
