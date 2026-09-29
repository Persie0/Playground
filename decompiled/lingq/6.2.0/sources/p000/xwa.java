package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xwa extends fxa {

    /* JADX INFO: renamed from: a */
    public final int f68909a;

    public xwa(int i) {
        this.f68909a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwa) && this.f68909a == ((xwa) obj).f68909a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68909a);
    }

    public final String toString() {
        return ux5.m22989l("OnPageSelected(page=", this.f68909a, ")");
    }
}
