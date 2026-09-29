package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class p79 extends b2a {

    /* JADX INFO: renamed from: c */
    public final short f55702c;

    /* JADX INFO: renamed from: d */
    public final short f55703d;

    public p79(b2a b2aVar, int i, int i2) {
        super(b2aVar);
        this.f55702c = (short) i;
        this.f55703d = (short) i2;
    }

    @Override // p000.b2a
    /* JADX INFO: renamed from: a */
    public final void mo3196a(zc0 zc0Var, byte[] bArr) {
        zc0Var.m25545b(this.f55702c, this.f55703d);
    }

    public final String toString() {
        short s = this.f55703d;
        return "<" + Integer.toBinaryString((this.f55702c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
