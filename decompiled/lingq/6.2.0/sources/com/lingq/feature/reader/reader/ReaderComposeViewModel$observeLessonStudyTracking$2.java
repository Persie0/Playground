package com.lingq.feature.reader.reader;

import com.lingq.feature.reader.tracking.TrackingPauseReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeLessonStudyTracking$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f30008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeLessonStudyTracking$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30009b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeLessonStudyTracking$2 readerComposeViewModel$observeLessonStudyTracking$2 = new ReaderComposeViewModel$observeLessonStudyTracking$2(this.f30009b, continuation);
        readerComposeViewModel$observeLessonStudyTracking$2.f30008a = ((Boolean) obj).booleanValue();
        return readerComposeViewModel$observeLessonStudyTracking$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ReaderComposeViewModel$observeLessonStudyTracking$2 readerComposeViewModel$observeLessonStudyTracking$2 = (ReaderComposeViewModel$observeLessonStudyTracking$2) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeLessonStudyTracking$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f30008a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f30009b.f30186H.m9503n(TrackingPauseReason.ExternalListeningTracking, !z, false, true);
        return xfa.f68157a;
    }
}
