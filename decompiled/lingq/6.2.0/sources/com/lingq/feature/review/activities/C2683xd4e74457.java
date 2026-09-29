package com.lingq.feature.review.activities;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.review.data.ReviewActivityResult;
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

/* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2683xd4e74457 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f32075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f32076c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReviewActivityResultFragment f32077d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nb8 f32078e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityResult f32079f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f32080g;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32081a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityResultFragment f32082b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nb8 f32083c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ReviewActivityResult f32084d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f32085e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nb8 nb8Var, ReviewActivityResultFragment reviewActivityResultFragment, ReviewActivityResult reviewActivityResult, String str, Continuation continuation) {
            super(2, continuation);
            this.f32082b = reviewActivityResultFragment;
            this.f32083c = nb8Var;
            this.f32084d = reviewActivityResult;
            this.f32085e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32083c, this.f32082b, this.f32084d, this.f32085e, continuation);
            anonymousClass1.f32081a = obj;
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
            un1 un1Var = (un1) this.f32081a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32082b;
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$1(reviewActivityResultFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$2(reviewActivityResultFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$3(this.f32083c, reviewActivityResultFragment, this.f32084d, this.f32085e, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$4(reviewActivityResultFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$5(reviewActivityResultFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$6(reviewActivityResultFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReviewActivityResultFragment$onViewCreated$2$7(reviewActivityResultFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2683xd4e74457(ReviewActivityResultFragment reviewActivityResultFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReviewActivityResultFragment reviewActivityResultFragment2, nb8 nb8Var, ReviewActivityResult reviewActivityResult, String str) {
        super(2, continuation);
        this.f32075b = reviewActivityResultFragment;
        this.f32076c = lifecycle$State;
        this.f32077d = reviewActivityResultFragment2;
        this.f32078e = nb8Var;
        this.f32079f = reviewActivityResult;
        this.f32080g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2683xd4e74457(this.f32075b, this.f32076c, continuation, this.f32077d, this.f32078e, this.f32079f, this.f32080g);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2683xd4e74457) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32074a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f32075b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32078e, this.f32077d, this.f32079f, this.f32080g, null);
            this.f32074a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f32076c, anonymousClass1, this) == coroutineSingletons) {
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
