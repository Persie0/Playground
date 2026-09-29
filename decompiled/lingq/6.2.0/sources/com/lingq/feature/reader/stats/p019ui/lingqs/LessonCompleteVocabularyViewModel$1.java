package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f30999b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$1$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25591 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f31000a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2568b f31001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25591(C2568b c2568b, Continuation continuation) {
            super(2, continuation);
            this.f31001b = c2568b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25591 c25591 = new C25591(this.f31001b, continuation);
            c25591.f31000a = ((Number) obj).intValue();
            return c25591;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25591 c25591 = (C25591) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25591.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f31000a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31001b;
            AbstractC1263a.m7047b(lda.m16103C(c2568b), c2568b.f31065l, ux5.m22988k(i, "cards "), new LessonCompleteVocabularyViewModel$fetchCards$1(c2568b, i, null));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$1(C2568b c2568b, Continuation continuation) {
        super(2, continuation);
        this.f30999b = c2568b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$1(this.f30999b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30998a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f30999b;
            C3540rl c3540rl = new C3540rl(c2568b.f31067n, 5);
            C25591 c25591 = new C25591(c2568b, null);
            this.f30998a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c25591, this) == coroutineSingletons) {
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
