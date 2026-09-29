package com.lingq.core.settings.review;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeFlashcardSettings$3", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeFlashcardSettings$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f23114a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f23115b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReviewSettingsProvider$observeFlashcardSettings$3 reviewSettingsProvider$observeFlashcardSettings$3 = new ReviewSettingsProvider$observeFlashcardSettings$3(3, (Continuation) obj3);
        reviewSettingsProvider$observeFlashcardSettings$3.f23114a = (Map) obj;
        reviewSettingsProvider$observeFlashcardSettings$3.f23115b = (Map) obj2;
        return reviewSettingsProvider$observeFlashcardSettings$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f23114a;
        Map map2 = this.f23115b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(map, map2);
    }
}
