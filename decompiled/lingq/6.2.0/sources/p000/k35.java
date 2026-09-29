package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class k35 implements r35 {

    /* JADX INFO: renamed from: a */
    public final int f46619a;

    public k35(int i) {
        this.f46619a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k35) && this.f46619a == ((k35) obj).f46619a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46619a);
    }

    public final String toString() {
        return ux5.m22989l("AddToPlaylist(lessonId=", this.f46619a, ")");
    }
}
