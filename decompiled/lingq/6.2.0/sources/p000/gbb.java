package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gbb extends pbb {

    /* JADX INFO: renamed from: a */
    public final int f40509a;

    public gbb(int i) {
        this.f40509a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbb) && this.f40509a == ((gbb) obj).f40509a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40509a);
    }

    public final String toString() {
        return ux5.m22989l("Backward(position=", this.f40509a, ")");
    }
}
