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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {58}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2749d f32254b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$1$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f32255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2749d f32256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27361(C2749d c2749d, Continuation continuation) {
            super(2, continuation);
            this.f32256b = c2749d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27361 c27361 = new C27361(this.f32256b, continuation);
            c27361.f32255a = ((Number) obj).intValue();
            return c27361;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27361 c27361 = (C27361) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27361.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f32255a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f32256b.f32361m, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$1(C2749d c2749d, Continuation continuation) {
        super(2, continuation);
        this.f32254b = c2749d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleViewModel$1(this.f32254b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32253a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2749d c2749d = this.f32254b;
            i93 i93VarM7396k = c2749d.f32352d.m7396k(c2749d.f32350b.mo4589b2());
            C27361 c27361 = new C27361(c2749d, null);
            this.f32253a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c27361, this) == coroutineSingletons) {
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
