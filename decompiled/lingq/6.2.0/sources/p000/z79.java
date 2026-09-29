package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class z79 implements b89 {

    /* JADX INFO: renamed from: a */
    public final int f71028a;

    public z79(int i) {
        this.f71028a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z79) && this.f71028a == ((z79) obj).f71028a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71028a);
    }

    public final String toString() {
        return ux5.m22989l("SwitchSimplify(id=", this.f71028a, ")");
    }
}
