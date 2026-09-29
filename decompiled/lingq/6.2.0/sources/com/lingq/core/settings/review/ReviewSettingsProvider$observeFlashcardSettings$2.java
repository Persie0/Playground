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
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeFlashcardSettings$2", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeFlashcardSettings$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23109a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23110b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23111c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23112d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f23113e;

    public ReviewSettingsProvider$observeFlashcardSettings$2(Continuation continuation) {
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
        ReviewSettingsProvider$observeFlashcardSettings$2 reviewSettingsProvider$observeFlashcardSettings$2 = new ReviewSettingsProvider$observeFlashcardSettings$2((Continuation) obj6);
        reviewSettingsProvider$observeFlashcardSettings$2.f23109a = zBooleanValue;
        reviewSettingsProvider$observeFlashcardSettings$2.f23110b = zBooleanValue2;
        reviewSettingsProvider$observeFlashcardSettings$2.f23111c = zBooleanValue3;
        reviewSettingsProvider$observeFlashcardSettings$2.f23112d = zBooleanValue4;
        reviewSettingsProvider$observeFlashcardSettings$2.f23113e = zBooleanValue5;
        return reviewSettingsProvider$observeFlashcardSettings$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23109a;
        boolean z2 = this.f23110b;
        boolean z3 = this.f23111c;
        boolean z4 = this.f23112d;
        boolean z5 = this.f23113e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new tf8(z, z2, z3, z4, z5);
    }
}
