package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$loadLynxCoach$result$1$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$loadLynxCoach$result$1$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2535j f30599a;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.LessonCompleteViewModel$loadLynxCoach$result$1$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$loadLynxCoach$result$1$2$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {547}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25221 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f30600a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2535j f30601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25221(C2535j c2535j, Continuation continuation) {
            super(2, continuation);
            this.f30601b = c2535j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C25221(this.f30601b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25221) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f30600a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f30600a = 1;
                if (this.f30601b.m9464Z2(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$loadLynxCoach$result$1$2(C2535j c2535j, Continuation continuation) {
        super(1, continuation);
        this.f30599a = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonCompleteViewModel$loadLynxCoach$result$1$2(this.f30599a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        LessonCompleteViewModel$loadLynxCoach$result$1$2 lessonCompleteViewModel$loadLynxCoach$result$1$2 = (LessonCompleteViewModel$loadLynxCoach$result$1$2) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteViewModel$loadLynxCoach$result$1$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2535j c2535j = this.f30599a;
        c2535j.f30813W.m15571i(null);
        wfb.m23926u(lda.m16103C(c2535j), null, null, new C25221(c2535j, null), 3);
        return xfa.f68157a;
    }
}
