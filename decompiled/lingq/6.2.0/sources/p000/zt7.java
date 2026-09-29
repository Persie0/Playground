package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zt7 extends zic {

    /* JADX INFO: renamed from: c */
    public final int f72152c;

    public zt7(int i) {
        this.f72152c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt7) && this.f72152c == ((zt7) obj).f72152c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72152c);
    }

    public final String toString() {
        return ux5.m22989l("WordCountUpdated(totalTokens=", this.f72152c, ")");
    }
}
