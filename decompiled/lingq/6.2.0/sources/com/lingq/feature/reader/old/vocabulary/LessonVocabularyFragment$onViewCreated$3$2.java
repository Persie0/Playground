package com.lingq.feature.reader.old.vocabulary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.c83;
import p000.ded;
import p000.jfa;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$2", m4291f = "LessonVocabularyFragment.kt", m4292l = {181}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyFragment$onViewCreated$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonVocabularyFragment f29693b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$2$1", m4291f = "LessonVocabularyFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24611 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonVocabularyFragment f29694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24611(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
            super(2, continuation);
            this.f29694a = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24611(this.f29694a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24611 c24611 = (C24611) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24611.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29694a;
            if (vz1.m23653w(lessonVocabularyFragment)) {
                ded.m10315a(jfa.m14427j(lessonVocabularyFragment), true);
            } else {
                b34.m3244j(lessonVocabularyFragment).m22689f();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$3$2(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
        super(2, continuation);
        this.f29693b = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyFragment$onViewCreated$3$2(this.f29693b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyFragment$onViewCreated$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29692a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29693b;
            c83 c83VarMo8734A2 = lessonVocabularyFragment.m9356S0().f31656b.mo8734A2();
            C24611 c24611 = new C24611(lessonVocabularyFragment, null);
            this.f29692a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8734A2, c24611, this) == coroutineSingletons) {
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
