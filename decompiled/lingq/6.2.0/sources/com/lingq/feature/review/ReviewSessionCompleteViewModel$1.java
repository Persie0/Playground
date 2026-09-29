package com.lingq.feature.review;

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
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {73}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2757e f31794b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$1$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26241 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31795a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2757e f31796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26241(C2757e c2757e, Continuation continuation) {
            super(2, continuation);
            this.f31796b = c2757e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26241 c26241 = new C26241(this.f31796b, continuation);
            c26241.f31795a = obj;
            return c26241;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26241 c26241 = (C26241) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26241.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f31795a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31796b.f32480j.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$1(C2757e c2757e, Continuation continuation) {
        super(2, continuation);
        this.f31794b = c2757e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSessionCompleteViewModel$1(this.f31794b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSessionCompleteViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31793a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2757e c2757e = this.f31794b;
            C3228h c3228hM8209a = c2757e.f32474d.m8209a();
            C26241 c26241 = new C26241(c2757e, null);
            this.f31793a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c26241, this) == coroutineSingletons) {
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
