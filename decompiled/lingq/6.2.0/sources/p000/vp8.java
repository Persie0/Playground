package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vp8 extends zp8 {

    /* JADX INFO: renamed from: a */
    public final int f65767a;

    public vp8(int i) {
        this.f65767a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp8) && this.f65767a == ((vp8) obj).f65767a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65767a);
    }

    public final String toString() {
        return ux5.m22989l("Empty(message=", this.f65767a, ")");
    }
}
