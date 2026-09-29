package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ek5 extends uj7 {

    /* JADX INFO: renamed from: a */
    public long[] f37383a;

    /* JADX INFO: renamed from: b */
    public int f37384b;

    public ek5(long[] jArr) {
        jArr.getClass();
        this.f37383a = jArr;
        this.f37384b = jArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f37383a, this.f37384b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        long[] jArr = this.f37383a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f37383a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f37384b;
    }

    /* JADX INFO: renamed from: e */
    public final void m11212e(long j) {
        mo4383b(mo4384d() + 1);
        long[] jArr = this.f37383a;
        int i = this.f37384b;
        this.f37384b = i + 1;
        jArr[i] = j;
    }
}
