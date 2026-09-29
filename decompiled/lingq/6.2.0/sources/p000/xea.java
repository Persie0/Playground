package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xea extends uj7 {

    /* JADX INFO: renamed from: a */
    public short[] f68141a;

    /* JADX INFO: renamed from: b */
    public int f68142b;

    public xea(short[] sArr) {
        this.f68141a = sArr;
        this.f68142b = sArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return new wea(Arrays.copyOf(this.f68141a, this.f68142b));
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        short[] sArr = this.f68141a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f68141a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f68142b;
    }

    /* JADX INFO: renamed from: e */
    public final void m24479e(short s) {
        mo4383b(mo4384d() + 1);
        short[] sArr = this.f68141a;
        int i = this.f68142b;
        this.f68142b = i + 1;
        sArr[i] = s;
    }
}
