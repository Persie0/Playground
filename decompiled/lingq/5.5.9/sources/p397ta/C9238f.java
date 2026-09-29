package p397ta;

import android.graphics.Color;
import android.support.v4.media.C0141b;
import android.text.Layout;
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
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import com.android.installreferrer.api.InstallReferrerClient;
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
import p219ka.C6640a;
import p294oa.C8027a;
import p294oa.C8029c;
import p404u2.C9384d;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: ta.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9238f {

    /* JADX INFO: renamed from: a */
    public static final Pattern f47901a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f47902b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map<String, Integer> f47903c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, Integer> f47904d;

    /* JADX INFO: renamed from: ta.f$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final C9384d f47905c = new C9384d(2);

        /* JADX INFO: renamed from: a */
        public final b f47906a;

        /* JADX INFO: renamed from: b */
        public final int f47907b;

        public a(b bVar, int i10) {
            this.f47906a = bVar;
            this.f47907b = i10;
        }
    }

    /* JADX INFO: renamed from: ta.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f47908a;

        /* JADX INFO: renamed from: b */
        public final int f47909b;

        /* JADX INFO: renamed from: c */
        public final String f47910c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f47911d;

        public b(String str, int i10, String str2, Set<String> set) {
            this.f47909b = i10;
            this.f47908a = str;
            this.f47910c = str2;
            this.f47911d = set;
        }
    }

    /* JADX INFO: renamed from: ta.f$c */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a */
        public final int f47912a;

        /* JADX INFO: renamed from: b */
        public final C9236d f47913b;

        public c(int i10, C9236d c9236d) {
            this.f47912a = i10;
            this.f47913b = c9236d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f47912a, cVar.f47912a);
        }
    }

    /* JADX INFO: renamed from: ta.f$d */
    public static final class d {

        /* JADX INFO: renamed from: c */
        public CharSequence f47916c;

        /* JADX INFO: renamed from: a */
        public long f47914a = 0;

        /* JADX INFO: renamed from: b */
        public long f47915b = 0;

        /* JADX INFO: renamed from: d */
        public int f47917d = 2;

        /* JADX INFO: renamed from: e */
        public float f47918e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f47919f = 1;

        /* JADX INFO: renamed from: g */
        public int f47920g = 0;

        /* JADX INFO: renamed from: h */
        public float f47921h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f47922i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f47923j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f47924k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0040  */
        /* JADX WARN: Code duplicated, block: B:21:0x0042  */
        /* JADX WARN: Code duplicated, block: B:30:0x0064  */
        /* JADX WARN: Code duplicated, block: B:32:0x006a  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C6640a.a m17602a() {
            Layout.Alignment alignment;
            float f3;
            float f10 = this.f47921h;
            if (f10 == -3.4028235E38f) {
                int i10 = this.f47917d;
                if (i10 != 4) {
                    f10 = i10 != 5 ? 0.5f : 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int i11 = this.f47922i;
            if (i11 == Integer.MIN_VALUE) {
                int i12 = this.f47917d;
                if (i12 == 1) {
                    i11 = 0;
                } else if (i12 == 3) {
                    i11 = 2;
                } else if (i12 == 4) {
                    i11 = 0;
                } else if (i12 != 5) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
            }
            C6640a.a aVar = new C6640a.a();
            int i13 = this.f47917d;
            if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i13 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 != 5) {
                C0141b.m620p("Unknown textAlignment: ", i13, "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            aVar.f37673c = alignment;
            float f11 = this.f47918e;
            int i14 = this.f47919f;
            if (f11 == -3.4028235E38f || i14 != 0 || (f11 >= 0.0f && f11 <= 1.0f)) {
                if (f11 != -3.4028235E38f) {
                    f3 = f11;
                } else {
                    f3 = i14 == 0 ? 1.0f : -3.4028235E38f;
                }
            }
            aVar.f37675e = f3;
            aVar.f37676f = i14;
            aVar.f37677g = this.f47920g;
            aVar.f37678h = f10;
            aVar.f37679i = i11;
            float f12 = this.f47923j;
            if (i11 == 0) {
                f10 = 1.0f - f10;
            } else if (i11 == 1) {
                f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            } else if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
            aVar.f37682l = Math.min(f12, f10);
            aVar.f37686p = this.f47924k;
            CharSequence charSequence = this.f47916c;
            if (charSequence != null) {
                aVar.f37671a = charSequence;
            }
            return aVar;
        }
    }

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
        f47903c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f47904d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: a */
    public static void m17595a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        byte b10;
        int i10;
        int i11 = bVar.f47909b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f47908a;
        str2.getClass();
        int iHashCode = str2.hashCode();
        int i12 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b10 = 5;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b10 = 7;
                    } else {
                        b10 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("i")) {
                b10 = 3;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        switch (b10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 2:
                for (String str3 : bVar.f47911d) {
                    Map<String, Integer> map = f47903c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i11, length, 33);
                    } else {
                        Map<String, Integer> map2 = f47904d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                int iM17597c = m17597c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.f47905c);
                int i13 = bVar.f47909b;
                int i14 = 0;
                int length2 = 0;
                while (i14 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i14)).f47906a.f47908a)) {
                        a aVar = (a) arrayList.get(i14);
                        int iM17597c2 = m17597c(list2, str, aVar.f47906a);
                        if (iM17597c2 == i12) {
                            iM17597c2 = iM17597c != i12 ? iM17597c : 1;
                        }
                        int i15 = aVar.f47906a.f47909b - length2;
                        int i16 = aVar.f47907b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new C8029c(charSequenceSubSequence.toString(), iM17597c2), i13, i15, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i13 = i15;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM17596b = m17596b(list2, str, bVar);
        for (int i17 = 0; i17 < arrayListM17596b.size(); i17++) {
            C9236d c9236d = ((c) arrayListM17596b.get(i17)).f47913b;
            if (c9236d != null) {
                int i18 = c9236d.f47892l;
                if (i18 == -1 && c9236d.f47893m == -1) {
                    i10 = -1;
                } else {
                    i10 = (c9236d.f47893m == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
                }
                if (i10 != -1) {
                    int i19 = c9236d.f47892l;
                    C0987y.m3819a(spannableStringBuilder, new StyleSpan((i19 == -1 && c9236d.f47893m == -1) ? -1 : (i19 == 1 ? 1 : 0) | (c9236d.f47893m == 1 ? 2 : 0)), i11, length);
                }
                if (c9236d.f47890j == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, length, 33);
                }
                if (c9236d.f47891k == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                }
                if (c9236d.f47887g) {
                    if (!c9236d.f47887g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    C0987y.m3819a(spannableStringBuilder, new ForegroundColorSpan(c9236d.f47886f), i11, length);
                }
                if (c9236d.f47889i) {
                    if (!c9236d.f47889i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    C0987y.m3819a(spannableStringBuilder, new BackgroundColorSpan(c9236d.f47888h), i11, length);
                }
                if (c9236d.f47885e != null) {
                    C0987y.m3819a(spannableStringBuilder, new TypefaceSpan(c9236d.f47885e), i11, length);
                }
                int i20 = c9236d.f47894n;
                if (i20 == 1) {
                    C0987y.m3819a(spannableStringBuilder, new AbsoluteSizeSpan((int) c9236d.f47895o, true), i11, length);
                } else if (i20 == 2) {
                    C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c9236d.f47895o), i11, length);
                } else if (i20 == 3) {
                    C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c9236d.f47895o / 100.0f), i11, length);
                }
                if (c9236d.f47897q) {
                    spannableStringBuilder.setSpan(new C8027a(), i11, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m17596b(List list, String str, b bVar) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9236d c9236d = (C9236d) list.get(i10);
            String str2 = bVar.f47908a;
            if (c9236d.f47881a.isEmpty() && c9236d.f47882b.isEmpty() && c9236d.f47883c.isEmpty() && c9236d.f47884d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM17594a = C9236d.m17594a(c9236d.f47884d, C9236d.m17594a(c9236d.f47882b, C9236d.m17594a(c9236d.f47881a, 0, 1073741824, str), 2, str2), 4, bVar.f47910c);
                if (iM17594a != -1) {
                    if (bVar.f47911d.containsAll(c9236d.f47883c)) {
                        size = iM17594a + (c9236d.f47883c.size() * 4);
                    } else {
                        r10 = 0;
                    }
                } else {
                    r10 = 0;
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new c(r10, c9236d));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m17597c(List<C9236d> list, String str, b bVar) {
        ArrayList arrayListM17596b = m17596b(list, str, bVar);
        for (int i10 = 0; i10 < arrayListM17596b.size(); i10++) {
            int i11 = ((c) arrayListM17596b.get(i10)).f47913b.f47896p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static C9237e m17598d(String str, Matcher matcher, C10151t c10151t, ArrayList arrayList) {
        d dVar = new d();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            dVar.f47914a = C9240h.m17605c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            dVar.f47915b = C9240h.m17605c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m17599e(strGroup3, dVar);
            StringBuilder sb2 = new StringBuilder();
            String strM19130e = c10151t.m19130e();
            while (true) {
                String str2 = strM19130e;
                if (TextUtils.isEmpty(str2)) {
                    dVar.f47916c = m17600f(str, sb2.toString(), arrayList);
                    return new C9237e(dVar.m17602a().m13277a(), dVar.f47914a, dVar.f47915b);
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(str2.trim());
                strM19130e = c10151t.m19130e();
            }
        } catch (NumberFormatException unused) {
            C10145n.m19099g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m17599e(String str, d dVar) {
        int i10;
        int i11;
        Matcher matcher = f47902b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m17601g(strGroup2, dVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i10 = 2;
                                break;
                            case "end":
                                i10 = 3;
                                break;
                            case "left":
                                i10 = 4;
                                break;
                            case "right":
                                i10 = 5;
                                break;
                            case "start":
                                i10 = 1;
                                break;
                            default:
                                C10145n.m19099g("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i10 = 2;
                                break;
                        }
                        dVar.f47917d = i10;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i12 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i12 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    break;
                                default:
                                    C10145n.m19099g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i12 = Integer.MIN_VALUE;
                                    break;
                            }
                            dVar.f47922i = i12;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        dVar.f47921h = C9240h.m17604b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        dVar.f47923j = C9240h.m17604b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i11 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            C10145n.m19099g("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                        dVar.f47924k = i11;
                    } else {
                        C10145n.m19099g("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                C10145n.m19099g("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX INFO: renamed from: f */
    public static SpannedString m17600f(String str, String str2, List<C9236d> list) {
        boolean z10;
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String strTrim = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m17595a(spannableStringBuilder, (b) arrayDeque.pop(), str, arrayList, list);
                }
                m17595a(spannableStringBuilder, new b("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i10, iIndexOf);
                    strSubstring.getClass();
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
                            C10145n.m19099g("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int length = i10 + 1;
                if (length < str2.length()) {
                    boolean z11 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i11 = length - 2;
                    boolean z12 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z11 ? 2 : 1);
                    if (!z12) {
                        i11 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i12, i11);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        C10129a.m18990b(!strTrim2.isEmpty());
                        int i13 = C10134c0.f51354a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                z10 = true;
                                break;
                            default:
                                z10 = false;
                                break;
                        }
                        if (z10) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    b bVar = (b) arrayDeque.pop();
                                    m17595a(spannableStringBuilder, bVar, str, arrayList, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                    }
                                    if (bVar.f47908a.equals(str3)) {
                                    }
                                }
                            } else if (!z12) {
                                int length2 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                C10129a.m18990b(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(" ");
                                if (iIndexOf4 == -1) {
                                    c10 = 0;
                                } else {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    c10 = 0;
                                    strTrim3 = strTrim3.substring(0, iIndexOf4);
                                }
                                String[] strArrSplit = strTrim3.split("\\.", -1);
                                String str4 = strArrSplit[c10];
                                HashSet hashSet = new HashSet();
                                for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                                    hashSet.add(strArrSplit[i14]);
                                }
                                arrayDeque.push(new b(str4, length2, strTrim, hashSet));
                            }
                        }
                    }
                }
                i10 = length;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m17601g(String str, d dVar) {
        String strSubstring = str;
        int iIndexOf = strSubstring.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring2 = strSubstring.substring(iIndexOf + 1);
            strSubstring2.getClass();
            int i10 = 2;
            switch (strSubstring2) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    C10145n.m19099g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f47920g = i10;
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        if (strSubstring.endsWith("%")) {
            dVar.f47918e = C9240h.m17604b(strSubstring);
            dVar.f47919f = 0;
        } else {
            dVar.f47918e = Integer.parseInt(strSubstring);
            dVar.f47919f = 1;
        }
    }
}
