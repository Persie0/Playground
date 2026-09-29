package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yj2 implements gn1, w64 {

    /* JADX INFO: renamed from: a */
    public final float f69904a;

    public yj2(float f) {
        this.f69904a = f;
    }

    @Override // p000.gn1
    /* JADX INFO: renamed from: a */
    public final float mo12761a(long j, fb2 fb2Var) {
        return fb2Var.mo912g0(this.f69904a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj2) && xj2.m24560b(this.f69904a, ((yj2) obj).f69904a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f69904a);
    }

    public final String toString() {
        return wq1.m24121q(new StringBuilder("CornerSize(size = "), this.f69904a, ".dp)");
    }
}
