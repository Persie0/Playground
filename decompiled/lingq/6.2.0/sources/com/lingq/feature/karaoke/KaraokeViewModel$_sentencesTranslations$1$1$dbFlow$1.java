package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f26253a;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1 karaokeViewModel$_sentencesTranslations$1$1$dbFlow$1 = new KaraokeViewModel$_sentencesTranslations$1$1$dbFlow$1(3, (Continuation) obj3);
        karaokeViewModel$_sentencesTranslations$1$1$dbFlow$1.f26253a = (Throwable) obj2;
        xfa xfaVar = xfa.f68157a;
        karaokeViewModel$_sentencesTranslations$1$1$dbFlow$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.f26253a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        th.printStackTrace();
        return xfa.f68157a;
    }
}
