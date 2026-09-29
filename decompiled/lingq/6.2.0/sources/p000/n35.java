package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class n35 implements r35 {

    /* JADX INFO: renamed from: a */
    public final int f52269a;

    public n35(int i) {
        this.f52269a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n35) && this.f52269a == ((n35) obj).f52269a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52269a);
    }

    public final String toString() {
        return ux5.m22989l("OpenCourse(courseId=", this.f52269a, ")");
    }
}
