package com.lingq.feature.challenges.cup;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hi8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupContributorsViewModel$refresh$1", m4291f = "CupContributorsViewModel.kt", m4292l = {77}, m4293m = "invokeSuspend", m4294v = 2)
final class CupContributorsViewModel$refresh$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1975b f24573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupContributorsViewModel$refresh$1(C1975b c1975b, Continuation continuation) {
        super(2, continuation);
        this.f24573b = c1975b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupContributorsViewModel$refresh$1(this.f24573b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupContributorsViewModel$refresh$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24572a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1975b c1975b = this.f24573b;
            hi8 hi8Var = c1975b.f24681b;
            String str = c1975b.f24682c;
            this.f24572a = 1;
            if (hi8Var.m13286w(str, this) == coroutineSingletons) {
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
