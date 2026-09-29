package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final int f43532a;

    public i51(int i) {
        this.f43532a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i51) && this.f43532a == ((i51) obj).f43532a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43532a);
    }

    public final String toString() {
        return ux5.m22989l("OnCourseLikeClicked(courseId=", this.f43532a, ")");
    }
}
