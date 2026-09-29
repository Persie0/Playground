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

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2637x18e50c8c extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f31922c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31923d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nb8 f31924e;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31925a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31926b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nb8 f31927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nb8 nb8Var, ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31926b = reviewActivityFlashcardFragment;
            this.f31927c = nb8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31927c, this.f31926b, continuation);
            anonymousClass1.f31925a = obj;
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
            un1 un1Var = (un1) this.f31925a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31926b;
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$1(reviewActivityFlashcardFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$2(reviewActivityFlashcardFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$3(reviewActivityFlashcardFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$4(this.f31927c, reviewActivityFlashcardFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$5(reviewActivityFlashcardFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityFlashcardFragment$onViewCreated$2$6(reviewActivityFlashcardFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2637x18e50c8c(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReviewActivityFlashcardFragment reviewActivityFlashcardFragment2, nb8 nb8Var) {
        super(2, continuation);
        this.f31921b = reviewActivityFlashcardFragment;
        this.f31922c = lifecycle$State;
        this.f31923d = reviewActivityFlashcardFragment2;
        this.f31924e = nb8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2637x18e50c8c(this.f31921b, this.f31922c, continuation, this.f31923d, this.f31924e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2637x18e50c8c) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31920a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f31921b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31924e, this.f31923d, null);
            this.f31920a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f31922c, anonymousClass1, this) == coroutineSingletons) {
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
