package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import p000.m58;
import p000.p94;
import p000.uk9;
import p000.zga;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1181b {

    /* JADX INFO: renamed from: e */
    public static final Logger f13929e = Logger.getLogger(C1181b.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f13930f = zga.f71558e;

    /* JADX INFO: renamed from: a */
    public m58 f13931a;

    /* JADX INFO: renamed from: b */
    public final byte[] f13932b;

    /* JADX INFO: renamed from: c */
    public final int f13933c;

    /* JADX INFO: renamed from: d */
    public int f13934d;

    public C1181b(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            uk9.m22783r("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.f13932b = bArr;
        this.f13934d = 0;
        this.f13933c = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m6792a(int i) {
        if (i >= 0) {
            return m6795d(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: b */
    public static int m6793b(String str) {
        int length;
        try {
            length = AbstractC1192m.m6884b(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(p94.f55800a).length;
        }
        return m6795d(length) + length;
    }

    /* JADX INFO: renamed from: c */
    public static int m6794c(int i) {
        return m6795d(i << 3);
    }

    /* JADX INFO: renamed from: d */
    public static int m6795d(int i) {
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

    /* JADX INFO: renamed from: e */
    public static int m6796e(long j) {
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

    /* JADX INFO: renamed from: f */
    public final void m6797f(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13932b;
            int i = this.f13934d;
            this.f13934d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), 1), e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6798g(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f13932b, this.f13934d, i2);
            this.f13934d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6799h(ByteString byteString) {
        m6807p(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        m6798g(literalByteString.f13925c, literalByteString.mo6784h(), literalByteString.size());
    }

    /* JADX INFO: renamed from: i */
    public final void m6800i(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m6806o(i, 5);
        m6801j(i2);
    }

    /* JADX INFO: renamed from: j */
    public final void m6801j(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13932b;
            int i2 = this.f13934d;
            int i3 = i2 + 1;
            this.f13934d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f13934d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f13934d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f13934d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), 1), e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6802k(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m6806o(i, 1);
        m6803l(j);
    }

    /* JADX INFO: renamed from: l */
    public final void m6803l(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f13932b;
            int i = this.f13934d;
            int i2 = i + 1;
            this.f13934d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f13934d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f13934d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f13934d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f13934d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f13934d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f13934d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f13934d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), 1), e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6804m(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            m6807p(i);
        } else {
            m6809r(i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6805n(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f13934d;
        try {
            int iM6795d = m6795d(str.length() * 3);
            int iM6795d2 = m6795d(str.length());
            int i2 = this.f13933c;
            byte[] bArr = this.f13932b;
            if (iM6795d2 != iM6795d) {
                m6807p(AbstractC1192m.m6884b(str));
                int i3 = this.f13934d;
                this.f13934d = AbstractC1192m.f13964a.m6881a(str, bArr, i3, i2 - i3);
                return;
            }
            int i4 = i + iM6795d2;
            this.f13934d = i4;
            int iM6881a = AbstractC1192m.f13964a.m6881a(str, bArr, i4, i2 - i4);
            this.f13934d = i;
            m6807p((iM6881a - i) - iM6795d2);
            this.f13934d = iM6881a;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.f13934d = i;
            f13929e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(p94.f55800a);
            try {
                m6807p(bytes.length);
                m6798g(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6806o(int i, int i2) {
        m6807p((i << 3) | i2);
    }

    /* JADX INFO: renamed from: p */
    public final void m6807p(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f13934d;
            byte[] bArr = this.f13932b;
            if (i2 == 0) {
                this.f13934d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f13934d = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(this.f13933c), 1), e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m6808q(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m6806o(i, 0);
        m6809r(j);
    }

    /* JADX INFO: renamed from: r */
    public final void m6809r(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f13930f;
        int i = this.f13933c;
        byte[] bArr = this.f13932b;
        if (!z || i - this.f13934d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.f13934d;
                if (j2 == 0) {
                    this.f13934d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.f13934d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(i), 1), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13934d), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.f13934d;
            if (j3 == 0) {
                this.f13934d = i3 + 1;
                zga.m25611k(bArr, i3, (byte) j);
                return;
            } else {
                this.f13934d = i3 + 1;
                zga.m25611k(bArr, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
