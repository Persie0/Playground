package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f53599a;

    public o19(int i) {
        this.f53599a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o19) && this.f53599a == ((o19) obj).f53599a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53599a);
    }

    public final String toString() {
        return ux5.m22989l("CategoryTitle(title=", this.f53599a, ")");
    }
}
