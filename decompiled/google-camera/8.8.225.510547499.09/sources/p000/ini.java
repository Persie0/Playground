package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ini {

    /* JADX INFO: renamed from: a */
    public double f31594a;

    /* JADX INFO: renamed from: b */
    public double f31595b;

    /* JADX INFO: renamed from: c */
    public double f31596c;

    /* JADX INFO: renamed from: a */
    public static double m11513a(ini iniVar, ini iniVar2) {
        return (iniVar.f31594a * iniVar2.f31594a) + (iniVar.f31595b * iniVar2.f31595b) + (iniVar.f31596c * iniVar2.f31596c);
    }

    /* JADX INFO: renamed from: c */
    public static void m11514c(ini iniVar, ini iniVar2, ini iniVar3) {
        double d = iniVar.f31595b;
        double d2 = iniVar2.f31596c;
        double d3 = iniVar.f31596c;
        double d4 = iniVar2.f31595b;
        double d5 = iniVar2.f31594a;
        double d6 = iniVar.f31594a;
        iniVar3.m11519g((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* JADX INFO: renamed from: b */
    public final double m11515b() {
        double d = this.f31594a;
        double d2 = this.f31595b;
        double d3 = this.f31596c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    /* JADX INFO: renamed from: d */
    public final void m11516d() {
        double dM11515b = m11515b();
        if (dM11515b != 0.0d) {
            m11517e(1.0d / dM11515b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11517e(double d) {
        this.f31594a *= d;
        this.f31595b *= d;
        this.f31596c *= d;
    }

    /* JADX INFO: renamed from: f */
    public final void m11518f(ini iniVar) {
        this.f31594a = iniVar.f31594a;
        this.f31595b = iniVar.f31595b;
        this.f31596c = iniVar.f31596c;
    }

    /* JADX INFO: renamed from: g */
    public final void m11519g(double d, double d2, double d3) {
        this.f31594a = d;
        this.f31595b = d2;
        this.f31596c = d3;
    }

    /* JADX INFO: renamed from: h */
    public final void m11520h() {
        this.f31596c = 0.0d;
        this.f31595b = 0.0d;
        this.f31594a = 0.0d;
    }
}
