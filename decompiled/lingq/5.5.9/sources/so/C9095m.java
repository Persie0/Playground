package so;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.C7076b;
import mo.C7661i;
import p100em.InterfaceC5429a;
import p260m8.C7499b;
import p349qo.C8656b;
import tl.C9322j;
import to.C9347b;

/* JADX INFO: renamed from: so.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C9095m implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final String[] f47452a;

    /* JADX INFO: renamed from: so.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ArrayList f47453a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public final void m17311a(String str, String str2) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(str2, "value");
            b.m17317a(str);
            b.m17318b(str2, str);
            m17313c(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public final void m17312b(String str) {
            C5207g.m11111f(str, "line");
            int iM14284d3 = C7076b.m14284d3(str, ':', 1, false, 4);
            if (iM14284d3 != -1) {
                String strSubstring = str.substring(0, iM14284d3);
                C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iM14284d3 + 1);
                C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m17313c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                m17313c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            C5207g.m11110e(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m17313c("", strSubstring3);
        }

        /* JADX INFO: renamed from: c */
        public final void m17313c(String str, String str2) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(str2, "value");
            ArrayList arrayList = this.f47453a;
            arrayList.add(str);
            arrayList.add(C7076b.m14277B3(str2).toString());
        }

        /* JADX INFO: renamed from: d */
        public final C9095m m17314d() {
            Object[] array = this.f47453a.toArray(new String[0]);
            if (array != null) {
                return new C9095m((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* JADX INFO: renamed from: e */
        public final String m17315e(String str) {
            C5207g.m11111f(str, "name");
            ArrayList arrayList = this.f47453a;
            int size = arrayList.size() - 2;
            int iM16915w = C8656b.m16915w(size, 0, -2);
            if (iM16915w <= size) {
                while (true) {
                    int i10 = size - 2;
                    if (C7661i.m15249O2(str, (String) arrayList.get(size))) {
                        return (String) arrayList.get(size + 1);
                    }
                    if (size != iM16915w) {
                        size = i10;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public final void m17316f(String str) {
            C5207g.m11111f(str, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f47453a;
                if (i10 >= arrayList.size()) {
                    return;
                }
                if (C7661i.m15249O2(str, (String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: so.m$b */
    public static final class b {
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public static void m17317a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(C9347b.m17702i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002b  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public static void m17318b(String str, String str2) {
            boolean z10;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\t') {
                    z10 = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    throw new IllegalArgumentException(C5207g.m11116k(C9347b.m17710q(str2) ? "" : C5207g.m11116k(str, ": "), C9347b.m17702i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2)).toString());
                }
                i10 = i11;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: c */
        public static C9095m m17319c(String... strArr) {
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr2[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = C7076b.m14277B3(str).toString();
                i11 = i12;
            }
            int iM16915w = C8656b.m16915w(0, strArr2.length - 1, 2);
            if (iM16915w >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    m17317a(str2);
                    m17318b(str3, str2);
                    if (i10 == iM16915w) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new C9095m(strArr2);
        }
    }

    public C9095m(String[] strArr) {
        this.f47452a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m17305a(String str) {
        C5207g.m11111f(str, "name");
        String[] strArr = this.f47452a;
        int length = strArr.length - 2;
        int iM16915w = C8656b.m16915w(length, 0, -2);
        if (iM16915w <= length) {
            while (true) {
                int i10 = length - 2;
                if (C7661i.m15249O2(str, strArr[length])) {
                    return strArr[length + 1];
                }
                if (length != iM16915w) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9095m) {
            if (Arrays.equals(this.f47452a, ((C9095m) obj).f47452a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m17306f(int i10) {
        return this.f47452a[i10 * 2];
    }

    /* JADX INFO: renamed from: g */
    public final a m17307g() {
        a aVar = new a();
        ArrayList arrayList = aVar.f47453a;
        C5207g.m11111f(arrayList, "<this>");
        String[] strArr = this.f47452a;
        C5207g.m11111f(strArr, "elements");
        arrayList.addAll(C9322j.m17670X(strArr));
        return aVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47452a);
    }

    /* JADX INFO: renamed from: i */
    public final TreeMap m17308i() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C5207g.m11110e(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int length = this.f47452a.length / 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String strM17306f = m17306f(i10);
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String lowerCase = strM17306f.toLowerCase(locale);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m17309l(i10));
            i10 = i11;
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f47452a.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i10 = 0; i10 < length; i10++) {
            pairArr[i10] = new Pair(m17306f(i10), m17309l(i10));
        }
        return C7499b.m14931b0(pairArr);
    }

    /* JADX INFO: renamed from: l */
    public final String m17309l(int i10) {
        return this.f47452a[(i10 * 2) + 1];
    }

    /* JADX INFO: renamed from: m */
    public final List<String> m17310m(String str) {
        C5207g.m11111f(str, "name");
        int length = this.f47452a.length / 2;
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (C7661i.m15249O2(str, m17306f(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m17309l(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return EmptyList.f38032a;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C5207g.m11110e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f47452a.length / 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String strM17306f = m17306f(i10);
            String strM17309l = m17309l(i10);
            sb2.append(strM17306f);
            sb2.append(": ");
            if (C9347b.m17710q(strM17306f)) {
                strM17309l = "██";
            }
            sb2.append(strM17309l);
            sb2.append("\n");
            i10 = i11;
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
