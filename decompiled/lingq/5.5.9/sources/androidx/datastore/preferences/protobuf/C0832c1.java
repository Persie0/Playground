package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0832c1 {

    /* JADX INFO: renamed from: f */
    public static final C0832c1 f5830f = new C0832c1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f5831a;

    /* JADX INFO: renamed from: b */
    public int[] f5832b;

    /* JADX INFO: renamed from: c */
    public Object[] f5833c;

    /* JADX INFO: renamed from: d */
    public int f5834d;

    /* JADX INFO: renamed from: e */
    public boolean f5835e;

    public C0832c1() {
        this(0, new int[8], new Object[8], true);
    }

    public C0832c1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f5834d = -1;
        this.f5831a = i10;
        this.f5832b = iArr;
        this.f5833c = objArr;
        this.f5835e = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final int m3197a() {
        int iM3087w;
        int i10 = this.f5834d;
        if (i10 != -1) {
            return i10;
        }
        int iM3197a = 0;
        for (int i11 = 0; i11 < this.f5831a; i11++) {
            int i12 = this.f5832b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iM3087w = CodedOutputStream.m3087w(i13, ((Long) this.f5833c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f5833c[i11]).longValue();
                iM3087w = CodedOutputStream.m3071g(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iM3197a = ((C0832c1) this.f5833c[i11]).m3197a() + (CodedOutputStream.m3084t(i13) * 2) + iM3197a;
                } else {
                    if (i14 != 5) {
                        int i15 = InvalidProtocolBufferException.f5813a;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                    }
                    ((Integer) this.f5833c[i11]).intValue();
                    iM3087w = CodedOutputStream.m3070f(i13);
                }
            } else {
                iM3087w = CodedOutputStream.m3067c(i13, (ByteString) this.f5833c[i11]);
            }
            iM3197a = iM3087w + iM3197a;
        }
        this.f5834d = iM3197a;
        return iM3197a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m3198b(int i10, Object obj) {
        if (!this.f5835e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f5831a;
        int[] iArr = this.f5832b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f5832b = Arrays.copyOf(iArr, i12);
            this.f5833c = Arrays.copyOf(this.f5833c, i12);
        }
        int[] iArr2 = this.f5832b;
        int i13 = this.f5831a;
        iArr2[i13] = i10;
        this.f5833c[i13] = obj;
        this.f5831a = i13 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m3199c(C0849j c0849j) throws IOException {
        if (this.f5831a == 0) {
            return;
        }
        c0849j.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i10 = 0; i10 < this.f5831a; i10++) {
            int i11 = this.f5832b[i10];
            Object obj = this.f5833c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c0849j.m3353j(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c0849j.m3349f(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c0849j.m3345b(i12, (ByteString) obj);
            } else if (i13 == 3) {
                c0849j.getClass();
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                CodedOutputStream codedOutputStream = c0849j.f5881a;
                codedOutputStream.mo3105Q(i12, 3);
                ((C0832c1) obj).m3199c(c0849j);
                codedOutputStream.mo3105Q(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = InvalidProtocolBufferException.f5813a;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                c0849j.m3348e(i12, ((Integer) obj).intValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0832c1)) {
            C0832c1 c0832c1 = (C0832c1) obj;
            int i10 = this.f5831a;
            if (i10 == c0832c1.f5831a) {
                int[] iArr = this.f5832b;
                int[] iArr2 = c0832c1.f5832b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z10 = true;
                        break;
                    }
                    if (iArr[i11] != iArr2[i11]) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
                if (z10) {
                    Object[] objArr = this.f5833c;
                    Object[] objArr2 = c0832c1.f5833c;
                    int i12 = this.f5831a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (!objArr[i13].equals(objArr2[i13])) {
                            z11 = false;
                            if (z11) {
                                return true;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5831a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f5832b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f5833c;
        int i15 = this.f5831a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
