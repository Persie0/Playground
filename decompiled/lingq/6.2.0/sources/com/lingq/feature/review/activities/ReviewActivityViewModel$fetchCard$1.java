package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$fetchCard$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {149}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$fetchCard$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2750e f32287b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$fetchCard$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$fetchCard$1$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32288a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27421(C2750e c2750e, Continuation continuation) {
            super(2, continuation);
            this.f32289b = c2750e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27421 c27421 = new C27421(this.f32289b, continuation);
            c27421.f32288a = obj;
            return c27421;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27421 c27421 = (C27421) create((LessonCard) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27421.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonCard lessonCard = (LessonCard) this.f32288a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f32289b.f32381n.m15571i(lessonCard);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$fetchCard$1(C2750e c2750e, Continuation continuation) {
        super(2, continuation);
        this.f32287b = c2750e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityViewModel$fetchCard$1(this.f32287b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityViewModel$fetchCard$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32286a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2750e c2750e = this.f32287b;
            c83 c83VarM7121k = ((C1287c) c2750e.f32370c).m7121k(c2750e.f32369b.mo4589b2(), c2750e.f32380m);
            C27421 c27421 = new C27421(c2750e, null);
            this.f32286a = 1;
            if (AbstractC3224d.m15529h(c83VarM7121k, c27421, this) == coroutineSingletons) {
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
