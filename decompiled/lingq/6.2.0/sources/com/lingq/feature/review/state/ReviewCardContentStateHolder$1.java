package com.lingq.feature.review.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vs3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder$1", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {88}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewCardContentStateHolder$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2761a f32532b;

    /* JADX INFO: renamed from: com.lingq.feature.review.state.ReviewCardContentStateHolder$1$1 */
    @c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder$1$1", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27591 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32533a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2761a f32534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27591(C2761a c2761a, Continuation continuation) {
            super(2, continuation);
            this.f32534b = c2761a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27591 c27591 = new C27591(this.f32534b, continuation);
            c27591.f32533a = obj;
            return c27591;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27591 c27591 = (C27591) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27591.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f32533a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ((xc9) this.f32534b.f32722s).setValue(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$1(C2761a c2761a, Continuation continuation) {
        super(2, continuation);
        this.f32532b = c2761a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewCardContentStateHolder$1(this.f32532b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewCardContentStateHolder$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32531a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2761a c2761a = this.f32532b;
            C3228h c3228hM8209a = c2761a.f32713j.m8209a();
            C27591 c27591 = new C27591(c2761a, null);
            this.f32531a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c27591, this) == coroutineSingletons) {
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
