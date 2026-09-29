package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoPosition$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeVideoPosition$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f31247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeVideoPosition$3(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31248b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeVideoPosition$3 readerVideoComposeViewModel$observeVideoPosition$3 = new ReaderVideoComposeViewModel$observeVideoPosition$3(this.f31248b, continuation);
        readerVideoComposeViewModel$observeVideoPosition$3.f31247a = ((Number) obj).intValue();
        return readerVideoComposeViewModel$observeVideoPosition$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoComposeViewModel$observeVideoPosition$3 readerVideoComposeViewModel$observeVideoPosition$3 = (ReaderVideoComposeViewModel$observeVideoPosition$3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeVideoPosition$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f31247a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2583a c2583a = this.f31248b;
        Integer numM9523e = c2583a.f31372e.m9523e(i);
        if (numM9523e != null) {
            c2583a.m9510W2(numM9523e.intValue());
        }
        return xfa.f68157a;
    }
}
