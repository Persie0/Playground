package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lea extends uj7 {

    /* JADX INFO: renamed from: a */
    public int[] f49563a;

    /* JADX INFO: renamed from: b */
    public int f49564b;

    public lea(int[] iArr) {
        this.f49563a = iArr;
        this.f49564b = iArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return new kea(Arrays.copyOf(this.f49563a, this.f49564b));
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        int[] iArr = this.f49563a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f49563a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f49564b;
    }

    /* JADX INFO: renamed from: e */
    public final void m16151e(int i) {
        mo4383b(mo4384d() + 1);
        int[] iArr = this.f49563a;
        int i2 = this.f49564b;
        this.f49564b = i2 + 1;
        iArr[i2] = i;
    }
}
