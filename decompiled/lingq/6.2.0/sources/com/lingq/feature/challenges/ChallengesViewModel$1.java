package com.lingq.feature.challenges;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.m58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$1", m4291f = "ChallengesViewModel.kt", m4292l = {82}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1986f f24464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$1(C1986f c1986f, Continuation continuation) {
        super(2, continuation);
        this.f24464b = c1986f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengesViewModel$1(this.f24464b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengesViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24463a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m58 m58Var = this.f24464b.f24766g;
            this.f24463a = 1;
            if (m58Var.m16644h(this) == coroutineSingletons) {
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
