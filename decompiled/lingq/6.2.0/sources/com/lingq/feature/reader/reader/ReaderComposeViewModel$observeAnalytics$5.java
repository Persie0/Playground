package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.lesson.LessonStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.rt7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$5", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeAnalytics$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeAnalytics$5(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29984b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeAnalytics$5 readerComposeViewModel$observeAnalytics$5 = new ReaderComposeViewModel$observeAnalytics$5(this.f29984b, continuation);
        readerComposeViewModel$observeAnalytics$5.f29983a = obj;
        return readerComposeViewModel$observeAnalytics$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeAnalytics$5 readerComposeViewModel$observeAnalytics$5 = (ReaderComposeViewModel$observeAnalytics$5) create((LessonStats) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeAnalytics$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonStats lessonStats = (LessonStats) this.f29983a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f29984b.f30232v.m17001k(new rt7((int) lessonStats.f19272f));
        return xfa.f68157a;
    }
}
