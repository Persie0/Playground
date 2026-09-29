package com.lingq.feature.reader.video;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.e08;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$translationState$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$translationState$3 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f31324a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f31325b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f31326c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ReaderVideoComposeViewModel$translationState$3 readerVideoComposeViewModel$translationState$3 = new ReaderVideoComposeViewModel$translationState$3(4, (Continuation) obj4);
        readerVideoComposeViewModel$translationState$3.f31324a = (Map) obj;
        readerVideoComposeViewModel$translationState$3.f31325b = (Map) obj2;
        readerVideoComposeViewModel$translationState$3.f31326c = zBooleanValue;
        return readerVideoComposeViewModel$translationState$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f31324a;
        Map mapM15360M = this.f31325b;
        boolean z = this.f31326c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!z) {
            mapM15360M = AbstractC3194a.m15360M();
        }
        return new e08(map, mapM15360M);
    }
}
