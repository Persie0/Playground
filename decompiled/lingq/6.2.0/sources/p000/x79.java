package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class x79 implements b89 {

    /* JADX INFO: renamed from: a */
    public final int f67904a;

    public x79(int i) {
        this.f67904a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x79) && this.f67904a == ((x79) obj).f67904a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67904a);
    }

    public final String toString() {
        return ux5.m22989l("SwitchOriginal(id=", this.f67904a, ")");
    }
}
