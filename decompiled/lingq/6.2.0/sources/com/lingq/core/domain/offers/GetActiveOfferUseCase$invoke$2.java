package com.lingq.core.domain.offers;

import com.lingq.core.data.repository.C1301q;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aq6;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.offers.GetActiveOfferUseCase$invoke$2", m4291f = "GetActiveOfferUseCase.kt", m4292l = {61}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActiveOfferUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f19873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1516b f19874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveOfferUseCase$invoke$2(C1516b c1516b, Continuation continuation) {
        super(1, continuation);
        this.f19874b = c1516b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetActiveOfferUseCase$invoke$2(this.f19874b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetActiveOfferUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19873a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            aq6 aq6Var = this.f19874b.f19877a;
            this.f19873a = 1;
            if (((C1301q) aq6Var).m7338a(this) == coroutineSingletons) {
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
