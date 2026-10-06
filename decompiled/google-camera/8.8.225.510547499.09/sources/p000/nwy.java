package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwy extends nxb {

    /* JADX INFO: renamed from: a */
    final byte[] f44884a;

    /* JADX INFO: renamed from: b */
    final int f44885b;

    /* JADX INFO: renamed from: c */
    int f44886c;

    /* JADX INFO: renamed from: d */
    int f44887d;

    /* JADX INFO: renamed from: g */
    private final OutputStream f44888g;

    public nwy(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f44884a = bArr;
        this.f44885b = bArr.length;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f44888g = outputStream;
    }

    /* JADX INFO: renamed from: aA */
    private final void m17927aA() throws IOException {
        this.f44888g.write(this.f44884a, 0, this.f44886c);
        this.f44886c = 0;
    }

    /* JADX INFO: renamed from: aB */
    private final void m17928aB(int i) throws IOException {
        if (this.f44885b - this.f44886c < i) {
            m17927aA();
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: A */
    public final void mo17929A(int i, int i2) throws IOException {
        mo17931C(oal.m18388c(i, i2));
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: B */
    public final void mo17930B(int i, int i2) throws IOException {
        m17928aB(20);
        m17939f(i, 0);
        m17940g(i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: C */
    public final void mo17931C(int i) throws IOException {
        m17928aB(5);
        m17940g(i);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: D */
    public final void mo17932D(int i, long j) throws IOException {
        m17928aB(20);
        m17939f(i, 0);
        m17941h(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: E */
    public final void mo17933E(long j) throws IOException {
        m17928aB(10);
        m17941h(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: F */
    public final void mo17934F(byte[] bArr, int i) throws IOException {
        mo17931C(i);
        m17944k(bArr, 0, i);
    }

    @Override // p000.nxb, p000.nwk
    /* JADX INFO: renamed from: a */
    public final void mo17778a(byte[] bArr, int i, int i2) throws IOException {
        m17944k(bArr, i, i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: b */
    public final int mo17935b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: renamed from: c */
    final void m17936c(byte b) {
        byte[] bArr = this.f44884a;
        int i = this.f44886c;
        this.f44886c = i + 1;
        bArr[i] = b;
        this.f44887d++;
    }

    /* JADX INFO: renamed from: d */
    final void m17937d(int i) {
        byte[] bArr = this.f44884a;
        int i2 = this.f44886c;
        int i3 = i2 + 1;
        this.f44886c = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f44886c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f44886c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f44886c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f44887d += 4;
    }

    /* JADX INFO: renamed from: e */
    final void m17938e(long j) {
        byte[] bArr = this.f44884a;
        int i = this.f44886c;
        int i2 = i + 1;
        this.f44886c = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.f44886c = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.f44886c = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.f44886c = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.f44886c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f44886c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f44886c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f44886c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f44887d += 8;
    }

    /* JADX INFO: renamed from: f */
    final void m17939f(int i, int i2) {
        m17940g(oal.m18388c(i, i2));
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: i */
    public final void mo17942i() throws IOException {
        if (this.f44886c > 0) {
            m17927aA();
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: j */
    public final void mo17943j(byte b) throws IOException {
        if (this.f44886c == this.f44885b) {
            m17927aA();
        }
        m17936c(b);
    }

    /* JADX INFO: renamed from: k */
    public final void m17944k(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f44885b;
        int i4 = this.f44886c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f44884a, i4, i2);
            this.f44886c += i2;
            this.f44887d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f44884a, i4, i5);
        int i6 = i + i5;
        this.f44886c = this.f44885b;
        this.f44887d += i5;
        m17927aA();
        int i7 = i2 - i5;
        if (i7 <= this.f44885b) {
            System.arraycopy(bArr, i6, this.f44884a, 0, i7);
            this.f44886c = i7;
        } else {
            this.f44888g.write(bArr, i6, i7);
        }
        this.f44887d += i7;
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: l */
    public final void mo17945l(int i, boolean z) throws IOException {
        m17928aB(11);
        m17939f(i, 0);
        m17936c(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: m */
    public final void mo17946m(int i, nwr nwrVar) throws IOException {
        mo17929A(i, 2);
        mo17947n(nwrVar);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: n */
    public final void mo17947n(nwr nwrVar) throws IOException {
        mo17931C(nwrVar.mo17783d());
        nwrVar.mo17794o(this);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: o */
    public final void mo17948o(int i, int i2) throws IOException {
        m17928aB(14);
        m17939f(i, 5);
        m17937d(i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: p */
    public final void mo17949p(int i) throws IOException {
        m17928aB(4);
        m17937d(i);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: q */
    public final void mo17950q(int i, long j) throws IOException {
        m17928aB(18);
        m17939f(i, 1);
        m17938e(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: r */
    public final void mo17951r(long j) throws IOException {
        m17928aB(8);
        m17938e(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: s */
    public final void mo17952s(int i, int i2) throws IOException {
        m17928aB(20);
        m17939f(i, 0);
        if (i2 >= 0) {
            m17940g(i2);
        } else {
            m17941h(i2);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: t */
    public final void mo17953t(int i) throws IOException {
        if (i >= 0) {
            mo17931C(i);
        } else {
            mo17933E(i);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: u */
    public final void mo17954u(int i, nyw nywVar, nzm nzmVar) throws IOException {
        mo17929A(i, 2);
        mo17931C(((nwc) nywVar).mo17757G(nzmVar));
        nzmVar.mo18256l(nywVar, this.f44894f);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: v */
    public final void mo17955v(nyw nywVar) throws IOException {
        mo17931C(nywVar.mo18136N());
        nywVar.mo17764cy(this);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: w */
    public final void mo17956w(int i, nyw nywVar) throws IOException {
        mo17929A(1, 3);
        mo17930B(2, i);
        mo17929A(3, 2);
        mo17955v(nywVar);
        mo17929A(1, 4);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: x */
    public final void mo17957x(int i, nwr nwrVar) throws IOException {
        mo17929A(1, 3);
        mo17930B(2, i);
        mo17946m(3, nwrVar);
        mo17929A(1, 4);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: y */
    public final void mo17958y(int i, String str) throws IOException {
        mo17929A(i, 2);
        mo17959z(str);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: z */
    public final void mo17959z(String str) throws IOException {
        int iM18380b;
        try {
            int length = str.length() * 3;
            int iAb = m17983ab(length);
            int i = iAb + length;
            int i2 = this.f44885b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM18379a = oai.m18379a(str, bArr, 0, length);
                mo17931C(iM18379a);
                m17944k(bArr, 0, iM18379a);
                return;
            }
            if (i > i2 - this.f44886c) {
                m17927aA();
            }
            int iAb2 = m17983ab(str.length());
            int i3 = this.f44886c;
            try {
                if (iAb2 == iAb) {
                    int i4 = i3 + iAb2;
                    this.f44886c = i4;
                    int iM18379a2 = oai.m18379a(str, this.f44884a, i4, this.f44885b - i4);
                    this.f44886c = i3;
                    iM18380b = (iM18379a2 - i3) - iAb2;
                    m17940g(iM18380b);
                    this.f44886c = iM18379a2;
                } else {
                    iM18380b = oai.m18380b(str);
                    m17940g(iM18380b);
                    this.f44886c = oai.m18379a(str, this.f44884a, this.f44886c, iM18380b);
                }
                this.f44887d += iM18380b;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new nxa(e);
            } catch (oah e2) {
                this.f44887d -= this.f44886c - i3;
                this.f44886c = i3;
                throw e2;
            }
        } catch (oah e3) {
            m17998aj(str, e3);
        }
    }

    /* JADX INFO: renamed from: g */
    final void m17940g(int i) {
        if (!nxb.f44893e) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f44884a;
                int i2 = this.f44886c;
                this.f44886c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.f44887d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.f44884a;
            int i3 = this.f44886c;
            this.f44886c = i3 + 1;
            bArr2[i3] = (byte) i;
            this.f44887d++;
            return;
        }
        long j = this.f44886c;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f44884a;
            int i4 = this.f44886c;
            this.f44886c = i4 + 1;
            oag.m18366n(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.f44884a;
        int i5 = this.f44886c;
        this.f44886c = i5 + 1;
        oag.m18366n(bArr4, i5, (byte) i);
        this.f44887d += (int) (((long) this.f44886c) - j);
    }

    /* JADX INFO: renamed from: h */
    final void m17941h(long j) {
        if (!nxb.f44893e) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f44884a;
                int i = this.f44886c;
                this.f44886c = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.f44887d++;
                j >>>= 7;
            }
            byte[] bArr2 = this.f44884a;
            int i2 = this.f44886c;
            this.f44886c = i2 + 1;
            bArr2[i2] = (byte) j;
            this.f44887d++;
            return;
        }
        long j2 = this.f44886c;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f44884a;
            int i3 = this.f44886c;
            this.f44886c = i3 + 1;
            oag.m18366n(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f44884a;
        int i4 = this.f44886c;
        this.f44886c = i4 + 1;
        oag.m18366n(bArr4, i4, (byte) j);
        this.f44887d += (int) (((long) this.f44886c) - j2);
    }
}
