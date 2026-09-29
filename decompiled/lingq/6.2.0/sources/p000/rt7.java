package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rt7 extends zic {

    /* JADX INFO: renamed from: c */
    public final int f59798c;

    public rt7(int i) {
        this.f59798c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt7) && this.f59798c == ((rt7) obj).f59798c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59798c);
    }

    public final String toString() {
        return ux5.m22989l("CoinsEarnedUpdated(coins=", this.f59798c, ")");
    }
}
