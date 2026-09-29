package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jq3 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f45998e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f45999a;

    /* JADX INFO: renamed from: b */
    public int f46000b;

    /* JADX INFO: renamed from: c */
    public int f46001c;

    /* JADX INFO: renamed from: d */
    public byte[] f46002d;

    /* JADX INFO: renamed from: a */
    public final void m14616a(byte[] bArr, int i, int i2) {
        if (this.f45999a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f46002d;
            int length = bArr2.length;
            int i4 = this.f46000b + i3;
            if (length < i4) {
                this.f46002d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f46002d, this.f46000b, i3);
            this.f46000b += i3;
        }
    }
}
