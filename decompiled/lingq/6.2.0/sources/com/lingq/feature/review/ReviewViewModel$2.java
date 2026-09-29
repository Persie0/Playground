package com.lingq.feature.review;

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
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$2", m4291f = "ReviewViewModel.kt", m4292l = {258}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31824b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$2$1", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26271 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f31825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2758f f31826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26271(C2758f c2758f, Continuation continuation) {
            super(2, continuation);
            this.f31826b = c2758f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26271 c26271 = new C26271(this.f31826b, continuation);
            c26271.f31825a = ((Number) obj).intValue();
            return c26271;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26271 c26271 = (C26271) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26271.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f31825a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f31826b.f32490I, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$2(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31824b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$2(this.f31824b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31823a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31824b;
            i93 i93VarM7396k = c2758f.f32511g.m7396k(c2758f.f32506b.mo4589b2());
            C26271 c26271 = new C26271(c2758f, null);
            this.f31823a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c26271, this) == coroutineSingletons) {
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
