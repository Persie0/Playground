package com.lingq.feature.reader.vocabulary;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.token.TokenMeaning;
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
import p000.e4a;
import p000.lda;
import p000.u91;
import p000.un1;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchPopularMeanings$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {346}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$fetchPopularMeanings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31610c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchPopularMeanings$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$fetchPopularMeanings$1$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {353}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26071 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f31611a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f31612b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2610a f31613c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f31614d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26071(C2610a c2610a, String str, Continuation continuation) {
            super(2, continuation);
            this.f31613c = c2610a;
            this.f31614d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26071 c26071 = new C26071(this.f31613c, this.f31614d, continuation);
            c26071.f31612b = obj;
            return c26071;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C26071) create((e4a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            C2610a c2610a = this.f31613c;
            C3244l c3244l = c2610a.f31673s;
            e4a e4aVar = (e4a) this.f31612b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31611a;
            String str = this.f31614d;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (e4aVar != null) {
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
                    Locale locale = c2610a.f31668n;
                    locale.getClass();
                    String strM23610P = vz1.m23610P(str, locale);
                    TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(e4aVar.f36705a);
                    if (tokenMeaning == null) {
                        tokenMeaning = new TokenMeaning(0, null, null, 0, false, null, false, 0, 1023);
                    }
                    linkedHashMapM15372Y.put(strM23610P, tokenMeaning);
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, linkedHashMapM15372Y));
                } else {
                    this.f31612b = null;
                    this.f31611a = 1;
                    if (AbstractC3208a.m15437d(100L, this) == coroutineSingletons) {
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
            wfb.m23926u(lda.m16103C(c2610a), null, null, new LessonVocabularyViewModel$updatePopularMeanings$1(c2610a, c2610a.f31657c.mo4589b2(), str, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$fetchPopularMeanings$1(C2610a c2610a, String str, Continuation continuation) {
        super(2, continuation);
        this.f31609b = c2610a;
        this.f31610c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$fetchPopularMeanings$1(this.f31609b, this.f31610c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$fetchPopularMeanings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2610a c2610a = this.f31609b;
        cma cmaVar = c2610a.f31657c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31608a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = c2610a.f31660f;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            String str = this.f31610c;
            c83 c83VarM7381g = ((C1306v) w3aVar).m7381g(strMo4589b2, str, strMo4580K1);
            C26071 c26071 = new C26071(c2610a, str, null);
            this.f31608a = 1;
            if (AbstractC3224d.m15529h(c83VarM7381g, c26071, this) == coroutineSingletons) {
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
