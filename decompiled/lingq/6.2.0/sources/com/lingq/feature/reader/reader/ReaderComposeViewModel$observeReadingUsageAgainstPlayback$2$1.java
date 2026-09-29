package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.k55;
import p000.m97;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ k55 f30047a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m97 f30048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f30049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1(boolean z, Continuation continuation) {
        super(3, continuation);
        this.f30049c = z;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1 readerComposeViewModel$observeReadingUsageAgainstPlayback$2$1 = new ReaderComposeViewModel$observeReadingUsageAgainstPlayback$2$1(this.f30049c, (Continuation) obj3);
        readerComposeViewModel$observeReadingUsageAgainstPlayback$2$1.f30047a = (k55) obj;
        readerComposeViewModel$observeReadingUsageAgainstPlayback$2$1.f30048b = (m97) obj2;
        return readerComposeViewModel$observeReadingUsageAgainstPlayback$2$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k55 k55Var = this.f30047a;
        m97 m97Var = this.f30048b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(Boolean.valueOf(this.f30049c), Boolean.valueOf(k55Var.f46725a && (m97Var == null || m97Var.m16697a(k55Var.f46726b))));
    }
}
