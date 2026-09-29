package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.i93;
import p000.un1;
import p000.xe9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {93}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32171b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$1$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f32172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2748c f32173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27121(C2748c c2748c, Continuation continuation) {
            super(2, continuation);
            this.f32173b = c2748c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27121 c27121 = new C27121(this.f32173b, continuation);
            c27121.f32172a = ((Number) obj).intValue();
            return c27121;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27121 c27121 = (C27121) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27121.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            int i = this.f32172a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f32173b.f32343p;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, xe9.m24478a((xe9) value, i > 0, 0, null, null, null, null, null, 126)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$1(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32171b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$1(this.f32171b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32170a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2748c c2748c = this.f32171b;
            i93 i93VarM7396k = c2748c.f32332e.m7396k(c2748c.f32329b.mo4589b2());
            C27121 c27121 = new C27121(c2748c, null);
            this.f32170a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c27121, this) == coroutineSingletons) {
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
