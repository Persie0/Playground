package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ky9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final int f48779a;

    public ky9(int i) {
        this.f48779a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky9) && this.f48779a == ((ky9) obj).f48779a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48779a);
    }

    public final String toString() {
        return ux5.m22989l("UpdateFontSize(size=", this.f48779a, ")");
    }
}
