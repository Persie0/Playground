package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$loadLynxCoach$result$1$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$loadLynxCoach$result$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$loadLynxCoach$result$1$1(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30598b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$1 = new LessonCompleteViewModel$loadLynxCoach$result$1$1(this.f30598b, continuation);
        lessonCompleteViewModel$loadLynxCoach$result$1$1.f30597a = obj;
        return lessonCompleteViewModel$loadLynxCoach$result$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$1 = (LessonCompleteViewModel$loadLynxCoach$result$1$1) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteViewModel$loadLynxCoach$result$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f30597a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30598b.f30813W.m15571i(str);
        return xfa.f68157a;
    }
}
