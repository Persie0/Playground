package com.lingq.feature.reader.old;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$pagesInfo$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$pagesInfo$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f29007a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f29008b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ReaderViewModel$pagesInfo$1 readerViewModel$pagesInfo$1 = new ReaderViewModel$pagesInfo$1(3, (Continuation) obj3);
        readerViewModel$pagesInfo$1.f29007a = iIntValue;
        readerViewModel$pagesInfo$1.f29008b = (List) obj2;
        return readerViewModel$pagesInfo$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f29007a;
        List list = this.f29008b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(new Integer(i + 1), new Integer(list.size()));
    }
}
