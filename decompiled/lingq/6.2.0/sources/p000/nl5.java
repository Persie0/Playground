package p000;

/* JADX INFO: loaded from: classes.dex */
public final class nl5 {

    /* JADX INFO: renamed from: a */
    public final int f52913a;

    public final boolean equals(Object obj) {
        if (obj instanceof nl5) {
            return this.f52913a == ((nl5) obj).f52913a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52913a);
    }

    public final String toString() {
        return ux5.m22989l("RawRes(resId=", this.f52913a, ")");
    }
}
