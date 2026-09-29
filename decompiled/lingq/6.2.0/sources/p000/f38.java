package p000;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f38 {

    /* JADX INFO: renamed from: a */
    public SparseArray f38365a;

    /* JADX INFO: renamed from: b */
    public int f38366b;

    /* JADX INFO: renamed from: c */
    public Set f38367c;

    /* JADX INFO: renamed from: a */
    public final e38 m11528a(int i) {
        SparseArray sparseArray = this.f38365a;
        e38 e38Var = (e38) sparseArray.get(i);
        if (e38Var != null) {
            return e38Var;
        }
        e38 e38Var2 = new e38();
        sparseArray.put(i, e38Var2);
        return e38Var2;
    }
}
