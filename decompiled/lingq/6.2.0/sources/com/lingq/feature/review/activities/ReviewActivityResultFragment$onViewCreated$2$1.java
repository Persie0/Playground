package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.sca;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {486}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityResultFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f32087b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$1$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f32088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityResultFragment f32089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26841(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
            super(2, continuation);
            this.f32089b = reviewActivityResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26841 c26841 = new C26841(this.f32089b, continuation);
            c26841.f32088a = ((Boolean) obj).booleanValue();
            return c26841;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C26841 c26841 = (C26841) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26841.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            boolean z = this.f32088a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
                ReviewActivityResultFragment reviewActivityResultFragment = this.f32089b;
                C2750e c2750eM9548U0 = reviewActivityResultFragment.m9548U0();
                LessonCard lessonCard = (LessonCard) ((C3244l) reviewActivityResultFragment.m9548U0().f32382o.f9311a).getValue();
                sca.m21224J0(c2750eM9548U0, (lessonCard == null || (str = lessonCard.f19178a) == null) ? "" : AbstractC3352my.m17124i(str), false, 12);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$2$1(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
        super(2, continuation);
        this.f32087b = reviewActivityResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityResultFragment$onViewCreated$2$1(this.f32087b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityResultFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32086a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32087b;
            c18 c18Var = reviewActivityResultFragment.m9548U0().f32392y;
            C26841 c26841 = new C26841(reviewActivityResultFragment, null);
            c18Var.getClass();
            this.f32086a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26841, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
