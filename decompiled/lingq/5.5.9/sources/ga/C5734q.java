package ga;

import android.util.SparseArray;
import p150h9.C5931p;
import p479xa.InterfaceC10137f;

/* JADX INFO: renamed from: ga.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5734q<V> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC10137f<V> f34796c;

    /* JADX INFO: renamed from: b */
    public final SparseArray<V> f34795b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public int f34794a = -1;

    public C5734q(C5931p c5931p) {
        this.f34796c = c5931p;
    }

    /* JADX INFO: renamed from: a */
    public final V m12088a(int i10) {
        SparseArray<V> sparseArray;
        if (this.f34794a == -1) {
            this.f34794a = 0;
        }
        while (true) {
            int i11 = this.f34794a;
            sparseArray = this.f34795b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f34794a--;
        }
        while (this.f34794a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f34794a + 1)) {
            this.f34794a++;
        }
        return sparseArray.valueAt(this.f34794a);
    }
}
