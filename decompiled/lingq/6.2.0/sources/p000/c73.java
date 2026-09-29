package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c73 extends uj7 {

    /* JADX INFO: renamed from: a */
    public float[] f9656a;

    /* JADX INFO: renamed from: b */
    public int f9657b;

    public c73(float[] fArr) {
        fArr.getClass();
        this.f9656a = fArr;
        this.f9657b = fArr.length;
        mo4383b(10);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: a */
    public final Object mo4382a() {
        return Arrays.copyOf(this.f9656a, this.f9657b);
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: b */
    public final void mo4383b(int i) {
        float[] fArr = this.f9656a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f9656a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p000.uj7
    /* JADX INFO: renamed from: d */
    public final int mo4384d() {
        return this.f9657b;
    }

    /* JADX INFO: renamed from: e */
    public final void m4385e(float f) {
        mo4383b(mo4384d() + 1);
        float[] fArr = this.f9656a;
        int i = this.f9657b;
        this.f9657b = i + 1;
        fArr[i] = f;
    }
}
