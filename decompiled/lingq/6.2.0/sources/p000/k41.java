package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k41 extends fyb {

    /* JADX INFO: renamed from: b */
    public static final char[] f46684b;

    /* JADX INFO: renamed from: c */
    public static final char[] f46685c = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: d */
    public static final char[] f46686d = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: e */
    public static final char f46687e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f46684b = cArr;
        f46687e = cArr[0];
    }

    @Override // p000.fyb
    /* JADX INFO: renamed from: b */
    public final boolean[] mo4913b(String str) {
        int i;
        int length = str.length();
        char c = f46687e;
        if (length < 2) {
            str = c + str + c;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f46684b;
            boolean zM14285a = j41.m14285a(cArr, upperCase);
            boolean zM14285a2 = j41.m14285a(cArr, upperCase2);
            char[] cArr2 = f46685c;
            boolean zM14285a3 = j41.m14285a(cArr2, upperCase);
            boolean zM14285a4 = j41.m14285a(cArr2, upperCase2);
            if (zM14285a) {
                if (!zM14285a2) {
                    C3386nv.m17626m("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zM14285a3) {
                if (zM14285a2 || zM14285a4) {
                    C3386nv.m17626m("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c + str + c;
            } else if (!zM14285a4) {
                C3386nv.m17626m("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!j41.m14285a(f46686d, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
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
            int i6 = 0;
            while (true) {
                char[] cArr3 = j41.f45032b;
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = j41.f45033c[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
