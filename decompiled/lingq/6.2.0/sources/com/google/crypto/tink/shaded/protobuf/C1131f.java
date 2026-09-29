package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;
import p000.o94;
import p000.uk9;
import p000.wm8;
import p000.yga;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1131f {

    /* JADX INFO: renamed from: e */
    public static final Logger f13586e = Logger.getLogger(C1131f.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f13587f = yga.f69828e;

    /* JADX INFO: renamed from: a */
    public C1132g f13588a;

    /* JADX INFO: renamed from: b */
    public final byte[] f13589b;

    /* JADX INFO: renamed from: c */
    public final int f13590c;

    /* JADX INFO: renamed from: d */
    public int f13591d;

    public C1131f(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            uk9.m22783r("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.f13589b = bArr;
        this.f13591d = 0;
        this.f13590c = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m6500a(int i, ByteString byteString) {
        return m6501b(byteString) + m6507h(i);
    }

    /* JADX INFO: renamed from: b */
    public static int m6501b(ByteString byteString) {
        int size = byteString.size();
        return m6508i(size) + size;
    }

    /* JADX INFO: renamed from: c */
    public static int m6502c(int i) {
        return m6507h(i) + 4;
    }

    /* JADX INFO: renamed from: d */
    public static int m6503d(int i) {
        return m6507h(i) + 8;
    }

    /* JADX INFO: renamed from: e */
    public static int m6504e(int i, AbstractC1126a abstractC1126a, wm8 wm8Var) {
        return abstractC1126a.mo6429a(wm8Var) + (m6507h(i) * 2);
    }

    /* JADX INFO: renamed from: f */
    public static int m6505f(int i) {
        if (i >= 0) {
            return m6508i(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: g */
    public static int m6506g(String str) {
        int length;
        try {
            length = AbstractC1144s.m6664b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(o94.f54077a).length;
        }
        return m6508i(length) + length;
    }

    /* JADX INFO: renamed from: h */
    public static int m6507h(int i) {
        return m6508i(i << 3);
    }

    /* JADX INFO: renamed from: i */
    public static int m6508i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: j */
    public static int m6509j(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: k */
    public final void m6510k(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13589b;
            int i = this.f13591d;
            this.f13591d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), 1), e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6511l(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f13589b, this.f13591d, i2);
            this.f13591d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6512m(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m6517r(i, 5);
        m6513n(i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m6513n(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13589b;
            int i2 = this.f13591d;
            int i3 = i2 + 1;
            this.f13591d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f13591d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f13591d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f13591d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), 1), e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6514o(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m6517r(i, 1);
        m6515p(j);
    }

    /* JADX INFO: renamed from: p */
    public final void m6515p(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13589b;
            int i = this.f13591d;
            int i2 = i + 1;
            this.f13591d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f13591d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f13591d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f13591d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f13591d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f13591d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f13591d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f13591d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), 1), e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6516q(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            m6518s(i);
        } else {
            m6520u(i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6517r(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m6518s((i << 3) | i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m6518s(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f13591d;
            byte[] bArr = this.f13589b;
            if (i2 == 0) {
                this.f13591d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f13591d = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(this.f13590c), 1), e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6519t(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m6517r(i, 0);
        m6520u(j);
    }

    /* JADX INFO: renamed from: u */
    public final void m6520u(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f13587f;
        int i = this.f13590c;
        byte[] bArr = this.f13589b;
        if (!z || i - this.f13591d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.f13591d;
                if (j2 == 0) {
                    this.f13591d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.f13591d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(i), 1), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13591d), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.f13591d;
            if (j3 == 0) {
                this.f13591d = i3 + 1;
                yga.m25135k(bArr, i3, (byte) j);
                return;
            } else {
                this.f13591d = i3 + 1;
                yga.m25135k(bArr, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
