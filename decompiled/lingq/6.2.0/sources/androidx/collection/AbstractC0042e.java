package androidx.collection;

import p000.fa4;
import p000.vi3;

/* JADX INFO: renamed from: androidx.collection.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0042e {

    /* JADX INFO: renamed from: a */
    public long[] f1302a;

    /* JADX INFO: renamed from: b */
    public Object[] f1303b;

    /* JADX INFO: renamed from: c */
    public int f1304c;

    /* JADX INFO: renamed from: d */
    public int f1305d;

    /* JADX INFO: renamed from: a */
    public final boolean m723a(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f1304c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f1302a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (fa4.m11650l(this.f1303b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX INFO: renamed from: b */
    public final boolean m724b() {
        return this.f1305d == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m725c() {
        return this.f1305d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0042e)) {
            return false;
        }
        AbstractC0042e abstractC0042e = (AbstractC0042e) obj;
        if (abstractC0042e.f1305d != this.f1305d) {
            return false;
        }
        Object[] objArr = this.f1303b;
        long[] jArr = this.f1302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !abstractC0042e.m723a(objArr[(i << 3) + i3])) {
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
        int iHashCode = (this.f1304c * 31) + this.f1305d;
        Object[] objArr = this.f1303b;
        long[] jArr = this.f1302a;
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

    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[DONT_INVERT, PHI: r7
      0x0065: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0028, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:0: B:5:0x001a->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[SYNTHETIC] */
    public final String toString() {
        vi3 vi3Var = new vi3() { // from class: androidx.collection.ScatterSet$toString$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return obj == this.f1276b ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f1303b;
        long[] jArr = this.f1302a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) vi3Var.invoke(obj));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
