package p230l0;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7205b {

    /* JADX INFO: renamed from: a */
    public final int f40544a;

    /* JADX INFO: renamed from: b */
    public final long[] f40545b;

    /* JADX INFO: renamed from: c */
    public final Object[] f40546c;

    public C7205b(int i10, long[] jArr, Object[] objArr) {
        this.f40544a = i10;
        this.f40545b = jArr;
        this.f40546c = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m14525a(long j10) {
        int i10 = this.f40544a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f40545b;
        int i11 = 0;
        if (i10 == 0) {
            long j11 = jArr[0];
            if (j11 == j10) {
                return 0;
            }
            return j11 > j10 ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j12 = jArr[i12] - j10;
            if (j12 < 0) {
                i11 = i12 + 1;
            } else {
                if (j12 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: b */
    public final C7205b m14526b(long j10, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f40546c;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] != null) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr2 = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                jArr = this.f40545b;
                i10 = this.f40544a;
                if (i11 >= i14 || i15 >= i10) {
                    break;
                }
                long j11 = jArr[i15];
                Object obj2 = objArr[i15];
                if (j11 > j10) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i11] = j11;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr2[i16] = j10;
                objArr2[i16] = obj;
            } else {
                while (i11 < i14) {
                    long j12 = jArr[i15];
                    Object obj3 = objArr[i15];
                    if (obj3 != null) {
                        jArr2[i11] = j12;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new C7205b(i14, jArr2, objArr2);
    }
}
