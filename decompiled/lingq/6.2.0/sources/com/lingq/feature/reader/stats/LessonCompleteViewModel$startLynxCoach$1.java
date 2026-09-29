package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$startLynxCoach$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {506}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$startLynxCoach$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30702a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f30703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$startLynxCoach$1(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30704c = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonCompleteViewModel$startLynxCoach$1 lessonCompleteViewModel$startLynxCoach$1 = new LessonCompleteViewModel$startLynxCoach$1(this.f30704c, continuation);
        lessonCompleteViewModel$startLynxCoach$1.f30703b = ((Boolean) obj).booleanValue();
        return lessonCompleteViewModel$startLynxCoach$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((LessonCompleteViewModel$startLynxCoach$1) create(bool, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f30703b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30702a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f30703b = z;
            this.f30702a = 1;
            if (C2535j.m9461W2(this.f30704c, z, this) == coroutineSingletons) {
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
