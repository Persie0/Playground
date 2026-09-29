package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g69 extends uj7 {

    /* JADX INFO: renamed from: a */
    public short[] f40277a;

    /* JADX INFO: renamed from: b */
    public int f40278b;

    public g69(short[] sArr) {
        sArr.getClass();
        this.f40277a = sArr;
        this.f40278b = sArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f40277a, this.f40278b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        short[] sArr = this.f40277a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f40277a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f40278b;
    }

    /* JADX INFO: renamed from: e */
    public final void m12385e(short s) {
        mo4383b(mo4384d() + 1);
        short[] sArr = this.f40277a;
        int i = this.f40278b;
        this.f40278b = i + 1;
        sArr[i] = s;
    }
}
