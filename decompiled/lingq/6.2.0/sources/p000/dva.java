package p000;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class dva extends gva {

    /* JADX INFO: renamed from: f */
    public SparseArray f36276f;

    /* JADX INFO: renamed from: g */
    public float[] f36277g;

    @Override // p000.gva
    /* JADX INFO: renamed from: b */
    public final void mo10687b(int i, float f) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // p000.gva
    /* JADX INFO: renamed from: c */
    public final void mo9912c(View view, float f) {
        this.f41402a.mo9886d(f, this.f36277g);
        bad.m3548c((cj1) this.f36276f.valueAt(0), view, this.f36277g);
    }

    @Override // p000.gva
    /* JADX INFO: renamed from: d */
    public final void mo10688d(int i) {
        SparseArray sparseArray = this.f36276f;
        int size = sparseArray.size();
        int iM4767d = ((cj1) sparseArray.valueAt(0)).m4767d();
        double[] dArr = new double[size];
        this.f36277g = new float[iM4767d];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM4767d);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            cj1 cj1Var = (cj1) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            cj1Var.m4766c(this.f36277g);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f36277g;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f41402a = z9d.m25517a(i, dArr, dArr2);
    }
}
