package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e76 {

    /* JADX INFO: renamed from: a */
    public final int f36811a;

    /* JADX INFO: renamed from: b */
    public boolean f36812b;

    /* JADX INFO: renamed from: c */
    public boolean f36813c;

    /* JADX INFO: renamed from: d */
    public byte[] f36814d;

    /* JADX INFO: renamed from: e */
    public int f36815e;

    public e76(int i) {
        this.f36811a = i;
        byte[] bArr = new byte[131];
        this.f36814d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m10906a(byte[] bArr, int i, int i2) {
        if (this.f36812b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f36814d;
            int length = bArr2.length;
            int i4 = this.f36815e + i3;
            if (length < i4) {
                this.f36814d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f36814d, this.f36815e, i3);
            this.f36815e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10907b(int i) {
        if (!this.f36812b) {
            return false;
        }
        this.f36815e -= i;
        this.f36812b = false;
        this.f36813c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m10908c() {
        this.f36812b = false;
        this.f36813c = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m10909d(int i) {
        bna.m3987z(!this.f36812b);
        boolean z = i == this.f36811a;
        this.f36812b = z;
        if (z) {
            this.f36815e = 3;
            this.f36813c = false;
        }
    }
}
