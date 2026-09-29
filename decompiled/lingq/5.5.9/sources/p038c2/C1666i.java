package p038c2;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1666i extends C1660c {

    /* JADX INFO: renamed from: d */
    public final double f9340d;

    /* JADX INFO: renamed from: e */
    public final double f9341e;

    public C1666i(String str) {
        this.f9304a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f9340d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f9341e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // p038c2.C1660c
    /* JADX INFO: renamed from: a */
    public final double mo5384a(double d10) {
        double d11 = this.f9341e;
        double d12 = this.f9340d;
        if (d10 < d11) {
            return (d11 * d10) / (((d11 - d10) * d12) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * d12));
    }

    @Override // p038c2.C1660c
    /* JADX INFO: renamed from: b */
    public final double mo5385b(double d10) {
        double d11 = this.f9341e;
        double d12 = this.f9340d;
        if (d10 < d11) {
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d10) * d12) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d11 - 1.0d;
        double d16 = (((d11 - d10) * (-d12)) - d10) + 1.0d;
        return ((d15 * d12) * d15) / (d16 * d16);
    }
}
