package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final int f67188a;

    public wq8(int i) {
        this.f67188a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq8) && this.f67188a == ((wq8) obj).f67188a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67188a);
    }

    public final String toString() {
        return ux5.m22989l("LessonLoading(id=", this.f67188a, ")");
    }
}
