package com.lingq.p020ui;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "HomeFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2872xa4f401f2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f33901c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ HomeFragment f33902d;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "HomeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33903a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeFragment f33904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33904b = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33904b, continuation);
            anonymousClass1.f33903a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            anonymousClass1.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f33903a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            HomeFragment homeFragment = this.f33904b;
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$1(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$2(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$3(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$4(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$5(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$6(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$7(homeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new HomeFragment$onViewCreated$5$8(homeFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2872xa4f401f2(HomeFragment homeFragment, Lifecycle$State lifecycle$State, Continuation continuation, HomeFragment homeFragment2) {
        super(2, continuation);
        this.f33900b = homeFragment;
        this.f33901c = lifecycle$State;
        this.f33902d = homeFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2872xa4f401f2(this.f33900b, this.f33901c, continuation, this.f33902d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2872xa4f401f2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33899a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f33900b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33902d, null);
            this.f33899a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f33901c, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
