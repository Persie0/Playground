package p443w;

/* JADX INFO: renamed from: w.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9783n {

    /* JADX INFO: renamed from: a */
    public final int f49871a;

    /* JADX INFO: renamed from: b */
    public int f49872b;

    /* JADX INFO: renamed from: c */
    public int f49873c;

    /* JADX INFO: renamed from: d */
    public final int f49874d;

    /* JADX INFO: renamed from: e */
    public Object f49875e;

    public C9783n() {
        this.f49874d = 5;
        this.f49871a = 16;
        this.f49875e = new double[16];
        this.f49872b = -1;
        this.f49873c = -1;
    }

    public C9783n(int i10, int i11, int i12, int[] iArr) {
        this.f49871a = i10;
        this.f49872b = 0;
        this.f49873c = i12;
        this.f49874d = 0;
        this.f49875e = iArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static double m18278b(C9783n c9783n) {
        int i10 = c9783n.f49873c;
        int i11 = c9783n.f49872b;
        int i12 = 1;
        int i13 = (i10 - i11) + 1;
        if (i13 < 1) {
            c9783n.getClass();
            throw new IllegalArgumentException("inclusionCount cannot be less than 1.");
        }
        if (i13 > (i10 - i11) + 1) {
            throw new IllegalArgumentException("inclusionCount cannot be greater than the inserted value count.");
        }
        double d10 = 0.0d;
        double d11 = 0.0d;
        if (1 <= i13) {
            while (true) {
                d11 += (double) i12;
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        int i14 = c9783n.f49873c;
        int i15 = i14 - (i13 - 1);
        if (i14 >= i15) {
            while (true) {
                d10 += (((double) i13) / d11) * ((double[]) c9783n.f49875e)[i14];
                i13--;
                if (i14 == i15) {
                    break;
                }
                i14--;
            }
        }
        return d10;
    }

    /* JADX INFO: renamed from: a */
    public final void m18279a(double d10) {
        int i10 = this.f49874d;
        if (i10 > 0) {
            int i11 = this.f49873c;
            int i12 = this.f49872b;
            if ((i11 - i12) + 1 == i10) {
                this.f49872b = i12 + 1;
            }
        }
        int i13 = this.f49873c;
        Object obj = this.f49875e;
        double[] dArr = (double[]) obj;
        if (i13 == dArr.length - 1) {
            double[] dArr2 = new double[dArr.length * 2];
            int i14 = this.f49872b;
            int i15 = (i13 - i14) + 1;
            System.arraycopy((double[]) obj, i14, dArr2, 0, i15);
            this.f49875e = dArr2;
            this.f49872b = 0;
            this.f49873c = i15 - 1;
        }
        int i16 = this.f49873c + 1;
        this.f49873c = i16;
        if (i16 == 0) {
            this.f49872b = i16;
        }
        ((double[]) this.f49875e)[i16] = d10;
    }
}
