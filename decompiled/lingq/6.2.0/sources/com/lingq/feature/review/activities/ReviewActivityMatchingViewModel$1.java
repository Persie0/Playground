package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.i93;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$1", m4291f = "ReviewActivityMatchingViewModel.kt", m4292l = {56}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMatchingViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2747b f32004b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$1$1", m4291f = "ReviewActivityMatchingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26661 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f32005a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2747b f32006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26661(C2747b c2747b, Continuation continuation) {
            super(2, continuation);
            this.f32006b = c2747b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26661 c26661 = new C26661(this.f32006b, continuation);
            c26661.f32005a = ((Number) obj).intValue();
            return c26661;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26661 c26661 = (C26661) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26661.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f32005a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f32006b.f32328k, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingViewModel$1(C2747b c2747b, Continuation continuation) {
        super(2, continuation);
        this.f32004b = c2747b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMatchingViewModel$1(this.f32004b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMatchingViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32003a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2747b c2747b = this.f32004b;
            i93 i93VarM7396k = c2747b.f32321d.m7396k(c2747b.f32319b.mo4589b2());
            C26661 c26661 = new C26661(c2747b, null);
            this.f32003a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c26661, this) == coroutineSingletons) {
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
