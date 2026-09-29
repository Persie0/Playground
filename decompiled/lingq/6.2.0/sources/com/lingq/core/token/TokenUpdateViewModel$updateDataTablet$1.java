package com.lingq.core.token;

import com.lingq.core.data.repository.C1287c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.f5a;
import p000.un1;
import p000.vz1;
import p000.xa2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$updateDataTablet$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1615}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$updateDataTablet$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$updateDataTablet$1(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23697b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$updateDataTablet$1(this.f23697b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$updateDataTablet$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1909e c1909e = this.f23697b;
        cma cmaVar = c1909e.f23872J;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23696a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xa2 xa2Var = c1909e.f23911y;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strM23609O = vz1.m23609O(((f5a) c1909e.f23885W.getValue()).f38476h, cmaVar.mo4589b2());
            this.f23696a = 1;
            C1287c c1287c = (C1287c) xa2Var.f67988a;
            c1287c.getClass();
            C1287c.m7112c(c1287c, strMo4589b2, strM23609O, null);
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
