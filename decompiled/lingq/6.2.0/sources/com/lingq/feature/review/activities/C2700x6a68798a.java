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
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2700x6a68798a extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivitySpeakingFragment f32144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f32145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewActivitySpeakingFragment f32146d;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32147a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivitySpeakingFragment f32148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
            super(2, continuation);
            this.f32148b = reviewActivitySpeakingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32148b, continuation);
            anonymousClass1.f32147a = obj;
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
            un1 un1Var = (un1) this.f32147a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f32148b;
            wfb.m23926u(un1Var, null, null, new ReviewActivitySpeakingFragment$onViewCreated$2$1(reviewActivitySpeakingFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivitySpeakingFragment$onViewCreated$2$2(reviewActivitySpeakingFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2700x6a68798a(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReviewActivitySpeakingFragment reviewActivitySpeakingFragment2) {
        super(2, continuation);
        this.f32144b = reviewActivitySpeakingFragment;
        this.f32145c = lifecycle$State;
        this.f32146d = reviewActivitySpeakingFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2700x6a68798a(this.f32144b, this.f32145c, continuation, this.f32146d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2700x6a68798a) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32143a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f32144b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32146d, null);
            this.f32143a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f32145c, anonymousClass1, this) == coroutineSingletons) {
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
