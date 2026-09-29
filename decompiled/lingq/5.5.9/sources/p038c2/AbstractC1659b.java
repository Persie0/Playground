package p038c2;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1659b {

    /* JADX INFO: renamed from: c2.b$a */
    public static class a extends AbstractC1659b {

        /* JADX INFO: renamed from: a */
        public final double f9300a;

        /* JADX INFO: renamed from: b */
        public final double[] f9301b;

        public a(double d10, double[] dArr) {
            this.f9300a = d10;
            this.f9301b = dArr;
        }

        @Override // p038c2.AbstractC1659b
        /* JADX INFO: renamed from: b */
        public final double mo5370b(double d10) {
            return this.f9301b[0];
        }

        @Override // p038c2.AbstractC1659b
        /* JADX INFO: renamed from: c */
        public final void mo5371c(double d10, double[] dArr) {
            double[] dArr2 = this.f9301b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p038c2.AbstractC1659b
        /* JADX INFO: renamed from: d */
        public final void mo5372d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f9301b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // p038c2.AbstractC1659b
        /* JADX INFO: renamed from: e */
        public final void mo5373e(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f9301b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // p038c2.AbstractC1659b
        /* JADX INFO: renamed from: f */
        public final double[] mo5374f() {
            return new double[]{this.f9300a};
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1659b m5382a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 != 0) {
            return i10 != 2 ? new C1663f(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new C1664g(dArr, dArr2);
    }

    /* JADX INFO: renamed from: b */
    public abstract double mo5370b(double d10);

    /* JADX INFO: renamed from: c */
    public abstract void mo5371c(double d10, double[] dArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo5372d(double d10, float[] fArr);

    /* JADX INFO: renamed from: e */
    public abstract void mo5373e(double d10, double[] dArr);

    /* JADX INFO: renamed from: f */
    public abstract double[] mo5374f();
}
