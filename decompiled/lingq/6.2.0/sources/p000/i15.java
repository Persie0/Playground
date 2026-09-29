package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final int f43329a;

    public i15(int i) {
        this.f43329a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i15) && this.f43329a == ((i15) obj).f43329a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43329a);
    }

    public final String toString() {
        return ux5.m22989l("OnPageChanged(page=", this.f43329a, ")");
    }
}
