package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class io5 {

    /* JADX INFO: renamed from: a */
    public int[] f44357a;

    /* JADX INFO: renamed from: b */
    public int f44358b;

    /* JADX INFO: renamed from: c */
    public float[] f44359c;

    public io5(int[] iArr) {
        int i;
        this.f44357a = iArr;
        if (iArr.length == 0) {
            C3386nv.m17636w("Empty array can't be reduced.");
            throw null;
        }
        int i2 = iArr[0];
        i84 i84Var = new i84(1, iArr.length - 1, 1);
        int i3 = i84Var.f40380b;
        int i4 = i84Var.f40381c;
        boolean z = i4 <= 0 ? 1 >= i3 : 1 <= i3;
        int i5 = z ? 1 : i3;
        while (z) {
            if (i5 != i3) {
                i = i5 + i4;
            } else {
                if (!z) {
                    uk9.m22784s();
                    throw null;
                }
                z = false;
                i = i5;
            }
            i2 *= iArr[i5];
            i5 = i;
        }
        this.f44358b = i2;
        this.f44359c = new float[i2];
    }

    /* JADX INFO: renamed from: a */
    public final float[] m14051a() {
        return this.f44359c;
    }

    /* JADX INFO: renamed from: b */
    public final int m14052b(int i) {
        return this.f44357a[i];
    }
}
