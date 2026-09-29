package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.k55;
import p000.m97;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$6$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeLessonStudyTracking$6$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ k55 f30012a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m97 f30013b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$observeLessonStudyTracking$6$1 readerComposeViewModel$observeLessonStudyTracking$6$1 = new ReaderComposeViewModel$observeLessonStudyTracking$6$1(3, (Continuation) obj3);
        readerComposeViewModel$observeLessonStudyTracking$6$1.f30012a = (k55) obj;
        readerComposeViewModel$observeLessonStudyTracking$6$1.f30013b = (m97) obj2;
        return readerComposeViewModel$observeLessonStudyTracking$6$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k55 k55Var = this.f30012a;
        m97 m97Var = this.f30013b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return k55.m14854a(k55Var, false, 0L, 0L, m97Var, 7);
    }
}
