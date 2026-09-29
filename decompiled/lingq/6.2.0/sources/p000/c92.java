package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c92 extends r8a {

    /* JADX INFO: renamed from: A */
    public final boolean f9745A;

    /* JADX INFO: renamed from: B */
    public final boolean f9746B;

    /* JADX INFO: renamed from: C */
    public final boolean f9747C;

    /* JADX INFO: renamed from: D */
    public final SparseArray f9748D;

    /* JADX INFO: renamed from: E */
    public final SparseBooleanArray f9749E;

    /* JADX INFO: renamed from: w */
    public final boolean f9750w;

    /* JADX INFO: renamed from: x */
    public final boolean f9751x;

    /* JADX INFO: renamed from: y */
    public final boolean f9752y;

    /* JADX INFO: renamed from: z */
    public final boolean f9753z;

    public c92(d92 d92Var) {
        m20447a(d92Var);
        this.f9750w = d92Var.f35203w;
        this.f9751x = d92Var.f35204x;
        this.f9752y = d92Var.f35205y;
        this.f9753z = d92Var.f35206z;
        this.f9745A = d92Var.f35198A;
        this.f9746B = d92Var.f35199B;
        this.f9747C = d92Var.f35200C;
        SparseArray sparseArray = d92Var.f35201D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f9748D = sparseArray2;
        this.f9749E = d92Var.f35202E.clone();
    }

    public c92() {
        this.f9748D = new SparseArray();
        this.f9749E = new SparseBooleanArray();
        this.f9750w = true;
        this.f9751x = true;
        this.f9752y = true;
        this.f9753z = true;
        this.f9745A = true;
        this.f9746B = true;
        this.f9747C = true;
    }
}
