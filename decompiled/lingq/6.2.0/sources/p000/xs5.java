package p000;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xs5 implements st8 {

    /* JADX INFO: renamed from: a */
    public final u11 f68646a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f68647b;

    /* JADX INFO: renamed from: c */
    public final long f68648c;

    /* JADX INFO: renamed from: d */
    public final int f68649d;

    public xs5(SparseArray sparseArray, long j, int i, long j2, long j3) {
        u11 u11Var;
        int i2;
        this.f68647b = sparseArray;
        this.f68648c = j;
        this.f68649d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            u11Var = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                ws5 ws5Var = (ws5) list.get(i4);
                jArrCopyOf3[i4] = ws5Var.f67250a;
                jArrCopyOf[i4] = ws5Var.f67251b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                ss5.m21707d0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            u11Var = new u11(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f68646a = u11Var;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        List list = (List) this.f68647b.get(this.f68649d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        u11 u11Var = this.f68646a;
        if (u11Var != null) {
            return u11Var.mo3543f(j);
        }
        ut8 ut8Var = ut8.f64337c;
        return new rt8(ut8Var, ut8Var);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f68648c;
    }
}
