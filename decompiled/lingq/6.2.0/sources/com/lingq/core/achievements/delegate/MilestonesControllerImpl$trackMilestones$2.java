package com.lingq.core.achievements.delegate;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.delegate.MilestonesControllerImpl$trackMilestones$2", m4291f = "MilestonesController.kt", m4292l = {42}, m4293m = "invokeSuspend", m4294v = 2)
final class MilestonesControllerImpl$trackMilestones$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1239b f14244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f14245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesControllerImpl$trackMilestones$2(C1239b c1239b, long j, Continuation continuation) {
        super(2, continuation);
        this.f14244b = c1239b;
        this.f14245c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MilestonesControllerImpl$trackMilestones$2(this.f14244b, this.f14245c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MilestonesControllerImpl$trackMilestones$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14243a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f14243a = 1;
            if (this.f14244b.m7017b(this.f14245c, this) == coroutineSingletons) {
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
