package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ii6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final int f44146a;

    public ii6(int i) {
        this.f44146a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii6) && this.f44146a == ((ii6) obj).f44146a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44146a);
    }

    public final String toString() {
        return ux5.m22989l("Collection(collectionId=", this.f44146a, ")");
    }
}
