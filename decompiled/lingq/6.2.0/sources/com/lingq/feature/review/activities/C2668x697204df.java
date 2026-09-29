package com.lingq.feature.review.activities;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.nb8;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2668x697204df extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f32026c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32027d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nb8 f32028e;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32029a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32030b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nb8 f32031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nb8 nb8Var, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
            super(2, continuation);
            this.f32030b = reviewActivityMultiAndClozeFragment;
            this.f32031c = nb8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32031c, this.f32030b, continuation);
            anonymousClass1.f32029a = obj;
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
            un1 un1Var = (un1) this.f32029a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32030b;
            wfb.m23926u(un1Var, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$1$1(reviewActivityMultiAndClozeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$1$2(reviewActivityMultiAndClozeFragment, null), 3);
            nb8 nb8Var = this.f32031c;
            wfb.m23926u(un1Var, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$1$3(nb8Var, reviewActivityMultiAndClozeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$1$4(reviewActivityMultiAndClozeFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$1$5(nb8Var, reviewActivityMultiAndClozeFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668x697204df(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2, nb8 nb8Var) {
        super(2, continuation);
        this.f32025b = reviewActivityMultiAndClozeFragment;
        this.f32026c = lifecycle$State;
        this.f32027d = reviewActivityMultiAndClozeFragment2;
        this.f32028e = nb8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2668x697204df(this.f32025b, this.f32026c, continuation, this.f32027d, this.f32028e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2668x697204df) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32024a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f32025b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32028e, this.f32027d, null);
            this.f32024a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f32026c, anonymousClass1, this) == coroutineSingletons) {
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
