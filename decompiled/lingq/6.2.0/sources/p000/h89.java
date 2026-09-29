package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class h89 implements k89 {

    /* JADX INFO: renamed from: a */
    public final int f41994a;

    public h89(int i) {
        this.f41994a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h89) && this.f41994a == ((h89) obj).f41994a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41994a);
    }

    public final String toString() {
        return ux5.m22989l("Ready(lessonId=", this.f41994a, ")");
    }
}
