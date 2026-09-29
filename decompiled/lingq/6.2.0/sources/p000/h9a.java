package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h9a {

    /* JADX INFO: renamed from: a */
    public final double f42053a;

    /* JADX INFO: renamed from: b */
    public final double f42054b;

    /* JADX INFO: renamed from: c */
    public final double f42055c;

    /* JADX INFO: renamed from: d */
    public final double f42056d;

    /* JADX INFO: renamed from: e */
    public final double f42057e;

    /* JADX INFO: renamed from: f */
    public final double f42058f;

    /* JADX INFO: renamed from: g */
    public final double f42059g;

    public h9a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f42053a = d;
        this.f42054b = d2;
        this.f42055c = d3;
        this.f42056d = d4;
        this.f42057e = d5;
        this.f42058f = d6;
        this.f42059g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C3386nv.m17626m("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C3386nv.m17626m("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C3386nv.m17626m("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C3386nv.m17626m("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C3386nv.m17626m("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C3386nv.m17626m("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9a)) {
            return false;
        }
        h9a h9aVar = (h9a) obj;
        return Double.compare(this.f42053a, h9aVar.f42053a) == 0 && Double.compare(this.f42054b, h9aVar.f42054b) == 0 && Double.compare(this.f42055c, h9aVar.f42055c) == 0 && Double.compare(this.f42056d, h9aVar.f42056d) == 0 && Double.compare(this.f42057e, h9aVar.f42057e) == 0 && Double.compare(this.f42058f, h9aVar.f42058f) == 0 && Double.compare(this.f42059g, h9aVar.f42059g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f42059g) + g9a.m12424a(this.f42058f, g9a.m12424a(this.f42057e, g9a.m12424a(this.f42056d, g9a.m12424a(this.f42055c, g9a.m12424a(this.f42054b, Double.hashCode(this.f42053a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f42053a + ", a=" + this.f42054b + ", b=" + this.f42055c + ", c=" + this.f42056d + ", d=" + this.f42057e + ", e=" + this.f42058f + ", f=" + this.f42059g + ')';
    }

    public /* synthetic */ h9a(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
