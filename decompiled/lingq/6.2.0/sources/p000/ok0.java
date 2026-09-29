package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ok0 extends uj7 {

    /* JADX INFO: renamed from: a */
    public byte[] f54488a;

    /* JADX INFO: renamed from: b */
    public int f54489b;

    public ok0(byte[] bArr) {
        bArr.getClass();
        this.f54488a = bArr;
        this.f54489b = bArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f54488a, this.f54489b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        byte[] bArr = this.f54488a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f54488a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f54489b;
    }

    /* JADX INFO: renamed from: e */
    public final void m18054e(byte b) {
        mo4383b(mo4384d() + 1);
        byte[] bArr = this.f54488a;
        int i = this.f54489b;
        this.f54489b = i + 1;
        bArr[i] = b;
    }
}
