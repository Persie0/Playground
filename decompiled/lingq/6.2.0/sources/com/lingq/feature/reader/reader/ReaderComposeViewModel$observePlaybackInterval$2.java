package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.m97;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observePlaybackInterval$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observePlaybackInterval$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observePlaybackInterval$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30026b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observePlaybackInterval$2 readerComposeViewModel$observePlaybackInterval$2 = new ReaderComposeViewModel$observePlaybackInterval$2(this.f30026b, continuation);
        readerComposeViewModel$observePlaybackInterval$2.f30025a = obj;
        return readerComposeViewModel$observePlaybackInterval$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observePlaybackInterval$2 readerComposeViewModel$observePlaybackInterval$2 = (ReaderComposeViewModel$observePlaybackInterval$2) create((m97) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observePlaybackInterval$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        m97 m97Var = (m97) this.f30025a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30026b.f30197S.m15571i(m97Var);
        return xfa.f68157a;
    }
}
