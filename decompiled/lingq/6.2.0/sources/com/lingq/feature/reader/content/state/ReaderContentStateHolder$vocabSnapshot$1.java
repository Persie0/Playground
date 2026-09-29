package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.nwa;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$vocabSnapshot$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$vocabSnapshot$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f28066a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28067b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28068c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f28069d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f28070e;

    public ReaderContentStateHolder$vocabSnapshot$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ReaderContentStateHolder$vocabSnapshot$1 readerContentStateHolder$vocabSnapshot$1 = new ReaderContentStateHolder$vocabSnapshot$1((Continuation) obj6);
        readerContentStateHolder$vocabSnapshot$1.f28066a = (Map) obj;
        readerContentStateHolder$vocabSnapshot$1.f28067b = (Map) obj2;
        readerContentStateHolder$vocabSnapshot$1.f28068c = (Map) obj3;
        readerContentStateHolder$vocabSnapshot$1.f28069d = zBooleanValue;
        readerContentStateHolder$vocabSnapshot$1.f28070e = (String) obj5;
        return readerContentStateHolder$vocabSnapshot$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f28066a;
        Map map2 = this.f28067b;
        Map map3 = this.f28068c;
        boolean z = this.f28069d;
        String str = this.f28070e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new nwa(map, map2, map3, z, str, AbstractC3194a.m15360M());
    }
}
