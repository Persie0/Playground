package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observePlaybackSentenceBookmark$3", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observePlaybackSentenceBookmark$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f30033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observePlaybackSentenceBookmark$3(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30034b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observePlaybackSentenceBookmark$3 readerComposeViewModel$observePlaybackSentenceBookmark$3 = new ReaderComposeViewModel$observePlaybackSentenceBookmark$3(this.f30034b, continuation);
        readerComposeViewModel$observePlaybackSentenceBookmark$3.f30033a = ((Number) obj).intValue();
        return readerComposeViewModel$observePlaybackSentenceBookmark$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observePlaybackSentenceBookmark$3 readerComposeViewModel$observePlaybackSentenceBookmark$3 = (ReaderComposeViewModel$observePlaybackSentenceBookmark$3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observePlaybackSentenceBookmark$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f30033a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30034b.m9393Z2(i);
        return xfa.f68157a;
    }
}
