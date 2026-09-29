package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hi8;
import p000.l91;
import p000.vi3;
import p000.xfa;
import p000.xo1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$fetchSubscriptions$1", m4291f = "CollectionViewModel.kt", m4292l = {1043}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$fetchSubscriptions$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$fetchSubscriptions$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25381b = c2034d;
        this.f25382c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$fetchSubscriptions$1(this.f25381b, this.f25382c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$fetchSubscriptions$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25380a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        hi8 hi8Var = this.f25381b.f25580j;
        String str = this.f25382c.f49324a;
        this.f25380a = 1;
        Object objM7178b = ((C1290f) ((xo1) hi8Var.f42410b)).m7178b(str, this);
        if (objM7178b != coroutineSingletons) {
            objM7178b = xfaVar;
        }
        return objM7178b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
