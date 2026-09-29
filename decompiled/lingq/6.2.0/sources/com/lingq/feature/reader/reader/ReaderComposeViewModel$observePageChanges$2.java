package com.lingq.feature.reader.reader;

import com.lingq.feature.reader.content.state.C2264a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observePageChanges$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observePageChanges$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observePageChanges$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30021b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observePageChanges$2 readerComposeViewModel$observePageChanges$2 = new ReaderComposeViewModel$observePageChanges$2(this.f30021b, continuation);
        readerComposeViewModel$observePageChanges$2.f30020a = obj;
        return readerComposeViewModel$observePageChanges$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observePageChanges$2 readerComposeViewModel$observePageChanges$2 = (ReaderComposeViewModel$observePageChanges$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observePageChanges$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f30020a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2264a c2264a = this.f30021b.f30214f;
        c2264a.getClass();
        list.getClass();
        C3244l c3244l = c2264a.f28127p;
        c3244l.getClass();
        c3244l.m15572j(null, list);
        return xfa.f68157a;
    }
}
