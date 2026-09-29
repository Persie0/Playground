package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y41 extends z41 {

    /* JADX INFO: renamed from: a */
    public final int f69268a;

    public y41(int i) {
        this.f69268a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y41) && this.f69268a == ((y41) obj).f69268a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69268a);
    }

    public final String toString() {
        return ux5.m22989l("Success(coins=", this.f69268a, ")");
    }
}
