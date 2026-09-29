package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z80 extends a90 {
    public z80(String str, String str2) {
        x80 x80Var = new x80(str, str2.toCharArray());
        super(x80Var, (Character) '=');
        bna.m3969q(x80Var.f67913b.length == 64);
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: c */
    public final void mo185c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        bna.m3983x(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            x80 x80Var = this.f373a;
            char[] cArr = x80Var.f67913b;
            char[] cArr2 = x80Var.f67913b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m184b(i2, i - i2, sb, bArr);
        }
    }
}
