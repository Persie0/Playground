package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kse implements ksg {

    /* JADX INFO: renamed from: a */
    private final byte[] f37111a;

    /* JADX INFO: renamed from: b */
    private int f37112b = 0;

    public kse(byte[] bArr) {
        this.f37111a = bArr;
    }

    /* JADX INFO: renamed from: e */
    private final int m14790e() {
        return this.f37111a.length - this.f37112b;
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: a */
    public final int mo14791a() {
        int i = this.f37112b;
        byte[] bArr = this.f37111a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f37112b = i + 1;
        return bArr[i] & 255;
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: b */
    public final void mo14792b(int i) {
        this.f37112b += Math.min(i, m14790e());
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: c */
    public final mom mo14793c(int i, int i2) {
        int iMin = Math.min(i, m14790e());
        mom momVar = new mom(this.f37111a, i2, this.f37112b, iMin);
        this.f37112b += iMin;
        return momVar;
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: d */
    public final mom mo14794d() {
        return mo14793c(this.f37111a.length - this.f37112b, 218);
    }
}
