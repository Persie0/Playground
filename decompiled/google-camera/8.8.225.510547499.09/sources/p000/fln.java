package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fln implements flp {

    /* JADX INFO: renamed from: a */
    private volatile float f22508a = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    private volatile float f22509b;

    /* JADX INFO: renamed from: c */
    private final fkp f22510c;

    /* JADX INFO: renamed from: d */
    private final gtg f22511d;

    public fln(fkp fkpVar, gtg gtgVar, byte[] bArr, byte[] bArr2) {
        this.f22511d = gtgVar;
        this.f22510c = fkpVar;
        this.f22509b = gtgVar.f26337a;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: a */
    public final fli mo8554a() {
        return fli.ADAPTIVE_DISTANCE;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: b */
    public final boolean mo8555b(gsr gsrVar, gsr gsrVar2) {
        float f;
        float fM8525a = this.f22510c.m8525a(gsrVar, gsrVar2);
        long jAbs = Math.abs(gsrVar2.f26243c - gsrVar.f26243c);
        if (jAbs <= 200000000) {
            float f2 = this.f22508a;
            double d = fM8525a;
            Double.isNaN(d);
            double d2 = jAbs;
            Double.isNaN(d2);
            this.f22508a = Math.min(f2, (float) ((d * 1.0E9d) / d2));
            float f3 = this.f22508a;
            gtg gtgVar = this.f22511d;
            if (f3 > 1000.0f) {
                f = 0.0f;
            } else if (f3 < 150.0f) {
                f = gtgVar.f26338b;
            } else if (f3 > 200.0f) {
                f = gtgVar.f26337a;
            } else {
                float f4 = gtgVar.f26338b;
                f = (((f3 - 150.0f) * (gtgVar.f26337a - f4)) / 50.0f) + f4;
            }
            this.f22509b = f;
        }
        return fM8525a > this.f22509b;
    }
}
