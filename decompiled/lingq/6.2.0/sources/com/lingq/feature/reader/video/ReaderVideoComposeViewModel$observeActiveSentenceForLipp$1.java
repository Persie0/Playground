package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31217b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1 readerVideoComposeViewModel$observeActiveSentenceForLipp$1 = new ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1(this.f31217b, continuation);
        readerVideoComposeViewModel$observeActiveSentenceForLipp$1.f31216a = obj;
        return readerVideoComposeViewModel$observeActiveSentenceForLipp$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1 readerVideoComposeViewModel$observeActiveSentenceForLipp$1 = (ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1) create((Integer) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeActiveSentenceForLipp$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = (Integer) this.f31216a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f31217b.f31377j.f31549i.m15571i(num);
        return xfa.f68157a;
    }
}
