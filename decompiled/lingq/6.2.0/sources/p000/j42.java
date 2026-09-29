package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j42 extends tad {

    /* JADX INFO: renamed from: a */
    public final int f45037a;

    public j42(int i) {
        this.f45037a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j42) && this.f45037a == ((j42) obj).f45037a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45037a);
    }

    public final String toString() {
        return ux5.m22989l("LingQsOffer(offer=", this.f45037a, ")");
    }
}
