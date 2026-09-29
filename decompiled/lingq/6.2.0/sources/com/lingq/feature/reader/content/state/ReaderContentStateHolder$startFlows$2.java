package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.b27;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$startFlows$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$startFlows$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$startFlows$2(C2264a c2264a, Continuation continuation) {
        super(2, continuation);
        this.f28057b = c2264a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderContentStateHolder$startFlows$2 readerContentStateHolder$startFlows$2 = new ReaderContentStateHolder$startFlows$2(this.f28057b, continuation);
        readerContentStateHolder$startFlows$2.f28056a = obj;
        return readerContentStateHolder$startFlows$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderContentStateHolder$startFlows$2 readerContentStateHolder$startFlows$2 = (ReaderContentStateHolder$startFlows$2) create((b27) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerContentStateHolder$startFlows$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        b27 b27Var = (b27) this.f28056a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2264a c2264a = this.f28057b;
        c2264a.f28107C.m15571i(b27Var.f7794a);
        C3244l c3244l = c2264a.f28109E;
        Map map = b27Var.f7795b;
        c3244l.m15571i(map);
        C2264a.m9261c(c2264a, map.keySet());
        return xfa.f68157a;
    }
}
