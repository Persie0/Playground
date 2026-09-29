package com.lingq.feature.reader.content.state;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$phrases$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$phrases$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f28010a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f28011b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ReaderContentStateHolder$phrases$1 readerContentStateHolder$phrases$1 = new ReaderContentStateHolder$phrases$1(3, (Continuation) obj3);
        readerContentStateHolder$phrases$1.f28010a = (String) obj;
        readerContentStateHolder$phrases$1.f28011b = iIntValue;
        return readerContentStateHolder$phrases$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f28010a;
        int i = this.f28011b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(str, new Integer(i));
    }
}
