package com.lingq.feature.more;

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

/* JADX INFO: renamed from: com.lingq.feature.more.MoreFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "MoreFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2157x6c6e7ce8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MoreFragment f26811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f26812c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MoreFragment f26813d;

    /* JADX INFO: renamed from: com.lingq.feature.more.MoreFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.more.MoreFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "MoreFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26814a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MoreFragment f26815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MoreFragment moreFragment, Continuation continuation) {
            super(2, continuation);
            this.f26815b = moreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26815b, continuation);
            anonymousClass1.f26814a = obj;
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
            un1 un1Var = (un1) this.f26814a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            MoreFragment moreFragment = this.f26815b;
            wfb.m23926u(un1Var, null, null, new MoreFragment$onViewCreated$3$1(moreFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new MoreFragment$onViewCreated$3$2(moreFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157x6c6e7ce8(MoreFragment moreFragment, Lifecycle$State lifecycle$State, Continuation continuation, MoreFragment moreFragment2) {
        super(2, continuation);
        this.f26811b = moreFragment;
        this.f26812c = lifecycle$State;
        this.f26813d = moreFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2157x6c6e7ce8(this.f26811b, this.f26812c, continuation, this.f26813d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2157x6c6e7ce8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26810a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f26811b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26813d, null);
            this.f26810a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f26812c, anonymousClass1, this) == coroutineSingletons) {
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
