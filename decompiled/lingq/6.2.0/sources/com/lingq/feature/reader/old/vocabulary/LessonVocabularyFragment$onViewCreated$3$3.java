package com.lingq.feature.reader.old.vocabulary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.RunnableC3468pp;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$3", m4291f = "LessonVocabularyFragment.kt", m4292l = {191}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyFragment$onViewCreated$3$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonVocabularyFragment f29696b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$3$1", m4291f = "LessonVocabularyFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24621 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonVocabularyFragment f29697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24621(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
            super(2, continuation);
            this.f29697a = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24621(this.f29697a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24621 c24621 = (C24621) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24621.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29697a;
            lessonVocabularyFragment.m2092T().postDelayed(new RunnableC3468pp(lessonVocabularyFragment, 11), 100L);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$3$3(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
        super(2, continuation);
        this.f29696b = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyFragment$onViewCreated$3$3(this.f29696b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyFragment$onViewCreated$3$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29695a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29696b;
            du0 du0Var = lessonVocabularyFragment.m9356S0().f31653A;
            C24621 c24621 = new C24621(lessonVocabularyFragment, null);
            this.f29695a = 1;
            if (AbstractC3224d.m15529h(du0Var, c24621, this) == coroutineSingletons) {
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
