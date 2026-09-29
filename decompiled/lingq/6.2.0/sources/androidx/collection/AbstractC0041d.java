package androidx.collection;

import p000.fa4;
import p000.vi3;

/* JADX INFO: renamed from: androidx.collection.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0041d {

    /* JADX INFO: renamed from: a */
    public long[] f1295a;

    /* JADX INFO: renamed from: b */
    public Object[] f1296b;

    /* JADX INFO: renamed from: c */
    public long[] f1297c;

    /* JADX INFO: renamed from: d */
    public int f1298d;

    /* JADX INFO: renamed from: e */
    public int f1299e;

    /* JADX INFO: renamed from: f */
    public int f1300f;

    /* JADX INFO: renamed from: g */
    public int f1301g;

    /* JADX INFO: renamed from: a */
    public final boolean m722a(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f1300f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f1295a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (fa4.m11650l(this.f1296b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0041d)) {
            return false;
        }
        AbstractC0041d abstractC0041d = (AbstractC0041d) obj;
        if (abstractC0041d.f1301g != this.f1301g) {
            return false;
        }
        Object[] objArr = this.f1296b;
        long[] jArr = this.f1295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !abstractC0041d.m722a(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.f1300f * 31) + this.f1301g;
        Object[] objArr = this.f1296b;
        long[] jArr = this.f1295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!fa4.m11650l(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    public final String toString() {
        vi3 vi3Var = new vi3() { // from class: androidx.collection.OrderedScatterSet$toString$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return obj == this.f1275b ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f1296b;
        long[] jArr = this.f1297c;
        int i = this.f1299e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) vi3Var.invoke(obj));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
