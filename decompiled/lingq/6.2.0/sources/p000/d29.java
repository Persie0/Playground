package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class d29 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f34874a;

    public d29(int i) {
        this.f34874a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d29) && this.f34874a == ((d29) obj).f34874a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34874a) * 31;
    }

    public final String toString() {
        return ux5.m22989l("Title(value=", this.f34874a, ", key=null)");
    }
}
