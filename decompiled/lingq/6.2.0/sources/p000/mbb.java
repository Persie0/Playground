package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mbb extends pbb {

    /* JADX INFO: renamed from: a */
    public final int f50901a;

    public mbb(int i) {
        this.f50901a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbb) && this.f50901a == ((mbb) obj).f50901a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50901a);
    }

    public final String toString() {
        return ux5.m22989l("Seek(position=", this.f50901a, ")");
    }
}
