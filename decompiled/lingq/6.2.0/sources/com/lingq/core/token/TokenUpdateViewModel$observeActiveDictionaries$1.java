package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.e83;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observeActiveDictionaries$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observeActiveDictionaries$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f23630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observeActiveDictionaries$1(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23630a = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$observeActiveDictionaries$1(this.f23630a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$observeActiveDictionaries$1 tokenUpdateViewModel$observeActiveDictionaries$1 = (TokenUpdateViewModel$observeActiveDictionaries$1) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$observeActiveDictionaries$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23630a.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, true, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097150)));
        return xfa.f68157a;
    }
}
