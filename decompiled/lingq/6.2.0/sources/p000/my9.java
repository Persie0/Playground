package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class my9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final double f52046a;

    public my9(double d) {
        this.f52046a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my9) && Double.compare(this.f52046a, ((my9) obj).f52046a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f52046a);
    }

    public final String toString() {
        return "UpdateLineHeight(height=" + this.f52046a + ")";
    }
}
