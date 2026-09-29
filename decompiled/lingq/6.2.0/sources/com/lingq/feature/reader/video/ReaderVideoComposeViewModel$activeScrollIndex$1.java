package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$activeScrollIndex$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$activeScrollIndex$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Integer f31179a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31180b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderVideoComposeViewModel$activeScrollIndex$1 readerVideoComposeViewModel$activeScrollIndex$1 = new ReaderVideoComposeViewModel$activeScrollIndex$1(3, (Continuation) obj3);
        readerVideoComposeViewModel$activeScrollIndex$1.f31179a = (Integer) obj;
        readerVideoComposeViewModel$activeScrollIndex$1.f31180b = (Integer) obj2;
        return readerVideoComposeViewModel$activeScrollIndex$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.f31179a;
        Integer num2 = this.f31180b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return num2 == null ? num : num2;
    }
}
