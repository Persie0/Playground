package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.nwa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$vocabSnapshot$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$vocabSnapshot$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ nwa f28071a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28072b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderContentStateHolder$vocabSnapshot$2 readerContentStateHolder$vocabSnapshot$2 = new ReaderContentStateHolder$vocabSnapshot$2(3, (Continuation) obj3);
        readerContentStateHolder$vocabSnapshot$2.f28071a = (nwa) obj;
        readerContentStateHolder$vocabSnapshot$2.f28072b = (Map) obj2;
        return readerContentStateHolder$vocabSnapshot$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nwa nwaVar = this.f28071a;
        Map map = this.f28072b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Map map2 = nwaVar.f53336a;
        Map map3 = nwaVar.f53337b;
        Map map4 = nwaVar.f53338c;
        boolean z = nwaVar.f53339d;
        String str = nwaVar.f53340e;
        map2.getClass();
        map3.getClass();
        map4.getClass();
        str.getClass();
        map.getClass();
        return new nwa(map2, map3, map4, z, str, map);
    }
}
