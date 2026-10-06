package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nwq extends nwp {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    protected final byte[] f44838a;

    public nwq(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.f44838a = bArr;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: a */
    public byte mo17780a(int i) {
        return this.f44838a[i];
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: b */
    public byte mo17781b(int i) {
        return this.f44838a[i];
    }

    /* JADX INFO: renamed from: c */
    protected int mo17782c() {
        return 0;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: d */
    public int mo17783d() {
        return this.f44838a.length;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: e */
    protected void mo17784e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f44838a, i, bArr, i2, i3);
    }

    @Override // p000.nwr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nwr) || mo17783d() != ((nwr) obj).mo17783d()) {
            return false;
        }
        if (mo17783d() == 0) {
            return true;
        }
        if (!(obj instanceof nwq)) {
            return obj.equals(this);
        }
        nwq nwqVar = (nwq) obj;
        int i = this.f44840c;
        int i2 = nwqVar.f44840c;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo17786g(nwqVar, 0, mo17783d());
        }
        return false;
    }

    @Override // p000.nwp
    /* JADX INFO: renamed from: g */
    public final boolean mo17786g(nwr nwrVar, int i, int i2) {
        if (i2 > nwrVar.mo17783d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + mo17783d());
        }
        int i3 = i + i2;
        if (i3 > nwrVar.mo17783d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + nwrVar.mo17783d());
        }
        if (!(nwrVar instanceof nwq)) {
            return nwrVar.mo17790k(i, i3).equals(mo17790k(0, i2));
        }
        nwq nwqVar = (nwq) nwrVar;
        byte[] bArr = this.f44838a;
        byte[] bArr2 = nwqVar.f44838a;
        int iMo17782c = mo17782c() + i2;
        int iMo17782c2 = mo17782c();
        int iMo17782c3 = nwqVar.mo17782c() + i;
        while (iMo17782c2 < iMo17782c) {
            if (bArr[iMo17782c2] != bArr2[iMo17782c3]) {
                return false;
            }
            iMo17782c2++;
            iMo17782c3++;
        }
        return true;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: i */
    protected final int mo17788i(int i, int i2, int i3) {
        return nxz.m18154c(i, this.f44838a, mo17782c() + i2, i3);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: j */
    protected final int mo17789j(int i, int i2, int i3) {
        int iMo17782c = mo17782c() + i2;
        byte[] bArr = this.f44838a;
        lij lijVar = oai.f45130a;
        return lij.m15411T(i, bArr, iMo17782c, i3 + iMo17782c);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: k */
    public final nwr mo17790k(int i, int i2) {
        int iQ = m17796q(i, i2, mo17783d());
        return iQ == 0 ? nwr.f44839b : new nwn(this.f44838a, mo17782c() + i, iQ);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: l */
    public final nww mo17791l() {
        return nww.m17879L(this.f44838a, mo17782c(), mo17783d());
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: m */
    protected final String mo17792m(Charset charset) {
        return new String(this.f44838a, mo17782c(), mo17783d(), charset);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo17793n() {
        return ByteBuffer.wrap(this.f44838a, mo17782c(), mo17783d()).asReadOnlyBuffer();
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: o */
    public final void mo17794o(nwk nwkVar) {
        nwkVar.mo17778a(this.f44838a, mo17782c(), mo17783d());
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: p */
    public final boolean mo17795p() {
        int iMo17782c = mo17782c();
        return oai.m18385g(this.f44838a, iMo17782c, mo17783d() + iMo17782c);
    }
}
