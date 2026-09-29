package p374s;

/* JADX INFO: renamed from: s.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8915k {

    /* JADX INFO: renamed from: a */
    public double f46821a;

    /* JADX INFO: renamed from: b */
    public double f46822b;

    public C8915k(double d10, double d11) {
        this.f46821a = d10;
        this.f46822b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8915k)) {
            return false;
        }
        C8915k c8915k = (C8915k) obj;
        if (Double.compare(this.f46821a, c8915k.f46821a) == 0 && Double.compare(this.f46822b, c8915k.f46822b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f46822b) + (Double.hashCode(this.f46821a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f46821a + ", _imaginary=" + this.f46822b + ')';
    }
}
