package p340qf;

/* JADX INFO: renamed from: qf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8599b extends AbstractC8609l {

    /* JADX INFO: renamed from: a */
    public static final char[] f46083a;

    /* JADX INFO: renamed from: b */
    public static final char[] f46084b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c */
    public static final char[] f46085c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d */
    public static final char f46086d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f46083a = cArr;
        f46086d = cArr[0];
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p340qf.AbstractC8609l
    /* JADX INFO: renamed from: b */
    public final boolean[] mo9302b(String str) {
        int i10;
        int length = str.length();
        char c10 = f46086d;
        if (length < 2) {
            str = c10 + str + c10;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f46083a;
            boolean zM16820d = C8598a.m16820d(cArr, upperCase);
            boolean zM16820d2 = C8598a.m16820d(cArr, upperCase2);
            char[] cArr2 = f46084b;
            boolean zM16820d3 = C8598a.m16820d(cArr2, upperCase);
            boolean zM16820d4 = C8598a.m16820d(cArr2, upperCase2);
            if (zM16820d) {
                if (!zM16820d2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zM16820d3) {
                if (zM16820d2 || zM16820d4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c10 + str + c10;
            } else if (!zM16820d4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else {
                if (!C8598a.m16820d(f46085c, str.charAt(i12))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
                i11 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i11];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = C8598a.f46081a;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i15]) {
                    i10 = C8598a.f46082b[i15];
                    break;
                }
                i15++;
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
