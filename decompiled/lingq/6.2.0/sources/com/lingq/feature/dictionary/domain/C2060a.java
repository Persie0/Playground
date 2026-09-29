package com.lingq.feature.dictionary.domain;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ao0;
import p000.fa4;
import p000.w3a;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2060a {

    /* JADX INFO: renamed from: a */
    public final w3a f25813a;

    /* JADX INFO: renamed from: b */
    public final ao0 f25814b;

    public C2060a(w3a w3aVar, ao0 ao0Var) {
        w3aVar.getClass();
        ao0Var.getClass();
        this.f25813a = w3aVar;
        this.f25814b = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: a */
    public final Object m8977a(String str, String str2, TokenMeaning tokenMeaning, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        UpdateHintLocaleUseCase$invoke$1 updateHintLocaleUseCase$invoke$1;
        TokenMeaning tokenMeaning2;
        String str5;
        String str6;
        String str7;
        String str8;
        if (continuationImpl instanceof UpdateHintLocaleUseCase$invoke$1) {
            updateHintLocaleUseCase$invoke$1 = (UpdateHintLocaleUseCase$invoke$1) continuationImpl;
            int i = updateHintLocaleUseCase$invoke$1.f25812h;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateHintLocaleUseCase$invoke$1.f25812h = i - Integer.MIN_VALUE;
            } else {
                updateHintLocaleUseCase$invoke$1 = new UpdateHintLocaleUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateHintLocaleUseCase$invoke$1 = new UpdateHintLocaleUseCase$invoke$1(this, continuationImpl);
        }
        UpdateHintLocaleUseCase$invoke$1 updateHintLocaleUseCase$invoke$2 = updateHintLocaleUseCase$invoke$1;
        Object obj = updateHintLocaleUseCase$invoke$2.f25810f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateHintLocaleUseCase$invoke$2.f25812h;
        xfa xfaVar = xfa.f68157a;
        ao0 ao0Var = this.f25814b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            updateHintLocaleUseCase$invoke$2.f25805a = str;
            updateHintLocaleUseCase$invoke$2.f25806b = str2;
            tokenMeaning2 = tokenMeaning;
            updateHintLocaleUseCase$invoke$2.f25807c = tokenMeaning2;
            updateHintLocaleUseCase$invoke$2.f25808d = str3;
            updateHintLocaleUseCase$invoke$2.f25809e = str4;
            updateHintLocaleUseCase$invoke$2.f25812h = 1;
            Object objM7116f = ((C1287c) ao0Var).m7116f(str4, str, updateHintLocaleUseCase$invoke$2);
            if (objM7116f != coroutineSingletons) {
                str5 = str;
                str6 = str4;
                str7 = str3;
                str8 = str2;
                obj = objM7116f;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i2 == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str6 = updateHintLocaleUseCase$invoke$2.f25809e;
        str7 = updateHintLocaleUseCase$invoke$2.f25808d;
        tokenMeaning2 = updateHintLocaleUseCase$invoke$2.f25807c;
        str8 = updateHintLocaleUseCase$invoke$2.f25806b;
        str5 = updateHintLocaleUseCase$invoke$2.f25805a;
        AbstractC3193b.m15359b(obj);
        LessonCard lessonCard = (LessonCard) obj;
        if (lessonCard != null) {
            List<TokenMeaning> list = lessonCard.f19183f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TokenMeaning tokenMeaning3 : list) {
                    if (tokenMeaning3.f19594a == tokenMeaning2.f19594a || fa4.m11650l(tokenMeaning3.f19596c, tokenMeaning2.f19596c)) {
                        updateHintLocaleUseCase$invoke$2.f25805a = null;
                        updateHintLocaleUseCase$invoke$2.f25806b = null;
                        updateHintLocaleUseCase$invoke$2.f25807c = null;
                        updateHintLocaleUseCase$invoke$2.f25808d = null;
                        updateHintLocaleUseCase$invoke$2.f25809e = null;
                        updateHintLocaleUseCase$invoke$2.f25812h = 2;
                        if (((C1287c) ao0Var).m7131u(str6, str5, tokenMeaning2, str8, updateHintLocaleUseCase$invoke$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    }
                }
            }
        }
        TokenMeaning tokenMeaning4 = tokenMeaning2;
        updateHintLocaleUseCase$invoke$2.f25805a = null;
        updateHintLocaleUseCase$invoke$2.f25806b = null;
        updateHintLocaleUseCase$invoke$2.f25807c = null;
        updateHintLocaleUseCase$invoke$2.f25808d = null;
        updateHintLocaleUseCase$invoke$2.f25809e = null;
        updateHintLocaleUseCase$invoke$2.f25812h = 3;
        if (w3a.m23700b(this.f25813a, str6, str5, tokenMeaning4, str7, str8, null, updateHintLocaleUseCase$invoke$2, 32) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
