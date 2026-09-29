package kotlin.text;

import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.C6524g;
import jm.C6525h;
import jm.C6526i;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import mo.C7654b;
import mo.C7661i;
import p003a2.C0009a;
import p249lo.C7420m;
import p385sf.C9000b;
import tl.C9322j;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.text.b */
/* JADX INFO: loaded from: classes2.dex */
public class C7076b extends C7661i {
    /* JADX INFO: renamed from: A3 */
    public static final String m14276A3(String str, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "missingDelimiterValue");
        int iM14288h3 = m14288h3(str, ".", 6);
        if (iM14288h3 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM14288h3);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: B3 */
    public static final CharSequence m14277B3(CharSequence charSequence) {
        C5207g.m11111f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM11008f1 = C5206f.m11008f1(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM11008f1) {
                    break;
                }
                length--;
            } else if (zM11008f1) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* JADX INFO: renamed from: X2 */
    public static final boolean m14278X2(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m14285e3(charSequence, (String) charSequence2, 0, z10, 2) < 0) {
                return false;
            }
        } else if (m14283c3(charSequence, charSequence2, 0, charSequence.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Y2 */
    public static boolean m14279Y2(CharSequence charSequence, char c10) {
        C5207g.m11111f(charSequence, "<this>");
        return m14284d3(charSequence, c10, 0, false, 2) >= 0;
    }

    /* JADX INFO: renamed from: Z2 */
    public static boolean m14280Z2(CharSequence charSequence, String str) {
        return charSequence instanceof String ? C7661i.m15248N2((String) charSequence, str) : m14291k3(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: a3 */
    public static final int m14281a3(CharSequence charSequence) {
        C5207g.m11111f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: b3 */
    public static final int m14282b3(int i10, CharSequence charSequence, String str, boolean z10) {
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return m14283c3(charSequence, str, i10, charSequence.length(), z10, false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061 A[LOOP:0: B:31:0x0048->B:36:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0089 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c3 */
    public static final int m14283c3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C6524g c6524g;
        if (z11) {
            int iM14281a3 = m14281a3(charSequence);
            if (i10 > iM14281a3) {
                i10 = iM14281a3;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            c6524g = new C6524g(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            c6524g = new C6526i(i10, i11);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = c6524g.f37163a;
        int i13 = c6524g.f37165c;
        int i14 = c6524g.f37164b;
        if (z12 && (charSequence2 instanceof String)) {
            if (i13 > 0 && i12 <= i14) {
                while (!C7661i.m15251Q2(0, i12, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i12 != i14) {
                        i12 += i13;
                    }
                }
                return i12;
            }
            if (i13 < 0 && i14 <= i12) {
                while (!C7661i.m15251Q2(0, i12, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i12 != i14) {
                        i12 += i13;
                    }
                }
                return i12;
            }
        } else if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
            while (!m14291k3(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                if (i12 != i14) {
                    i12 += i13;
                }
            }
            return i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d3 */
    public static int m14284d3(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        C5207g.m11111f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m14286f3(i10, charSequence, z10, new char[]{c10}) : ((String) charSequence).indexOf(c10, i10);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ int m14285e3(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m14282b3(i10, charSequence, str, z10);
    }

    /* JADX INFO: renamed from: f3 */
    public static final int m14286f3(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        boolean z11;
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C6744b.m13387s0(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        C6525h it = new C6526i(i10, m14281a3(charSequence)).iterator();
        while (it.f37168c) {
            int iMo13105a = it.mo13105a();
            char cCharAt = charSequence.charAt(iMo13105a);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (C5206f.m10985F0(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iMo13105a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g3 */
    public static int m14287g3(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = m14281a3(charSequence);
        }
        C5207g.m11111f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C6744b.m13387s0(cArr), i10);
        }
        int iM14281a3 = m14281a3(charSequence);
        if (i10 > iM14281a3) {
            i10 = iM14281a3;
        }
        while (-1 < i10) {
            if (C5206f.m10985F0(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h3 */
    public static int m14288h3(CharSequence charSequence, String str, int i10) {
        int iM14281a3 = (i10 & 2) != 0 ? m14281a3(charSequence) : 0;
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(str, "string");
        return !(charSequence instanceof String) ? m14283c3(charSequence, str, iM14281a3, 0, false, true) : ((String) charSequence).lastIndexOf(str, iM14281a3);
    }

    /* JADX INFO: renamed from: i3 */
    public static final List<String> m14289i3(final CharSequence charSequence) {
        C5207g.m11111f(charSequence, "<this>");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(m14290j3(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new InterfaceC2052l<C6526i, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(C6526i c6526i) {
                C6526i c6526i2 = c6526i;
                C5207g.m11111f(c6526i2, "it");
                return C7076b.m14300t3(charSequence, c6526i2);
            }
        })));
    }

    /* JADX INFO: renamed from: j3 */
    public static C7654b m14290j3(CharSequence charSequence, String[] strArr, final boolean z10, int i10) {
        m14296p3(i10);
        final List listM17670X = C9322j.m17670X(strArr);
        return new C7654b(charSequence, 0, i10, new InterfaceC2056p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[EDGE_INSN: B:47:0x00c4->B:48:0x00c5 BREAK  A[LOOP:0: B:19:0x0054->B:30:0x0087]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Pair<? extends Integer, ? extends Integer> mo1337m0(CharSequence charSequence2, Integer num) {
                Object next;
                Pair pair;
                String str;
                Object next2;
                String str2;
                CharSequence charSequence3 = charSequence2;
                int iIntValue = num.intValue();
                C5207g.m11111f(charSequence3, "$this$$receiver");
                boolean z11 = z10;
                List<String> list = listM17670X;
                if (z11 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    C6526i c6526i = new C6526i(iIntValue, charSequence3.length());
                    boolean z12 = charSequence3 instanceof String;
                    int i11 = c6526i.f37165c;
                    int i12 = c6526i.f37164b;
                    if (!z12) {
                        if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                            while (true) {
                                Iterator<T> it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str = (String) next;
                                } while (!C7076b.m14291k3(str, 0, charSequence3, iIntValue, str.length(), z11));
                                String str3 = (String) next;
                                if (str3 == null) {
                                    if (iIntValue == i12) {
                                        pair = null;
                                        break;
                                    }
                                    iIntValue += i11;
                                } else {
                                    pair = new Pair(Integer.valueOf(iIntValue), str3);
                                    break;
                                }
                            }
                        } else {
                            pair = null;
                            break;
                        }
                    } else if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                        while (true) {
                            Iterator<T> it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str2 = (String) next2;
                            } while (!C7661i.m15251Q2(0, iIntValue, str2.length(), str2, (String) charSequence3, z11));
                            String str4 = (String) next2;
                            if (str4 == null) {
                                if (iIntValue == i12) {
                                    pair = null;
                                    break;
                                }
                                iIntValue += i11;
                            } else {
                                pair = new Pair(Integer.valueOf(iIntValue), str4);
                                break;
                            }
                        }
                    } else {
                        pair = null;
                        break;
                    }
                } else {
                    String str5 = (String) C6752c.m13442j0(list);
                    int iM14285e3 = C7076b.m14285e3(charSequence3, str5, iIntValue, false, 4);
                    if (iM14285e3 < 0) {
                        pair = null;
                        break;
                    }
                    pair = new Pair(Integer.valueOf(iM14285e3), str5);
                }
                if (pair == null) {
                    return null;
                }
                return new Pair<>(pair.f38012a, Integer.valueOf(((String) pair.f38013b).length()));
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static final boolean m14291k3(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(charSequence2, "other");
        if (i11 >= 0 && i10 >= 0 && i10 <= charSequence.length() - i12) {
            if (i11 <= charSequence2.length() - i12) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (!C5206f.m10985F0(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l3 */
    public static final String m14292l3(CharSequence charSequence, String str) {
        C5207g.m11111f(str, "<this>");
        if (!(charSequence instanceof String ? C7661i.m15256V2(str, (String) charSequence, false) : m14291k3(str, 0, charSequence, 0, charSequence.length(), false))) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: m3 */
    public static final CharSequence m14293m3(String str, int i10, int i11) {
        C5207g.m11111f(str, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C0009a.m20h("End index (", i11, ") is less than start index (", i10, ")."));
        }
        if (i11 == i10) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb2 = new StringBuilder(str.length() - (i11 - i10));
        sb2.append((CharSequence) str, 0, i10);
        sb2.append((CharSequence) str, i11, str.length());
        return sb2;
    }

    /* JADX INFO: renamed from: n3 */
    public static final String m14294n3(String str, String str2) {
        if (!m14280Z2(str2, str)) {
            return str2;
        }
        String strSubstring = str2.substring(0, str2.length() - str.length());
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o3 */
    public static final StringBuilder m14295o3(CharSequence charSequence, int i10, int i11, String str) {
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(str, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C0009a.m20h("End index (", i11, ") is less than start index (", i10, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        sb2.append((CharSequence) str);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m14296p3(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("Limit must be non-negative, but was ", i10).toString());
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final List m14297q3(int i10, CharSequence charSequence, String str, boolean z10) {
        m14296p3(i10);
        int length = 0;
        int iM14282b3 = m14282b3(0, charSequence, str, z10);
        if (iM14282b3 != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            int i11 = 10;
            if (z11) {
                i11 = i10 <= 10 ? i10 : 10;
            }
            ArrayList arrayList = new ArrayList(i11);
            do {
                arrayList.add(charSequence.subSequence(length, iM14282b3).toString());
                length = str.length() + iM14282b3;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                iM14282b3 = m14282b3(length, charSequence, str, z10);
            } while (iM14282b3 != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return C9000b.m17251q(charSequence.toString());
    }

    /* JADX INFO: renamed from: r3 */
    public static List m14298r3(CharSequence charSequence, final char[] cArr) {
        C5207g.m11111f(charSequence, "<this>");
        final boolean z10 = false;
        if (cArr.length == 1) {
            return m14297q3(0, charSequence, String.valueOf(cArr[0]), false);
        }
        m14296p3(0);
        C7420m c7420m = new C7420m(new C7654b(charSequence, 0, 0, new InterfaceC2056p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Pair<? extends Integer, ? extends Integer> mo1337m0(CharSequence charSequence2, Integer num) {
                CharSequence charSequence3 = charSequence2;
                int iIntValue = num.intValue();
                C5207g.m11111f(charSequence3, "$this$$receiver");
                int iM14286f3 = C7076b.m14286f3(iIntValue, charSequence3, z10, cArr);
                if (iM14286f3 < 0) {
                    return null;
                }
                return new Pair<>(Integer.valueOf(iM14286f3), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c7420m, 10));
        Iterator<Object> it = c7420m.iterator();
        while (it.hasNext()) {
            arrayList.add(m14300t3(charSequence, (C6526i) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s3 */
    public static List m14299s3(CharSequence charSequence, String[] strArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        C5207g.m11111f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return m14297q3(i10, charSequence, str, false);
            }
        }
        C7420m c7420m = new C7420m(m14290j3(charSequence, strArr, false, i10));
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c7420m, 10));
        Iterator<Object> it = c7420m.iterator();
        while (it.hasNext()) {
            arrayList.add(m14300t3(charSequence, (C6526i) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t3 */
    public static final String m14300t3(CharSequence charSequence, C6526i c6526i) {
        C5207g.m11111f(charSequence, "<this>");
        C5207g.m11111f(c6526i, "range");
        return charSequence.subSequence(Integer.valueOf(c6526i.f37163a).intValue(), Integer.valueOf(c6526i.f37164b).intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: u3 */
    public static final String m14301u3(String str, C6526i c6526i) {
        C5207g.m11111f(c6526i, "range");
        String strSubstring = str.substring(Integer.valueOf(c6526i.f37163a).intValue(), Integer.valueOf(c6526i.f37164b).intValue() + 1);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: v3 */
    public static final String m14302v3(String str, String str2, String str3) {
        C5207g.m11111f(str2, "delimiter");
        C5207g.m11111f(str3, "missingDelimiterValue");
        int iM14285e3 = m14285e3(str, str2, 0, false, 6);
        if (iM14285e3 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iM14285e3, str.length());
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: w3 */
    public static String m14303w3(String str, char c10) {
        int iM14284d3 = m14284d3(str, c10, 0, false, 6);
        if (iM14284d3 == -1) {
            return str;
        }
        String strSubstring = str.substring(iM14284d3 + 1, str.length());
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m14304x3(String str, char c10, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "missingDelimiterValue");
        int iM14287g3 = m14287g3(str, c10, 0, 6);
        if (iM14287g3 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM14287g3 + 1, str.length());
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: y3 */
    public static String m14305y3(String str, char c10) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str, "missingDelimiterValue");
        int iM14284d3 = m14284d3(str, c10, 0, false, 6);
        if (iM14284d3 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM14284d3);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: z3 */
    public static String m14306z3(String str, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str, "missingDelimiterValue");
        int iM14285e3 = m14285e3(str, str2, 0, false, 6);
        if (iM14285e3 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM14285e3);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
