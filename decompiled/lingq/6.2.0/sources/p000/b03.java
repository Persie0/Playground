package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b03 extends e03 {

    /* JADX INFO: renamed from: a */
    public final int f7719a;

    public b03(int i) {
        this.f7719a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b03) && this.f7719a == ((b03) obj).f7719a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7719a);
    }

    public final String toString() {
        return ux5.m22989l("Loading(id=", this.f7719a, ")");
    }
}
