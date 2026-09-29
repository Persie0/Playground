package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.g23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$refresh$3", m4291f = "CupViewModel.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$refresh$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$refresh$3(C1980g c1980g, Continuation continuation) {
        super(2, continuation);
        this.f24658b = c1980g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$refresh$3(this.f24658b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$refresh$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24657a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            g23 g23Var = this.f24658b.f24709e;
            this.f24657a = 1;
            Object objM7192e = ((C1291g) g23Var.f40075a).m7192e(this);
            if (objM7192e != coroutineSingletons) {
                objM7192e = xfaVar;
            }
            if (objM7192e == coroutineSingletons) {
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
