package com.lingq.core.token.domain;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenReadings;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.ao0;
import p000.fa4;
import p000.fm3;
import p000.s7b;
import p000.si7;
import p000.u91;

/* JADX INFO: renamed from: com.lingq.core.token.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1905b {

    /* JADX INFO: renamed from: a */
    public final s7b f23857a;

    /* JADX INFO: renamed from: b */
    public final ao0 f23858b;

    /* JADX INFO: renamed from: c */
    public final fm3 f23859c;

    public C1905b(s7b s7bVar, ao0 ao0Var, fm3 fm3Var) {
        s7bVar.getClass();
        ao0Var.getClass();
        this.f23857a = s7bVar;
        this.f23858b = ao0Var;
        this.f23859c = fm3Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m8714d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return u91.m22596N0(arrayList, " • ", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:21:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m8715a(java.lang.String r12, java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.token.domain.C1905b.m8715a(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:21:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m8716b(java.lang.String r12, java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.token.domain.C1905b.m8716b(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public final Object m8717c(String str, String str2, boolean z, List list, TokenTransliteration tokenTransliteration, ContinuationImpl continuationImpl) throws Throwable {
        GetAsianScriptUseCase$invoke$1 getAsianScriptUseCase$invoke$1;
        List list2;
        TokenTransliteration tokenTransliteration2;
        Pair pair;
        Object objM8718e;
        String str3;
        boolean z2;
        TokenTransliteration tokenTransliteration3;
        Pair pair2;
        Pair pair3;
        CharSequence charSequence;
        String str4;
        CharSequence charSequence2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Object objM8720g;
        String str10 = str;
        String str11 = str2;
        boolean z3 = z;
        if (continuationImpl instanceof GetAsianScriptUseCase$invoke$1) {
            getAsianScriptUseCase$invoke$1 = (GetAsianScriptUseCase$invoke$1) continuationImpl;
            int i = getAsianScriptUseCase$invoke$1.f23781j;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAsianScriptUseCase$invoke$1.f23781j = i - Integer.MIN_VALUE;
            } else {
                getAsianScriptUseCase$invoke$1 = new GetAsianScriptUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getAsianScriptUseCase$invoke$1 = new GetAsianScriptUseCase$invoke$1(this, continuationImpl);
        }
        Object objM8716b = getAsianScriptUseCase$invoke$1.f23779h;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAsianScriptUseCase$invoke$1.f23781j;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = getAsianScriptUseCase$invoke$1.f23778g;
                TokenTransliteration tokenTransliteration4 = getAsianScriptUseCase$invoke$1.f23775d;
                List list3 = getAsianScriptUseCase$invoke$1.f23774c;
                String str12 = getAsianScriptUseCase$invoke$1.f23773b;
                String str13 = getAsianScriptUseCase$invoke$1.f23772a;
                AbstractC3193b.m15359b(objM8716b);
                z3 = z4;
                str10 = str13;
                tokenTransliteration2 = tokenTransliteration4;
                str11 = str12;
                pair = (Pair) objM8716b;
                getAsianScriptUseCase$invoke$1.f23772a = str10;
                getAsianScriptUseCase$invoke$1.f23773b = null;
                getAsianScriptUseCase$invoke$1.f23774c = null;
                getAsianScriptUseCase$invoke$1.f23775d = tokenTransliteration2;
                getAsianScriptUseCase$invoke$1.f23776e = null;
                getAsianScriptUseCase$invoke$1.f23777f = pair;
                getAsianScriptUseCase$invoke$1.f23778g = z3;
                getAsianScriptUseCase$invoke$1.f23781j = 2;
                objM8718e = m8718e(str10, str11, getAsianScriptUseCase$invoke$1);
                if (objM8718e != obj) {
                    TokenTransliteration tokenTransliteration5 = tokenTransliteration2;
                    str3 = str10;
                    z2 = z3;
                    tokenTransliteration3 = tokenTransliteration5;
                    objM8716b = objM8718e;
                    pair2 = pair;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    boolean z5 = getAsianScriptUseCase$invoke$1.f23778g;
                    list2 = getAsianScriptUseCase$invoke$1.f23774c;
                    String str14 = getAsianScriptUseCase$invoke$1.f23772a;
                    AbstractC3193b.m15359b(objM8716b);
                    z3 = z5;
                    str10 = str14;
                    str7 = (String) objM8716b;
                    getAsianScriptUseCase$invoke$1.f23772a = str10;
                    getAsianScriptUseCase$invoke$1.f23773b = null;
                    getAsianScriptUseCase$invoke$1.f23774c = null;
                    getAsianScriptUseCase$invoke$1.f23775d = null;
                    getAsianScriptUseCase$invoke$1.f23776e = str7;
                    getAsianScriptUseCase$invoke$1.f23778g = z3;
                    getAsianScriptUseCase$invoke$1.f23781j = 4;
                    objM8716b = m8715a(str10, list2, getAsianScriptUseCase$invoke$1);
                    if (objM8716b != obj) {
                        boolean z6 = z3;
                        str8 = str10;
                        z2 = z6;
                        str9 = str7;
                    }
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = getAsianScriptUseCase$invoke$1.f23774c;
                        AbstractC3193b.m15359b(objM8716b);
                        return objM8716b;
                    }
                    z2 = getAsianScriptUseCase$invoke$1.f23778g;
                    str9 = getAsianScriptUseCase$invoke$1.f23776e;
                    List list5 = getAsianScriptUseCase$invoke$1.f23774c;
                    str8 = getAsianScriptUseCase$invoke$1.f23772a;
                    AbstractC3193b.m15359b(objM8716b);
                }
                str4 = str9;
                str5 = (String) objM8716b;
                str3 = str8;
                getAsianScriptUseCase$invoke$1.f23772a = null;
                getAsianScriptUseCase$invoke$1.f23773b = null;
                getAsianScriptUseCase$invoke$1.f23774c = null;
                getAsianScriptUseCase$invoke$1.f23775d = null;
                getAsianScriptUseCase$invoke$1.f23776e = null;
                getAsianScriptUseCase$invoke$1.f23777f = null;
                getAsianScriptUseCase$invoke$1.f23778g = z2;
                getAsianScriptUseCase$invoke$1.f23781j = 5;
                objM8720g = m8720g(str3, str4, str5, getAsianScriptUseCase$invoke$1);
                if (objM8720g == obj) {
                    return objM8720g;
                }
            } else {
                z2 = getAsianScriptUseCase$invoke$1.f23778g;
                pair2 = getAsianScriptUseCase$invoke$1.f23777f;
                tokenTransliteration3 = getAsianScriptUseCase$invoke$1.f23775d;
                List list6 = getAsianScriptUseCase$invoke$1.f23774c;
                str3 = getAsianScriptUseCase$invoke$1.f23772a;
                AbstractC3193b.m15359b(objM8716b);
            }
            pair3 = (Pair) objM8716b;
            charSequence = (CharSequence) pair2.f47623a;
            if (charSequence.length() == 0) {
                charSequence = (String) pair3.f47623a;
            }
            str4 = (String) charSequence;
            charSequence2 = (CharSequence) pair2.f47624b;
            if (charSequence2.length() == 0) {
                charSequence2 = (String) pair3.f47624b;
            }
            str5 = (String) charSequence2;
            if (tokenTransliteration3 != null) {
                if (str4.length() == 0) {
                    str6 = tokenTransliteration3.f19621c;
                    if (fa4.m11650l(str3, LanguageLearn.Mandarin.getCode()) ? !fa4.m11650l(str3, LanguageLearn.ChineseTraditional.getCode()) ? !fa4.m11650l(str3, LanguageLearn.Japanese.getCode()) ? !fa4.m11650l(str3, LanguageLearn.Cantonese.getCode()) ? !AbstractC3184kh.m15230y(str3) || (str6 = tokenTransliteration3.f19626h) == null : (str6 = tokenTransliteration3.f19624f) == null : (str6 = tokenTransliteration3.f19620b) == null : str6 == null : str6 == null) {
                    }
                    str4 = str6;
                }
                if (str5.length() == 0) {
                    str5 = tokenTransliteration3.f19623e;
                    if (fa4.m11650l(str3, LanguageLearn.Mandarin.getCode()) ? !fa4.m11650l(str3, LanguageLearn.ChineseTraditional.getCode()) ? !fa4.m11650l(str3, LanguageLearn.Japanese.getCode()) ? !fa4.m11650l(str3, LanguageLearn.Cantonese.getCode()) || str5 == null : (str5 = tokenTransliteration3.f19619a) == null : str5 == null : (str5 = tokenTransliteration3.f19622d) == null) {
                    }
                }
            }
            getAsianScriptUseCase$invoke$1.f23772a = null;
            getAsianScriptUseCase$invoke$1.f23773b = null;
            getAsianScriptUseCase$invoke$1.f23774c = null;
            getAsianScriptUseCase$invoke$1.f23775d = null;
            getAsianScriptUseCase$invoke$1.f23776e = null;
            getAsianScriptUseCase$invoke$1.f23777f = null;
            getAsianScriptUseCase$invoke$1.f23778g = z2;
            getAsianScriptUseCase$invoke$1.f23781j = 5;
            objM8720g = m8720g(str3, str4, str5, getAsianScriptUseCase$invoke$1);
            if (objM8720g == obj) {
                return objM8720g;
            }
        } else {
            AbstractC3193b.m15359b(objM8716b);
            if (z3) {
                getAsianScriptUseCase$invoke$1.f23772a = str10;
                getAsianScriptUseCase$invoke$1.f23773b = str11;
                getAsianScriptUseCase$invoke$1.f23774c = null;
                tokenTransliteration2 = tokenTransliteration;
                getAsianScriptUseCase$invoke$1.f23775d = tokenTransliteration2;
                getAsianScriptUseCase$invoke$1.f23776e = null;
                getAsianScriptUseCase$invoke$1.f23778g = z3;
                getAsianScriptUseCase$invoke$1.f23781j = 1;
                objM8716b = m8719f(str10, str11, getAsianScriptUseCase$invoke$1);
                if (objM8716b != obj) {
                    pair = (Pair) objM8716b;
                    getAsianScriptUseCase$invoke$1.f23772a = str10;
                    getAsianScriptUseCase$invoke$1.f23773b = null;
                    getAsianScriptUseCase$invoke$1.f23774c = null;
                    getAsianScriptUseCase$invoke$1.f23775d = tokenTransliteration2;
                    getAsianScriptUseCase$invoke$1.f23776e = null;
                    getAsianScriptUseCase$invoke$1.f23777f = pair;
                    getAsianScriptUseCase$invoke$1.f23778g = z3;
                    getAsianScriptUseCase$invoke$1.f23781j = 2;
                    objM8718e = m8718e(str10, str11, getAsianScriptUseCase$invoke$1);
                    if (objM8718e != obj) {
                        TokenTransliteration tokenTransliteration6 = tokenTransliteration2;
                        str3 = str10;
                        z2 = z3;
                        tokenTransliteration3 = tokenTransliteration6;
                        objM8716b = objM8718e;
                        pair2 = pair;
                        pair3 = (Pair) objM8716b;
                        charSequence = (CharSequence) pair2.f47623a;
                        if (charSequence.length() == 0) {
                            charSequence = (String) pair3.f47623a;
                        }
                        str4 = (String) charSequence;
                        charSequence2 = (CharSequence) pair2.f47624b;
                        if (charSequence2.length() == 0) {
                            charSequence2 = (String) pair3.f47624b;
                        }
                        str5 = (String) charSequence2;
                        if (tokenTransliteration3 != null) {
                            if (str4.length() == 0) {
                                str6 = tokenTransliteration3.f19621c;
                                str6 = fa4.m11650l(str3, LanguageLearn.Mandarin.getCode()) ? "" : "";
                                str4 = str6;
                            }
                            if (str5.length() == 0) {
                                str5 = tokenTransliteration3.f19623e;
                                str5 = fa4.m11650l(str3, LanguageLearn.Mandarin.getCode()) ? "" : "";
                            }
                        }
                        getAsianScriptUseCase$invoke$1.f23772a = null;
                        getAsianScriptUseCase$invoke$1.f23773b = null;
                        getAsianScriptUseCase$invoke$1.f23774c = null;
                        getAsianScriptUseCase$invoke$1.f23775d = null;
                        getAsianScriptUseCase$invoke$1.f23776e = null;
                        getAsianScriptUseCase$invoke$1.f23777f = null;
                        getAsianScriptUseCase$invoke$1.f23778g = z2;
                        getAsianScriptUseCase$invoke$1.f23781j = 5;
                        objM8720g = m8720g(str3, str4, str5, getAsianScriptUseCase$invoke$1);
                        if (objM8720g == obj) {
                            return objM8720g;
                        }
                    }
                }
            } else {
                getAsianScriptUseCase$invoke$1.f23772a = str10;
                getAsianScriptUseCase$invoke$1.f23773b = null;
                getAsianScriptUseCase$invoke$1.f23774c = list;
                getAsianScriptUseCase$invoke$1.f23775d = null;
                getAsianScriptUseCase$invoke$1.f23776e = null;
                getAsianScriptUseCase$invoke$1.f23778g = z3;
                getAsianScriptUseCase$invoke$1.f23781j = 3;
                objM8716b = m8716b(str10, list, getAsianScriptUseCase$invoke$1);
                if (objM8716b != obj) {
                    list2 = list;
                    str7 = (String) objM8716b;
                    getAsianScriptUseCase$invoke$1.f23772a = str10;
                    getAsianScriptUseCase$invoke$1.f23773b = null;
                    getAsianScriptUseCase$invoke$1.f23774c = null;
                    getAsianScriptUseCase$invoke$1.f23775d = null;
                    getAsianScriptUseCase$invoke$1.f23776e = str7;
                    getAsianScriptUseCase$invoke$1.f23778g = z3;
                    getAsianScriptUseCase$invoke$1.f23781j = 4;
                    objM8716b = m8715a(str10, list2, getAsianScriptUseCase$invoke$1);
                    if (objM8716b != obj) {
                        boolean z7 = z3;
                        str8 = str10;
                        z2 = z7;
                        str9 = str7;
                        str4 = str9;
                        str5 = (String) objM8716b;
                        str3 = str8;
                        getAsianScriptUseCase$invoke$1.f23772a = null;
                        getAsianScriptUseCase$invoke$1.f23773b = null;
                        getAsianScriptUseCase$invoke$1.f23774c = null;
                        getAsianScriptUseCase$invoke$1.f23775d = null;
                        getAsianScriptUseCase$invoke$1.f23776e = null;
                        getAsianScriptUseCase$invoke$1.f23777f = null;
                        getAsianScriptUseCase$invoke$1.f23778g = z2;
                        getAsianScriptUseCase$invoke$1.f23781j = 5;
                        objM8720g = m8720g(str3, str4, str5, getAsianScriptUseCase$invoke$1);
                        if (objM8720g == obj) {
                            return objM8720g;
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Serializable m8718e(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetAsianScriptUseCase$scriptsForCard$1 getAsianScriptUseCase$scriptsForCard$1;
        LessonTransliteration lessonTransliterationM8041i;
        if (continuationImpl instanceof GetAsianScriptUseCase$scriptsForCard$1) {
            getAsianScriptUseCase$scriptsForCard$1 = (GetAsianScriptUseCase$scriptsForCard$1) continuationImpl;
            int i = getAsianScriptUseCase$scriptsForCard$1.f23785d;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAsianScriptUseCase$scriptsForCard$1.f23785d = i - Integer.MIN_VALUE;
            } else {
                getAsianScriptUseCase$scriptsForCard$1 = new GetAsianScriptUseCase$scriptsForCard$1(this, continuationImpl);
            }
        } else {
            getAsianScriptUseCase$scriptsForCard$1 = new GetAsianScriptUseCase$scriptsForCard$1(this, continuationImpl);
        }
        Object objM7116f = getAsianScriptUseCase$scriptsForCard$1.f23783b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAsianScriptUseCase$scriptsForCard$1.f23785d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7116f);
            getAsianScriptUseCase$scriptsForCard$1.f23782a = str;
            getAsianScriptUseCase$scriptsForCard$1.f23785d = 1;
            objM7116f = ((C1287c) this.f23858b).m7116f(str, str2, getAsianScriptUseCase$scriptsForCard$1);
            if (objM7116f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getAsianScriptUseCase$scriptsForCard$1.f23782a;
            AbstractC3193b.m15359b(objM7116f);
        }
        LessonCard lessonCard = (LessonCard) objM7116f;
        if (lessonCard == null || (lessonTransliterationM8041i = lessonCard.m8041i()) == null) {
            return new Pair("", "");
        }
        String str3 = lessonTransliterationM8041i.f19303e;
        String str4 = lessonTransliterationM8041i.f19301c;
        if (fa4.m11650l(str, LanguageLearn.Mandarin.getCode())) {
            if (str4 == null) {
                str4 = "";
            }
            String str5 = lessonTransliterationM8041i.f19302d;
            return new Pair(str4, str5 != null ? str5 : "");
        }
        if (fa4.m11650l(str, LanguageLearn.ChineseTraditional.getCode())) {
            if (str4 == null) {
                str4 = "";
            }
            return new Pair(str4, str3 != null ? str3 : "");
        }
        if (fa4.m11650l(str, LanguageLearn.Japanese.getCode())) {
            String str6 = lessonTransliterationM8041i.f19300b;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = lessonTransliterationM8041i.f19299a;
            return new Pair(str6, str7 != null ? str7 : "");
        }
        if (fa4.m11650l(str, LanguageLearn.Cantonese.getCode())) {
            String str8 = lessonTransliterationM8041i.f19304f;
            if (str8 == null) {
                str8 = "";
            }
            return new Pair(str8, str3 != null ? str3 : "");
        }
        String str9 = lessonTransliterationM8041i.f19306h;
        if (str9 == null) {
            str9 = "";
        }
        return new Pair(str9, "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Serializable m8719f(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetAsianScriptUseCase$scriptsForWord$1 getAsianScriptUseCase$scriptsForWord$1;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        if (continuationImpl instanceof GetAsianScriptUseCase$scriptsForWord$1) {
            getAsianScriptUseCase$scriptsForWord$1 = (GetAsianScriptUseCase$scriptsForWord$1) continuationImpl;
            int i = getAsianScriptUseCase$scriptsForWord$1.f23789d;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAsianScriptUseCase$scriptsForWord$1.f23789d = i - Integer.MIN_VALUE;
            } else {
                getAsianScriptUseCase$scriptsForWord$1 = new GetAsianScriptUseCase$scriptsForWord$1(this, continuationImpl);
            }
        } else {
            getAsianScriptUseCase$scriptsForWord$1 = new GetAsianScriptUseCase$scriptsForWord$1(this, continuationImpl);
        }
        Object objM7425d = getAsianScriptUseCase$scriptsForWord$1.f23787b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAsianScriptUseCase$scriptsForWord$1.f23789d;
        Pair pair = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7425d);
            getAsianScriptUseCase$scriptsForWord$1.f23786a = str;
            getAsianScriptUseCase$scriptsForWord$1.f23789d = 1;
            objM7425d = ((C1310z) this.f23857a).m7425d(str, str2, getAsianScriptUseCase$scriptsForWord$1);
            if (objM7425d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getAsianScriptUseCase$scriptsForWord$1.f23786a;
            AbstractC3193b.m15359b(objM7425d);
        }
        LessonWord lessonWord = (LessonWord) objM7425d;
        if (lessonWord != null) {
            if (fa4.m11650l(str, LanguageLearn.Mandarin.getCode())) {
                TokenReadings tokenReadingsM8074h = lessonWord.m8074h();
                String strM8714d = (tokenReadingsM8074h == null || (list8 = tokenReadingsM8074h.f19607c) == null) ? "" : m8714d(list8);
                TokenReadings tokenReadingsM8074h2 = lessonWord.m8074h();
                pair = new Pair(strM8714d, (tokenReadingsM8074h2 == null || (list7 = tokenReadingsM8074h2.f19608d) == null) ? "" : m8714d(list7));
            } else if (fa4.m11650l(str, LanguageLearn.ChineseTraditional.getCode())) {
                TokenReadings tokenReadingsM8074h3 = lessonWord.m8074h();
                String strM8714d2 = (tokenReadingsM8074h3 == null || (list6 = tokenReadingsM8074h3.f19607c) == null) ? "" : m8714d(list6);
                TokenReadings tokenReadingsM8074h4 = lessonWord.m8074h();
                pair = new Pair(strM8714d2, (tokenReadingsM8074h4 == null || (list5 = tokenReadingsM8074h4.f19609e) == null) ? "" : m8714d(list5));
            } else if (fa4.m11650l(str, LanguageLearn.Japanese.getCode())) {
                TokenReadings tokenReadingsM8074h5 = lessonWord.m8074h();
                String strM8714d3 = (tokenReadingsM8074h5 == null || (list4 = tokenReadingsM8074h5.f19605a) == null) ? "" : m8714d(list4);
                TokenReadings tokenReadingsM8074h6 = lessonWord.m8074h();
                pair = new Pair(strM8714d3, (tokenReadingsM8074h6 == null || (list3 = tokenReadingsM8074h6.f19606b) == null) ? "" : m8714d(list3));
            } else if (fa4.m11650l(str, LanguageLearn.Cantonese.getCode())) {
                TokenReadings tokenReadingsM8074h7 = lessonWord.m8074h();
                String strM8714d4 = (tokenReadingsM8074h7 == null || (list2 = tokenReadingsM8074h7.f19610f) == null) ? "" : m8714d(list2);
                TokenReadings tokenReadingsM8074h8 = lessonWord.m8074h();
                pair = new Pair(strM8714d4, (tokenReadingsM8074h8 == null || (list = tokenReadingsM8074h8.f19609e) == null) ? "" : m8714d(list));
            }
            if (pair != null) {
                return pair;
            }
        }
        return new Pair("", "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m8720g(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetAsianScriptUseCase$selectScriptBasedOnPreference$1 getAsianScriptUseCase$selectScriptBasedOnPreference$1;
        Object objM15541t;
        if (continuationImpl instanceof GetAsianScriptUseCase$selectScriptBasedOnPreference$1) {
            getAsianScriptUseCase$selectScriptBasedOnPreference$1 = (GetAsianScriptUseCase$selectScriptBasedOnPreference$1) continuationImpl;
            int i = getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23794e;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23794e = i - Integer.MIN_VALUE;
            } else {
                getAsianScriptUseCase$selectScriptBasedOnPreference$1 = new GetAsianScriptUseCase$selectScriptBasedOnPreference$1(this, continuationImpl);
            }
        } else {
            getAsianScriptUseCase$selectScriptBasedOnPreference$1 = new GetAsianScriptUseCase$selectScriptBasedOnPreference$1(this, continuationImpl);
        }
        Object obj = getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23792c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23794e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23790a = str2;
            getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23791b = str3;
            getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23794e = 1;
            si7 si7Var = this.f23859c.f39280a;
            if (fa4.m11650l(str, LanguageLearn.Mandarin.getCode())) {
                objM15541t = AbstractC3224d.m15541t(((C1368a) si7Var).f18437p1, getAsianScriptUseCase$selectScriptBasedOnPreference$1);
            } else if (fa4.m11650l(str, LanguageLearn.ChineseTraditional.getCode())) {
                objM15541t = AbstractC3224d.m15541t(((C1368a) si7Var).f18443r1, getAsianScriptUseCase$selectScriptBasedOnPreference$1);
            } else if (fa4.m11650l(str, LanguageLearn.Japanese.getCode())) {
                objM15541t = AbstractC3224d.m15541t(((C1368a) si7Var).f18440q1, getAsianScriptUseCase$selectScriptBasedOnPreference$1);
            } else if (fa4.m11650l(str, LanguageLearn.Cantonese.getCode())) {
                objM15541t = AbstractC3224d.m15541t(((C1368a) si7Var).f18446s1, getAsianScriptUseCase$selectScriptBasedOnPreference$1);
            } else {
                if (AbstractC3184kh.m15230y(str)) {
                    objM15541t = AbstractC3224d.m15541t(((C1368a) si7Var).f18449t1, getAsianScriptUseCase$selectScriptBasedOnPreference$1);
                } else {
                    obj = "Off";
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            obj = objM15541t;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23791b;
            str2 = getAsianScriptUseCase$selectScriptBasedOnPreference$1.f23790a;
            AbstractC3193b.m15359b(obj);
        }
        String str4 = (String) obj;
        switch (str4.hashCode()) {
            case -1904268855:
                if (str4.equals("Pinyin")) {
                    if (str2.length() > 0) {
                        return str2;
                    }
                }
                return null;
            case -1841522256:
                if (str4.equals("Romaji")) {
                    if (str2.length() > 0) {
                        return str2;
                    }
                }
                return null;
            case -1311598819:
                if (str4.equals("Hiragana")) {
                    if (str3.length() > 0) {
                        return str3;
                    }
                }
                return null;
            case -702078272:
                if (str4.equals("Jyutping")) {
                    if (str2.length() > 0) {
                        return str2;
                    }
                }
                return null;
            case -469838457:
                if (str4.equals("Traditional")) {
                    if (str3.length() > 0) {
                        return str3;
                    }
                }
                return null;
            case 79183:
                str4.equals("Off");
                return null;
            case 73192164:
                if (str4.equals("Latin")) {
                    if (str2.length() > 0) {
                        return str2;
                    }
                }
                return null;
            case 566114168:
                if (str4.equals("Simplified")) {
                    if (str3.length() > 0) {
                        return str3;
                    }
                }
                return null;
            case 1565245555:
                if (str4.equals("Furigana")) {
                    if (str3.length() > 0) {
                        return str3;
                    }
                }
                return null;
            default:
                return null;
        }
    }
}
