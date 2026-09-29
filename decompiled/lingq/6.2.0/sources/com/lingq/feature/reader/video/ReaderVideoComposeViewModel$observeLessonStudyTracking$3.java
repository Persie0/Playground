package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.hqa;
import p000.k55;
import p000.m97;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeLessonStudyTracking$3", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeLessonStudyTracking$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ hqa f31229a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m97 f31230b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$observeLessonStudyTracking$3 readerVideoComposeViewModel$observeLessonStudyTracking$3 = new ReaderVideoComposeViewModel$observeLessonStudyTracking$3(3, (Continuation) obj3);
        readerVideoComposeViewModel$observeLessonStudyTracking$3.f31229a = (hqa) obj;
        readerVideoComposeViewModel$observeLessonStudyTracking$3.f31230b = (m97) obj2;
        return readerVideoComposeViewModel$observeLessonStudyTracking$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        hqa hqaVar = this.f31229a;
        m97 m97Var = this.f31230b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new k55(hqaVar.f42795c, hqaVar.f42793a, hqaVar.f42794b, m97Var);
    }
}
