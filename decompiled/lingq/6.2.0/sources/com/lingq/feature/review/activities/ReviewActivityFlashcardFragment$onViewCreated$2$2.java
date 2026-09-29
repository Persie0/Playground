package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.C2758f;
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
import p000.db8;
import p000.hb8;
import p000.kb8;
import p000.sca;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {348}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityFlashcardFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31932b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$2$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26391 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f31933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26391(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31934b = reviewActivityFlashcardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26391 c26391 = new C26391(this.f31934b, continuation);
            c26391.f31933a = ((Boolean) obj).booleanValue();
            return c26391;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C26391 c26391 = (C26391) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26391.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            boolean z = this.f31933a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
                ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31934b;
                C2758f c2758fM9537S0 = reviewActivityFlashcardFragment.m9537S0();
                if (!(c2758fM9537S0.m9609c3() instanceof hb8) && !(c2758fM9537S0.m9609c3() instanceof db8) && !(c2758fM9537S0.m9609c3() instanceof kb8)) {
                    C2750e c2750eM9539U0 = reviewActivityFlashcardFragment.m9539U0();
                    LessonCard lessonCard = (LessonCard) ((C3244l) reviewActivityFlashcardFragment.m9539U0().f32382o.f9311a).getValue();
                    sca.m21224J0(c2750eM9539U0, (lessonCard == null || (str = lessonCard.f19178a) == null) ? "" : AbstractC3352my.m17124i(str), false, 12);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$2(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
        super(2, continuation);
        this.f31932b = reviewActivityFlashcardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$2(this.f31932b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31931a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31932b;
            c18 c18Var = reviewActivityFlashcardFragment.m9539U0().f32392y;
            C26391 c26391 = new C26391(reviewActivityFlashcardFragment, null);
            c18Var.getClass();
            this.f31931a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26391, this) == coroutineSingletons) {
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
