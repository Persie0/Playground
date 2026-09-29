package com.lingq.core.settings.review;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3562s6;
import p000.c32;
import p000.cj3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsProvider$observeActivityDetail$1", m4291f = "ReviewSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsProvider$observeActivityDetail$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f23100a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f23101b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f23102c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f23103d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ReviewSettingsProvider$observeActivityDetail$1 reviewSettingsProvider$observeActivityDetail$1 = new ReviewSettingsProvider$observeActivityDetail$1(5, (Continuation) obj5);
        reviewSettingsProvider$observeActivityDetail$1.f23100a = (Map) obj;
        reviewSettingsProvider$observeActivityDetail$1.f23101b = (Map) obj2;
        reviewSettingsProvider$observeActivityDetail$1.f23102c = (Map) obj3;
        reviewSettingsProvider$observeActivityDetail$1.f23103d = (Map) obj4;
        return reviewSettingsProvider$observeActivityDetail$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f23100a;
        Map map2 = this.f23101b;
        Map map3 = this.f23102c;
        Map map4 = this.f23103d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new C3562s6(map, map2, map3, map4);
    }
}
