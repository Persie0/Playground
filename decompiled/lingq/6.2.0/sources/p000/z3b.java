package p000;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z3b {

    /* JADX INFO: renamed from: a */
    public static final Pattern f70840a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f70841b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f70842c;

    /* JADX INFO: renamed from: d */
    public static final Map f70843d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f70842c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f70843d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m25426a(String str, w3b w3bVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = w3bVar.f66342b;
        int length = spannableStringBuilder.length();
        String str2 = w3bVar.f66341a;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : w3bVar.f66344d) {
                    Map map = f70842c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = f70843d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new w1b(w3bVar.f66343c), i4, length, 33);
                break;
            case "ruby":
                int iM25428c = m25428c(list2, str, w3bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, v3b.f64802c);
                int i6 = w3bVar.f66342b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((v3b) arrayList.get(i7)).f64803a.f66341a)) {
                        v3b v3bVar = (v3b) arrayList.get(i7);
                        int iM25428c2 = m25428c(list2, str, v3bVar.f64803a);
                        if (iM25428c2 == i5) {
                            iM25428c2 = iM25428c != i5 ? iM25428c : 1;
                        }
                        int i8 = v3bVar.f64803a.f66342b - length2;
                        int i9 = v3bVar.f64804b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new yj8(charSequenceSubSequence.toString(), iM25428c2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM25427b = m25427b(list2, str, w3bVar);
        for (int i10 = 0; i10 < arrayListM25427b.size(); i10++) {
            t3b t3bVar = ((x3b) arrayListM25427b.get(i10)).f67734b;
            int i11 = t3bVar.f61825l;
            if (i11 == -1 && t3bVar.f61826m == -1) {
                i = -1;
            } else {
                i = (t3bVar.f61826m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = t3bVar.f61825l;
                if (i12 == -1 && t3bVar.f61826m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (t3bVar.f61826m == 1 ? 2 : 0);
                }
                a4d.m121a(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (t3bVar.f61823j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (t3bVar.f61824k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (t3bVar.f61820g) {
                if (!t3bVar.f61820g) {
                    C3386nv.m17633t("Font color not defined");
                    return;
                }
                a4d.m121a(spannableStringBuilder, new ForegroundColorSpan(t3bVar.f61819f), i4, length);
            }
            if (t3bVar.f61822i) {
                if (!t3bVar.f61822i) {
                    C3386nv.m17633t("Background color not defined.");
                    return;
                }
                a4d.m121a(spannableStringBuilder, new BackgroundColorSpan(t3bVar.f61821h), i4, length);
            }
            if (t3bVar.f61818e != null) {
                a4d.m121a(spannableStringBuilder, new TypefaceSpan(t3bVar.f61818e), i4, length);
            }
            int i13 = t3bVar.f61827n;
            if (i13 == 1) {
                a4d.m121a(spannableStringBuilder, new AbsoluteSizeSpan((int) t3bVar.f61828o, true), i4, length);
            } else if (i13 == 2) {
                a4d.m121a(spannableStringBuilder, new RelativeSizeSpan(t3bVar.f61828o), i4, length);
            } else if (i13 == 3) {
                a4d.m121a(spannableStringBuilder, new RelativeSizeSpan(t3bVar.f61828o / 100.0f), i4, length);
            }
            if (t3bVar.f61830q) {
                spannableStringBuilder.setSpan(new ov3(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m25427b(List list, String str, w3b w3bVar) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            t3b t3bVar = (t3b) list.get(i);
            String str2 = w3bVar.f66341a;
            Set set = w3bVar.f66344d;
            String str3 = w3bVar.f66343c;
            if (t3bVar.f61814a.isEmpty() && t3bVar.f61815b.isEmpty() && t3bVar.f61816c.isEmpty() && t3bVar.f61817d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM21834a = t3b.m21834a(t3bVar.f61817d, t3b.m21834a(t3bVar.f61815b, t3b.m21834a(t3bVar.f61814a, 0, 1073741824, str), 2, str2), 4, str3);
                if (iM21834a == -1 || !set.containsAll(t3bVar.f61816c)) {
                    r4 = 0;
                } else {
                    size = iM21834a + (t3bVar.f61816c.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new x3b(r4, t3bVar));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m25428c(List list, String str, w3b w3bVar) {
        ArrayList arrayListM25427b = m25427b(list, str, w3bVar);
        for (int i = 0; i < arrayListM25427b.size(); i++) {
            int i2 = ((x3b) arrayListM25427b.get(i)).f67734b.f61829p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static u3b m25429d(String str, Matcher matcher, k47 k47Var, ArrayList arrayList) {
        y3b y3bVar = new y3b();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            y3bVar.f69249a = a4b.m119b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            y3bVar.f69250b = a4b.m119b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m25430e(strGroup3, y3bVar);
            StringBuilder sb = new StringBuilder();
            k47Var.getClass();
            String strM14830n = k47Var.m14830n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM14830n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM14830n.trim());
                strM14830n = k47Var.m14830n(StandardCharsets.UTF_8);
            }
            y3bVar.f69251c = m25431f(str, sb.toString(), arrayList);
            return new u3b(y3bVar.m24934a().m4153a(), y3bVar.f69249a, y3bVar.f69250b);
        } catch (IllegalArgumentException unused) {
            ss5.m21707d0("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m25430e(String str, y3b y3bVar) {
        int i;
        int i2;
        int i3;
        Matcher matcher = f70841b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m25432g(strGroup2, y3bVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                ss5.m21707d0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        y3bVar.f69252d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    ss5.m21707d0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            y3bVar.f69257i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        y3bVar.f69256h = a4b.m118a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        y3bVar.f69258j = a4b.m118a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            ss5.m21707d0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        y3bVar.f69259k = i3;
                    } else {
                        ss5.m21707d0("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                ss5.m21707d0("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static SpannedString m25431f(String str, String str2, List list) {
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m25426a(str, (w3b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m25426a(str, new w3b("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            ss5.m21707d0("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        bna.m3969q(!strTrim2.isEmpty());
                        String str3 = uma.f64080a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        bna.m3969q(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new w3b(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        w3b w3bVar = (w3b) arrayDeque.pop();
                                        m25426a(str, w3bVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new v3b(w3bVar, spannableStringBuilder.length()));
                                        }
                                        if (w3bVar.f66341a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m25432g(String str, y3b y3bVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    ss5.m21707d0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            y3bVar.f69255g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            y3bVar.f69253e = a4b.m118a(str);
            y3bVar.f69254f = 0;
        } else {
            y3bVar.f69253e = Integer.parseInt(str);
            y3bVar.f69254f = 1;
        }
    }
}
