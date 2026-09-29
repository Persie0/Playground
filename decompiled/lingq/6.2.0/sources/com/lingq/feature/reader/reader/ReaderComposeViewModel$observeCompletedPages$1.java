package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeCompletedPages$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeCompletedPages$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f29988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeCompletedPages$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29989b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeCompletedPages$1 readerComposeViewModel$observeCompletedPages$1 = new ReaderComposeViewModel$observeCompletedPages$1(this.f29989b, continuation);
        readerComposeViewModel$observeCompletedPages$1.f29988a = ((Number) obj).intValue();
        return readerComposeViewModel$observeCompletedPages$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeCompletedPages$1 readerComposeViewModel$observeCompletedPages$1 = (ReaderComposeViewModel$observeCompletedPages$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeCompletedPages$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f29988a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f29989b.f30212e.f27949o;
        while (true) {
            Object value = c3244l.getValue();
            int i2 = i;
            if (c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, i2, false, null, null, false, false, null, 0, false, 8372223))) {
                return xfa.f68157a;
            }
            i = i2;
        }
    }
}
