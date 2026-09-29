package mo;

import dm.C5206f;
import dm.C5207g;
import java.util.Collection;
import jm.C6525h;
import jm.C6526i;
import kotlin.text.C7076b;

/* JADX INFO: renamed from: mo.i */
/* JADX INFO: loaded from: classes2.dex */
public class C7661i extends C7660h {
    /* JADX INFO: renamed from: N2 */
    public static boolean m15248N2(String str, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "suffix");
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: O2 */
    public static final boolean m15249O2(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P2 */
    public static final boolean m15250P2(CharSequence charSequence) {
        boolean z10;
        C5207g.m11111f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable c6526i = new C6526i(0, charSequence.length() - 1);
        if (!(c6526i instanceof Collection) || !((Collection) c6526i).isEmpty()) {
            C6525h it = c6526i.iterator();
            while (it.f37168c) {
                if (!C5206f.m11008f1(charSequence.charAt(it.mo13105a()))) {
                    z10 = false;
                    if (z10) {
                        return true;
                    }
                    return false;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Q2 */
    public static final boolean m15251Q2(int i10, int i11, int i12, String str, String str2, boolean z10) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    /* JADX INFO: renamed from: R2 */
    public static final String m15252R2(int i10, String str) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length != 0) {
                if (length == 1) {
                    char cCharAt = str.charAt(0);
                    char[] cArr = new char[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        cArr[i11] = cCharAt;
                    }
                    return new String(cArr);
                }
                StringBuilder sb2 = new StringBuilder(str.length() * i10);
                C6525h it = new C6526i(1, i10).iterator();
                while (it.f37168c) {
                    it.mo13105a();
                    sb2.append((CharSequence) str);
                }
                String string = sb2.toString();
                C5207g.m11110e(string, "{\n                    va…tring()\n                }");
                return string;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: S2 */
    public static String m15253S2(String str, char c10, char c11) {
        C5207g.m11111f(str, "<this>");
        String strReplace = str.replace(c10, c11);
        C5207g.m11110e(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
        return strReplace;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: T2 */
    public static String m15254T2(String str, String str2, String str3) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "oldValue");
        C5207g.m11111f(str3, "newValue");
        int iM14282b3 = C7076b.m14282b3(0, str, str2, false);
        if (iM14282b3 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = 1;
        if (length >= 1) {
            i10 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iM14282b3);
            sb2.append(str3);
            i11 = iM14282b3 + length;
            if (iM14282b3 >= str.length()) {
                break;
            }
            iM14282b3 = C7076b.m14282b3(iM14282b3 + i10, str, str2, false);
        } while (iM14282b3 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        C5207g.m11110e(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    /* JADX INFO: renamed from: U2 */
    public static final boolean m15255U2(String str, int i10, String str2, boolean z10) {
        C5207g.m11111f(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : m15251Q2(i10, 0, str2.length(), str, str2, z10);
    }

    /* JADX INFO: renamed from: V2 */
    public static final boolean m15256V2(String str, String str2, boolean z10) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : m15251Q2(0, 0, str2.length(), str, str2, z10);
    }
}
