package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$isLessonAlreadyComplete$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {586}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$isLessonAlreadyComplete$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$isLessonAlreadyComplete$2(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30579b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$isLessonAlreadyComplete$2(this.f30579b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$isLessonAlreadyComplete$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30578a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3540rl c3540rl = new C3540rl(this.f30579b.f30805O, 5);
            this.f30578a = 1;
            obj = AbstractC3224d.m15541t(c3540rl, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return Boolean.valueOf(((LessonCompleteData) obj).f19217n);
    }
}
