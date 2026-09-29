package com.lingq.core.settings.review;

import com.lingq.core.settings.ViewKeys;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$state$1", m4291f = "ReviewSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsViewModel$state$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ViewKeys f23171a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f23172b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23173c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f23174d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        ReviewSettingsViewModel$state$1 reviewSettingsViewModel$state$1 = new ReviewSettingsViewModel$state$1(5, (Continuation) obj5);
        reviewSettingsViewModel$state$1.f23171a = (ViewKeys) obj;
        reviewSettingsViewModel$state$1.f23172b = (String) obj2;
        reviewSettingsViewModel$state$1.f23173c = zBooleanValue;
        reviewSettingsViewModel$state$1.f23174d = iIntValue;
        return reviewSettingsViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewKeys viewKeys = this.f23171a;
        String str = this.f23172b;
        boolean z = this.f23173c;
        int i = this.f23174d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(new Pair(viewKeys, str), new Pair(Boolean.valueOf(z), new Integer(i)));
    }
}
