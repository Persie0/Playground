package p225kk;

import android.net.Uri;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import mo.C7660h;
import mo.C7661i;
import mo.C7662j;
import p096ei.C5408a;

/* JADX INFO: renamed from: kk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6706c {

    /* JADX INFO: renamed from: a */
    public final String f37897a;

    /* JADX INFO: renamed from: b */
    public final boolean f37898b;

    /* JADX INFO: renamed from: c */
    public final String f37899c;

    public C6706c(String str, String str2, boolean z10) {
        C5207g.m11111f(str, "url");
        C5207g.m11111f(str2, "activeLanguage");
        this.f37897a = str;
        this.f37898b = z10;
        this.f37899c = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m13313a() {
        String str = this.f37897a;
        if (C7076b.m14278X2(str, "challenges", true)) {
            List listM14299s3 = C7076b.m14299s3(str, new String[]{"/"}, 0, 6);
            ListIterator listIterator = listM14299s3.listIterator(listM14299s3.size());
            while (listIterator.hasPrevious()) {
                String str2 = (String) listIterator.previous();
                if (!C7661i.m15250P2(str2)) {
                    if (C7661i.m15249O2(str2, "challenges")) {
                        return true;
                    }
                }
            }
            throw new NoSuchElementException("List contains no element matching the predicate.");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0490  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final AbstractC6707d m13314b() {
        Pair pair;
        String str;
        Pair pair2;
        LanguageLearn languageLearn;
        LanguageLearnBeta languageLearnBeta;
        String strM11570c;
        Integer numValueOf;
        String strM15254T2;
        boolean z10;
        String strM15254T3;
        String string = this.f37897a;
        boolean z11 = false;
        if (C7076b.m14278X2(string, "click.lingq", false)) {
            return new AbstractC6707d.l(string);
        }
        boolean zM14278X2 = C7076b.m14278X2(string, "/accounts/login/", true);
        Pair pair3 = null;
        uri = null;
        uri = null;
        Uri uri = null;
        Pair pair4 = null;
        boolean z12 = this.f37898b;
        if (zM14278X2 && !z12) {
            Matcher matcher = Pattern.compile("accounts/login/(\\w*\\d*)").matcher(string);
            C5207g.m11110e(matcher, "matcher");
            ArrayList arrayListM10486x = C4924a.m10486x(matcher);
            String str2 = (String) C6752c.m13425S(arrayListM10486x);
            if ((!arrayListM10486x.isEmpty()) && arrayListM10486x.size() == 1) {
                if (str2 != null && (!C7661i.m15250P2(str2))) {
                    z11 = true;
                }
                if (z11) {
                    uri = Uri.parse("lingq://login/" + str2);
                }
            }
            return uri != null ? new AbstractC6707d.i(uri) : AbstractC6707d.e.f37908a;
        }
        if (!z12) {
            return new AbstractC6707d.j(string);
        }
        if ((C7661i.m15248N2(string, "vocabulary/all/review") || C7661i.m15248N2(string, "vocabulary/all/review/")) ? true : Pattern.compile("learn/(\\w{2}).*(\\d{4}-\\d{2}-\\d{2})").matcher(string).find()) {
            Matcher matcher2 = ((C7661i.m15248N2(string, "vocabulary/all/review") || C7661i.m15248N2(string, "vocabulary/all/review/")) ? Pattern.compile("learn/(\\w{2})") : Pattern.compile("learn/(\\w{2}).*(\\d{4}-\\d{2}-\\d{2})")).matcher(string);
            C5207g.m11110e(matcher2, "matcher");
            ArrayList arrayListM10486x2 = C4924a.m10486x(matcher2);
            Pair pair5 = arrayListM10486x2.isEmpty() ^ true ? new Pair(C6752c.m13425S(arrayListM10486x2), C6752c.m13433a0(arrayListM10486x2)) : null;
            return pair5 != null ? new AbstractC6707d.m((String) pair5.f38012a, (String) pair5.f38013b) : AbstractC6707d.e.f37908a;
        }
        if ((C7076b.m14278X2(string, "challenges", true) && !m13313a()) == true) {
            Pattern patternCompile = Pattern.compile("learn/(\\w{2})|((?!.*/).+)");
            if (C7662j.m15259D3(string) == '/') {
                string = C7076b.m14293m3(string, string.length() - 1, string.length()).toString();
            }
            Matcher matcher3 = patternCompile.matcher(string);
            C5207g.m11110e(matcher3, "matcher");
            ArrayList arrayListM10486x3 = C4924a.m10486x(matcher3);
            int size = arrayListM10486x3.size();
            if (size == 1) {
                pair4 = new Pair(Uri.parse("lingq://challenge/" + ((String) C6752c.m13425S(arrayListM10486x3))), null);
            } else if (size == 2) {
                String str3 = (String) C6752c.m13425S(arrayListM10486x3);
                pair4 = new Pair(Uri.parse("lingq://challenge/" + str3 + "/" + ((String) C6752c.m13433a0(arrayListM10486x3))), str3);
            }
            return pair4 != null ? new AbstractC6707d.a((Uri) pair4.f38012a, (String) pair4.f38013b) : AbstractC6707d.e.f37908a;
        }
        if (m13313a()) {
            Pattern patternCompile2 = Pattern.compile("learn/(\\w{2})|((?!.*/).+)");
            if (C7662j.m15259D3(string) == '/') {
                string = C7076b.m14293m3(string, string.length() - 1, string.length()).toString();
            }
            Matcher matcher4 = patternCompile2.matcher(string);
            C5207g.m11110e(matcher4, "matcher");
            ArrayList arrayListM10486x4 = C4924a.m10486x(matcher4);
            int size2 = arrayListM10486x4.size();
            if (size2 == 1) {
                pair3 = new Pair(Uri.parse("lingq://challenges"), null);
            } else if (size2 == 2) {
                String str4 = (String) C6752c.m13425S(arrayListM10486x4);
                pair3 = new Pair(Uri.parse("lingq://challenges/" + str4), str4);
            }
            return pair3 != null ? new AbstractC6707d.b((Uri) pair3.f38012a, (String) pair3.f38013b) : AbstractC6707d.e.f37908a;
        }
        Object[] objArr = Pattern.compile("learn/([a-z][a-z])/web/lesson/(\\d+)").matcher(string).find() || Pattern.compile("learn/([a-z][a-z])/web/reader/(\\d+)").matcher(string).find() || Pattern.compile("([a-z][a-z])/reader/(\\d+)").matcher(string).find();
        String str5 = this.f37899c;
        if (objArr == true) {
            Pattern patternCompile3 = Pattern.compile("learn/([a-z][a-z])/web/lesson/(\\d+)");
            Pattern patternCompile4 = Pattern.compile("learn/([a-z][a-z])/web/reader/(\\d+)");
            Pattern patternCompile5 = Pattern.compile("([a-z][a-z])/reader/(\\d+)");
            Matcher matcher5 = patternCompile3.matcher(string);
            Matcher matcher6 = patternCompile4.matcher(string);
            Matcher matcher7 = patternCompile5.matcher(string);
            C5207g.m11110e(matcher5, "matcher");
            ArrayList arrayListM10486x5 = C4924a.m10486x(matcher5);
            C5207g.m11110e(matcher6, "readerMatcher");
            ArrayList arrayListM10486x6 = C4924a.m10486x(matcher6);
            C5207g.m11110e(matcher7, "universalReaderMatcher");
            ArrayList arrayListM10486x7 = C4924a.m10486x(matcher7);
            String str6 = (String) C6752c.m13425S(arrayListM10486x5);
            if (str6 != null || (str6 = (String) C6752c.m13425S(arrayListM10486x6)) != null || (str6 = (String) C6752c.m13425S(arrayListM10486x6)) != null || (str6 = (String) C6752c.m13425S(arrayListM10486x7)) != null) {
                str5 = str6;
            }
            String str7 = (String) C6752c.m13433a0(arrayListM10486x5);
            if (str7 == null && (str7 = (String) C6752c.m13433a0(arrayListM10486x6)) == null) {
                String str8 = (String) C6752c.m13433a0(arrayListM10486x7);
                numValueOf = str8 != null ? Integer.valueOf(Integer.parseInt(str8)) : null;
            } else {
                numValueOf = Integer.valueOf(Integer.parseInt(str7));
            }
            Uri uri2 = Uri.parse(string);
            String queryParameter = uri2.getQueryParameter("utm_medium");
            if (queryParameter != null) {
                strM15254T2 = C7661i.m15254T2(queryParameter, "_", " ");
                if ((strM15254T2.length() > 0) != false) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf = String.valueOf(strM15254T2.charAt(0));
                    C5207g.m11109d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    sb2.append((Object) upperCase);
                    String strSubstring = strM15254T2.substring(1);
                    C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    strM15254T2 = sb2.toString();
                }
            } else {
                strM15254T2 = null;
            }
            String queryParameter2 = uri2.getQueryParameter("utm_source");
            if (queryParameter2 != null) {
                strM15254T3 = C7661i.m15254T2(queryParameter2, "_", " ");
                if (strM15254T3.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    String strValueOf2 = String.valueOf(strM15254T3.charAt(0));
                    C5207g.m11109d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    C5207g.m11110e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    sb3.append((Object) upperCase2);
                    z10 = true;
                    String strSubstring2 = strM15254T3.substring(1);
                    C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    sb3.append(strSubstring2);
                    strM15254T3 = sb3.toString();
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
                strM15254T3 = null;
            }
            AbstractC6707d.g gVar = (((arrayListM10486x5.isEmpty() ^ z10) || (arrayListM10486x6.isEmpty() ^ z10) || (arrayListM10486x7.isEmpty() ^ z10)) && numValueOf != null) ? new AbstractC6707d.g(str5, strM15254T2, numValueOf, strM15254T3) : null;
            return gVar != null ? gVar : AbstractC6707d.e.f37908a;
        }
        Matcher matcher8 = Pattern.compile("com/(\\w{2})|(\\d+).$").matcher(string);
        C5207g.m11110e(matcher8, "matcher");
        if (C4924a.m10486x(matcher8).size() == 2 && C7076b.m14278X2(string, "learn", false) && !C7076b.m14278X2(string, "library/search/", false) && !C7076b.m14278X2(string, "library/course/", false)) {
            Matcher matcher9 = Pattern.compile("com/(\\w{2})|(\\d+).$").matcher(string);
            C5207g.m11110e(matcher9, "matcher");
            ArrayList arrayListM10486x8 = C4924a.m10486x(matcher9);
            try {
                if ((!arrayListM10486x8.isEmpty()) && arrayListM10486x8.size() == 2) {
                    String str9 = (String) C7076b.m14299s3((CharSequence) C7076b.m14299s3((CharSequence) C7076b.m14299s3(string, new String[]{"com"}, 0, 6).get(1), new String[]{"/"}, 0, 6).get(2), new String[]{"-"}, 0, 6).get(1);
                    if (C5207g.m11106a(str9, "Chinese")) {
                        strM11570c = "zh";
                    } else {
                        LanguageLearn[] languageLearnArrValues = LanguageLearn.values();
                        int length = languageLearnArrValues.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                languageLearn = null;
                                break;
                            }
                            languageLearn = languageLearnArrValues[i10];
                            String lowerCase = languageLearn.name().toLowerCase(Locale.ROOT);
                            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (C5207g.m11106a(lowerCase, str9)) {
                                break;
                            }
                            i10++;
                        }
                        if (languageLearn != null) {
                            strM11570c = C5408a.m11569b(languageLearn);
                        } else {
                            LanguageLearnBeta[] languageLearnBetaArrValues = LanguageLearnBeta.values();
                            int length2 = languageLearnBetaArrValues.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    languageLearnBeta = null;
                                    break;
                                }
                                languageLearnBeta = languageLearnBetaArrValues[i11];
                                String lowerCase2 = languageLearnBeta.name().toLowerCase(Locale.ROOT);
                                C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (C5207g.m11106a(lowerCase2, str9)) {
                                    break;
                                }
                                i11++;
                            }
                            strM11570c = languageLearnBeta != null ? C5408a.m11570c(languageLearnBeta) : null;
                        }
                    }
                    String str10 = (String) C6752c.m13433a0(arrayListM10486x8);
                    Integer numValueOf2 = str10 != null ? Integer.valueOf(Integer.parseInt(str10)) : null;
                    if (strM11570c == null || numValueOf2 == null) {
                        pair2 = null;
                    } else {
                        pair2 = new Pair(strM11570c, numValueOf2);
                    }
                } else {
                    pair2 = null;
                }
            } catch (Exception unused) {
            }
            return pair2 != null ? new AbstractC6707d.g((String) pair2.f38012a, null, (Integer) pair2.f38013b, null) : AbstractC6707d.e.f37908a;
        }
        if (Pattern.compile("learn/(\\w{2})").matcher(string).find() && C7076b.m14278X2(string, "vocabulary", false)) {
            Matcher matcher10 = Pattern.compile("learn/(\\w{2})").matcher(string);
            C5207g.m11110e(matcher10, "matcher");
            ArrayList arrayListM10486x9 = C4924a.m10486x(matcher10);
            String str11 = ((arrayListM10486x9.isEmpty() ^ true) && arrayListM10486x9.size() == 1) ? (String) C6752c.m13425S(arrayListM10486x9) : null;
            return str11 != null ? new AbstractC6707d.o(str11) : AbstractC6707d.e.f37908a;
        }
        Matcher matcher11 = Pattern.compile("learn/(\\w{2})").matcher(string);
        List listM14299s3 = C7076b.m14299s3(string, new String[]{"/"}, 0, 6);
        ListIterator listIterator = listM14299s3.listIterator(listM14299s3.size());
        while (listIterator.hasPrevious()) {
            String str12 = (String) listIterator.previous();
            if (!C7661i.m15250P2(str12)) {
                if ((matcher11.find() && (C7661i.m15249O2(str12, "library") || C7661i.m15249O2(str12, "web"))) || C5207g.m11106a(string, "https://www.lingq.com/library") || C5207g.m11106a(string, "https://lingq.com/library")) {
                    Pattern patternCompile6 = Pattern.compile("learn/(\\w{2})");
                    Pattern patternCompile7 = Pattern.compile("(\\w{2})/library");
                    Matcher matcher12 = patternCompile6.matcher(string);
                    Matcher matcher13 = patternCompile7.matcher(string);
                    C5207g.m11110e(matcher12, "matcher");
                    ArrayList arrayListM10486x10 = C4924a.m10486x(matcher12);
                    C5207g.m11110e(matcher13, "universalMatcher");
                    ArrayList arrayListM10486x11 = C4924a.m10486x(matcher13);
                    String str13 = (String) C6752c.m13425S(arrayListM10486x10);
                    if (str13 == null) {
                        String str14 = (String) C6752c.m13425S(arrayListM10486x11);
                        if (str14 != null) {
                            str5 = str14;
                        }
                    } else {
                        str5 = str13;
                    }
                    return new AbstractC6707d.h(str5);
                }
                if (C7076b.m14278X2(string, "upgrade", true)) {
                    Matcher matcher14 = Pattern.compile("upgrade/(\\w*\\d*)").matcher(string);
                    C5207g.m11110e(matcher14, "matcher");
                    ArrayList arrayListM10486x12 = C4924a.m10486x(matcher14);
                    if ((!arrayListM10486x12.isEmpty()) && arrayListM10486x12.size() == 1) {
                        str = "lingq-" + C6752c.m13425S(arrayListM10486x12);
                    } else {
                        str = null;
                    }
                    return str != null ? new AbstractC6707d.n(str) : AbstractC6707d.e.f37908a;
                }
                if (Pattern.compile("learn/(\\w{2})").matcher(string).find() && (C7076b.m14278X2(string, "library/playlist", false) || C7076b.m14278X2(string, "library/folder", false))) {
                    Matcher matcher15 = Pattern.compile("learn/(\\w{2})").matcher(string);
                    C5207g.m11110e(matcher15, "matcher");
                    ArrayList arrayListM10486x13 = C4924a.m10486x(matcher15);
                    String str15 = (String) C6752c.m13423Q(C7076b.m14299s3((CharSequence) C6752c.m13432Z(C7076b.m14299s3(string, new String[]{"folder/"}, 0, 6)), new String[]{"/"}, 0, 6));
                    if (!arrayListM10486x13.isEmpty()) {
                        String str16 = (String) C6752c.m13425S(arrayListM10486x13);
                        pair = new Pair(str16 != null ? str16 : "", str15);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        A a10 = pair.f38012a;
                        if (!C7661i.m15250P2((CharSequence) a10)) {
                            return new AbstractC6707d.k(C7660h.m15246L2((String) pair.f38013b), (String) a10);
                        }
                    }
                    return AbstractC6707d.e.f37908a;
                }
                if (C7076b.m14278X2(string, "library/search/", false)) {
                    Pattern patternCompile8 = Pattern.compile("learn/(\\w{2})");
                    Pattern patternCompile9 = Pattern.compile("(\\w{2})/library/search/");
                    Matcher matcher16 = patternCompile8.matcher(string);
                    Matcher matcher17 = patternCompile9.matcher(string);
                    C5207g.m11110e(matcher16, "matcher");
                    ArrayList arrayListM10486x14 = C4924a.m10486x(matcher16);
                    C5207g.m11110e(matcher17, "universalMatcher");
                    ArrayList arrayListM10486x15 = C4924a.m10486x(matcher17);
                    String str17 = (String) C6752c.m13433a0(C7076b.m14299s3(string, new String[]{"library/search/"}, 0, 6));
                    String strM15254T4 = str17 != null ? C7661i.m15254T2(str17, "/", "") : null;
                    String str18 = (String) C6752c.m13425S(arrayListM10486x14);
                    if (str18 != null || (str18 = (String) C6752c.m13425S(arrayListM10486x15)) != null) {
                        str5 = str18;
                    }
                    Pair pair6 = strM15254T4 != null ? new Pair(str5, strM15254T4) : null;
                    return pair6 != null ? new AbstractC6707d.c((String) pair6.f38012a, (String) pair6.f38013b) : AbstractC6707d.e.f37908a;
                }
                if (!C7076b.m14278X2(string, "library/course/", false)) {
                    if (!C7076b.m14278X2(string, "settings/referrals", false)) {
                        return AbstractC6707d.e.f37908a;
                    }
                    Matcher matcher18 = Pattern.compile("learn/(\\w{2})").matcher(string);
                    C5207g.m11110e(matcher18, "pattern.matcher(url)");
                    ArrayList arrayListM10486x16 = C4924a.m10486x(matcher18);
                    String str19 = (String) C6752c.m13425S(arrayListM10486x16);
                    String str20 = (!(arrayListM10486x16.isEmpty() ^ true) || str19 == null) ? null : str19;
                    return str20 != null ? new AbstractC6707d.f(str20) : AbstractC6707d.e.f37908a;
                }
                Pattern patternCompile10 = Pattern.compile("learn/(\\w{2})");
                Pattern patternCompile11 = Pattern.compile("(\\w{2})/library/course");
                Matcher matcher19 = patternCompile10.matcher(string);
                Matcher matcher20 = patternCompile11.matcher(string);
                C5207g.m11110e(matcher19, "matcher");
                ArrayList arrayListM10486x17 = C4924a.m10486x(matcher19);
                C5207g.m11110e(matcher20, "universalMatcher");
                ArrayList arrayListM10486x18 = C4924a.m10486x(matcher20);
                String str21 = (String) C6752c.m13433a0(C7076b.m14299s3(string, new String[]{"library/course/"}, 0, 6));
                Integer numM15246L2 = str21 != null ? C7660h.m15246L2(C7661i.m15254T2(str21, "/", "")) : null;
                String str22 = (String) C6752c.m13425S(arrayListM10486x17);
                if (str22 != null || (str22 = (String) C6752c.m13425S(arrayListM10486x18)) != null) {
                    str5 = str22;
                }
                Pair pair7 = (((arrayListM10486x17.isEmpty() ^ true) || (arrayListM10486x18.isEmpty() ^ true)) && numM15246L2 != null) ? new Pair(str5, numM15246L2) : null;
                return pair7 != null ? new AbstractC6707d.d((Integer) pair7.f38013b, (String) pair7.f38012a) : AbstractC6707d.e.f37908a;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }
}
