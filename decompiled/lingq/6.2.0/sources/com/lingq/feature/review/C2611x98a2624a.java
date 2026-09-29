package com.lingq.feature.review;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.te8;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2611x98a2624a extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewSessionCompleteFragment f31760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f31761c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewSessionCompleteFragment f31762d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ te8 f31763e;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31764a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewSessionCompleteFragment f31765b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ te8 f31766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(te8 te8Var, ReviewSessionCompleteFragment reviewSessionCompleteFragment, Continuation continuation) {
            super(2, continuation);
            this.f31765b = reviewSessionCompleteFragment;
            this.f31766c = te8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31766c, this.f31765b, continuation);
            anonymousClass1.f31764a = obj;
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
            un1 un1Var = (un1) this.f31764a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f31765b;
            wfb.m23926u(un1Var, null, null, new ReviewSessionCompleteFragment$onViewCreated$2$1(reviewSessionCompleteFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewSessionCompleteFragment$onViewCreated$2$2(this.f31766c, reviewSessionCompleteFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2611x98a2624a(ReviewSessionCompleteFragment reviewSessionCompleteFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReviewSessionCompleteFragment reviewSessionCompleteFragment2, te8 te8Var) {
        super(2, continuation);
        this.f31760b = reviewSessionCompleteFragment;
        this.f31761c = lifecycle$State;
        this.f31762d = reviewSessionCompleteFragment2;
        this.f31763e = te8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2611x98a2624a(this.f31760b, this.f31761c, continuation, this.f31762d, this.f31763e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2611x98a2624a) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31759a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f31760b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31763e, this.f31762d, null);
            this.f31759a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f31761c, anonymousClass1, this) == coroutineSingletons) {
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
