package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h09 {

    /* JADX INFO: renamed from: a */
    public int f41639a;

    /* JADX INFO: renamed from: b */
    public final int[] f41640b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m12993a() {
        if ((this.f41639a & 16) != 0) {
            return this.f41640b[4];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m12994b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f41640b;
            if (i >= iArr.length) {
                return;
            }
            this.f41639a = (1 << i) | this.f41639a;
            iArr[i] = i2;
        }
    }
}
