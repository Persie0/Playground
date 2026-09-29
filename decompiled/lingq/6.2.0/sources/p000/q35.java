package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class q35 implements r35 {

    /* JADX INFO: renamed from: a */
    public final int f57189a;

    public q35(int i) {
        this.f57189a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q35) && this.f57189a == ((q35) obj).f57189a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57189a);
    }

    public final String toString() {
        return ux5.m22989l("RemoveFromPlaylist(lessonId=", this.f57189a, ")");
    }
}
