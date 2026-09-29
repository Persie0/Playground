package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ap8 extends zyc implements bp8 {

    /* JADX INFO: renamed from: a */
    public final int f7328a;

    /* JADX INFO: renamed from: b */
    public final int f7329b;

    /* JADX INFO: renamed from: c */
    public final String f7330c;

    /* JADX INFO: renamed from: d */
    public final boolean f7331d;

    public ap8(int i, int i2, String str, boolean z) {
        this.f7328a = i;
        this.f7329b = i2;
        this.f7330c = str;
        this.f7331d = z;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: a */
    public final int mo2968a() {
        return this.f7328a;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: b */
    public final boolean mo2969b() {
        return this.f7331d;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: c */
    public final int mo2970c() {
        return this.f7329b;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: d */
    public final boolean mo2971d() {
        return false;
    }

    @Override // p000.bp8
    /* JADX INFO: renamed from: e */
    public final String mo2972e() {
        return this.f7330c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap8)) {
            return false;
        }
        ap8 ap8Var = (ap8) obj;
        return this.f7328a == ap8Var.f7328a && this.f7329b == ap8Var.f7329b && fa4.m11650l(this.f7330c, ap8Var.f7330c) && this.f7331d == ap8Var.f7331d;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f7329b, Integer.hashCode(this.f7328a) * 31, 31);
        String str = this.f7330c;
        return Boolean.hashCode(false) + g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f7331d);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f7328a, this.f7329b, "DownloadLesson(lessonId=", ", lessonPrice=", ", lessonSharedByName=");
        sbM22994q.append(this.f7330c);
        sbM22994q.append(", isPremium=");
        sbM22994q.append(this.f7331d);
        sbM22994q.append(", checkPaidContent=false)");
        return sbM22994q.toString();
    }
}
