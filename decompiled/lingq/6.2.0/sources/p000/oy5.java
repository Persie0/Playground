package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class oy5 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f55305a;

    /* JADX INFO: renamed from: b */
    public rda f55306b;

    public oy5(int i) {
        this.f55305a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m18839a(rda rdaVar, int i, int i2) {
        int iM20594a = rdaVar.m20594a(i);
        SparseArray sparseArray = this.f55305a;
        oy5 oy5Var = sparseArray == null ? null : (oy5) sparseArray.get(iM20594a);
        if (oy5Var == null) {
            oy5Var = new oy5(1);
            sparseArray.put(rdaVar.m20594a(i), oy5Var);
        }
        if (i2 > i) {
            oy5Var.m18839a(rdaVar, i + 1, i2);
        } else {
            oy5Var.f55306b = rdaVar;
        }
    }
}
