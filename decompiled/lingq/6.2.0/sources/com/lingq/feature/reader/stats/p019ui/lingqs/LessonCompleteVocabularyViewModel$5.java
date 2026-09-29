package com.lingq.feature.reader.stats.p019ui.lingqs;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$5", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {134}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31017b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$5$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$5$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25641 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31018a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2568b f31019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25641(C2568b c2568b, Continuation continuation) {
            super(2, continuation);
            this.f31019b = c2568b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25641 c25641 = new C25641(this.f31019b, continuation);
            c25641.f31018a = obj;
            return c25641;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25641 c25641 = (C25641) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25641.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f31018a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31019b.f31074u.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$5(C2568b c2568b, Continuation continuation) {
        super(2, continuation);
        this.f31017b = c2568b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$5(this.f31017b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31016a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31017b;
            C3228h c3228hM8209a = c2568b.f31063j.m8209a();
            C25641 c25641 = new C25641(c2568b, null);
            this.f31016a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c25641, this) == coroutineSingletons) {
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
