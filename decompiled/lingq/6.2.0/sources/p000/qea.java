package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class qea extends uj7 {

    /* JADX INFO: renamed from: a */
    public long[] f57661a;

    /* JADX INFO: renamed from: b */
    public int f57662b;

    public qea(long[] jArr) {
        this.f57661a = jArr;
        this.f57662b = jArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return new pea(Arrays.copyOf(this.f57661a, this.f57662b));
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        long[] jArr = this.f57661a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f57661a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f57662b;
    }

    /* JADX INFO: renamed from: e */
    public final void m19902e(long j) {
        mo4383b(mo4384d() + 1);
        long[] jArr = this.f57661a;
        int i = this.f57662b;
        this.f57662b = i + 1;
        jArr[i] = j;
    }
}
