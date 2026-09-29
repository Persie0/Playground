package com.lingq.core.settings.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3173k6;
import p000.c32;
import p000.cj3;
import p000.uf8;
import p000.vf8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeActivities$4", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeActivities$4 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f23096a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uf8 f23097b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ vf8 f23098c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23099d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ReviewSettingsProvider$observeActivities$4 reviewSettingsProvider$observeActivities$4 = new ReviewSettingsProvider$observeActivities$4(5, (Continuation) obj5);
        reviewSettingsProvider$observeActivities$4.f23096a = iIntValue;
        reviewSettingsProvider$observeActivities$4.f23097b = (uf8) obj2;
        reviewSettingsProvider$observeActivities$4.f23098c = (vf8) obj3;
        reviewSettingsProvider$observeActivities$4.f23099d = zBooleanValue;
        return reviewSettingsProvider$observeActivities$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f23096a;
        uf8 uf8Var = this.f23097b;
        vf8 vf8Var = this.f23098c;
        boolean z = this.f23099d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new C3173k6(i, uf8Var.f63847a, uf8Var.f63848b, uf8Var.f63849c, uf8Var.f63850d, uf8Var.f63851e, vf8Var.f65320a, vf8Var.f65321b, vf8Var.f65322c, z);
    }
}
