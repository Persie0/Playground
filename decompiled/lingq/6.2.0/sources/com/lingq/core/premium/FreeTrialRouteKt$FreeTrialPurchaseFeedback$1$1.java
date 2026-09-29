package com.lingq.core.premium;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.eh3;
import p000.g77;
import p000.i77;
import p000.j77;
import p000.li3;
import p000.sh3;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1", m4291f = "FreeTrialRoute.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g77 f22320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li3 f22321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f22322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f22323d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f22324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1(g77 g77Var, li3 li3Var, vi3 vi3Var, vi3 vi3Var2, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f22320a = g77Var;
        this.f22321b = li3Var;
        this.f22322c = vi3Var;
        this.f22323d = vi3Var2;
        this.f22324e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1(this.f22320a, this.f22321b, this.f22322c, this.f22323d, this.f22324e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1 freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1 = (FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        j77 j77VarMo12408n = this.f22320a.mo12408n();
        j77VarMo12408n.getClass();
        if (j77VarMo12408n.equals(i77.f43628a) && this.f22321b.f49704g && ((Boolean) this.f22324e.getValue()).booleanValue()) {
            this.f22322c.invoke(eh3.f37254a);
            this.f22323d.invoke(sh3.f60862a);
        }
        return xfa.f68157a;
    }
}
