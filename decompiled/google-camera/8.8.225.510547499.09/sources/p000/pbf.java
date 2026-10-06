package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbf extends pax {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f47324e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f47325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbf(byte[][] bArr, int[] iArr) {
        super(pax.f47300a.f47301b);
        bArr.getClass();
        iArr.getClass();
        this.f47324e = bArr;
        this.f47325f = iArr;
    }

    /* JADX INFO: renamed from: i */
    private final pax m19294i() {
        return new pax(m19295h());
    }

    private final Object writeReplace() {
        return m19294i();
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: a */
    public final byte mo19279a(int i) {
        lku.m15624S(this.f47325f[this.f47324e.length - 1], i, 1L);
        int iM15703w = lle.m15703w(this, i);
        int i2 = iM15703w == 0 ? 0 : this.f47325f[iM15703w - 1];
        int[] iArr = this.f47325f;
        byte[][] bArr = this.f47324e;
        return bArr[iM15703w][(i - i2) + iArr[bArr.length + iM15703w]];
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: b */
    public final int mo19280b() {
        return this.f47325f[this.f47324e.length - 1];
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: c */
    public final String mo19281c() {
        return m19294i().mo19281c();
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: e */
    public final boolean mo19282e(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > mo19280b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iM15703w = lle.m15703w(this, i);
        while (i < i5) {
            if (iM15703w == 0) {
                iM15703w = 0;
                i4 = 0;
            } else {
                i4 = this.f47325f[iM15703w - 1];
            }
            int[] iArr = this.f47325f;
            int i6 = iArr[iM15703w] - i4;
            int i7 = iArr[this.f47324e.length + iM15703w];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!lku.m15625T(this.f47324e[iM15703w], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM15703w++;
        }
        return true;
    }

    @Override // p000.pax
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pax) {
            pax paxVar = (pax) obj;
            if (paxVar.mo19280b() == mo19280b() && mo19284g(paxVar, mo19280b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: f */
    public final byte[] mo19283f() {
        return m19295h();
    }

    @Override // p000.pax
    /* JADX INFO: renamed from: g */
    public final boolean mo19284g(pax paxVar, int i) {
        int i2;
        paxVar.getClass();
        if (mo19280b() - i < 0) {
            return false;
        }
        int iM15703w = lle.m15703w(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iM15703w == 0) {
                iM15703w = 0;
                i2 = 0;
            } else {
                i2 = this.f47325f[iM15703w - 1];
            }
            int[] iArr = this.f47325f;
            int i5 = iArr[iM15703w] - i2;
            int i6 = iArr[this.f47324e.length + iM15703w];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!paxVar.mo19282e(i4, this.f47324e[iM15703w], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iM15703w++;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m19295h() {
        byte[] bArr = new byte[mo19280b()];
        int length = this.f47324e.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f47325f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            omn.m18691ae(this.f47324e[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.pax
    public final int hashCode() {
        int i = this.f47302c;
        if (i != 0) {
            return i;
        }
        int length = this.f47324e.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f47325f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f47324e[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f47302c = i3;
        return i3;
    }

    @Override // p000.pax
    public final String toString() {
        return m19294i().toString();
    }
}
