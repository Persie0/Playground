package com.lingq.p020ui;

import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$7", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HomeFragment f33929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$7(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33929a = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$7(this.f33929a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HomeFragment$onViewCreated$5$7 homeFragment$onViewCreated$5$7 = (HomeFragment$onViewCreated$5$7) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        homeFragment$onViewCreated$5$7.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        HomeFragment homeFragment = this.f33929a;
        C1808b c1808b = homeFragment.f33896L0;
        if (c1808b == null) {
            fa4.m11636J("playerController");
            throw null;
        }
        if (((PlayingFrom) c1808b.f21953f.mo9214t2().getValue()) == PlayingFrom.Lesson) {
            C1808b c1808b2 = homeFragment.f33896L0;
            if (c1808b2 == null) {
                fa4.m11636J("playerController");
                throw null;
            }
            c1808b2.m8447J();
        }
        return xfa.f68157a;
    }
}
