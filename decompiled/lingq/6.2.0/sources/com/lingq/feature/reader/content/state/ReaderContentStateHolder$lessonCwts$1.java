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
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$lessonCwts$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$lessonCwts$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f28004a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f28005b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ReaderContentStateHolder$lessonCwts$1 readerContentStateHolder$lessonCwts$1 = new ReaderContentStateHolder$lessonCwts$1(3, (Continuation) obj3);
        readerContentStateHolder$lessonCwts$1.f28004a = iIntValue;
        readerContentStateHolder$lessonCwts$1.f28005b = (String) obj2;
        return readerContentStateHolder$lessonCwts$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f28004a;
        String str = this.f28005b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(new Integer(i), str);
    }
}
