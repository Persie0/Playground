package com.lingq.core.settings.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.tf8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeReverseFlashcardSettings$2", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeReverseFlashcardSettings$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23126a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23127b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23128c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23129d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f23130e;

    public ReviewSettingsProvider$observeReverseFlashcardSettings$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
        ReviewSettingsProvider$observeReverseFlashcardSettings$2 reviewSettingsProvider$observeReverseFlashcardSettings$2 = new ReviewSettingsProvider$observeReverseFlashcardSettings$2((Continuation) obj6);
        reviewSettingsProvider$observeReverseFlashcardSettings$2.f23126a = zBooleanValue;
        reviewSettingsProvider$observeReverseFlashcardSettings$2.f23127b = zBooleanValue2;
        reviewSettingsProvider$observeReverseFlashcardSettings$2.f23128c = zBooleanValue3;
        reviewSettingsProvider$observeReverseFlashcardSettings$2.f23129d = zBooleanValue4;
        reviewSettingsProvider$observeReverseFlashcardSettings$2.f23130e = zBooleanValue5;
        return reviewSettingsProvider$observeReverseFlashcardSettings$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23126a;
        boolean z2 = this.f23127b;
        boolean z3 = this.f23128c;
        boolean z4 = this.f23129d;
        boolean z5 = this.f23130e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new tf8(z, z2, z3, z4, z5);
    }
}
