package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lq3 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f50000f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f50001a;

    /* JADX INFO: renamed from: b */
    public int f50002b;

    /* JADX INFO: renamed from: c */
    public int f50003c;

    /* JADX INFO: renamed from: d */
    public int f50004d;

    /* JADX INFO: renamed from: e */
    public byte[] f50005e;

    /* JADX INFO: renamed from: a */
    public final void m16465a(byte[] bArr, int i, int i2) {
        if (this.f50001a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f50005e;
            int length = bArr2.length;
            int i4 = this.f50003c + i3;
            if (length < i4) {
                this.f50005e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f50005e, this.f50003c, i3);
            this.f50003c += i3;
        }
    }
}
