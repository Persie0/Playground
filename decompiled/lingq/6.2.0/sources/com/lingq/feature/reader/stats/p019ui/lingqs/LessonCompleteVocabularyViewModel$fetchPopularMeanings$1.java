package com.lingq.feature.reader.stats.p019ui.lingqs;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchPopularMeanings$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {257}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$fetchPopularMeanings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31027c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchPopularMeanings$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$fetchPopularMeanings$1$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {264}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25661 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f31028a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f31029b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2568b f31030c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f31031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25661(C2568b c2568b, String str, Continuation continuation) {
            super(2, continuation);
            this.f31030c = c2568b;
            this.f31031d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25661 c25661 = new C25661(this.f31030c, this.f31031d, continuation);
            c25661.f31029b = obj;
            return c25661;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25661) create((e4a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            C2568b c2568b = this.f31030c;
            C3244l c3244l = c2568b.f31072s;
            e4a e4aVar = (e4a) this.f31029b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31028a;
            String str = this.f31031d;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (e4aVar != null) {
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
                    Locale locale = c2568b.f31068o;
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
                    this.f31029b = null;
                    this.f31028a = 1;
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
            wfb.m23926u(lda.m16103C(c2568b), null, null, new LessonCompleteVocabularyViewModel$updatePopularMeanings$1(c2568b, c2568b.f31056c.mo4589b2(), str, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$fetchPopularMeanings$1(C2568b c2568b, String str, Continuation continuation) {
        super(2, continuation);
        this.f31026b = c2568b;
        this.f31027c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$fetchPopularMeanings$1(this.f31026b, this.f31027c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$fetchPopularMeanings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2568b c2568b = this.f31026b;
        cma cmaVar = c2568b.f31056c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31025a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = c2568b.f31061h;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            String str = this.f31027c;
            c83 c83VarM7381g = ((C1306v) w3aVar).m7381g(strMo4589b2, str, strMo4580K1);
            C25661 c25661 = new C25661(c2568b, str, null);
            this.f31025a = 1;
            if (AbstractC3224d.m15529h(c83VarM7381g, c25661, this) == coroutineSingletons) {
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
