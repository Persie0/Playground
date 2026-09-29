package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ibb extends pbb {

    /* JADX INFO: renamed from: a */
    public final int f43910a;

    public ibb(int i) {
        this.f43910a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibb) && this.f43910a == ((ibb) obj).f43910a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43910a);
    }

    public final String toString() {
        return ux5.m22989l("Forward(position=", this.f43910a, ")");
    }
}
