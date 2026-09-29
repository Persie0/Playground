package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.t91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$1", m4291f = "ReviewViewModel.kt", m4292l = {251}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31819b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$1$2", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26262 extends SuspendLambda implements zi3 {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C26262(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26262 c26262 = (C26262) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26262.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$1(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31819b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$1(this.f31819b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31818a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31819b;
            t91 t91Var = new t91(new c83[]{c2758f.f32491J, c2758f.f32494M, c2758f.f32492K, c2758f.f32493L, c2758f.f32495N, c2758f.f32496O, c2758f.f32497P, c2758f.f32498Q, c2758f.f32499R}, 3);
            C26262 c26262 = new C26262(2, null);
            this.f31818a = 1;
            if (AbstractC3224d.m15529h(t91Var, c26262, this) == coroutineSingletons) {
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
