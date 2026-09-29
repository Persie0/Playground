package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hf0 extends uj7 {

    /* JADX INFO: renamed from: a */
    public boolean[] f42291a;

    /* JADX INFO: renamed from: b */
    public int f42292b;

    public hf0(boolean[] zArr) {
        zArr.getClass();
        this.f42291a = zArr;
        this.f42292b = zArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f42291a, this.f42292b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        boolean[] zArr = this.f42291a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f42291a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f42292b;
    }

    /* JADX INFO: renamed from: e */
    public final void m13216e(boolean z) {
        mo4383b(mo4384d() + 1);
        boolean[] zArr = this.f42291a;
        int i = this.f42292b;
        this.f42292b = i + 1;
        zArr[i] = z;
    }
}
