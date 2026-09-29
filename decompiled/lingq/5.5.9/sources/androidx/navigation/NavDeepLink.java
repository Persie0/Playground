package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C6740a;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import p003a2.C0009a;
import p040c4.AbstractC1692q;
import p040c4.C1683h;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class NavDeepLink {

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final Pattern f6809m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: a */
    public final String f6810a;

    /* JADX INFO: renamed from: b */
    public final String f6811b;

    /* JADX INFO: renamed from: c */
    public final String f6812c;

    /* JADX INFO: renamed from: f */
    public final String f6815f;

    /* JADX INFO: renamed from: h */
    public final boolean f6817h;

    /* JADX INFO: renamed from: i */
    public final boolean f6818i;

    /* JADX INFO: renamed from: j */
    public final String f6819j;

    /* JADX INFO: renamed from: l */
    public final boolean f6821l;

    /* JADX INFO: renamed from: d */
    public final ArrayList f6813d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f6814e = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final InterfaceC9070c f6816g = C6740a.m13372a(new InterfaceC2041a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pattern$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final Pattern mo807E() {
            String str = this.f6825b.f6815f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: k */
    public final InterfaceC9070c f6820k = C6740a.m13372a(new InterfaceC2041a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final Pattern mo807E() {
            String str = this.f6824b.f6819j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: androidx.navigation.NavDeepLink$a */
    public static final class C1078a {

        /* JADX INFO: renamed from: a */
        public String f6822a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f6823b = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.navigation.NavDeepLink] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int] */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.regex.Matcher] */
    public NavDeepLink(String str, String str2, String str3) {
        int i10;
        List listM13448p0;
        this.f6810a = str;
        this.f6811b = str2;
        this.f6812c = str3;
        boolean z10 = true;
        int iEnd = 0;
        if (str != null) {
            Uri uri = Uri.parse(str);
            boolean z11 = uri.getQuery() != null;
            this.f6817h = z11;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f6809m.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (z11) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String strSubstring = str.substring(0, matcher.start());
                    C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    C5207g.m11110e(patternCompile, "fillInPattern");
                    this.f6821l = m4012a(strSubstring, sb2, patternCompile);
                }
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.f6818i = z10;
                        queryParameter = str4;
                    }
                    ?? Matcher = patternCompile.matcher(queryParameter);
                    C1078a c1078a = new C1078a();
                    ?? r14 = z10;
                    while (Matcher.find()) {
                        String strGroup = Matcher.group(r14);
                        if (strGroup == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        c1078a.f6823b.add(strGroup);
                        C5207g.m11110e(queryParameter, "queryParam");
                        String strSubstring2 = queryParameter.substring(iEnd, Matcher.start());
                        C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(Pattern.quote(strSubstring2));
                        sb3.append("(.+?)?");
                        iEnd = Matcher.end();
                        r14 = 1;
                    }
                    if (iEnd < queryParameter.length()) {
                        String strSubstring3 = queryParameter.substring(iEnd);
                        C5207g.m11110e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(strSubstring3));
                    }
                    String string = sb3.toString();
                    C5207g.m11110e(string, "argRegex.toString()");
                    c1078a.f6822a = C7661i.m15254T2(string, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f6814e;
                    C5207g.m11110e(str4, "paramName");
                    linkedHashMap.put(str4, c1078a);
                    z10 = true;
                    iEnd = 0;
                }
            } else {
                C5207g.m11110e(patternCompile, "fillInPattern");
                this.f6821l = m4012a(str, sb2, patternCompile);
            }
            String string2 = sb2.toString();
            C5207g.m11110e(string2, "uriRegex.toString()");
            this.f6815f = C7661i.m15254T2(string2, ".*", "\\E.*\\Q");
        }
        if (this.f6812c != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f6812c).matches()) {
                throw new IllegalArgumentException(C0009a.m23l(new StringBuilder("The given mimeType "), this.f6812c, " does not match to required \"type/subtype\" format").toString());
            }
            String str5 = this.f6812c;
            C5207g.m11111f(str5, "mimeType");
            List listM14273d = new Regex("/").m14273d(str5);
            if (listM14273d.isEmpty()) {
                i10 = 1;
                listM13448p0 = EmptyList.f38032a;
            } else {
                ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
                while (listIterator.hasPrevious()) {
                    if (!(((String) listIterator.previous()).length() == 0)) {
                        i10 = 1;
                        listM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                    }
                }
                i10 = 1;
                listM13448p0 = EmptyList.f38032a;
            }
            this.f6819j = C7661i.m15254T2(C0166e.m766l("^(", (String) listM13448p0.get(0), "|[*]+)/(", (String) listM13448p0.get(i10), "|[*]+)$"), "*|[*]", "[\\s\\S]");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4011b(Bundle bundle, String str, String str2, C1683h c1683h) {
        if (c1683h == null) {
            bundle.putString(str, str2);
            return;
        }
        AbstractC1692q<Object> abstractC1692q = c1683h.f9407a;
        abstractC1692q.getClass();
        C5207g.m11111f(str, "key");
        abstractC1692q.mo5422d(bundle, str, abstractC1692q.mo5423e(str2));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4012a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !C7076b.m14278X2(str, ".*", false);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f6813d.add(strGroup);
            String strSubstring = str.substring(iEnd, matcher.start());
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(Pattern.quote(strSubstring));
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
            z10 = false;
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(strSubstring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (C5207g.m11106a(this.f6810a, navDeepLink.f6810a) && C5207g.m11106a(this.f6811b, navDeepLink.f6811b) && C5207g.m11106a(this.f6812c, navDeepLink.f6812c)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f6810a;
        int iHashCode2 = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f6811b;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6812c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }
}
