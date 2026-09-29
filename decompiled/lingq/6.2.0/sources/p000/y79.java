package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y79 implements a89 {

    /* JADX INFO: renamed from: a */
    public final int f69419a;

    public y79(int i) {
        this.f69419a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y79) && this.f69419a == ((y79) obj).f69419a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69419a);
    }

    public final String toString() {
        return ux5.m22989l("SwitchSimplify(id=", this.f69419a, ")");
    }
}
