package com.lingq.feature.search.fastsearch;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$2", m4291f = "FastSearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2768b f32842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$2(C2768b c2768b, Continuation continuation) {
        super(2, continuation);
        this.f32842a = c2768b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FastSearchViewModel$2(this.f32842a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FastSearchViewModel$2 fastSearchViewModel$2 = (FastSearchViewModel$2) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fastSearchViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f32842a.m9682Y2();
        return xfa.f68157a;
    }
}
