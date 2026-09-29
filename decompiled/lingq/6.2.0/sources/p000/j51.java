package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final int f45061a;

    public j51(int i) {
        this.f45061a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j51) && this.f45061a == ((j51) obj).f45061a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45061a);
    }

    public final String toString() {
        return ux5.m22989l("OnCourseRemoveAllLessons(courseId=", this.f45061a, ")");
    }
}
