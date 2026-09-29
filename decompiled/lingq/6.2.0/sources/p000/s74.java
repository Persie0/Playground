package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s74 extends uj7 {

    /* JADX INFO: renamed from: a */
    public int[] f60462a;

    /* JADX INFO: renamed from: b */
    public int f60463b;

    public s74(int[] iArr) {
        iArr.getClass();
        this.f60462a = iArr;
        this.f60463b = iArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f60462a, this.f60463b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        int[] iArr = this.f60462a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f60462a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f60463b;
    }

    /* JADX INFO: renamed from: e */
    public final void m21134e(int i) {
        mo4383b(mo4384d() + 1);
        int[] iArr = this.f60462a;
        int i2 = this.f60463b;
        this.f60463b = i2 + 1;
        iArr[i2] = i;
    }
}
