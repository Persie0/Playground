package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import p000.C3386nv;
import p000.aha;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0672f extends AbstractC0673g {

    /* JADX INFO: renamed from: d */
    public final byte[] f6069d;

    /* JADX INFO: renamed from: e */
    public final int f6070e;

    /* JADX INFO: renamed from: f */
    public int f6071f;

    /* JADX INFO: renamed from: g */
    public final OutputStream f6072g;

    public C0672f(OutputStream outputStream, int i) {
        if (i < 0) {
            C3386nv.m17626m("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f6069d = new byte[iMax];
        this.f6070e = iMax;
        if (outputStream != null) {
            this.f6072g = outputStream;
        } else {
            C3386nv.m17635v("out");
            throw null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m2362A(long j) {
        int i = this.f6071f;
        int i2 = i + 1;
        this.f6071f = i2;
        byte[] bArr = this.f6069d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f6071f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f6071f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f6071f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f6071f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f6071f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f6071f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f6071f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: B */
    public final void m2363B(int i, int i2) {
        m2364C((i << 3) | i2);
    }

    /* JADX INFO: renamed from: C */
    public final void m2364C(int i) {
        boolean z = AbstractC0673g.f6074c;
        byte[] bArr = this.f6069d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f6071f;
                if (i2 == 0) {
                    this.f6071f = i3 + 1;
                    aha.m415k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f6071f = i3 + 1;
                    aha.m415k(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f6071f;
                if (i4 == 0) {
                    this.f6071f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f6071f = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2365D(long j) {
        boolean z = AbstractC0673g.f6074c;
        byte[] bArr = this.f6069d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f6071f;
                if (j2 == 0) {
                    this.f6071f = i + 1;
                    aha.m415k(bArr, i, (byte) j);
                    return;
                } else {
                    this.f6071f = i + 1;
                    aha.m415k(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f6071f;
                if (j3 == 0) {
                    this.f6071f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f6071f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2366E() throws IOException {
        this.f6072g.write(this.f6069d, 0, this.f6071f);
        this.f6071f = 0;
    }

    /* JADX INFO: renamed from: F */
    public final void m2367F(int i) throws IOException {
        if (this.f6070e - this.f6071f < i) {
            m2366E();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2368G(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f6071f;
        int i4 = this.f6070e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f6069d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f6071f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f6071f = i4;
        m2366E();
        if (i7 > i4) {
            this.f6072g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f6071f = i7;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: i */
    public final void mo2344i(byte b) throws IOException {
        if (this.f6071f == this.f6070e) {
            m2366E();
        }
        int i = this.f6071f;
        this.f6071f = i + 1;
        this.f6069d[i] = b;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: j */
    public final void mo2345j(int i, boolean z) throws IOException {
        m2367F(11);
        m2363B(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f6071f;
        this.f6071f = i2 + 1;
        this.f6069d[i2] = b;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: k */
    public final void mo2346k(int i, ByteString byteString) throws IOException {
        mo2356u(i, 2);
        mo2358w(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        mo2353r(literalByteString.f6042d, literalByteString.mo2265j(), literalByteString.size());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: l */
    public final void mo2347l(int i, int i2) throws IOException {
        m2367F(14);
        m2363B(i, 5);
        m2369z(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: m */
    public final void mo2348m(int i) throws IOException {
        m2367F(4);
        m2369z(i);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: n */
    public final void mo2349n(int i, long j) throws IOException {
        m2367F(18);
        m2363B(i, 1);
        m2362A(j);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: o */
    public final void mo2350o(long j) throws IOException {
        m2367F(8);
        m2362A(j);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: p */
    public final void mo2351p(int i, int i2) throws IOException {
        m2367F(20);
        m2363B(i, 0);
        if (i2 >= 0) {
            m2364C(i2);
        } else {
            m2365D(i2);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: q */
    public final void mo2352q(int i) throws IOException {
        if (i >= 0) {
            mo2358w(i);
        } else {
            mo2360y(i);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: r */
    public final void mo2353r(byte[] bArr, int i, int i2) throws IOException {
        m2368G(bArr, i, i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: s */
    public final void mo2354s(int i, AbstractC0667a abstractC0667a, ym8 ym8Var) throws IOException {
        mo2356u(i, 2);
        mo2358w(abstractC0667a.mo2278b(ym8Var));
        ym8Var.mo2418d(abstractC0667a, this.f6075a);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: t */
    public final void mo2355t(int i, String str) throws IOException {
        mo2356u(i, 2);
        try {
            int length = str.length() * 3;
            int iM2375f = AbstractC0673g.m2375f(length);
            int i2 = iM2375f + length;
            int i3 = this.f6070e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iM2478c = AbstractC0684r.f6107a.m2478c(str, bArr, 0, length);
                mo2358w(iM2478c);
                m2368G(bArr, 0, iM2478c);
                return;
            }
            if (i2 > i3 - this.f6071f) {
                m2366E();
            }
            int iM2375f2 = AbstractC0673g.m2375f(str.length());
            int i4 = this.f6071f;
            byte[] bArr2 = this.f6069d;
            try {
                if (iM2375f2 != iM2375f) {
                    int iM2481b = AbstractC0684r.m2481b(str);
                    m2364C(iM2481b);
                    this.f6071f = AbstractC0684r.f6107a.m2478c(str, bArr2, this.f6071f, iM2481b);
                    return;
                }
                int i5 = i4 + iM2375f2;
                this.f6071f = i5;
                int iM2478c2 = AbstractC0684r.f6107a.m2478c(str, bArr2, i5, i3 - i5);
                this.f6071f = i4;
                m2364C((iM2478c2 - i4) - iM2375f2);
                this.f6071f = iM2478c2;
            } catch (Utf8$UnpairedSurrogateException e) {
                this.f6071f = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            m2377h(str, e3);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: u */
    public final void mo2356u(int i, int i2) throws IOException {
        mo2358w((i << 3) | i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: v */
    public final void mo2357v(int i, int i2) throws IOException {
        m2367F(20);
        m2363B(i, 0);
        m2364C(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: w */
    public final void mo2358w(int i) throws IOException {
        m2367F(5);
        m2364C(i);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: x */
    public final void mo2359x(int i, long j) throws IOException {
        m2367F(20);
        m2363B(i, 0);
        m2365D(j);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: y */
    public final void mo2360y(long j) throws IOException {
        m2367F(10);
        m2365D(j);
    }

    /* JADX INFO: renamed from: z */
    public final void m2369z(int i) {
        int i2 = this.f6071f;
        int i3 = i2 + 1;
        this.f6071f = i3;
        byte[] bArr = this.f6069d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f6071f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f6071f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f6071f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }
}
