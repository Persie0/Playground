package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class l45 implements q45 {

    /* JADX INFO: renamed from: a */
    public final int f49023a;

    public l45(int i) {
        this.f49023a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l45) && this.f49023a == ((l45) obj).f49023a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49023a);
    }

    public final String toString() {
        return ux5.m22989l("Download(lessonId=", this.f49023a, ")");
    }
}
