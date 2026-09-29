package com.lingq.feature.reader.reader;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.tt7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeAnalytics$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeAnalytics$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29980b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeAnalytics$2 readerComposeViewModel$observeAnalytics$2 = new ReaderComposeViewModel$observeAnalytics$2(this.f29980b, continuation);
        readerComposeViewModel$observeAnalytics$2.f29979a = obj;
        return readerComposeViewModel$observeAnalytics$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeAnalytics$2 readerComposeViewModel$observeAnalytics$2 = (ReaderComposeViewModel$observeAnalytics$2) create((Lesson) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeAnalytics$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Lesson lesson = (Lesson) this.f29979a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2493a c2493a = this.f29980b;
        c2493a.f30232v.m17001k(new tt7(lesson, c2493a.f30206b.mo4589b2(), c2493a.f30188J.f44585b, c2493a.f30194P));
        return xfa.f68157a;
    }
}
