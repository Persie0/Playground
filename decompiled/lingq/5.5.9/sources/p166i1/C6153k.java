package p166i1;

import android.support.v4.media.C0141b;
import com.facebook.appevents.FlushResult;
import dm.C5207g;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: i1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6153k {

    /* JADX INFO: renamed from: a */
    public int f35977a;

    /* JADX INFO: renamed from: b */
    public Serializable f35978b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6153k(int i10) {
        this(32, 2);
        if (i10 != 2) {
            this.f35978b = FlushResult.SUCCESS;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [int[], java.io.Serializable] */
    public C6153k(int i10, int i11) {
        if (i11 == 2) {
            this.f35978b = new long[i10];
        } else if (i11 != 4) {
            this.f35978b = new int[i10];
        } else {
            this.f35977a = i10;
            this.f35978b = new ArrayBlockingQueue(Math.max(1, i10));
        }
    }

    public C6153k(String str, int i10) {
        this.f35977a = i10;
        this.f35978b = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, long[]] */
    /* JADX INFO: renamed from: a */
    public final void m12659a(long j10) {
        int i10 = this.f35977a;
        Object obj = this.f35978b;
        if (i10 == ((long[]) obj).length) {
            this.f35978b = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f35978b;
        int i11 = this.f35977a;
        this.f35977a = i11 + 1;
        jArr[i11] = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final long m12660b(int i10) {
        if (i10 >= 0 && i10 < this.f35977a) {
            return ((long[]) this.f35978b)[i10];
        }
        StringBuilder sbM614j = C0141b.m614j("Invalid index ", i10, ", size is ");
        sbM614j.append(this.f35977a);
        throw new IndexOutOfBoundsException(sbM614j.toString());
    }

    /* JADX INFO: renamed from: c */
    public final int m12661c() {
        int[] iArr = (int[]) this.f35978b;
        int i10 = this.f35977a - 1;
        this.f35977a = i10;
        return iArr[i10];
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [int[], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m12662d(int i10, int i11, int i12) {
        int i13 = this.f35977a;
        int i14 = i13 + 3;
        Object obj = this.f35978b;
        if (i14 >= ((int[]) obj).length) {
            ?? CopyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            C5207g.m11110e(CopyOf, "copyOf(this, newSize)");
            this.f35978b = CopyOf;
        }
        int[] iArr = (int[]) this.f35978b;
        iArr[i13 + 0] = i10 + i12;
        iArr[i13 + 1] = i11 + i12;
        iArr[i13 + 2] = i12;
        this.f35977a = i14;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [int[], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m12663e(int i10, int i11, int i12, int i13) {
        int i14 = this.f35977a;
        int i15 = i14 + 4;
        Object obj = this.f35978b;
        if (i15 >= ((int[]) obj).length) {
            ?? CopyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            C5207g.m11110e(CopyOf, "copyOf(this, newSize)");
            this.f35978b = CopyOf;
        }
        int[] iArr = (int[]) this.f35978b;
        iArr[i14 + 0] = i10;
        iArr[i14 + 1] = i11;
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = i13;
        this.f35977a = i15;
    }

    /* JADX INFO: renamed from: f */
    public final void m12664f(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = (int[]) this.f35978b;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    m12665g(i12, i13);
                }
            }
            int i16 = i12 + 3;
            m12665g(i16, i11);
            m12664f(i10, i16 - 3);
            m12664f(i16 + 3, i11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12665g(int i10, int i11) {
        int[] iArr = (int[]) this.f35978b;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }
}
