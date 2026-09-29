package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class x14 extends ufd {

    /* JADX INFO: renamed from: a */
    public final int f67628a;

    public x14(int i) {
        this.f67628a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x14) && this.f67628a == ((x14) obj).f67628a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67628a);
    }

    public final String toString() {
        return ux5.m22989l("Success(lessonId=", this.f67628a, ")");
    }
}
