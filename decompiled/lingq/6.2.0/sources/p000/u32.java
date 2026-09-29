package p000;

import android.net.Uri;
import com.lingq.core.domain.model.LanguageLearn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Triple;

/* JADX INFO: loaded from: classes.dex */
public final class u32 {
    public static final t32 Companion = new t32();

    /* JADX INFO: renamed from: a */
    public final String f63340a;

    /* JADX INFO: renamed from: b */
    public final boolean f63341b;

    /* JADX INFO: renamed from: c */
    public final String f63342c;

    /* JADX INFO: renamed from: d */
    public String f63343d;

    /* JADX INFO: renamed from: e */
    public String f63344e;

    public u32(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f63340a = str;
        this.f63341b = z;
        this.f63342c = str2;
        this.f63343d = "profile";
        this.f63344e = "en";
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22428a() {
        String str = this.f63340a;
        if (vk9.m23380c0(str, "challenges", true)) {
            List listM23365A0 = vk9.m23365A0(str, new String[]{"/"}, 0, 6);
            ListIterator listIterator = listM23365A0.listIterator(listM23365A0.size());
            while (listIterator.hasPrevious()) {
                String str2 = (String) listIterator.previous();
                if (!vk9.m23391n0(str2)) {
                    if (str2.equalsIgnoreCase("challenges")) {
                        return true;
                    }
                }
            }
            uk9.m22775i("List contains no element matching the predicate.");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x043b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final tad m22429b() {
        Integer numValueOf;
        String strM4839V;
        String strM4839V2;
        Object objPrevious;
        Pair pair;
        Integer numM4844a0;
        Pair pair2;
        int i;
        String str;
        Pair pair3;
        Object next;
        Object next2;
        String code;
        String lowerCase;
        String code2;
        String lowerCase2;
        Object next3;
        String str2;
        String string = this.f63340a;
        if (vk9.m23380c0(string, "click.lingq", false) || vk9.m23380c0(string, "links.lingq.com", false)) {
            return new o42(string);
        }
        boolean zM23380c0 = vk9.m23380c0(string, "/accounts/login/", true);
        boolean z = this.f63341b;
        Pair pair4 = null;
        uriBuild = null;
        uriBuild = null;
        Uri uriBuild = null;
        Pair pair5 = null;
        if (zM23380c0 && !vk9.m23380c0(string, "checkout", false)) {
            List<String> pathSegments = Uri.parse(string).getPathSegments();
            pathSegments.getClass();
            Iterator it = vz1.m23601G(pathSegments).iterator();
            while (true) {
                if (!((h84) it).f41941c) {
                    next3 = null;
                    break;
                }
                next3 = ((a84) it).next();
                int iIntValue = ((Number) next3).intValue();
                if (cl9.m4834Q(pathSegments.get(iIntValue), "accounts", true) && cl9.m4834Q((String) u91.m22592J0(iIntValue + 1, pathSegments), "login", true)) {
                    break;
                }
            }
            Integer num = (Integer) next3;
            if (num != null && (str2 = (String) u91.m22592J0(num.intValue() + 2, pathSegments)) != null) {
                if (vk9.m23391n0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    uriBuild = new Uri.Builder().scheme("lingq").authority("login").appendPath(str2).build();
                }
            }
            return (uriBuild == null || z) ? e42.f36689a : new k42(uriBuild);
        }
        Companion.getClass();
        if (t32.m21826a(string)) {
            Uri uri = Uri.parse(string);
            String queryParameter = uri.getQueryParameter("user_id");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String queryParameter2 = uri.getQueryParameter("email");
            return new s42(queryParameter, queryParameter2 != null ? queryParameter2 : "");
        }
        if (!z) {
            return new l42(string);
        }
        boolean zFind = (cl9.m4833P(string, "vocabulary/all/review", false) || cl9.m4833P(string, "vocabulary/all/review/", false) || cl9.m4833P(string, "vocabulary/srs/review", false) || cl9.m4833P(string, "vocabulary/srs/review/", false)) ? true : Pattern.compile("learn/([^/]+).*(\\d{4}-\\d{2}-\\d{2})").matcher(string).find();
        c42 c42Var = c42.f9436a;
        if (zFind) {
            Matcher matcher = ((cl9.m4833P(string, "vocabulary/all/review", false) || cl9.m4833P(string, "vocabulary/all/review/", false) || cl9.m4833P(string, "vocabulary/srs/review", false) || cl9.m4833P(string, "vocabulary/srs/review/", false)) ? Pattern.compile("learn/([^/]+)") : Pattern.compile("learn/([^/]+).*(\\d{4}-\\d{2}-\\d{2})")).matcher(string);
            matcher.getClass();
            ArrayList arrayListM17085D = AbstractC3352my.m17085D(matcher);
            Triple triple = arrayListM17085D.isEmpty() ? null : new Triple(u91.m22591I0(arrayListM17085D), arrayListM17085D.size() == 1 ? null : (String) u91.m22598P0(arrayListM17085D), m22430c());
            if (triple != null) {
                String str3 = (String) triple.f47633a;
                Object obj = triple.f47634b;
                String str4 = (String) obj;
                CharSequence charSequence = (CharSequence) obj;
                return new p42(str3, (String) triple.f47635c, str4, !(charSequence == null || charSequence.length() == 0) || vk9.m23380c0(string, "srs/review", false));
            }
        } else if (vk9.m23380c0(string, "challenges", true) && !m22428a()) {
            Pattern patternCompile = Pattern.compile("learn/([^/]+)|((?!.*/).+)");
            if (vk9.m23392o0(string) == '/') {
                string = vk9.m23399v0(string, string.length() - 1, string.length()).toString();
            }
            if (vk9.m23380c0(string, "/challenges/cup-2026", true)) {
                Matcher matcher2 = Pattern.compile("learn/([^/]+)").matcher(string);
                matcher2.getClass();
                pair5 = new Pair(Uri.parse("lingq://cup?openSignup=true"), (String) u91.m22591I0(AbstractC3352my.m17085D(matcher2)));
            } else {
                Matcher matcher3 = patternCompile.matcher(string);
                matcher3.getClass();
                ArrayList arrayListM17085D2 = AbstractC3352my.m17085D(matcher3);
                int size = arrayListM17085D2.size();
                if (size == 1) {
                    pair5 = new Pair(Uri.parse("lingq://challenge/" + ((String) u91.m22591I0(arrayListM17085D2))), null);
                } else if (size == 2) {
                    String str5 = (String) u91.m22591I0(arrayListM17085D2);
                    pair5 = new Pair(Uri.parse("lingq://challenge/" + str5 + "/" + ((String) u91.m22598P0(arrayListM17085D2))), str5);
                }
            }
            if (pair5 != null) {
                return new x32((Uri) pair5.f47623a, (String) pair5.f47624b);
            }
        } else if (m22428a()) {
            Pattern patternCompile2 = Pattern.compile("learn/([^/]+)|((?!.*/).+)");
            if (vk9.m23392o0(string) == '/') {
                string = vk9.m23399v0(string, string.length() - 1, string.length()).toString();
            }
            Matcher matcher4 = patternCompile2.matcher(string);
            matcher4.getClass();
            ArrayList arrayListM17085D3 = AbstractC3352my.m17085D(matcher4);
            int size2 = arrayListM17085D3.size();
            if (size2 == 1) {
                pair4 = new Pair(Uri.parse("lingq://challenges"), null);
            } else if (size2 == 2) {
                String str6 = (String) u91.m22591I0(arrayListM17085D3);
                pair4 = new Pair(Uri.parse("lingq://challenges/" + str6), str6);
            }
            if (pair4 != null) {
                return new y32((Uri) pair4.f47623a, (String) pair4.f47624b);
            }
        } else {
            String path = Uri.parse(string).getPath();
            String strM23378N0 = path != null ? vk9.m23378N0(path, '/') : null;
            if (strM23378N0 == null) {
                strM23378N0 = "";
            }
            if (cl9.m4833P(strM23378N0, "/cup-2026", true) && !vk9.m23380c0(strM23378N0, "challenges", true)) {
                return new x32(Uri.parse("lingq://cup"), null);
            }
            Pattern patternCompile3 = Pattern.compile("learn/([^/]+)/web/lesson/(\\d+)");
            Pattern patternCompile4 = Pattern.compile("learn/([^/]+)/web/reader/(\\d+)");
            Pattern patternCompile5 = Pattern.compile("([^/]+)/reader/(\\d+)");
            Matcher matcher5 = patternCompile3.matcher(string);
            Matcher matcher6 = patternCompile4.matcher(string);
            boolean zFind2 = matcher5.find();
            String str7 = this.f63342c;
            if (zFind2 || matcher6.find() || patternCompile5.matcher(string).find()) {
                Pattern patternCompile6 = Pattern.compile("learn/([^/]+)/web/lesson/(\\d+)");
                Pattern patternCompile7 = Pattern.compile("learn/([^/]+)/web/reader/(\\d+)");
                Pattern patternCompile8 = Pattern.compile("([^/]+)/reader/(\\d+)");
                Matcher matcher7 = patternCompile6.matcher(string);
                Matcher matcher8 = patternCompile7.matcher(string);
                Matcher matcher9 = patternCompile8.matcher(string);
                matcher7.getClass();
                ArrayList arrayListM17085D4 = AbstractC3352my.m17085D(matcher7);
                matcher8.getClass();
                ArrayList arrayListM17085D5 = AbstractC3352my.m17085D(matcher8);
                matcher9.getClass();
                ArrayList arrayListM17085D6 = AbstractC3352my.m17085D(matcher9);
                String str8 = (String) u91.m22591I0(arrayListM17085D4);
                if (str8 != null || (str8 = (String) u91.m22591I0(arrayListM17085D5)) != null || (str8 = (String) u91.m22591I0(arrayListM17085D5)) != null || (str8 = (String) u91.m22591I0(arrayListM17085D6)) != null) {
                    str7 = str8;
                }
                String str9 = (String) u91.m22598P0(arrayListM17085D4);
                if (str9 == null && (str9 = (String) u91.m22598P0(arrayListM17085D5)) == null) {
                    String str10 = (String) u91.m22598P0(arrayListM17085D6);
                    numValueOf = str10 != null ? Integer.valueOf(Integer.parseInt(str10)) : null;
                } else {
                    numValueOf = Integer.valueOf(Integer.parseInt(str9));
                }
                Uri uri2 = Uri.parse(string);
                String queryParameter3 = uri2.getQueryParameter("utm_medium");
                if (queryParameter3 != null) {
                    strM4839V = cl9.m4839V(queryParameter3, "_", " ");
                    if (strM4839V.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(strM4839V.charAt(0));
                        strValueOf.getClass();
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(strM4839V.substring(1));
                        strM4839V = sb.toString();
                    }
                } else {
                    strM4839V = null;
                }
                String queryParameter4 = uri2.getQueryParameter("utm_source");
                if (queryParameter4 != null) {
                    strM4839V2 = cl9.m4839V(queryParameter4, "_", " ");
                    if (strM4839V2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String strValueOf2 = String.valueOf(strM4839V2.charAt(0));
                        strValueOf2.getClass();
                        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        sb2.append((Object) upperCase2);
                        sb2.append(strM4839V2.substring(1));
                        strM4839V2 = sb2.toString();
                    }
                } else {
                    strM4839V2 = null;
                }
                h42 h42Var = ((arrayListM17085D4.isEmpty() && arrayListM17085D5.isEmpty() && arrayListM17085D6.isEmpty()) || numValueOf == null) ? null : new h42(str7, numValueOf, strM4839V, strM4839V2);
                if (h42Var != null) {
                    return h42Var;
                }
            } else {
                Matcher matcher10 = Pattern.compile("com/(\\w{2})|(\\d+).$").matcher(string);
                matcher10.getClass();
                if (AbstractC3352my.m17085D(matcher10).size() == 2 && vk9.m23380c0(string, "learn", false) && !vk9.m23380c0(string, "library/search/", false) && !vk9.m23380c0(string, "library/course/", false)) {
                    Matcher matcher11 = Pattern.compile("com/(\\w{2})|(\\d+).$").matcher(string);
                    matcher11.getClass();
                    ArrayList arrayListM17085D7 = AbstractC3352my.m17085D(matcher11);
                    try {
                        if (arrayListM17085D7.isEmpty() || arrayListM17085D7.size() != 2) {
                            pair3 = null;
                        } else {
                            String str11 = (String) vk9.m23365A0((CharSequence) vk9.m23365A0((CharSequence) vk9.m23365A0(string, new String[]{"com"}, 0, 6).get(1), new String[]{"/"}, 0, 6).get(2), new String[]{"-"}, 0, 6).get(1);
                            if (fa4.m11650l(str11, "Chinese")) {
                                code = "zh";
                            } else {
                                Iterator<E> it2 = LanguageLearn.getEntries().iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    lowerCase2 = ((LanguageLearn) next).name().toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                } while (!lowerCase2.equals(str11));
                                LanguageLearn languageLearn = (LanguageLearn) next;
                                if (languageLearn == null || (code2 = languageLearn.getCode()) == null) {
                                    Iterator<E> it3 = LanguageLearn.getEntries().iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                        lowerCase = ((LanguageLearn) next2).name().toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                    } while (!lowerCase.equals(str11));
                                    LanguageLearn languageLearn2 = (LanguageLearn) next2;
                                    code = languageLearn2 != null ? languageLearn2.getCode() : null;
                                } else {
                                    code = code2;
                                }
                            }
                            String str12 = (String) u91.m22598P0(arrayListM17085D7);
                            Integer numValueOf2 = str12 != null ? Integer.valueOf(Integer.parseInt(str12)) : null;
                            if (code == null || numValueOf2 == null) {
                                pair3 = null;
                            } else {
                                pair3 = new Pair(code, numValueOf2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return pair3 != null ? new h42((String) pair3.f47623a, (Integer) pair3.f47624b, null, null) : c42Var;
                }
                if (Pattern.compile("learn/([^/]+)").matcher(string).find() && vk9.m23380c0(string, "vocabulary", false)) {
                    Matcher matcher12 = Pattern.compile("learn/([^/]+)").matcher(string);
                    matcher12.getClass();
                    ArrayList arrayListM17085D8 = AbstractC3352my.m17085D(matcher12);
                    Pair pair6 = (arrayListM17085D8.isEmpty() || arrayListM17085D8.size() != 1) ? null : new Pair(u91.m22591I0(arrayListM17085D8), (String) u91.m22598P0(vk9.m23365A0(string, new String[]{"/vocabulary/"}, 0, 6)));
                    String str13 = pair6 != null ? (String) pair6.f47623a : null;
                    if (str13 != null) {
                        return new r42(str13, (String) pair6.f47624b);
                    }
                } else {
                    if (vk9.m23380c0(string, "web/editor", false)) {
                        Matcher matcher13 = Pattern.compile("learn/([^/]+)").matcher(string);
                        matcher13.getClass();
                        String str14 = (String) u91.m22591I0(AbstractC3352my.m17085D(matcher13));
                        if (str14 != null) {
                            str7 = str14;
                        }
                        return new d42(str7);
                    }
                    Matcher matcher14 = Pattern.compile("learn/([^/]+)").matcher(string);
                    List listM23365A0 = vk9.m23365A0(string, new String[]{"/"}, 0, 6);
                    ListIterator listIterator = listM23365A0.listIterator(listM23365A0.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (vk9.m23391n0((String) objPrevious));
                    String str15 = (String) objPrevious;
                    Object[] objArr = z && vk9.m23380c0(string, "?next=/en/library", false);
                    Set setM20855w0 = AbstractC3550rv.m20855w0(new String[]{"https://www.lingq.com/library", "https://www.lingq.com/library/", "https://lingq.com/library", "https://lingq.com/library/"});
                    if ((matcher14.find() && (cl9.m4834Q(str15, "library", true) || cl9.m4834Q(str15, "web", true))) || setM20855w0.contains(string) || objArr == true) {
                        Pattern patternCompile9 = Pattern.compile("learn/([^/]+)");
                        Pattern patternCompile10 = Pattern.compile("(\\w{2})/library");
                        Matcher matcher15 = patternCompile9.matcher(string);
                        Matcher matcher16 = patternCompile10.matcher(string);
                        matcher15.getClass();
                        ArrayList arrayListM17085D9 = AbstractC3352my.m17085D(matcher15);
                        matcher16.getClass();
                        ArrayList arrayListM17085D10 = AbstractC3352my.m17085D(matcher16);
                        String str16 = (String) u91.m22591I0(arrayListM17085D9);
                        if (str16 == null) {
                            String str17 = (String) u91.m22591I0(arrayListM17085D10);
                            if (str17 != null) {
                                str7 = str17;
                            }
                        } else {
                            str7 = str16;
                        }
                        return new i42(str7);
                    }
                    String path2 = Uri.parse(string).getPath();
                    String strM23378N1 = path2 != null ? vk9.m23378N0(path2, '/') : null;
                    if (strM23378N1 == null) {
                        strM23378N1 = "";
                    }
                    if (cl9.m4833P(strM23378N1, "/accounts/subscription", true)) {
                        return new q42(null, string, m22431d());
                    }
                    if (vk9.m23380c0(string, "upgrade", true) || vk9.m23380c0(string, "en/signup/", true)) {
                        Matcher matcher17 = Pattern.compile("upgrade/(\\w*\\d*)").matcher(string);
                        matcher17.getClass();
                        ArrayList arrayListM17085D11 = AbstractC3352my.m17085D(matcher17);
                        String strM17733h = (arrayListM17085D11.isEmpty() || arrayListM17085D11.size() != 1) ? null : AbstractC3393o1.m17733h(u91.m22591I0(arrayListM17085D11), "lq-");
                        sm5.Companion.getClass();
                        h0a.f41641a.mo11430a("[Offers] getUpgradePromo url=" + string + " → " + strM17733h, new Object[0]);
                        boolean zM22431d = m22431d();
                        return strM17733h != null ? new q42(strM17733h, string, zM22431d) : new q42("lq-standard", string, zM22431d);
                    }
                    if (vk9.m23380c0(string, "accounts/subscription", true) && vk9.m23380c0(string, "/checkout", true)) {
                        Matcher matcher18 = Pattern.compile("/([^/]+)/checkout/?").matcher(string);
                        matcher18.getClass();
                        ArrayList arrayListM17085D12 = AbstractC3352my.m17085D(matcher18);
                        String strConcat = (arrayListM17085D12.isEmpty() || (str = (String) u91.m22591I0(arrayListM17085D12)) == null || vk9.m23391n0(str)) ? null : "lq-".concat(str);
                        boolean zM22431d2 = m22431d();
                        return strConcat != null ? new q42(strConcat, string, zM22431d2) : new q42("lq-standard", string, zM22431d2);
                    }
                    if (vk9.m23380c0(string, "lingqs-offer", true)) {
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            int length = string.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                char cCharAt = string.charAt(i2);
                                if (Character.isDigit(cCharAt)) {
                                    sb3.append(cCharAt);
                                }
                            }
                            i = Integer.parseInt(sb3.toString());
                        } catch (Exception unused2) {
                            i = -1;
                        }
                        return i != -1 ? new j42(i) : c42Var;
                    }
                    if (Pattern.compile("learn/([^/]+)").matcher(string).find() && (vk9.m23380c0(string, "library/playlist", false) || vk9.m23380c0(string, "library/folder", false))) {
                        Matcher matcher19 = Pattern.compile("learn/([^/]+)").matcher(string);
                        matcher19.getClass();
                        ArrayList arrayListM17085D13 = AbstractC3352my.m17085D(matcher19);
                        String str18 = (String) u91.m22589G0(vk9.m23365A0((CharSequence) u91.m22597O0(vk9.m23365A0(string, new String[]{"folder/"}, 0, 6)), new String[]{"/"}, 0, 6));
                        if (arrayListM17085D13.isEmpty()) {
                            pair2 = null;
                        } else {
                            String str19 = (String) u91.m22591I0(arrayListM17085D13);
                            pair2 = new Pair(str19 != null ? str19 : "", str18);
                        }
                        if (pair2 != null) {
                            Object obj2 = pair2.f47623a;
                            if (!vk9.m23391n0((CharSequence) obj2)) {
                                return new n42(cl9.m4844a0((String) pair2.f47624b), (String) obj2);
                            }
                        }
                    } else if (vk9.m23380c0(string, "search/guided", false)) {
                        Matcher matcher20 = Pattern.compile("learn/([^/]+)").matcher(string);
                        matcher20.getClass();
                        ArrayList arrayListM17085D14 = AbstractC3352my.m17085D(matcher20);
                        String str20 = (String) u91.m22598P0(vk9.m23365A0(string, new String[]{"library/search/"}, 0, 6));
                        String strM4839V3 = str20 != null ? cl9.m4839V(str20, "/", "") : null;
                        String str21 = (String) u91.m22591I0(arrayListM17085D14);
                        if (str21 != null) {
                            str7 = str21;
                        }
                        Matcher matcher21 = Pattern.compile("[?&]level=([0-9]+)").matcher(string);
                        matcher21.getClass();
                        String str22 = (String) u91.m22591I0(AbstractC3352my.m17085D(matcher21));
                        Pair pair7 = strM4839V3 != null ? new Pair(str7, Integer.valueOf((str22 == null || (numM4844a0 = cl9.m4844a0(str22)) == null) ? 1 : numM4844a0.intValue())) : null;
                        if (pair7 != null) {
                            return new b42((String) pair7.f47623a, ((Number) pair7.f47624b).intValue());
                        }
                    } else if (vk9.m23380c0(string, "library/search/", false)) {
                        Pattern patternCompile11 = Pattern.compile("learn/([^/]+)");
                        Pattern patternCompile12 = Pattern.compile("(\\w{2})/library/search/");
                        Matcher matcher22 = patternCompile11.matcher(string);
                        Matcher matcher23 = patternCompile12.matcher(string);
                        matcher22.getClass();
                        ArrayList arrayListM17085D15 = AbstractC3352my.m17085D(matcher22);
                        matcher23.getClass();
                        ArrayList arrayListM17085D16 = AbstractC3352my.m17085D(matcher23);
                        String str23 = (String) u91.m22598P0(vk9.m23365A0(string, new String[]{"library/search/"}, 0, 6));
                        String strM4839V4 = str23 != null ? cl9.m4839V(str23, "/", "") : null;
                        String str24 = (String) u91.m22591I0(arrayListM17085D15);
                        if (str24 != null || (str24 = (String) u91.m22591I0(arrayListM17085D16)) != null) {
                            str7 = str24;
                        }
                        Pair pair8 = strM4839V4 != null ? new Pair(str7, strM4839V4) : null;
                        if (pair8 != null) {
                            return new z32((String) pair8.f47623a, (String) pair8.f47624b);
                        }
                    } else if (vk9.m23380c0(string, "library/course/", false)) {
                        Pattern patternCompile13 = Pattern.compile("learn/([^/]+)");
                        Pattern patternCompile14 = Pattern.compile("(\\w{2})/library/course");
                        Matcher matcher24 = patternCompile13.matcher(string);
                        Matcher matcher25 = patternCompile14.matcher(string);
                        matcher24.getClass();
                        ArrayList arrayListM17085D17 = AbstractC3352my.m17085D(matcher24);
                        matcher25.getClass();
                        ArrayList arrayListM17085D18 = AbstractC3352my.m17085D(matcher25);
                        String str25 = (String) u91.m22598P0(vk9.m23365A0(string, new String[]{"library/course/"}, 0, 6));
                        Integer numM4844a1 = str25 != null ? cl9.m4844a0(cl9.m4839V(str25, "/", "")) : null;
                        String str26 = (String) u91.m22591I0(arrayListM17085D17);
                        if (str26 != null || (str26 = (String) u91.m22591I0(arrayListM17085D18)) != null) {
                            str7 = str26;
                        }
                        Pair pair9 = ((arrayListM17085D17.isEmpty() && arrayListM17085D18.isEmpty()) || numM4844a1 == null) ? null : new Pair(str7, numM4844a1);
                        if (pair9 != null) {
                            return new a42((Integer) pair9.f47624b, (String) pair9.f47623a);
                        }
                    } else if (vk9.m23380c0(string, "settings/referrals", false)) {
                        Matcher matcher26 = Pattern.compile("learn/([^/]+)").matcher(string);
                        matcher26.getClass();
                        ArrayList arrayListM17085D19 = AbstractC3352my.m17085D(matcher26);
                        String str27 = (String) u91.m22591I0(arrayListM17085D19);
                        String str28 = (arrayListM17085D19.isEmpty() || str27 == null) ? null : str27;
                        if (str28 != null) {
                            return new f42(str28);
                        }
                    } else {
                        if (vk9.m23380c0(string, "year_in_review", true)) {
                            return new t42(this.f63344e, ux5.m22991n("https://www.lingq.com/", this.f63344e, "/profile/", this.f63343d, "/year-at-lingq-2024/"));
                        }
                        Matcher matcher27 = Pattern.compile("/([a-z]{2})/learn/([a-z]{2})/web/profile/(?:[\\w]+)?$").matcher(string);
                        matcher27.getClass();
                        ArrayList arrayListM17085D20 = AbstractC3352my.m17085D(matcher27);
                        String str29 = (String) u91.m22591I0(arrayListM17085D20);
                        if (!arrayListM17085D20.isEmpty() && str29 != null) {
                            Matcher matcher28 = Pattern.compile("/([a-z]{2})/learn/([a-z]{2})/web/profile/(?:[\\w]+)?$").matcher(string);
                            matcher28.getClass();
                            ArrayList arrayListM17085D21 = AbstractC3352my.m17085D(matcher28);
                            String str30 = (String) u91.m22598P0(arrayListM17085D21);
                            if (arrayListM17085D21.isEmpty() || str30 == null) {
                                pair = null;
                            } else {
                                String strM22430c = m22430c();
                                pair = new Pair(str30, strM22430c != null ? strM22430c : "");
                            }
                            if (pair != null) {
                                return new g42((String) pair.f47623a, (String) pair.f47624b);
                            }
                        } else if (vk9.m23380c0(string, "lynx", false)) {
                            Matcher matcher29 = Pattern.compile("/[^/]+/([a-z]{2})[/$]").matcher(string);
                            matcher29.getClass();
                            return new m42((String) u91.m22598P0(AbstractC3352my.m17085D(matcher29)));
                        }
                    }
                }
            }
        }
        return c42Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m22430c() {
        String str = this.f63340a;
        if (!vk9.m23380c0(str, "learn", false) || !vk9.m23380c0(str, "web", false)) {
            return null;
        }
        List listM23365A0 = vk9.m23365A0(str, new String[]{"/"}, 0, 6);
        return (String) u91.m22592J0(listM23365A0.indexOf("learn") - 1, listM23365A0);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22431d() {
        String queryParameter = Uri.parse(this.f63340a).getQueryParameter("useWeb");
        return queryParameter != null && queryParameter.equalsIgnoreCase("true");
    }
}
