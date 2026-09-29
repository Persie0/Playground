package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u67 implements gn1, w64 {

    /* JADX INFO: renamed from: a */
    public final float f63494a;

    public u67(float f) {
        this.f63494a = f;
        if (f < 0.0f || f > 100.0f) {
            l54.m15814a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p000.gn1
    /* JADX INFO: renamed from: a */
    public final float mo12761a(long j, fb2 fb2Var) {
        return (this.f63494a / 100.0f) * x89.m24406c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u67) && Float.compare(this.f63494a, ((u67) obj).f63494a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f63494a);
    }

    public final String toString() {
        return wq1.m24121q(new StringBuilder("CornerSize(size = "), this.f63494a, "%)");
    }
}
