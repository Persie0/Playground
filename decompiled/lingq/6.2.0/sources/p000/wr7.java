package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wr7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f67206a;

    public wr7(int i) {
        this.f67206a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr7) && this.f67206a == ((wr7) obj).f67206a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67206a);
    }

    public final String toString() {
        return ux5.m22989l("GoToPage(page=", this.f67206a, ")");
    }
}
