package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sn6 extends wn6 {

    /* JADX INFO: renamed from: a */
    public final int f61062a;

    public sn6(int i) {
        this.f61062a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn6) && this.f61062a == ((sn6) obj).f61062a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61062a);
    }

    public final String toString() {
        return ux5.m22989l("OnCountSelected(count=", this.f61062a, ")");
    }
}
