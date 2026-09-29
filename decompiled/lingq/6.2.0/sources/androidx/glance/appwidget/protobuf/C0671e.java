package androidx.glance.appwidget.protobuf;

import p000.aha;
import p000.uk9;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0671e extends AbstractC0673g {

    /* JADX INFO: renamed from: d */
    public final byte[] f6066d;

    /* JADX INFO: renamed from: e */
    public final int f6067e;

    /* JADX INFO: renamed from: f */
    public int f6068f;

    public C0671e(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            uk9.m22783r("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.f6066d = bArr;
        this.f6068f = 0;
        this.f6067e = i;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: i */
    public final void mo2344i(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6066d;
            int i = this.f6068f;
            this.f6068f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: j */
    public final void mo2345j(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 0);
        mo2344i(z ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: k */
    public final void mo2346k(int i, ByteString byteString) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 2);
        mo2358w(byteString.size());
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        mo2353r(literalByteString.f6042d, literalByteString.mo2265j(), literalByteString.size());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: l */
    public final void mo2347l(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 5);
        mo2348m(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: m */
    public final void mo2348m(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6066d;
            int i2 = this.f6068f;
            int i3 = i2 + 1;
            this.f6068f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f6068f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f6068f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f6068f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: n */
    public final void mo2349n(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 1);
        mo2350o(j);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: o */
    public final void mo2350o(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6066d;
            int i = this.f6068f;
            int i2 = i + 1;
            this.f6068f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f6068f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f6068f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f6068f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f6068f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f6068f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f6068f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f6068f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: p */
    public final void mo2351p(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 0);
        mo2352q(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: q */
    public final void mo2352q(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            mo2358w(i);
        } else {
            mo2360y(i);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: r */
    public final void mo2353r(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f6066d, this.f6068f, i2);
            this.f6068f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), Integer.valueOf(i2)), e);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: s */
    public final void mo2354s(int i, AbstractC0667a abstractC0667a, ym8 ym8Var) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 2);
        mo2358w(abstractC0667a.mo2278b(ym8Var));
        ym8Var.mo2418d(abstractC0667a, this.f6075a);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: t */
    public final void mo2355t(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 2);
        int i2 = this.f6068f;
        try {
            int iM2375f = AbstractC0673g.m2375f(str.length() * 3);
            int iM2375f2 = AbstractC0673g.m2375f(str.length());
            byte[] bArr = this.f6066d;
            if (iM2375f2 != iM2375f) {
                mo2358w(AbstractC0684r.m2481b(str));
                this.f6068f = AbstractC0684r.f6107a.m2478c(str, bArr, this.f6068f, m2361z());
                return;
            }
            int i3 = i2 + iM2375f2;
            this.f6068f = i3;
            int iM2478c = AbstractC0684r.f6107a.m2478c(str, bArr, i3, m2361z());
            this.f6068f = i2;
            mo2358w((iM2478c - i2) - iM2375f2);
            this.f6068f = iM2478c;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.f6068f = i2;
            m2377h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: u */
    public final void mo2356u(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo2358w((i << 3) | i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: v */
    public final void mo2357v(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 0);
        mo2358w(i2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: w */
    public final void mo2358w(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f6068f;
            byte[] bArr = this.f6066d;
            if (i2 == 0) {
                this.f6068f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f6068f = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: x */
    public final void mo2359x(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        mo2356u(i, 0);
        mo2360y(j);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0673g
    /* JADX INFO: renamed from: y */
    public final void mo2360y(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = AbstractC0673g.f6074c;
        byte[] bArr = this.f6066d;
        if (!z || m2361z() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f6068f;
                if (j2 == 0) {
                    this.f6068f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.f6068f = i + 1;
                        bArr[i] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6068f), Integer.valueOf(this.f6067e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.f6068f;
            if (j3 == 0) {
                this.f6068f = i2 + 1;
                aha.m415k(bArr, i2, (byte) j);
                return;
            } else {
                this.f6068f = i2 + 1;
                aha.m415k(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m2361z() {
        return this.f6067e - this.f6068f;
    }
}
