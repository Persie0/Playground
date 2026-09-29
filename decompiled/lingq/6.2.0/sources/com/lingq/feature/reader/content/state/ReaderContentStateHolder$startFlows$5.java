package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.b27;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$startFlows$5", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$startFlows$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$startFlows$5(C2264a c2264a, Continuation continuation) {
        super(2, continuation);
        this.f28061b = c2264a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderContentStateHolder$startFlows$5 readerContentStateHolder$startFlows$5 = new ReaderContentStateHolder$startFlows$5(this.f28061b, continuation);
        readerContentStateHolder$startFlows$5.f28060a = obj;
        return readerContentStateHolder$startFlows$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderContentStateHolder$startFlows$5 readerContentStateHolder$startFlows$5 = (ReaderContentStateHolder$startFlows$5) create((b27) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerContentStateHolder$startFlows$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map;
        Map map2;
        Object value2;
        b27 b27Var = (b27) this.f28060a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2264a c2264a = this.f28061b;
        C3244l c3244l = c2264a.f28107C;
        do {
            value = c3244l.getValue();
            map = b27Var.f7794a;
            map2 = b27Var.f7795b;
        } while (!c3244l.m15570h(value, AbstractC3194a.m15367T((Map) value, map)));
        C3244l c3244l2 = c2264a.f28109E;
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, AbstractC3194a.m15367T((Map) value2, map2)));
        C2264a.m9261c(c2264a, map2.keySet());
        return xfa.f68157a;
    }
}
