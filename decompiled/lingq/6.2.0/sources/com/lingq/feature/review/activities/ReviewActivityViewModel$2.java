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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$2", m4291f = "ReviewActivityViewModel.kt", m4292l = {134}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32276a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2750e f32277b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$2$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f32278a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27411(C2750e c2750e, Continuation continuation) {
            super(2, continuation);
            this.f32279b = c2750e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27411 c27411 = new C27411(this.f32279b, continuation);
            c27411.f32278a = ((Number) obj).intValue();
            return c27411;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27411 c27411 = (C27411) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27411.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f32278a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f32279b.f32389v, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$2(C2750e c2750e, Continuation continuation) {
        super(2, continuation);
        this.f32277b = c2750e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$2(this.f32277b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32276a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32277b;
            i93 i93VarM7396k = c2750e.f32372e.m7396k(c2750e.f32369b.mo4589b2());
            C27411 c27411 = new C27411(c2750e, null);
            this.f32276a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c27411, this) == coroutineSingletons) {
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
