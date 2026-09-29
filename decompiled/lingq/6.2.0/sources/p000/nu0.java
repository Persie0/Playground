package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nu0 extends uj7 {

    /* JADX INFO: renamed from: a */
    public char[] f53245a;

    /* JADX INFO: renamed from: b */
    public int f53246b;

    public nu0(char[] cArr) {
        cArr.getClass();
        this.f53245a = cArr;
        this.f53246b = cArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f53245a, this.f53246b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        char[] cArr = this.f53245a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f53245a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f53246b;
    }

    /* JADX INFO: renamed from: e */
    public final void m17616e(char c) {
        mo4383b(mo4384d() + 1);
        char[] cArr = this.f53245a;
        int i = this.f53246b;
        this.f53246b = i + 1;
        cArr[i] = c;
    }
}
