package com.lingq.core.settings.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.vf8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeActivities$2", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeActivities$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23093a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23094b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23095c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ReviewSettingsProvider$observeActivities$2 reviewSettingsProvider$observeActivities$2 = new ReviewSettingsProvider$observeActivities$2(4, (Continuation) obj4);
        reviewSettingsProvider$observeActivities$2.f23093a = zBooleanValue;
        reviewSettingsProvider$observeActivities$2.f23094b = zBooleanValue2;
        reviewSettingsProvider$observeActivities$2.f23095c = zBooleanValue3;
        return reviewSettingsProvider$observeActivities$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23093a;
        boolean z2 = this.f23094b;
        boolean z3 = this.f23095c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new vf8(z, z2, z3);
    }
}
