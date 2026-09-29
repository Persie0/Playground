package com.lingq.feature.reader.reader;

import com.lingq.feature.reader.reader.state.C2503b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeContentReadiness$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeContentReadiness$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f29993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeContentReadiness$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29994b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeContentReadiness$2 readerComposeViewModel$observeContentReadiness$2 = new ReaderComposeViewModel$observeContentReadiness$2(this.f29994b, continuation);
        readerComposeViewModel$observeContentReadiness$2.f29993a = ((Boolean) obj).booleanValue();
        return readerComposeViewModel$observeContentReadiness$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ReaderComposeViewModel$observeContentReadiness$2 readerComposeViewModel$observeContentReadiness$2 = (ReaderComposeViewModel$observeContentReadiness$2) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeContentReadiness$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f29993a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2503b c2503b = this.f29994b.f30223m;
        if (z) {
            c2503b.m9410f();
        } else {
            C3244l c3244l = c2503b.f30320i;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            c2503b.f30321j.m15571i(null);
            c2503b.f30318g.m15571i(null);
            c2503b.f30319h = null;
        }
        return xfa.f68157a;
    }
}
