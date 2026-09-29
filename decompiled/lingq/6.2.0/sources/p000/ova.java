package p000;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class ova extends rva {

    /* JADX INFO: renamed from: k */
    public String f55041k;

    /* JADX INFO: renamed from: l */
    public SparseArray f55042l;

    /* JADX INFO: renamed from: m */
    public SparseArray f55043m;

    /* JADX INFO: renamed from: n */
    public float[] f55044n;

    @Override // p000.rva
    /* JADX INFO: renamed from: c */
    public final void mo18524c(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("Wrong call for custom attribute");
    }

    @Override // p000.rva
    /* JADX INFO: renamed from: d */
    public final boolean mo17649d(float f, long j, View view, web webVar) {
        this.f59884a.mo9886d(f, this.f55044n);
        float[] fArr = this.f55044n;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.f59892i;
        if (Float.isNaN(this.f59893j)) {
            float fM23883t = webVar.m23883t(view, this.f55041k);
            this.f59893j = fM23883t;
            if (Float.isNaN(fM23883t)) {
                this.f59893j = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f59893j)) % 1.0d);
        this.f59893j = f4;
        this.f59892i = j;
        float fM20867a = m20867a(f4);
        this.f59891h = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f59890g;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.f59891h;
            float f5 = this.f55044n[i];
            this.f59891h = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fM20867a) + f3;
            i++;
        }
        bad.m3548c((cj1) this.f55042l.valueAt(0), view, this.f59890g);
        if (f2 != 0.0f) {
            this.f59891h = true;
        }
        return this.f59891h;
    }

    @Override // p000.rva
    /* JADX INFO: renamed from: e */
    public final void mo18525e(int i) {
        SparseArray sparseArray = this.f55042l;
        int size = sparseArray.size();
        int iM4767d = ((cj1) sparseArray.valueAt(0)).m4767d();
        double[] dArr = new double[size];
        int i2 = iM4767d + 2;
        this.f55044n = new float[i2];
        this.f59890g = new float[iM4767d];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            cj1 cj1Var = (cj1) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.f55043m.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            cj1Var.m4766c(this.f55044n);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f55044n;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iM4767d] = fArr[0];
            dArr3[iM4767d + 1] = fArr[1];
        }
        this.f59884a = z9d.m25517a(i, dArr, dArr2);
    }
}
