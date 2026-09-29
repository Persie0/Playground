package p000;

/* JADX INFO: loaded from: classes.dex */
public final class re6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final int f59161a;

    public re6(int i) {
        this.f59161a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re6) && this.f59161a == ((re6) obj).f59161a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59161a);
    }

    public final String toString() {
        return ux5.m22989l("LingQsOffer(offer=", this.f59161a, ")");
    }
}
