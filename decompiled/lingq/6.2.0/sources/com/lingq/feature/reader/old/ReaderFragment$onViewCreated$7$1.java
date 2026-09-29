package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bh4;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$7$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$7$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f28433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$7$1(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28434b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderFragment$onViewCreated$7$1 readerFragment$onViewCreated$7$1 = new ReaderFragment$onViewCreated$7$1(this.f28434b, continuation);
        readerFragment$onViewCreated$7$1.f28433a = ((Number) obj).intValue();
        return readerFragment$onViewCreated$7$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderFragment$onViewCreated$7$1 readerFragment$onViewCreated$7$1 = (ReaderFragment$onViewCreated$7$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerFragment$onViewCreated$7$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f28433a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        bh4[] bh4VarArr = ReaderFragment.f28218P0;
        ReaderFragment readerFragment = this.f28434b;
        readerFragment.m9290W0().m9341u3(i, false);
        readerFragment.m9288U0().f66709o.m2892c(i, true);
        return xfa.f68157a;
    }
}
