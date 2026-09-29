package com.lingq.feature.reader.vocabulary;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.lda;
import p000.u91;
import p000.un1;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchTokenTranslation$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {312}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$fetchTokenTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31617c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchTokenTranslation$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchTokenTranslation$1$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {322}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26081 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f31618a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f31619b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2610a f31620c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f31621d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26081(C2610a c2610a, String str, Continuation continuation) {
            super(2, continuation);
            this.f31620c = c2610a;
            this.f31621d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26081 c26081 = new C26081(this.f31620c, this.f31621d, continuation);
            c26081.f31619b = obj;
            return c26081;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C26081) create((TokenTranslations) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object value;
            C2610a c2610a = this.f31620c;
            C3244l c3244l = c2610a.f31673s;
            TokenTranslations tokenTranslations = (TokenTranslations) this.f31619b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31618a;
            String str2 = this.f31621d;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (tokenTranslations != null) {
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
                    Locale locale = c2610a.f31668n;
                    locale.getClass();
                    String strM23610P = vz1.m23610P(str2, locale);
                    TokenTranslationSimple tokenTranslationSimple = (TokenTranslationSimple) u91.m22591I0(tokenTranslations.f19618b);
                    if (tokenTranslationSimple == null || (str = tokenTranslationSimple.f19615a) == null) {
                        str = "";
                    }
                    linkedHashMapM15372Y.put(strM23610P, new TokenMeaning(0, null, str, 0, false, null, true, 0, 763));
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, linkedHashMapM15372Y));
                } else {
                    this.f31619b = null;
                    this.f31618a = 1;
                    if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(lda.m16103C(c2610a), null, null, new LessonVocabularyViewModel$updateTokenTranslation$1(c2610a, str2, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$fetchTokenTranslation$1(C2610a c2610a, String str, Continuation continuation) {
        super(2, continuation);
        this.f31616b = c2610a;
        this.f31617c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$fetchTokenTranslation$1(this.f31616b, this.f31617c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$fetchTokenTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2610a c2610a = this.f31616b;
        cma cmaVar = c2610a.f31657c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31615a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = c2610a.f31660f;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            String str = this.f31617c;
            c83 c83VarM7383i = ((C1306v) w3aVar).m7383i(strMo4589b2, strMo4580K1, str);
            C26081 c26081 = new C26081(c2610a, str, null);
            this.f31615a = 1;
            if (AbstractC3224d.m15529h(c83VarM7383i, c26081, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
