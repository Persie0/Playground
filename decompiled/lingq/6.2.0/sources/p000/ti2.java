package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ti2 extends uj7 {

    /* JADX INFO: renamed from: a */
    public double[] f62335a;

    /* JADX INFO: renamed from: b */
    public int f62336b;

    public ti2(double[] dArr) {
        dArr.getClass();
        this.f62335a = dArr;
        this.f62336b = dArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f62335a, this.f62336b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        double[] dArr = this.f62335a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f62335a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f62336b;
    }

    /* JADX INFO: renamed from: e */
    public final void m22070e(double d) {
        mo4383b(mo4384d() + 1);
        double[] dArr = this.f62335a;
        int i = this.f62336b;
        this.f62336b = i + 1;
        dArr[i] = d;
    }
}
