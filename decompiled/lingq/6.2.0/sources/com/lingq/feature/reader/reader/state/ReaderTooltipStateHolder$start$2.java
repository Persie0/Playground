package com.lingq.feature.reader.reader.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.state.ReaderTooltipStateHolder$start$2", m4291f = "ReaderTooltipStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderTooltipStateHolder$start$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f30306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2503b f30307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderTooltipStateHolder$start$2(C2503b c2503b, Continuation continuation) {
        super(2, continuation);
        this.f30307b = c2503b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderTooltipStateHolder$start$2 readerTooltipStateHolder$start$2 = new ReaderTooltipStateHolder$start$2(this.f30307b, continuation);
        readerTooltipStateHolder$start$2.f30306a = ((Boolean) obj).booleanValue();
        return readerTooltipStateHolder$start$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ReaderTooltipStateHolder$start$2 readerTooltipStateHolder$start$2 = (ReaderTooltipStateHolder$start$2) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerTooltipStateHolder$start$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f30306a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (z) {
            C2503b.m9405a(this.f30307b);
        }
        return xfa.f68157a;
    }
}
