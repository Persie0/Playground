package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ex1 extends z9d {

    /* JADX INFO: renamed from: a */
    public double f38020a;

    /* JADX INFO: renamed from: b */
    public double[] f38021b;

    @Override // p000.z9d
    /* JADX INFO: renamed from: b */
    public final double mo9884b(double d) {
        return this.f38021b[0];
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: c */
    public final void mo9885c(double d, double[] dArr) {
        double[] dArr2 = this.f38021b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: d */
    public final void mo9886d(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f38021b;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: e */
    public final void mo9887e(double d, double[] dArr) {
        for (int i = 0; i < this.f38021b.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // p000.z9d
    /* JADX INFO: renamed from: f */
    public final double[] mo9888f() {
        return new double[]{this.f38020a};
    }
}
