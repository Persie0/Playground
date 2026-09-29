package com.lingq.feature.reader.content.state;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.b27;
import p000.c18;
import p000.c32;
import p000.nwa;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$startFlows$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$startFlows$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$startFlows$1(C2264a c2264a, Continuation continuation) {
        super(2, continuation);
        this.f28055b = c2264a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderContentStateHolder$startFlows$1 readerContentStateHolder$startFlows$1 = new ReaderContentStateHolder$startFlows$1(this.f28055b, continuation);
        readerContentStateHolder$startFlows$1.f28054a = obj;
        return readerContentStateHolder$startFlows$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$startFlows$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2264a c2264a = this.f28055b;
        c18 c18Var = c2264a.f28134w;
        List list = (List) this.f28054a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty()) {
            return new b27(AbstractC3194a.m15360M(), AbstractC3194a.m15360M());
        }
        List listM9262d = C2264a.m9262d(c2264a, list, ((yz4) ((C3244l) c2264a.f28122k.f27957w.f9311a).getValue()).f70680n);
        return new b27(C2264a.m9259a(c2264a, list, listM9262d, (nwa) ((C3244l) c18Var.f9311a).getValue(), AbstractC3194a.m15360M()), C2264a.m9260b(c2264a, list, listM9262d, (nwa) ((C3244l) c18Var.f9311a).getValue(), AbstractC3194a.m15360M()));
    }
}
