package com.lingq.core.token;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observeActiveDictionaries$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observeActiveDictionaries$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observeActiveDictionaries$3(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23634b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$observeActiveDictionaries$3 tokenUpdateViewModel$observeActiveDictionaries$3 = new TokenUpdateViewModel$observeActiveDictionaries$3(this.f23634b, continuation);
        tokenUpdateViewModel$observeActiveDictionaries$3.f23633a = obj;
        return tokenUpdateViewModel$observeActiveDictionaries$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$observeActiveDictionaries$3 tokenUpdateViewModel$observeActiveDictionaries$3 = (TokenUpdateViewModel$observeActiveDictionaries$3) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$observeActiveDictionaries$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list = (List) this.f23633a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23634b.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, list, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1048577, 2097150)));
        return xfa.f68157a;
    }
}
