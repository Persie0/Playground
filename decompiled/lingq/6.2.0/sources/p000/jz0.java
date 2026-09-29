package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jz0 extends nz0 {

    /* JADX INFO: renamed from: a */
    public final double f46415a;

    public jz0(double d) {
        this.f46415a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz0) && Double.compare(this.f46415a, ((jz0) obj).f46415a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f46415a);
    }

    public final String toString() {
        return "Ended(coins=" + this.f46415a + ")";
    }
}
