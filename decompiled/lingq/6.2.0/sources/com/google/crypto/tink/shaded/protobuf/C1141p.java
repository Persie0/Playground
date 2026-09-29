package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import p000.ij6;
import p000.uk9;
import p000.v63;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1141p {

    /* JADX INFO: renamed from: f */
    public static final C1141p f13620f = new C1141p(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f13621a;

    /* JADX INFO: renamed from: b */
    public int[] f13622b;

    /* JADX INFO: renamed from: c */
    public Object[] f13623c;

    /* JADX INFO: renamed from: d */
    public int f13624d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f13625e;

    public C1141p(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13621a = i;
        this.f13622b = iArr;
        this.f13623c = objArr;
        this.f13625e = z;
    }

    /* JADX INFO: renamed from: c */
    public static C1141p m6653c() {
        return new C1141p(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m6654a(int i) {
        int[] iArr = this.f13622b;
        if (i > iArr.length) {
            int i2 = this.f13621a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f13622b = Arrays.copyOf(iArr, i);
            this.f13623c = Arrays.copyOf(this.f13623c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m6655b() {
        int iM6507h;
        int iM6509j;
        int iM6503d;
        int i = this.f13624d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13621a; i3++) {
            int i4 = this.f13622b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f13623c[i3]).getClass();
                    iM6503d = C1131f.m6503d(i5);
                } else if (i6 == 2) {
                    iM6503d = C1131f.m6500a(i5, (ByteString) this.f13623c[i3]);
                } else if (i6 == 3) {
                    iM6507h = C1131f.m6507h(i5) * 2;
                    iM6509j = ((C1141p) this.f13623c[i3]).m6655b();
                } else {
                    if (i6 != 5) {
                        uk9.m22779n(InvalidProtocolBufferException.m6417c());
                        return 0;
                    }
                    ((Integer) this.f13623c[i3]).getClass();
                    iM6503d = C1131f.m6502c(i5);
                }
                i2 = iM6503d + i2;
            } else {
                long jLongValue = ((Long) this.f13623c[i3]).longValue();
                iM6507h = C1131f.m6507h(i5);
                iM6509j = C1131f.m6509j(jLongValue);
            }
            i2 = iM6509j + iM6507h + i2;
        }
        this.f13624d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m6656d(int i, Object obj) {
        if (!this.f13625e) {
            ij6.m13946b();
            return;
        }
        m6654a(this.f13621a + 1);
        int[] iArr = this.f13622b;
        int i2 = this.f13621a;
        iArr[i2] = i;
        this.f13623c[i2] = obj;
        this.f13621a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m6657e(C1132g c1132g) throws CodedOutputStream$OutOfSpaceException {
        if (this.f13621a == 0) {
            return;
        }
        c1132g.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f13621a; i++) {
            int i2 = this.f13622b[i];
            Object obj = this.f13623c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c1132g.m6530j(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c1132g.m6526f(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c1132g.m6522b(i3, (ByteString) obj);
            } else if (i4 == 3) {
                C1131f c1131f = c1132g.f13592a;
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                c1131f.m6517r(i3, 3);
                ((C1141p) obj).m6657e(c1132g);
                c1131f.m6517r(i3, 4);
            } else {
                if (i4 != 5) {
                    v63.m23141s(InvalidProtocolBufferException.m6417c());
                    return;
                }
                c1132g.m6525e(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1141p)) {
            return false;
        }
        C1141p c1141p = (C1141p) obj;
        int i = this.f13621a;
        if (i == c1141p.f13621a) {
            int[] iArr = this.f13622b;
            int[] iArr2 = c1141p.f13622b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f13623c;
            Object[] objArr2 = c1141p.f13623c;
            int i3 = this.f13621a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f13621a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f13622b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f13623c;
        int i6 = this.f13621a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
