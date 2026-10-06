package p000;

import android.opengl.Matrix;
import java.util.Vector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exu extends ewx {

    /* JADX INFO: renamed from: i */
    public final exs f20889i;

    /* JADX INFO: renamed from: m */
    private eyl f20893m;

    /* JADX INFO: renamed from: f */
    public final float[] f20886f = new float[16];

    /* JADX INFO: renamed from: g */
    public final float[] f20887g = new float[16];

    /* JADX INFO: renamed from: h */
    public final float[] f20888h = new float[16];

    /* JADX INFO: renamed from: k */
    private final float[] f20891k = new float[16];

    /* JADX INFO: renamed from: l */
    private final ing f20892l = new ing();

    /* JADX INFO: renamed from: n */
    private double f20894n = -1.0d;

    /* JADX INFO: renamed from: j */
    public final Vector f20890j = new Vector();

    public exu(exs exsVar) {
        this.f20889i = exsVar;
        try {
            this.f20893m = new eyl();
            ewy.m7963a("photo collection");
        } catch (ewy e) {
            e.printStackTrace();
        }
        Matrix.setIdentityM(this.f20888h, 0);
        Matrix.rotateM(this.f20888h, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final int m8026b() {
        return this.f20890j.size();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x01d5, TryCatch #1 {all -> 0x01d5, blocks: (B:54:0x01a9, B:23:0x0091, B:29:0x00b3, B:34:0x00c2, B:36:0x00cf, B:38:0x011e, B:40:0x013c, B:42:0x015d, B:48:0x018d, B:49:0x0190, B:52:0x01a1, B:43:0x0171, B:37:0x00d5, B:61:0x01d3, B:56:0x01c1), top: B:67:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: all -> 0x01d5, TryCatch #1 {all -> 0x01d5, blocks: (B:54:0x01a9, B:23:0x0091, B:29:0x00b3, B:34:0x00c2, B:36:0x00cf, B:38:0x011e, B:40:0x013c, B:42:0x015d, B:48:0x018d, B:49:0x0190, B:52:0x01a1, B:43:0x0171, B:37:0x00d5, B:61:0x01d3, B:56:0x01c1), top: B:67:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    @Override // p000.ewx
    /* JADX INFO: renamed from: c */
    public final void mo7961c(float[] fArr) throws Throwable {
        boolean z;
        double d;
        double d2;
        long j;
        float[] fArr2;
        double d3;
        double dAcos;
        exs exsVar = this.f20889i;
        ewz ewzVar = exsVar.f20701e;
        boolean z2 = exsVar.f20874l;
        boolean z3 = exsVar.f20875m;
        int i = 0;
        exsVar.f20874l = false;
        exsVar.f20875m = true;
        exsVar.f20701e = this.f20893m;
        double d4 = this.f20894n;
        double d5 = -1.0d;
        long j2 = 4607182418800017408L;
        double d6 = 0.0d;
        if (d4 >= 0.0d) {
            double d7 = d4 + ((1.0d - d4) * 0.05d);
            this.f20894n = d7;
            if (d7 >= 0.95d) {
                this.f20894n = -1.0d;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Vector vector = this.f20890j;
        synchronized (vector) {
            while (i < this.f20890j.size()) {
                try {
                    ext extVar = (ext) this.f20890j.get(i);
                    if (extVar.f20882g) {
                        float f = extVar.f20880e;
                        int i2 = extVar.f20883h;
                        if (extVar.f20884i.f39211a != -1 && z) {
                            boolean z4 = extVar.f20881f;
                        }
                        float[] fArr3 = extVar.f20876a;
                        double d8 = this.f20894n;
                        if (d8 >= d6) {
                            ing ingVar = extVar.f20878c;
                            ing ingVar2 = extVar.f20879d;
                            ing ingVar3 = this.f20892l;
                            double d9 = (ingVar.f31587a * ingVar2.f31587a) + (ingVar.f31588b * ingVar2.f31588b) + (ingVar.f31589c * ingVar2.f31589c) + (ingVar.f31590d * ingVar2.f31590d);
                            if (d9 <= 1.0d) {
                                d2 = -1.0d;
                                if (d9 < -1.0d) {
                                }
                                d = 0.0d;
                                if (d9 < 0.0d) {
                                    d9 = -d9;
                                    d3 = d2;
                                } else {
                                    d3 = 1.0d;
                                }
                                dAcos = Math.acos(d9);
                                if (dAcos <= 1.0E-6d) {
                                    ingVar3.m11510a(ingVar2);
                                    j = 4607182418800017408L;
                                } else {
                                    j = 4607182418800017408L;
                                    double dSin = 1.0d / Math.sin(dAcos);
                                    double dSin2 = Math.sin((1.0d - d8) * dAcos) * dSin;
                                    double dSin3 = d3 * Math.sin(d8 * dAcos) * dSin;
                                    ingVar3.f31587a = (ingVar.f31587a * dSin2) + (ingVar2.f31587a * dSin3);
                                    ingVar3.f31588b = (ingVar.f31588b * dSin2) + (ingVar2.f31588b * dSin3);
                                    ingVar3.f31589c = (ingVar.f31589c * dSin2) + (ingVar2.f31589c * dSin3);
                                    ingVar3.f31590d = (ingVar.f31590d * dSin2) + (ingVar2.f31590d * dSin3);
                                }
                                this.f20892l.m11511b(this.f20887g);
                                fArr2 = this.f20887g;
                            } else {
                                d2 = -1.0d;
                            }
                            ingVar3.m11510a(ingVar2);
                            d = 0.0d;
                            if (d9 < 0.0d) {
                                d9 = -d9;
                                d3 = d2;
                            } else {
                                d3 = 1.0d;
                            }
                            dAcos = Math.acos(d9);
                            if (dAcos <= 1.0E-6d) {
                                ingVar3.m11510a(ingVar2);
                                j = 4607182418800017408L;
                            } else {
                                j = 4607182418800017408L;
                                double dSin4 = 1.0d / Math.sin(dAcos);
                                double dSin5 = Math.sin((1.0d - d8) * dAcos) * dSin4;
                                double dSin6 = d3 * Math.sin(d8 * dAcos) * dSin4;
                                ingVar3.f31587a = (ingVar.f31587a * dSin5) + (ingVar2.f31587a * dSin6);
                                ingVar3.f31588b = (ingVar.f31588b * dSin5) + (ingVar2.f31588b * dSin6);
                                ingVar3.f31589c = (ingVar.f31589c * dSin5) + (ingVar2.f31589c * dSin6);
                                ingVar3.f31590d = (ingVar.f31590d * dSin5) + (ingVar2.f31590d * dSin6);
                            }
                            this.f20892l.m11511b(this.f20887g);
                            fArr2 = this.f20887g;
                        } else {
                            d = d6;
                            d2 = -1.0d;
                            j = 4607182418800017408L;
                            fArr2 = fArr3;
                        }
                        Matrix.multiplyMM(this.f20891k, 0, fArr, 0, fArr2, 0);
                        this.f20893m.m7968c();
                        int i3 = extVar.f20884i.f39211a;
                        int i4 = extVar.f20885j.f39211a;
                        if (i3 != -1) {
                            boolean z5 = extVar.f20881f;
                            this.f20889i.m8025e(i3);
                            this.f20893m.m8049j(f);
                            this.f20889i.mo7959a(this.f20891k);
                        } else {
                            this.f20889i.m8025e(i4);
                            this.f20893m.m8049j(1.0f);
                            this.f20889i.mo7959a(this.f20891k);
                        }
                        if (f < 1.0f) {
                            if (f > 0.99f) {
                                extVar.f20880e = 1.0f;
                            } else {
                                extVar.f20880e += (1.0f - f) * 0.05f;
                            }
                        }
                        if (i2 < 500) {
                            extVar.f20883h++;
                        }
                    } else {
                        z2 = z2;
                        z3 = z3;
                        i = i;
                        vector = vector;
                        d2 = d5;
                        j = j2;
                        d = d6;
                        ewzVar = ewzVar;
                    }
                    try {
                        d5 = d2;
                        j2 = j;
                        z2 = z2;
                        z3 = z3;
                        i++;
                        ewzVar = ewzVar;
                        d6 = d;
                        vector = vector;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector = vector;
                }
            }
            ewz ewzVar2 = ewzVar;
            boolean z6 = z2;
            boolean z7 = z3;
            exs exsVar2 = this.f20889i;
            exsVar2.f20874l = z6;
            exsVar2.f20875m = z7;
            exsVar2.f20701e = ewzVar2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8027e(int i, boolean z) {
        if (i < this.f20890j.size()) {
            ((ext) this.f20890j.get(i)).f20882g = z;
        }
    }
}
