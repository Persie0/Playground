package com.lingq.feature.reader.reader;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$wireSentenceTimestamps$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$wireSentenceTimestamps$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$wireSentenceTimestamps$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30141b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$wireSentenceTimestamps$1 readerComposeViewModel$wireSentenceTimestamps$1 = new ReaderComposeViewModel$wireSentenceTimestamps$1(this.f30141b, continuation);
        readerComposeViewModel$wireSentenceTimestamps$1.f30140a = obj;
        return readerComposeViewModel$wireSentenceTimestamps$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$wireSentenceTimestamps$1 readerComposeViewModel$wireSentenceTimestamps$1 = (ReaderComposeViewModel$wireSentenceTimestamps$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$wireSentenceTimestamps$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f30140a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30141b.f30218h.m9366i(list);
        return xfa.f68157a;
    }
}
