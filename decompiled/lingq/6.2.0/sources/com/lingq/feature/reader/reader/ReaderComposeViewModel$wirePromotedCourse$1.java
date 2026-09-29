package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.tn7;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$wirePromotedCourse$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$wirePromotedCourse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$wirePromotedCourse$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30133b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$wirePromotedCourse$1 readerComposeViewModel$wirePromotedCourse$1 = new ReaderComposeViewModel$wirePromotedCourse$1(this.f30133b, continuation);
        readerComposeViewModel$wirePromotedCourse$1.f30132a = obj;
        return readerComposeViewModel$wirePromotedCourse$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$wirePromotedCourse$1 readerComposeViewModel$wirePromotedCourse$1 = (ReaderComposeViewModel$wirePromotedCourse$1) create((tn7) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$wirePromotedCourse$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        tn7 tn7Var = (tn7) this.f30132a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f30133b.f30212e.f27949o;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, tn7Var, 0, false, 7340031)));
        return xfa.f68157a;
    }
}
