package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xm4 extends ym4 {

    /* JADX INFO: renamed from: a */
    public final int f68347a;

    public xm4(int i) {
        this.f68347a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm4) && this.f68347a == ((xm4) obj).f68347a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68347a);
    }

    public final String toString() {
        return ux5.m22989l("Header(header=", this.f68347a, ")");
    }
}
