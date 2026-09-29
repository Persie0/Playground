package com.google.protobuf;

import p000.m58;
import p000.uk9;
import p000.v63;
import p000.wq1;

/* JADX INFO: renamed from: com.google.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1190k {

    /* JADX INFO: renamed from: f */
    public static final C1190k f13956f = new C1190k(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f13957a;

    /* JADX INFO: renamed from: b */
    public int[] f13958b;

    /* JADX INFO: renamed from: c */
    public Object[] f13959c;

    /* JADX INFO: renamed from: d */
    public int f13960d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f13961e;

    public C1190k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13957a = i;
        this.f13958b = iArr;
        this.f13959c = objArr;
        this.f13961e = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m6876a() {
        int iM6794c;
        int iM6796e;
        int iM6794c2;
        int i = this.f13960d;
        if (i != -1) {
            return i;
        }
        int iM24107c = 0;
        for (int i2 = 0; i2 < this.f13957a; i2++) {
            int i3 = this.f13958b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        ByteString byteString = (ByteString) this.f13959c[i2];
                        int iM6794c3 = C1181b.m6794c(i4);
                        int size = byteString.size();
                        iM24107c = wq1.m24107c(size, size, iM6794c3, iM24107c);
                    } else if (i5 == 3) {
                        iM6794c = C1181b.m6794c(i4) * 2;
                        iM6796e = ((C1190k) this.f13959c[i2]).m6876a();
                    } else {
                        if (i5 != 5) {
                            uk9.m22779n(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                            return 0;
                        }
                        ((Integer) this.f13959c[i2]).getClass();
                        iM6794c2 = C1181b.m6794c(i4) + 4;
                    }
                } else {
                    ((Long) this.f13959c[i2]).getClass();
                    iM6794c2 = C1181b.m6794c(i4) + 8;
                }
                iM24107c = iM6794c2 + iM24107c;
            } else {
                long jLongValue = ((Long) this.f13959c[i2]).longValue();
                iM6794c = C1181b.m6794c(i4);
                iM6796e = C1181b.m6796e(jLongValue);
            }
            iM24107c = iM6796e + iM6794c + iM24107c;
        }
        this.f13960d = iM24107c;
        return iM24107c;
    }

    /* JADX INFO: renamed from: b */
    public final void m6877b(m58 m58Var) throws CodedOutputStream$OutOfSpaceException {
        if (this.f13957a == 0) {
            return;
        }
        m58Var.getClass();
        C1181b c1181b = (C1181b) m58Var.f50618b;
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.f13957a; i++) {
            int i2 = this.f13958b[i];
            Object obj = this.f13959c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c1181b.m6808q(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c1181b.m6802k(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                m58Var.m16649o(i3, (ByteString) obj);
            } else if (i4 == 3) {
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                c1181b.m6806o(i3, 3);
                ((C1190k) obj).m6877b(m58Var);
                c1181b.m6806o(i3, 4);
            } else {
                if (i4 != 5) {
                    v63.m23141s(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                    return;
                }
                c1181b.m6800i(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1190k)) {
            C1190k c1190k = (C1190k) obj;
            int i = this.f13957a;
            if (i == c1190k.f13957a) {
                int[] iArr = this.f13958b;
                int[] iArr2 = c1190k.f13958b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f13959c;
                Object[] objArr2 = c1190k.f13959c;
                int i3 = this.f13957a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f13957a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f13958b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f13959c;
        int i6 = this.f13957a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
