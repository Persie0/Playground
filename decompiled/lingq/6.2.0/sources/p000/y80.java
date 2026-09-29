package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y80 extends a90 {

    /* JADX INFO: renamed from: f */
    public final char[] f69456f;

    public y80(x80 x80Var) {
        super(x80Var, (Character) null);
        this.f69456f = new char[512];
        char[] cArr = x80Var.f67913b;
        bna.m3969q(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f69456f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: c */
    public final void mo185c(StringBuilder sb, byte[] bArr, int i) {
        bna.m3983x(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f69456f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
