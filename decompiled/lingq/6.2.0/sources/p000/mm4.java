package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mm4 extends qm4 {

    /* JADX INFO: renamed from: a */
    public final int f51515a;

    public mm4(int i) {
        this.f51515a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm4) && this.f51515a == ((mm4) obj).f51515a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51515a);
    }

    public final String toString() {
        return ux5.m22989l("Error(message=", this.f51515a, ")");
    }
}
