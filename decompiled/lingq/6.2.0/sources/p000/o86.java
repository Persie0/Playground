package p000;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* JADX INFO: loaded from: classes.dex */
public final class o86 {

    /* JADX INFO: renamed from: q */
    public static final Regex f53979q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: r */
    public static final Regex f53980r = new Regex("\\{(.+?)\\}");

    /* JADX INFO: renamed from: s */
    public static final Regex f53981s = new Regex("http[s]?://");

    /* JADX INFO: renamed from: t */
    public static final Regex f53982t = new Regex(".*");

    /* JADX INFO: renamed from: u */
    public static final Regex f53983u = new Regex("([^/]*?|)");

    /* JADX INFO: renamed from: v */
    public static final Regex f53984v = new Regex("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a */
    public final String f53985a;

    /* JADX INFO: renamed from: b */
    public final String f53986b;

    /* JADX INFO: renamed from: c */
    public final String f53987c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f53988d;

    /* JADX INFO: renamed from: e */
    public final String f53989e;

    /* JADX INFO: renamed from: f */
    public final cs4 f53990f;

    /* JADX INFO: renamed from: g */
    public final cs4 f53991g;

    /* JADX INFO: renamed from: h */
    public final cs4 f53992h;

    /* JADX INFO: renamed from: i */
    public boolean f53993i;

    /* JADX INFO: renamed from: j */
    public final cs4 f53994j;

    /* JADX INFO: renamed from: k */
    public final cs4 f53995k;

    /* JADX INFO: renamed from: l */
    public final cs4 f53996l;

    /* JADX INFO: renamed from: m */
    public final cs4 f53997m;

    /* JADX INFO: renamed from: n */
    public final String f53998n;

    /* JADX INFO: renamed from: o */
    public final cs4 f53999o;

    /* JADX INFO: renamed from: p */
    public final boolean f54000p;

    public o86(String str, String str2, String str3) {
        this.f53985a = str;
        this.f53986b = str2;
        this.f53987c = str3;
        ArrayList arrayList = new ArrayList();
        this.f53988d = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.f53990f = AbstractC3192a.m15356a(new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i2 = i;
                o86 o86Var = this.f46859b;
                switch (i2) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i3 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i3) {
                                        String strQuote = Pattern.quote(str8.substring(i3, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i3 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.f53991g = AbstractC3192a.m15356a(new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i3 = i2;
                o86 o86Var = this.f46859b;
                switch (i3) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i4 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i4) {
                                        String strQuote = Pattern.quote(str8.substring(i4, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i4 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i4));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i3 = 2;
        this.f53992h = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i4 = i3;
                o86 o86Var = this.f46859b;
                switch (i4) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i5 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i5) {
                                        String strQuote = Pattern.quote(str8.substring(i5, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i5 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i5));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.f53994j = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i5 = i4;
                o86 o86Var = this.f46859b;
                switch (i5) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i6 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i6) {
                                        String strQuote = Pattern.quote(str8.substring(i6, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i6 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i6));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.f53995k = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i6 = i5;
                o86 o86Var = this.f46859b;
                switch (i6) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i7 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i7) {
                                        String strQuote = Pattern.quote(str8.substring(i7, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i7 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i7));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.f53996l = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i7 = i6;
                o86 o86Var = this.f46859b;
                switch (i7) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i8 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i8) {
                                        String strQuote = Pattern.quote(str8.substring(i8, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i8 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i8));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.f53997m = AbstractC3192a.m15356a(new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i8 = i7;
                o86 o86Var = this.f46859b;
                switch (i8) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i9 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i9) {
                                        String strQuote = Pattern.quote(str8.substring(i9, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i9 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i9));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.f53999o = AbstractC3192a.m15356a(new ui3(this) { // from class: k86

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ o86 f46859b;

            {
                this.f46859b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                List list;
                int i9 = i8;
                o86 o86Var = this.f46859b;
                switch (i9) {
                    case 0:
                        String str4 = o86Var.f53989e;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = o86Var.f53985a;
                        return Boolean.valueOf(str5 != null && o86.f53984v.m15427f(str5));
                    case 2:
                        String str6 = o86Var.f53985a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) o86Var.f53991g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    C3386nv.m17624j(ux5.m22991n("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) u91.m22591I0(queryParameters);
                                if (str8 == null) {
                                    o86Var.f53993i = true;
                                    str8 = str7;
                                }
                                n86 n86Var = new n86();
                                int i10 = 0;
                                for (dr5 dr5VarM15424b = o86.f53980r.m15424b(str8); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
                                    uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
                                    uq5VarM9865f.getClass();
                                    n86Var.m17281a(uq5VarM9865f.f64214a);
                                    if (dr5VarM15424b.m10611b().f40379a > i10) {
                                        String strQuote = Pattern.quote(str8.substring(i10, dr5VarM15424b.m10611b().f40379a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i10 = dr5VarM15424b.m10611b().f40380b + 1;
                                }
                                if (i10 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i10));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                n86Var.m17284d(o86.m17847f(sb.toString()));
                                linkedHashMap.put(str7, n86Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = o86Var.f53985a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        o86.m17845a(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) o86Var.f53994j.getValue();
                        return (pair == null || (list = (List) pair.f47623a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) o86Var.f53994j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f47624b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) o86Var.f53996l.getValue();
                        if (str10 != null) {
                            return new Regex(str10, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = o86Var.f53998n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f53979q.m15423a(str)) {
                String strPattern = f53981s.f47727a.pattern();
                strPattern.getClass();
                sb.append(strPattern);
            }
            dr5 dr5VarM15424b = new Regex("(\\?|#|$)").m15424b(str);
            if (dr5VarM15424b != null) {
                m17845a(str.substring(0, dr5VarM15424b.m10611b().f40379a), sb, arrayList);
                if (!f53982t.m15423a(sb) && !f53983u.m15423a(sb)) {
                    z = true;
                }
                this.f54000p = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f53989e = m17847f(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").m15427f(str3)) {
            C3386nv.m17624j(wq1.m24118n("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        m86 m86Var = new m86(str3);
        this.f53998n = cl9.m4839V("^(" + m86Var.m16680c() + "|[*]+)/(" + m86Var.m16679b() + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    /* JADX INFO: renamed from: a */
    public static void m17845a(String str, StringBuilder sb, ArrayList arrayList) {
        int i = 0;
        for (dr5 dr5VarM15424b = f53980r.m15424b(str); dr5VarM15424b != null; dr5VarM15424b = dr5VarM15424b.m10613d()) {
            uq5 uq5VarM9865f = dr5VarM15424b.f36079c.m9865f(1);
            uq5VarM9865f.getClass();
            arrayList.add(uq5VarM9865f.f64214a);
            if (dr5VarM15424b.m10611b().f40379a > i) {
                String strQuote = Pattern.quote(str.substring(i, dr5VarM15424b.m10611b().f40379a));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = f53983u.f47727a.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = dr5VarM15424b.m10611b().f40380b + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17846e(Bundle bundle, String str, String str2, x76 x76Var) {
        if (x76Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            de6 de6Var = x76Var.f67888a;
            str.getClass();
            de6Var.mo304e(bundle, str, de6Var.mo303d(str2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m17847f(String str) {
        if (vk9.m23380c0(str, "\\Q", false) && vk9.m23380c0(str, "\\E", false)) {
            return cl9.m4839V(str, ".*", "\\E.*\\Q");
        }
        return vk9.m23380c0(str, "\\.\\*", false) ? cl9.m4839V(str, "\\.\\*", ".*") : str;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m17848b() {
        Collection collectionValues = ((Map) this.f53992h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((n86) it.next()).m17282b(), arrayList);
        }
        return u91.m22603U0((List) this.f53995k.getValue(), u91.m22603U0(arrayList, this.f53988d));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17849c(dr5 dr5Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.f53988d;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            String str = (String) obj;
            uq5 uq5VarM9865f = dr5Var.f36079c.m9865f(i2);
            if (uq5VarM9865f != null) {
                strDecode = Uri.decode(uq5VarM9865f.f64214a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                m17846e(bundle, str, strDecode, (x76) map.get(str));
                arrayList2.add(xfa.f68157a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final boolean m17850d(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.f53992h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            n86 n86Var = (n86) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f53993i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = vz1.m23604J(query);
            }
            Object obj = xfa.f68157a;
            boolean z2 = false;
            Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
            for (String str2 : n86Var.m17282b()) {
                x76 x76Var = (x76) map.get(str2);
                de6 de6Var = x76Var != null ? x76Var.f67888a : null;
                if ((de6Var instanceof ff0) && !x76Var.f67890c) {
                    ff0 ff0Var = (ff0) de6Var;
                    int i = ff0Var.f38987r;
                    Object obj2 = EmptyList.f47638a;
                    switch (i) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                    }
                    ff0Var.mo304e(bundleM18160p, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String strM17283c = n86Var.m17283c();
                dr5 dr5VarM15426e = strM17283c != null ? new Regex(strM17283c).m15426e(str3) : null;
                if (dr5VarM15426e == null) {
                    return z2;
                }
                ArrayList arrayListM17282b = n86Var.m17282b();
                ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM17282b, 10));
                ?? r14 = z2;
                for (Object obj3 : arrayListM17282b) {
                    int i2 = r14 + 1;
                    if (r14 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    uq5 uq5VarM9865f = dr5VarM15426e.f36079c.m9865f(i2);
                    String str5 = uq5VarM9865f != null ? uq5VarM9865f.f64214a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    x76 x76Var2 = (x76) map.get(str4);
                    try {
                        str4.getClass();
                        if (bundleM18160p.containsKey(str4)) {
                            if (bundleM18160p.containsKey(str4)) {
                                if (x76Var2 != null) {
                                    de6 de6Var2 = x76Var2.f67888a;
                                    Object objMo301a = de6Var2.mo301a(str4, bundleM18160p);
                                    if (!bundleM18160p.containsKey(str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    de6Var2.mo304e(bundleM18160p, str4, de6Var2.mo10313c(objMo301a, str5));
                                    objValueOf = obj;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj;
                            }
                        } else {
                            m17846e(bundleM18160p, str4, str5, x76Var2);
                            objValueOf = obj;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList.add(objValueOf);
                    r14 = i2;
                    z2 = false;
                }
            }
            bundle.putAll(bundleM18160p);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o86)) {
            o86 o86Var = (o86) obj;
            if (fa4.m11650l(this.f53985a, o86Var.f53985a) && fa4.m11650l(this.f53986b, o86Var.f53986b) && fa4.m11650l(this.f53987c, o86Var.f53987c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53985a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f53986b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f53987c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
