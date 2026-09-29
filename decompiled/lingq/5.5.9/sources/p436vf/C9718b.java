package p436vf;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: vf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9718b {

    /* JADX INFO: renamed from: a */
    public final byte[][] f49725a;

    /* JADX INFO: renamed from: b */
    public final int f49726b;

    /* JADX INFO: renamed from: c */
    public final int f49727c;

    public C9718b(int i10, int i11) {
        this.f49725a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f49726b = i10;
        this.f49727c = i11;
    }

    /* JADX INFO: renamed from: a */
    public final byte m18220a(int i10, int i11) {
        return this.f49725a[i11][i10];
    }

    /* JADX INFO: renamed from: b */
    public final void m18221b(int i10, int i11, int i12) {
        this.f49725a[i11][i10] = (byte) i12;
    }

    /* JADX INFO: renamed from: c */
    public final void m18222c(int i10, int i11, boolean z10) {
        this.f49725a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i10 = this.f49726b;
        int i11 = this.f49727c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f49725a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
