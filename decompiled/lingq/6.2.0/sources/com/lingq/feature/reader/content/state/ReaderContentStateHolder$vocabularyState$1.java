package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.v08;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$vocabularyState$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$vocabularyState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f28073a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28074b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f28075c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f28076d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f28077e;

    public ReaderContentStateHolder$vocabularyState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        int iIntValue3 = ((Number) obj5).intValue();
        ReaderContentStateHolder$vocabularyState$1 readerContentStateHolder$vocabularyState$1 = new ReaderContentStateHolder$vocabularyState$1((Continuation) obj6);
        readerContentStateHolder$vocabularyState$1.f28073a = (Map) obj;
        readerContentStateHolder$vocabularyState$1.f28074b = (Map) obj2;
        readerContentStateHolder$vocabularyState$1.f28075c = iIntValue;
        readerContentStateHolder$vocabularyState$1.f28076d = iIntValue2;
        readerContentStateHolder$vocabularyState$1.f28077e = iIntValue3;
        return readerContentStateHolder$vocabularyState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f28073a;
        Map map2 = this.f28074b;
        int i = this.f28075c;
        int i2 = this.f28076d;
        int i3 = this.f28077e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new v08(map, map2, i, i2, i3);
    }
}
