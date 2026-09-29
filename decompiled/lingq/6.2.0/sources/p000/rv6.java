package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final int f59865a;

    public rv6(int i) {
        this.f59865a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m20866a() {
        return this.f59865a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv6) && this.f59865a == ((rv6) obj).f59865a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59865a);
    }

    public final String toString() {
        return ux5.m22989l("TimeSelected(minutes=", this.f59865a, ")");
    }
}
