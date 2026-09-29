package p000;

import com.lingq.core.domain.model.lesson.LessonFurigana;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenFurigana;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s7d {

    /* JADX INFO: renamed from: a */
    public static p04 f60497a;

    /* JADX WARN: Code duplicated, block: B:138:0x022c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[PHI: r17 r24
      0x00aa: PHI (r17v13 int) = 
      (r17v2 int)
      (r17v2 int)
      (r17v2 int)
      (r17v3 int)
      (r17v3 int)
      (r17v3 int)
      (r17v4 int)
      (r17v4 int)
      (r17v4 int)
      (r17v5 int)
      (r17v5 int)
      (r17v5 int)
      (r17v6 int)
      (r17v6 int)
      (r17v6 int)
      (r17v7 int)
      (r17v7 int)
      (r17v7 int)
      (r17v8 int)
      (r17v8 int)
      (r17v8 int)
      (r17v9 int)
      (r17v14 int)
     binds: [B:83:0x0136, B:85:0x013a, B:87:0x013e, B:76:0x0121, B:78:0x0124, B:80:0x0128, B:69:0x0109, B:71:0x010c, B:73:0x0110, B:62:0x00f5, B:64:0x00f8, B:66:0x00fc, B:55:0x00e1, B:57:0x00e4, B:59:0x00e8, B:48:0x00cc, B:50:0x00d0, B:52:0x00d4, B:41:0x00b7, B:43:0x00bb, B:45:0x00bf, B:38:0x00a8, B:26:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r24v14 java.util.Iterator) = 
      (r24v3 java.util.Iterator)
      (r24v3 java.util.Iterator)
      (r24v3 java.util.Iterator)
      (r24v4 java.util.Iterator)
      (r24v4 java.util.Iterator)
      (r24v4 java.util.Iterator)
      (r24v5 java.util.Iterator)
      (r24v5 java.util.Iterator)
      (r24v5 java.util.Iterator)
      (r24v6 java.util.Iterator)
      (r24v6 java.util.Iterator)
      (r24v6 java.util.Iterator)
      (r24v7 java.util.Iterator)
      (r24v7 java.util.Iterator)
      (r24v7 java.util.Iterator)
      (r24v8 java.util.Iterator)
      (r24v8 java.util.Iterator)
      (r24v8 java.util.Iterator)
      (r24v9 java.util.Iterator)
      (r24v9 java.util.Iterator)
      (r24v9 java.util.Iterator)
      (r24v11 java.util.Iterator)
      (r24v15 java.util.Iterator)
     binds: [B:83:0x0136, B:85:0x013a, B:87:0x013e, B:76:0x0121, B:78:0x0124, B:80:0x0128, B:69:0x0109, B:71:0x010c, B:73:0x0110, B:62:0x00f5, B:64:0x00f8, B:66:0x00fc, B:55:0x00e1, B:57:0x00e4, B:59:0x00e8, B:48:0x00cc, B:50:0x00d0, B:52:0x00d4, B:41:0x00b7, B:43:0x00bb, B:45:0x00bf, B:38:0x00a8, B:26:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final ox8 m21148a(LessonSentence lessonSentence, int i, int i2, boolean z, String str) {
        Iterator it;
        String str2;
        String str3;
        int length;
        int length2;
        int i3;
        String strM4839V;
        String str4;
        LessonFurigana lessonFurigana;
        LessonFurigana lessonFurigana2;
        LessonFurigana lessonFurigana3;
        lessonSentence.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = lessonSentence.f19253a.iterator();
        int i4 = i2;
        int i5 = 0;
        while (true) {
            String str5 = null;
            while (true) {
                if (!it2.hasNext()) {
                    return new ox8(i4 - i2, sb.toString(), arrayList);
                }
                LessonTextToken lessonTextToken = (LessonTextToken) it2.next();
                String str6 = lessonTextToken.f19286j;
                LessonTransliteration lessonTransliteration = lessonTextToken.f19282f;
                String str7 = lessonTextToken.f19281e;
                String str8 = lessonTextToken.f19280d;
                String str9 = lessonTextToken.f19278b;
                String str10 = lessonTextToken.f19277a;
                if (str6 == null && str10 == null && str9 == null) {
                    if (str8 != null) {
                        str5 = str8;
                    }
                    if (str7 != null) {
                        break;
                    }
                } else {
                    String str11 = str8 != null ? str8 : str5;
                    if (str10 == null) {
                        if (str9 == null) {
                            if (str6 != null) {
                                int length3 = str6.length() + i4;
                                int length4 = str6.length() + i5;
                                int i6 = lessonTextToken.f19283g;
                                int i7 = lessonTextToken.f19284h;
                                switch (str.hashCode()) {
                                    case -1904268855:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Pinyin") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19301c) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case -1841522256:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Romaji") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19300b) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case -1311598819:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Hiragana") || lessonTransliteration == null || (str4 = lessonTransliteration.f19299a) == null) {
                                            strM4839V = "";
                                        } else {
                                            strM4839V = cl9.m4839V(str4, " ", "");
                                        }
                                        break;
                                    case -702078272:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Jyutping") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19304f) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case -469838457:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Traditional") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19302d) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case 73192164:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Latin") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19306h) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case 566114168:
                                        it = it2;
                                        i3 = i4;
                                        if (!str.equals("Simplified") || lessonTransliteration == null || (strM4839V = lessonTransliteration.f19303e) == null) {
                                            strM4839V = "";
                                        }
                                        break;
                                    case 1565245555:
                                        if (str.equals("Furigana")) {
                                            if (lessonTransliteration == null || (lessonFurigana = lessonTransliteration.f19305g) == null) {
                                                it = it2;
                                            } else {
                                                it = it2;
                                                String str12 = lessonFurigana.f19229a;
                                                String str13 = lessonFurigana.f19230b;
                                                if (str12 != null && str13 != null) {
                                                    i3 = i4;
                                                    strM4839V = AbstractC3393o1.m17735j(str12, "***", str13);
                                                    break;
                                                }
                                            }
                                            i3 = i4;
                                        }
                                        strM4839V = "";
                                    default:
                                        it = it2;
                                        i3 = i4;
                                        strM4839V = "";
                                        break;
                                }
                                if (strM4839V.equalsIgnoreCase(str6)) {
                                    strM4839V = null;
                                }
                                String str14 = strM4839V != null ? strM4839V : "";
                                String str15 = lessonTransliteration != null ? lessonTransliteration.f19300b : null;
                                String str16 = lessonTransliteration != null ? lessonTransliteration.f19299a : null;
                                String str17 = lessonTransliteration != null ? lessonTransliteration.f19301c : null;
                                String str18 = lessonTransliteration != null ? lessonTransliteration.f19302d : null;
                                String str19 = lessonTransliteration != null ? lessonTransliteration.f19303e : null;
                                String str20 = lessonTransliteration != null ? lessonTransliteration.f19304f : null;
                                TokenFurigana tokenFurigana = new TokenFurigana((lessonTransliteration == null || (lessonFurigana3 = lessonTransliteration.f19305g) == null) ? null : lessonFurigana3.f19229a, (lessonTransliteration == null || (lessonFurigana2 = lessonTransliteration.f19305g) == null) ? null : lessonFurigana2.f19230b);
                                int i8 = i3;
                                str2 = str7;
                                arrayList.add(new xz7(i8, length3, i5, length4, str6, i6, i, i7, str14, new TokenTransliteration(str16, str15, str17, str18, str19, str20, tokenFurigana, lessonTransliteration != null ? lessonTransliteration.f19306h : null), TextTokenType.WORD, lessonTextToken.f19289m, lessonTextToken.f19290n, str11, lessonTextToken.f19281e, (String) null, 143360));
                                length = str6.length() + i8;
                                length2 = str6.length() + i5;
                                sb.append(str6);
                            }
                            if (str2 != null) {
                                it2 = it;
                                break;
                            }
                            str5 = str11;
                            it2 = it;
                        } else if (z) {
                            i4++;
                            i5++;
                            sb.append(" ");
                        }
                        it = it2;
                        str2 = str7;
                        if (str2 != null) {
                            it2 = it;
                            break;
                            break;
                        }
                        str5 = str11;
                        it2 = it;
                    } else {
                        it = it2;
                        str2 = str7;
                        if (lessonTextToken.f19279c) {
                            str3 = str10;
                            arrayList.add(new xz7(i4, str10.length() + i4, i5, str10.length() + i5, str3, -1, i, lessonTextToken.f19284h, (String) null, (TokenTransliteration) null, TextTokenType.PUNCT, 0, (Map) null, str11, lessonTextToken.f19281e, (String) null, 162560));
                        } else {
                            str3 = str10;
                        }
                        length = str3.length() + i4;
                        length2 = str3.length() + i5;
                        sb.append(str3);
                    }
                    i4 = length;
                    i5 = length2;
                    if (str2 != null) {
                        it2 = it;
                        break;
                        break;
                    }
                    str5 = str11;
                    it2 = it;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m21149b() {
        p04 p04Var = f60497a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(19.0f, 6.41f);
        f57Var.m11551f(17.59f, 5.0f);
        f57Var.m11551f(12.0f, 10.59f);
        f57Var.m11551f(6.41f, 5.0f);
        f57Var.m11551f(5.0f, 6.41f);
        f57Var.m11551f(10.59f, 12.0f);
        f57Var.m11551f(5.0f, 17.59f);
        f57Var.m11551f(6.41f, 19.0f);
        f57Var.m11551f(12.0f, 13.41f);
        f57Var.m11551f(17.59f, 19.0f);
        f57Var.m11551f(19.0f, 17.59f);
        f57Var.m11551f(13.41f, 12.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f60497a = p04VarM17721b;
        return p04VarM17721b;
    }
}
