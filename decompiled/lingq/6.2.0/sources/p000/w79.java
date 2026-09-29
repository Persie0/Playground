package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class w79 implements a89 {

    /* JADX INFO: renamed from: a */
    public final int f66491a;

    public w79(int i) {
        this.f66491a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w79) && this.f66491a == ((w79) obj).f66491a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66491a);
    }

    public final String toString() {
        return ux5.m22989l("SwitchOriginal(id=", this.f66491a, ")");
    }
}
