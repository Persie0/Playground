package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final int f46721a;

    public k51(int i) {
        this.f46721a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k51) && this.f46721a == ((k51) obj).f46721a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46721a);
    }

    public final String toString() {
        return ux5.m22989l("OnCourseSubscribeClicked(courseId=", this.f46721a, ")");
    }
}
