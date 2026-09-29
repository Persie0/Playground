package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class je6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final int f45471a;

    public je6(int i) {
        this.f45471a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m14416a() {
        return this.f45471a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je6) && this.f45471a == ((je6) obj).f45471a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45471a);
    }

    public final String toString() {
        return ux5.m22989l("Course(courseId=", this.f45471a, ")");
    }
}
