package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.hqa;
import p000.m97;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ hqa f31220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m97 f31221b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$1 readerVideoComposeViewModel$observeAppUsageAgainstPlayback$1 = new ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$1(3, (Continuation) obj3);
        readerVideoComposeViewModel$observeAppUsageAgainstPlayback$1.f31220a = (hqa) obj;
        readerVideoComposeViewModel$observeAppUsageAgainstPlayback$1.f31221b = (m97) obj2;
        return readerVideoComposeViewModel$observeAppUsageAgainstPlayback$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        hqa hqaVar = this.f31220a;
        m97 m97Var = this.f31221b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(hqaVar.f42795c && (m97Var == null || m97Var.m16697a(hqaVar.f42793a)));
    }
}
