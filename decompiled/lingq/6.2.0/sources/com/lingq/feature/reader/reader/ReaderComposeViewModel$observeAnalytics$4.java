package com.lingq.feature.reader.reader;

import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.mq7;
import p000.ox7;
import p000.xfa;
import p000.zi3;
import p000.zt7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$4", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeAnalytics$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeAnalytics$4(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29982b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeAnalytics$4 readerComposeViewModel$observeAnalytics$4 = new ReaderComposeViewModel$observeAnalytics$4(this.f29982b, continuation);
        readerComposeViewModel$observeAnalytics$4.f29981a = obj;
        return readerComposeViewModel$observeAnalytics$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeAnalytics$4 readerComposeViewModel$observeAnalytics$4 = (ReaderComposeViewModel$observeAnalytics$4) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeAnalytics$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f29981a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mq7 mq7Var = this.f29982b.f30232v;
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((ox7) it.next()).f55132e.size();
        }
        mq7Var.m17001k(new zt7(size));
        return xfa.f68157a;
    }
}
