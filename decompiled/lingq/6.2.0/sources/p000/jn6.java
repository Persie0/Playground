package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jn6 extends kn6 {

    /* JADX INFO: renamed from: a */
    public final int f45869a;

    public jn6(int i) {
        this.f45869a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn6) && this.f45869a == ((jn6) obj).f45869a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45869a);
    }

    public final String toString() {
        return ux5.m22989l("Header(header=", this.f45869a, ")");
    }
}
