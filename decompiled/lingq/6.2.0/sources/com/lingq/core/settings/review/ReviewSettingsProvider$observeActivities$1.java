package com.lingq.core.settings.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.uf8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeActivities$1", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeActivities$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23088a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23089b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23090c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23091d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f23092e;

    public ReviewSettingsProvider$observeActivities$1(Continuation continuation) {
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
        ReviewSettingsProvider$observeActivities$1 reviewSettingsProvider$observeActivities$1 = new ReviewSettingsProvider$observeActivities$1((Continuation) obj6);
        reviewSettingsProvider$observeActivities$1.f23088a = zBooleanValue;
        reviewSettingsProvider$observeActivities$1.f23089b = zBooleanValue2;
        reviewSettingsProvider$observeActivities$1.f23090c = zBooleanValue3;
        reviewSettingsProvider$observeActivities$1.f23091d = zBooleanValue4;
        reviewSettingsProvider$observeActivities$1.f23092e = zBooleanValue5;
        return reviewSettingsProvider$observeActivities$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23088a;
        boolean z2 = this.f23089b;
        boolean z3 = this.f23090c;
        boolean z4 = this.f23091d;
        boolean z5 = this.f23092e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new uf8(z, z2, z3, z4, z5);
    }
}
