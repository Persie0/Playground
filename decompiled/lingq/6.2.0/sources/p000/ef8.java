package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ef8 extends if8 {

    /* JADX INFO: renamed from: a */
    public final int f37191a;

    public ef8(int i) {
        this.f37191a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef8) && this.f37191a == ((ef8) obj).f37191a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37191a);
    }

    public final String toString() {
        return ux5.m22989l("OnCardsPerSessionChanged(value=", this.f37191a, ")");
    }
}
