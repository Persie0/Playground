package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f41267a;

    public gs7(int i) {
        this.f41267a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs7) && this.f41267a == ((gs7) obj).f41267a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41267a);
    }

    public final String toString() {
        return ux5.m22989l("PageChanged(page=", this.f41267a, ")");
    }
}
