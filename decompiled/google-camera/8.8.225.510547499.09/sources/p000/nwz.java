package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwz extends nxb {

    /* JADX INFO: renamed from: a */
    private final byte[] f44889a;

    /* JADX INFO: renamed from: b */
    private final int f44890b;

    /* JADX INFO: renamed from: c */
    private int f44891c;

    public nwz(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f44889a = bArr;
        this.f44891c = 0;
        this.f44890b = i;
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: A */
    public final void mo17929A(int i, int i2) throws nxa {
        mo17931C(oal.m18388c(i, i2));
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: B */
    public final void mo17930B(int i, int i2) throws nxa {
        mo17929A(i, 0);
        mo17931C(i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: D */
    public final void mo17932D(int i, long j) throws nxa {
        mo17929A(i, 0);
        mo17933E(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: F */
    public final void mo17934F(byte[] bArr, int i) throws nxa {
        mo17931C(i);
        m17960c(bArr, 0, i);
    }

    @Override // p000.nxb, p000.nwk
    /* JADX INFO: renamed from: a */
    public final void mo17778a(byte[] bArr, int i, int i2) throws nxa {
        m17960c(bArr, i, i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: b */
    public final int mo17935b() {
        return this.f44890b - this.f44891c;
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: i */
    public final void mo17942i() {
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: l */
    public final void mo17945l(int i, boolean z) throws nxa {
        mo17929A(i, 0);
        mo17943j(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: m */
    public final void mo17946m(int i, nwr nwrVar) throws nxa {
        mo17929A(i, 2);
        mo17947n(nwrVar);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: n */
    public final void mo17947n(nwr nwrVar) throws nxa {
        mo17931C(nwrVar.mo17783d());
        nwrVar.mo17794o(this);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: o */
    public final void mo17948o(int i, int i2) throws nxa {
        mo17929A(i, 5);
        mo17949p(i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: p */
    public final void mo17949p(int i) throws nxa {
        try {
            byte[] bArr = this.f44889a;
            int i2 = this.f44891c;
            int i3 = i2 + 1;
            this.f44891c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f44891c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f44891c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f44891c = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), 1), e);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: q */
    public final void mo17950q(int i, long j) throws nxa {
        mo17929A(i, 1);
        mo17951r(j);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: r */
    public final void mo17951r(long j) throws nxa {
        try {
            byte[] bArr = this.f44889a;
            int i = this.f44891c;
            int i2 = i + 1;
            this.f44891c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f44891c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f44891c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f44891c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f44891c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f44891c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f44891c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f44891c = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), 1), e);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: s */
    public final void mo17952s(int i, int i2) throws nxa {
        mo17929A(i, 0);
        mo17953t(i2);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: t */
    public final void mo17953t(int i) throws nxa {
        if (i >= 0) {
            mo17931C(i);
        } else {
            mo17933E(i);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: u */
    public final void mo17954u(int i, nyw nywVar, nzm nzmVar) throws nxa {
        mo17929A(i, 2);
        mo17931C(((nwc) nywVar).mo17757G(nzmVar));
        nzmVar.mo18256l(nywVar, this.f44894f);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: v */
    public final void mo17955v(nyw nywVar) throws nxa {
        mo17931C(nywVar.mo18136N());
        nywVar.mo17764cy(this);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: w */
    public final void mo17956w(int i, nyw nywVar) throws nxa {
        mo17929A(1, 3);
        mo17930B(2, i);
        mo17929A(3, 2);
        mo17955v(nywVar);
        mo17929A(1, 4);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: x */
    public final void mo17957x(int i, nwr nwrVar) throws nxa {
        mo17929A(1, 3);
        mo17930B(2, i);
        mo17946m(3, nwrVar);
        mo17929A(1, 4);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: y */
    public final void mo17958y(int i, String str) throws nxa {
        mo17929A(i, 2);
        mo17959z(str);
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: z */
    public final void mo17959z(String str) throws nxa {
        int i = this.f44891c;
        try {
            int iAb = m17983ab(str.length() * 3);
            int iAb2 = m17983ab(str.length());
            if (iAb2 != iAb) {
                mo17931C(oai.m18380b(str));
                this.f44891c = oai.m18379a(str, this.f44889a, this.f44891c, mo17935b());
                return;
            }
            int i2 = i + iAb2;
            this.f44891c = i2;
            int iM18379a = oai.m18379a(str, this.f44889a, i2, mo17935b());
            this.f44891c = i;
            mo17931C((iM18379a - i) - iAb2);
            this.f44891c = iM18379a;
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(e);
        } catch (oah e2) {
            this.f44891c = i;
            m17998aj(str, e2);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: C */
    public final void mo17931C(int i) throws nxa {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f44889a;
                int i2 = this.f44891c;
                this.f44891c = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), 1), e);
            }
        }
        byte[] bArr2 = this.f44889a;
        int i3 = this.f44891c;
        this.f44891c = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    /* JADX INFO: renamed from: c */
    public final void m17960c(byte[] bArr, int i, int i2) throws nxa {
        try {
            System.arraycopy(bArr, i, this.f44889a, this.f44891c, i2);
            this.f44891c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: j */
    public final void mo17943j(byte b) throws nxa {
        try {
            byte[] bArr = this.f44889a;
            int i = this.f44891c;
            this.f44891c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), 1), e);
        }
    }

    @Override // p000.nxb
    /* JADX INFO: renamed from: E */
    public final void mo17933E(long j) throws nxa {
        if (nxb.f44893e && mo17935b() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f44889a;
                int i = this.f44891c;
                this.f44891c = i + 1;
                oag.m18366n(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f44889a;
            int i2 = this.f44891c;
            this.f44891c = i2 + 1;
            oag.m18366n(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f44889a;
                int i3 = this.f44891c;
                this.f44891c = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f44891c), Integer.valueOf(this.f44890b), 1), e);
            }
        }
        byte[] bArr4 = this.f44889a;
        int i4 = this.f44891c;
        this.f44891c = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
