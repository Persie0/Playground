package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ox4 extends rx4 {

    /* JADX INFO: renamed from: a */
    public final int f55125a;

    public ox4(int i) {
        this.f55125a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox4) && this.f55125a == ((ox4) obj).f55125a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55125a);
    }

    public final String toString() {
        return ux5.m22989l("Play(lessonId=", this.f55125a, ")");
    }
}
