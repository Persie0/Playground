package com.lingq.feature.reader.content.state;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.nwa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$startFlows$3", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$startFlows$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f28058a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nwa f28059b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ReaderContentStateHolder$startFlows$3 readerContentStateHolder$startFlows$3 = new ReaderContentStateHolder$startFlows$3(3, (Continuation) obj3);
        readerContentStateHolder$startFlows$3.f28058a = iIntValue;
        readerContentStateHolder$startFlows$3.f28059b = (nwa) obj2;
        return readerContentStateHolder$startFlows$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f28058a;
        nwa nwaVar = this.f28059b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(new Integer(i), nwaVar);
    }
}
