package p502y7;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10300a {

    /* JADX INFO: renamed from: a */
    public int[] f51815a;

    /* JADX INFO: renamed from: b */
    public int f51816b;

    /* JADX INFO: renamed from: c */
    public float[] f51817c;

    /* JADX INFO: renamed from: y7.a$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static final int m19296a(int[] iArr) {
            int i10 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i11 = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    i11 *= iArr[i10];
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            return i11;
        }
    }

    static {
        new a();
    }

    public C10300a(int[] iArr) {
        this.f51815a = iArr;
        int iM19296a = a.m19296a(iArr);
        this.f51816b = iM19296a;
        this.f51817c = new float[iM19296a];
    }
}
