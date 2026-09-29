package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$17", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$17 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23506a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$17 tokenUpdateViewModel$17 = new TokenUpdateViewModel$17(2, continuation);
        tokenUpdateViewModel$17.f23506a = obj;
        return tokenUpdateViewModel$17;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$17) create((f5a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        f5a f5aVar = (f5a) this.f23506a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return f5aVar.f38494z;
    }
}
