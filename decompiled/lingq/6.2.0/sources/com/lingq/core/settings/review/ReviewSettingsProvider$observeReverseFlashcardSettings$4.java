package com.lingq.core.settings.review;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.do0;
import p000.tf8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeReverseFlashcardSettings$4", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeReverseFlashcardSettings$4 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ tf8 f23133a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ tf8 f23134b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23135c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f23136d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Pair f23137e;

    public ReviewSettingsProvider$observeReverseFlashcardSettings$4(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ReviewSettingsProvider$observeReverseFlashcardSettings$4 reviewSettingsProvider$observeReverseFlashcardSettings$4 = new ReviewSettingsProvider$observeReverseFlashcardSettings$4((Continuation) obj6);
        reviewSettingsProvider$observeReverseFlashcardSettings$4.f23133a = (tf8) obj;
        reviewSettingsProvider$observeReverseFlashcardSettings$4.f23134b = (tf8) obj2;
        reviewSettingsProvider$observeReverseFlashcardSettings$4.f23135c = zBooleanValue;
        reviewSettingsProvider$observeReverseFlashcardSettings$4.f23136d = (Map) obj4;
        reviewSettingsProvider$observeReverseFlashcardSettings$4.f23137e = (Pair) obj5;
        return reviewSettingsProvider$observeReverseFlashcardSettings$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        tf8 tf8Var = this.f23133a;
        tf8 tf8Var2 = this.f23134b;
        boolean z = this.f23135c;
        Map map = this.f23136d;
        Pair pair = this.f23137e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new do0(tf8Var.f62224a, tf8Var.f62225b, tf8Var.f62226c, tf8Var.f62227d, tf8Var.f62228e, tf8Var2.f62224a, tf8Var2.f62225b, tf8Var2.f62226c, tf8Var2.f62227d, tf8Var2.f62228e, z, map, (Map) pair.f47623a, (Map) pair.f47624b);
    }
}
