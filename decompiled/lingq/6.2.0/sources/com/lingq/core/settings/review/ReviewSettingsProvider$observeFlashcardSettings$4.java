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
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeFlashcardSettings$4", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeFlashcardSettings$4 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ tf8 f23116a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ tf8 f23117b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23118c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f23119d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Pair f23120e;

    public ReviewSettingsProvider$observeFlashcardSettings$4(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ReviewSettingsProvider$observeFlashcardSettings$4 reviewSettingsProvider$observeFlashcardSettings$4 = new ReviewSettingsProvider$observeFlashcardSettings$4((Continuation) obj6);
        reviewSettingsProvider$observeFlashcardSettings$4.f23116a = (tf8) obj;
        reviewSettingsProvider$observeFlashcardSettings$4.f23117b = (tf8) obj2;
        reviewSettingsProvider$observeFlashcardSettings$4.f23118c = zBooleanValue;
        reviewSettingsProvider$observeFlashcardSettings$4.f23119d = (Map) obj4;
        reviewSettingsProvider$observeFlashcardSettings$4.f23120e = (Pair) obj5;
        return reviewSettingsProvider$observeFlashcardSettings$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        tf8 tf8Var = this.f23116a;
        tf8 tf8Var2 = this.f23117b;
        boolean z = this.f23118c;
        Map map = this.f23119d;
        Pair pair = this.f23120e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new do0(tf8Var.f62224a, tf8Var.f62225b, tf8Var.f62226c, tf8Var.f62227d, tf8Var.f62228e, tf8Var2.f62224a, tf8Var2.f62225b, tf8Var2.f62226c, tf8Var2.f62227d, tf8Var2.f62228e, z, map, (Map) pair.f47623a, (Map) pair.f47624b);
    }
}
