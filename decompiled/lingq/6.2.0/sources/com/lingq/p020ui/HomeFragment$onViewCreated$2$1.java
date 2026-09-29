package com.lingq.p020ui;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bh4;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$2$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HomeFragment f33905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$2$1(HomeFragment homeFragment, int i, Continuation continuation) {
        super(2, continuation);
        this.f33905a = homeFragment;
        this.f33906b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$2$1(this.f33905a, this.f33906b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HomeFragment$onViewCreated$2$1 homeFragment$onViewCreated$2$1 = (HomeFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        homeFragment$onViewCreated$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        bh4[] bh4VarArr = HomeFragment.f33886N0;
        this.f33905a.m9798k0().m9810Y2(this.f33906b, LqAnalyticsValues$LessonPath.Unknown.f14315a);
        return xfa.f68157a;
    }
}
