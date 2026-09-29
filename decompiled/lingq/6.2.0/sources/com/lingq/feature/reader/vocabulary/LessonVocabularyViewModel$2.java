package com.lingq.feature.reader.vocabulary;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vs3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$2", m4291f = "LessonVocabularyViewModel.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31579b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$2$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26001 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31580a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26001(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31581b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26001 c26001 = new C26001(this.f31581b, continuation);
            c26001.f31580a = obj;
            return c26001;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26001 c26001 = (C26001) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26001.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f31580a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31581b.f31654B.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$2(C2610a c2610a, Continuation continuation) {
        super(2, continuation);
        this.f31579b = c2610a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$2(this.f31579b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31578a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31579b;
            C3228h c3228hM8209a = c2610a.f31664j.m8209a();
            C26001 c26001 = new C26001(c2610a, null);
            this.f31578a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c26001, this) == coroutineSingletons) {
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
