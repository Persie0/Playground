package com.lingq.feature.chat.domain;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.q02;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.GetChatsUseCase$invoke$3", m4291f = "GetChatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChatsUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25182a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatsUseCase$invoke$3 getChatsUseCase$invoke$3 = new GetChatsUseCase$invoke$3(2, continuation);
        getChatsUseCase$invoke$3.f25182a = obj;
        return getChatsUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatsUseCase$invoke$3) create((q02) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        q02 q02Var = (q02) this.f25182a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = (List) q02Var.f57065a;
        if (obj2 == null) {
            obj2 = EmptyList.f47638a;
        }
        Integer num = (Integer) q02Var.f57066b;
        return new Pair(obj2, new Integer(num != null ? num.intValue() : -1));
    }
}
