package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gea extends uj7 {

    /* JADX INFO: renamed from: a */
    public byte[] f40638a;

    /* JADX INFO: renamed from: b */
    public int f40639b;

    public gea(byte[] bArr) {
        this.f40638a = bArr;
        this.f40639b = bArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return new fea(Arrays.copyOf(this.f40638a, this.f40639b));
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        byte[] bArr = this.f40638a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f40638a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f40639b;
    }

    /* JADX INFO: renamed from: e */
    public final void m12516e(byte b) {
        mo4383b(mo4384d() + 1);
        byte[] bArr = this.f40638a;
        int i = this.f40639b;
        this.f40639b = i + 1;
        bArr[i] = b;
    }
}
