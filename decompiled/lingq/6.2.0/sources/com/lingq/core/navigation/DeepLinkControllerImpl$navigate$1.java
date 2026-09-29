package com.lingq.core.navigation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.hf6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.navigation.DeepLinkControllerImpl$navigate$1", m4291f = "DeepLinkController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DeepLinkControllerImpl$navigate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1552a f20251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hf6 f20252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$navigate$1(C1552a c1552a, hf6 hf6Var, Continuation continuation) {
        super(2, continuation);
        this.f20251a = c1552a;
        this.f20252b = hf6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeepLinkControllerImpl$navigate$1(this.f20251a, this.f20252b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DeepLinkControllerImpl$navigate$1 deepLinkControllerImpl$navigate$1 = (DeepLinkControllerImpl$navigate$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        deepLinkControllerImpl$navigate$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f20251a.f20265i.m15571i(this.f20252b);
        return xfa.f68157a;
    }
}
