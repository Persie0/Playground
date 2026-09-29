package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class c29 extends g29 {

    /* JADX INFO: renamed from: a */
    public final int f9371a;

    public c29(int i) {
        this.f9371a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c29) && this.f9371a == ((c29) obj).f9371a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9371a) * 31;
    }

    public final String toString() {
        return ux5.m22989l("Title(value=", this.f9371a, ", key=null)");
    }
}
