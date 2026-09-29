package p176ib;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.api.C2542a;

/* JADX INFO: renamed from: ib.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6302x {

    /* JADX INFO: renamed from: a */
    public final SparseIntArray f36509a = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    public final C2549d f36510b;

    public C6302x(C2549d c2549d) {
        C6272i.m12915i(c2549d);
        this.f36510b = c2549d;
    }

    /* JADX INFO: renamed from: a */
    public final int m12932a(Context context, C2542a.e eVar) {
        C6272i.m12915i(context);
        C6272i.m12915i(eVar);
        int i10 = 0;
        if (!eVar.mo7547k()) {
            return 0;
        }
        int iMo7548m = eVar.mo7548m();
        SparseIntArray sparseIntArray = this.f36509a;
        int iMo7586c = sparseIntArray.get(iMo7548m, -1);
        if (iMo7586c == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= sparseIntArray.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = sparseIntArray.keyAt(i11);
                if (iKeyAt > iMo7548m && sparseIntArray.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iMo7586c = i10 == -1 ? this.f36510b.mo7586c(context, iMo7548m) : i10;
            sparseIntArray.put(iMo7548m, iMo7586c);
        }
        return iMo7586c;
    }
}
