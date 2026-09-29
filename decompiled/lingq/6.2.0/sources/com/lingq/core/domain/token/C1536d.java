package com.lingq.core.domain.token;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.e4a;
import p000.s7b;
import p000.u91;
import p000.vk9;
import p000.w3a;

/* JADX INFO: renamed from: com.lingq.core.domain.token.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1536d {

    /* JADX INFO: renamed from: a */
    public final s7b f20101a;

    /* JADX INFO: renamed from: b */
    public final w3a f20102b;

    public C1536d(s7b s7bVar, w3a w3aVar) {
        s7bVar.getClass();
        w3aVar.getClass();
        this.f20101a = s7bVar;
        this.f20102b = w3aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8217a(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1 getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1;
        List list;
        TokenMeaning tokenMeaning;
        String str4;
        if (continuationImpl instanceof GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1) {
            getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1 = (GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1) continuationImpl;
            int i = getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1.f20048c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1.f20048c = i - Integer.MIN_VALUE;
            } else {
                getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1 = new GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1(this, continuationImpl);
            }
        } else {
            getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1 = new GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1(this, continuationImpl);
        }
        Object objM15541t = getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1.f20046a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1.f20048c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83VarM7381g = ((C1306v) this.f20102b).m7381g(str, str3, str2);
            getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1.f20048c = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7381g, getOrFetchTokenMeaningUseCase$cachedPopularMeaning$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        e4a e4aVar = (e4a) objM15541t;
        if (e4aVar == null || (list = e4aVar.f36705a) == null || (tokenMeaning = (TokenMeaning) u91.m22591I0(list)) == null || (str4 = tokenMeaning.f19596c) == null || vk9.m23391n0(str4)) {
            return null;
        }
        return tokenMeaning;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m8218b(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchTokenMeaningUseCase$cachedTranslation$1 getOrFetchTokenMeaningUseCase$cachedTranslation$1;
        List list;
        TokenTranslationSimple tokenTranslationSimple;
        String str4;
        if (continuationImpl instanceof GetOrFetchTokenMeaningUseCase$cachedTranslation$1) {
            getOrFetchTokenMeaningUseCase$cachedTranslation$1 = (GetOrFetchTokenMeaningUseCase$cachedTranslation$1) continuationImpl;
            int i = getOrFetchTokenMeaningUseCase$cachedTranslation$1.f20051c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchTokenMeaningUseCase$cachedTranslation$1.f20051c = i - Integer.MIN_VALUE;
            } else {
                getOrFetchTokenMeaningUseCase$cachedTranslation$1 = new GetOrFetchTokenMeaningUseCase$cachedTranslation$1(this, continuationImpl);
            }
        } else {
            getOrFetchTokenMeaningUseCase$cachedTranslation$1 = new GetOrFetchTokenMeaningUseCase$cachedTranslation$1(this, continuationImpl);
        }
        Object objM15541t = getOrFetchTokenMeaningUseCase$cachedTranslation$1.f20049a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrFetchTokenMeaningUseCase$cachedTranslation$1.f20051c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83VarM7383i = ((C1306v) this.f20102b).m7383i(str, str2, str3);
            getOrFetchTokenMeaningUseCase$cachedTranslation$1.f20051c = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7383i, getOrFetchTokenMeaningUseCase$cachedTranslation$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        TokenTranslations tokenTranslations = (TokenTranslations) objM15541t;
        if (tokenTranslations != null && (list = tokenTranslations.f19618b) != null && (tokenTranslationSimple = (TokenTranslationSimple) u91.m22591I0(list)) != null && (str4 = tokenTranslationSimple.f19615a) != null) {
            String str5 = !vk9.m23391n0(str4) ? str4 : null;
            if (str5 != null) {
                return new TokenMeaning(0, null, str5, 0, false, null, true, 0, 763);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m8219c(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1 getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1;
        String str4;
        String str5;
        Object objM8218b;
        if (continuationImpl instanceof GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1) {
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1 = (GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1) continuationImpl;
            int i = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f = i - Integer.MIN_VALUE;
            } else {
                getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1 = new GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1(this, continuationImpl);
            }
        } else {
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1 = new GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1(this, continuationImpl);
        }
        Object objM8218b2 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20055d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8218b2);
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a = str;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b = str2;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c = str3;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f = 1;
            objM8218b2 = m8218b(str, str2, str3, getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1);
            if (objM8218b2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c;
            str2 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b;
            str = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a;
            AbstractC3193b.m15359b(objM8218b2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM8218b2);
                    return objM8218b2;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c;
            str2 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b;
            str4 = getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a;
            AbstractC3193b.m15359b(objM8218b2);
        }
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a = null;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b = null;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c = null;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f = 3;
        objM8218b = m8218b(str4, str2, str5, getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1);
        if (objM8218b != obj) {
            return obj;
        }
        return objM8218b;
        TokenMeaning tokenMeaning = (TokenMeaning) objM8218b2;
        if (tokenMeaning != null) {
            return tokenMeaning;
        }
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a = str;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b = str2;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c = str3;
        getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f = 2;
        if (((C1306v) this.f20102b).m7380f(str, str2, str3, null, getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1) != obj) {
            String str6 = str3;
            str4 = str;
            str5 = str6;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20052a = null;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20053b = null;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20054c = null;
            getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1.f20057f = 3;
            objM8218b = m8218b(str4, str2, str5, getOrFetchTokenMeaningUseCase$googleTranslateMeaning$1);
            if (objM8218b != obj) {
                return objM8218b;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m8220d(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchTokenMeaningUseCase$invoke$1 getOrFetchTokenMeaningUseCase$invoke$1;
        String str4;
        String str5;
        List list;
        TokenMeaning tokenMeaning;
        TokenMeaning tokenMeaning2;
        Object objM8219c;
        if (continuationImpl instanceof GetOrFetchTokenMeaningUseCase$invoke$1) {
            getOrFetchTokenMeaningUseCase$invoke$1 = (GetOrFetchTokenMeaningUseCase$invoke$1) continuationImpl;
            int i = getOrFetchTokenMeaningUseCase$invoke$1.f20063f;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchTokenMeaningUseCase$invoke$1.f20063f = i - Integer.MIN_VALUE;
            } else {
                getOrFetchTokenMeaningUseCase$invoke$1 = new GetOrFetchTokenMeaningUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getOrFetchTokenMeaningUseCase$invoke$1 = new GetOrFetchTokenMeaningUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7425d = getOrFetchTokenMeaningUseCase$invoke$1.f20061d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrFetchTokenMeaningUseCase$invoke$1.f20063f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7425d);
            getOrFetchTokenMeaningUseCase$invoke$1.f20058a = str;
            getOrFetchTokenMeaningUseCase$invoke$1.f20059b = str2;
            getOrFetchTokenMeaningUseCase$invoke$1.f20060c = str3;
            getOrFetchTokenMeaningUseCase$invoke$1.f20063f = 1;
            objM7425d = ((C1310z) this.f20101a).m7425d(str, str3, getOrFetchTokenMeaningUseCase$invoke$1);
            if (objM7425d != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = getOrFetchTokenMeaningUseCase$invoke$1.f20060c;
            str2 = getOrFetchTokenMeaningUseCase$invoke$1.f20059b;
            str = getOrFetchTokenMeaningUseCase$invoke$1.f20058a;
            AbstractC3193b.m15359b(objM7425d);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM7425d);
                    return objM7425d;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = getOrFetchTokenMeaningUseCase$invoke$1.f20060c;
            str2 = getOrFetchTokenMeaningUseCase$invoke$1.f20059b;
            str4 = getOrFetchTokenMeaningUseCase$invoke$1.f20058a;
            AbstractC3193b.m15359b(objM7425d);
        }
        tokenMeaning2 = (TokenMeaning) objM7425d;
        if (tokenMeaning2 != null) {
            return tokenMeaning2;
        }
        getOrFetchTokenMeaningUseCase$invoke$1.f20058a = null;
        getOrFetchTokenMeaningUseCase$invoke$1.f20059b = null;
        getOrFetchTokenMeaningUseCase$invoke$1.f20060c = null;
        getOrFetchTokenMeaningUseCase$invoke$1.f20063f = 3;
        objM8219c = m8219c(str4, str2, str5, getOrFetchTokenMeaningUseCase$invoke$1);
        if (objM8219c != obj) {
            return obj;
        }
        return objM8219c;
        LessonWord lessonWord = (LessonWord) objM7425d;
        if (lessonWord != null && (list = lessonWord.f19319f) != null && (tokenMeaning = (TokenMeaning) u91.m22591I0(list)) != null) {
            return tokenMeaning;
        }
        getOrFetchTokenMeaningUseCase$invoke$1.f20058a = str;
        getOrFetchTokenMeaningUseCase$invoke$1.f20059b = str2;
        getOrFetchTokenMeaningUseCase$invoke$1.f20060c = str3;
        getOrFetchTokenMeaningUseCase$invoke$1.f20063f = 2;
        objM7425d = m8221e(str, str2, str3, getOrFetchTokenMeaningUseCase$invoke$1);
        if (objM7425d != obj) {
            String str6 = str3;
            str4 = str;
            str5 = str6;
            tokenMeaning2 = (TokenMeaning) objM7425d;
            if (tokenMeaning2 != null) {
                return tokenMeaning2;
            }
            getOrFetchTokenMeaningUseCase$invoke$1.f20058a = null;
            getOrFetchTokenMeaningUseCase$invoke$1.f20059b = null;
            getOrFetchTokenMeaningUseCase$invoke$1.f20060c = null;
            getOrFetchTokenMeaningUseCase$invoke$1.f20063f = 3;
            objM8219c = m8219c(str4, str2, str5, getOrFetchTokenMeaningUseCase$invoke$1);
            if (objM8219c != obj) {
                return objM8219c;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m8221e(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchTokenMeaningUseCase$popularMeaning$1 getOrFetchTokenMeaningUseCase$popularMeaning$1;
        String str4;
        String str5;
        Object objM8217a;
        if (continuationImpl instanceof GetOrFetchTokenMeaningUseCase$popularMeaning$1) {
            getOrFetchTokenMeaningUseCase$popularMeaning$1 = (GetOrFetchTokenMeaningUseCase$popularMeaning$1) continuationImpl;
            int i = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f = i - Integer.MIN_VALUE;
            } else {
                getOrFetchTokenMeaningUseCase$popularMeaning$1 = new GetOrFetchTokenMeaningUseCase$popularMeaning$1(this, continuationImpl);
            }
        } else {
            getOrFetchTokenMeaningUseCase$popularMeaning$1 = new GetOrFetchTokenMeaningUseCase$popularMeaning$1(this, continuationImpl);
        }
        Object objM8217a2 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20067d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8217a2);
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a = str;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b = str2;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c = str3;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f = 1;
            objM8217a2 = m8217a(str, str2, str3, getOrFetchTokenMeaningUseCase$popularMeaning$1);
            if (objM8217a2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c;
            str2 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b;
            str = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a;
            AbstractC3193b.m15359b(objM8217a2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM8217a2);
                    return objM8217a2;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c;
            str2 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b;
            str4 = getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a;
            AbstractC3193b.m15359b(objM8217a2);
        }
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a = null;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b = null;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c = null;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f = 3;
        objM8217a = m8217a(str4, str2, str5, getOrFetchTokenMeaningUseCase$popularMeaning$1);
        if (objM8217a != obj) {
            return obj;
        }
        return objM8217a;
        TokenMeaning tokenMeaning = (TokenMeaning) objM8217a2;
        if (tokenMeaning != null) {
            return tokenMeaning;
        }
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a = str;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b = str2;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c = str3;
        getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f = 2;
        if (((C1306v) this.f20102b).m7377c(str, str3, str2, getOrFetchTokenMeaningUseCase$popularMeaning$1) != obj) {
            String str6 = str3;
            str4 = str;
            str5 = str6;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20064a = null;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20065b = null;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20066c = null;
            getOrFetchTokenMeaningUseCase$popularMeaning$1.f20069f = 3;
            objM8217a = m8217a(str4, str2, str5, getOrFetchTokenMeaningUseCase$popularMeaning$1);
            if (objM8217a != obj) {
                return objM8217a;
            }
        }
        return obj;
    }
}
