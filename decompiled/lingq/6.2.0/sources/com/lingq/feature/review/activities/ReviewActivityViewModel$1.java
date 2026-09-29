package com.lingq.feature.review.activities;

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
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {127}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2750e f32273b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$1$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32274a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27401(C2750e c2750e, Continuation continuation) {
            super(2, continuation);
            this.f32275b = c2750e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27401 c27401 = new C27401(this.f32275b, continuation);
            c27401.f32274a = obj;
            return c27401;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27401 c27401 = (C27401) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27401.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f32274a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f32275b.f32367E.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$1(C2750e c2750e, Continuation continuation) {
        super(2, continuation);
        this.f32273b = c2750e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$1(this.f32273b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32272a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32273b;
            C3228h c3228hM8209a = c2750e.f32377j.m8209a();
            C27401 c27401 = new C27401(c2750e, null);
            this.f32272a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c27401, this) == coroutineSingletons) {
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
