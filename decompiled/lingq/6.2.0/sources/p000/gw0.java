package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gw0 implements iw0 {

    /* JADX INFO: renamed from: a */
    public final int f41411a;

    public gw0(int i) {
        this.f41411a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw0) && this.f41411a == ((gw0) obj).f41411a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41411a);
    }

    public final String toString() {
        return ux5.m22989l("ChatHeader(title=", this.f41411a, ")");
    }
}
