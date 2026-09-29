package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30051b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3 readerComposeViewModel$observeReadingUsageAgainstPlayback$3 = new ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3(this.f30051b, continuation);
        readerComposeViewModel$observeReadingUsageAgainstPlayback$3.f30050a = obj;
        return readerComposeViewModel$observeReadingUsageAgainstPlayback$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3 readerComposeViewModel$observeReadingUsageAgainstPlayback$3 = (ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeReadingUsageAgainstPlayback$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f30050a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean zBooleanValue = ((Boolean) pair.f47623a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.f47624b).booleanValue();
        C2493a c2493a = this.f30051b;
        boolean z = c2493a.f30191M;
        xfa xfaVar = xfa.f68157a;
        if (!z) {
            return xfaVar;
        }
        if (zBooleanValue) {
            c2493a.m9397d3(zBooleanValue2);
            return xfaVar;
        }
        c2493a.m9396c3();
        c2493a.m9395b3();
        return xfaVar;
    }
}
