package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class vk9 extends cl9 {
    /* JADX INFO: renamed from: A0 */
    public static List m23365A0(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m23403z0(str, charSequence, i);
            }
        }
        m23401x0(i);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        C3512qv c3512qv = new C3512qv(new db2(charSequence, i, new g61(listAsList)), 2);
        ArrayList arrayList = new ArrayList(v91.m23189q0(c3512qv, 10));
        Iterator it = c3512qv.iterator();
        while (true) {
            cb2 cb2Var = (cb2) it;
            if (!cb2Var.hasNext()) {
                return arrayList;
            }
            i84 i84Var = (i84) cb2Var.next();
            i84Var.getClass();
            arrayList.add(charSequence.subSequence(i84Var.f40379a, i84Var.f40380b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static List m23366B0(String str, char[] cArr) {
        str.getClass();
        int i = 0;
        if (cArr.length == 1) {
            return m23403z0(String.valueOf(cArr[0]), str, 0);
        }
        m23401x0(0);
        C3512qv c3512qv = new C3512qv(new db2(str, 0, new dl9(cArr, i)), 2);
        ArrayList arrayList = new ArrayList(v91.m23189q0(c3512qv, 10));
        Iterator it = c3512qv.iterator();
        while (true) {
            cb2 cb2Var = (cb2) it;
            if (!cb2Var.hasNext()) {
                return arrayList;
            }
            i84 i84Var = (i84) cb2Var.next();
            i84Var.getClass();
            arrayList.add(str.subSequence(i84Var.f40379a, i84Var.f40380b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static String m23367C0(String str, i84 i84Var) {
        str.getClass();
        i84Var.getClass();
        return str.substring(i84Var.f40379a, i84Var.f40380b + 1);
    }

    /* JADX INFO: renamed from: D0 */
    public static String m23368D0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iM23389l0 = m23389l0(str, str2, 0, false, 6);
        return iM23389l0 == -1 ? str3 : str.substring(str2.length() + iM23389l0, str.length());
    }

    /* JADX INFO: renamed from: E0 */
    public static String m23369E0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iM23393p0 = m23393p0(str, c, 0, 6);
        return iM23393p0 == -1 ? str2 : str.substring(iM23393p0 + 1, str.length());
    }

    /* JADX INFO: renamed from: F0 */
    public static String m23370F0(String str, char c) {
        int iM23388k0 = m23388k0(str, c, 0, 6);
        return iM23388k0 == -1 ? str : str.substring(0, iM23388k0);
    }

    /* JADX INFO: renamed from: G0 */
    public static String m23371G0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM23389l0 = m23389l0(str, str2, 0, false, 6);
        return iM23389l0 == -1 ? str : str.substring(0, iM23389l0);
    }

    /* JADX INFO: renamed from: H0 */
    public static String m23372H0(String str) {
        str.getClass();
        str.getClass();
        int iM23394q0 = m23394q0(str, 6, ".");
        return iM23394q0 == -1 ? str : str.substring(0, iM23394q0);
    }

    /* JADX INFO: renamed from: I0 */
    public static String m23373I0(String str, char c) {
        str.getClass();
        str.getClass();
        int iM23393p0 = m23393p0(str, c, 0, 6);
        return iM23393p0 == -1 ? str : str.substring(0, iM23393p0);
    }

    /* JADX INFO: renamed from: J0 */
    public static CharSequence m23374J0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX INFO: renamed from: K0 */
    public static String m23375K0(int i, String str) {
        str.getClass();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: L0 */
    public static CharSequence m23376L0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM4697J = ci8.m4697J(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM4697J) {
                    break;
                }
                length--;
            } else if (zM4697J) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: M0 */
    public static CharSequence m23377M0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!ci8.m4697J(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static String m23378N0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!AbstractC3550rv.m20821O(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static String m23379O0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC3550rv.m20821O(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m23380c0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m23389l0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m23387j0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m23381d0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return m23388k0(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m23382e0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && ci8.m4732q(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m23383f0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? cl9.m4833P((String) charSequence, str, false) : m23397t0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m23384g0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: h0 */
    public static Character m23385h0(int i, String str) {
        str.getClass();
        if (i < 0 || i >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i));
    }

    /* JADX INFO: renamed from: i0 */
    public static int m23386i0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m23387j0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m23387j0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        g84 g84Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM23384g0 = m23384g0(charSequence);
            if (i3 > iM23384g0) {
                i3 = iM23384g0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            g84Var = new g84(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            g84Var = new i84(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = g84Var.f40381c;
        int i6 = g84Var.f40380b;
        int i7 = g84Var.f40379a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (cl9.m4836S(str, 0, i8, str.length(), z, (String) charSequence)) {
                        return i8;
                    }
                    if (i8 != i6) {
                        i8 += i5;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m23397t0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m23388k0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? m23390m0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ int m23389l0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m23386i0(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: m0 */
    public static final int m23390m0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC3550rv.m20847o0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ci8.m4732q(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m23391n0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ci8.m4697J(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public static char m23392o0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        uk9.m22775i("Char sequence is empty.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m23393p0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m23384g0(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC3550rv.m20847o0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (ci8.m4732q(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q0 */
    public static int m23394q0(String str, int i, String str2) {
        int iM23384g0 = (i & 2) != 0 ? m23384g0(str) : 0;
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, iM23384g0);
    }

    /* JADX INFO: renamed from: r0 */
    public static List m23395r0(String str) {
        hd5 hd5Var = new hd5(str);
        if (!hd5Var.hasNext()) {
            return EmptyList.f47638a;
        }
        Object next = hd5Var.next();
        if (!hd5Var.hasNext()) {
            return vz1.m23604J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (hd5Var.hasNext()) {
            arrayList.add(hd5Var.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public static String m23396s0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            C3386nv.m17626m(ux5.m22989l("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: t0 */
    public static final boolean m23397t0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ci8.m4732q(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public static String m23398u0(String str, String str2) {
        str.getClass();
        return cl9.m4842Y(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: v0 */
    public static CharSequence m23399v0(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        if (i2 < i) {
            v63.m23143u(ux5.m22987j(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: w0 */
    public static StringBuilder m23400w0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            v63.m23143u(ux5.m22987j(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m23401x0(int i) {
        if (i >= 0) {
            return;
        }
        C3386nv.m17624j(ux5.m22988k(i, "Limit must be non-negative, but was "));
    }

    /* JADX INFO: renamed from: y0 */
    public static String m23402y0(String str, i84 i84Var) {
        str.getClass();
        i84Var.getClass();
        return i84Var.isEmpty() ? "" : m23367C0(str, i84Var);
    }

    /* JADX INFO: renamed from: z0 */
    public static final List m23403z0(String str, CharSequence charSequence, int i) {
        m23401x0(i);
        int iM23386i0 = m23386i0(charSequence, str, 0, false);
        if (iM23386i0 == -1 || i == 1) {
            return vz1.m23604J(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM23386i0).toString());
            length = str.length() + iM23386i0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM23386i0 = m23386i0(charSequence, str, length, false);
        } while (iM23386i0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }
}
