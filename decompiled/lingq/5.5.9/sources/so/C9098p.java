package so;

import dm.C5207g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mo.C7661i;
import p349qo.C8656b;

/* JADX INFO: renamed from: so.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C9098p {

    /* JADX INFO: renamed from: d */
    public static final Pattern f47473d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f47474e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f47475a;

    /* JADX INFO: renamed from: b */
    public final String f47476b;

    /* JADX INFO: renamed from: c */
    public final String[] f47477c;

    /* JADX INFO: renamed from: so.p$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static C9098p m17339a(String str) {
            C5207g.m11111f(str, "<this>");
            Matcher matcher = C9098p.f47473d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            C5207g.m11110e(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            C5207g.m11110e(locale, "US");
            String lowerCase = strGroup.toLowerCase(locale);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            C5207g.m11110e(strGroup2, "typeSubtype.group(2)");
            C5207g.m11110e(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C9098p.f47474e.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (C7661i.m15256V2(strGroup4, "'", false) && C7661i.m15248N2(strGroup4, "'") && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        C5207g.m11110e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C9098p(str, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public C9098p(String str, String str2, String[] strArr) {
        this.f47475a = str;
        this.f47476b = str2;
        this.f47477c = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Charset m17338a(Charset charset) {
        String str;
        String[] strArr = this.f47477c;
        int i10 = 0;
        int iM16915w = C8656b.m16915w(0, strArr.length - 1, 2);
        if (iM16915w >= 0) {
            while (true) {
                int i11 = i10 + 2;
                if (C7661i.m15249O2(strArr[i10], "charset")) {
                    str = strArr[i10 + 1];
                    break;
                }
                if (i10 != iM16915w) {
                    i10 = i11;
                }
            }
            if (str != null) {
                try {
                } catch (IllegalArgumentException unused) {
                    return charset;
                }
            }
        }
        str = null;
        return str != null ? charset : Charset.forName(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9098p) && C5207g.m11106a(((C9098p) obj).f47475a, this.f47475a);
    }

    public final int hashCode() {
        return this.f47475a.hashCode();
    }

    public final String toString() {
        return this.f47475a;
    }
}
