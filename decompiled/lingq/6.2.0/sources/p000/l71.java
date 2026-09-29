package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l71 extends n71 {

    /* JADX INFO: renamed from: a */
    public final int f49242a;

    public l71(int i) {
        this.f49242a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l71) && this.f49242a == ((l71) obj).f49242a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49242a);
    }

    public final String toString() {
        return ux5.m22989l("LessonLoading(id=", this.f49242a, ")");
    }
}
