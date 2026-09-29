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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {368}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMultiAndClozeFragment$onViewCreated$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32033b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$1$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26691 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f32034a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26691(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
            super(2, continuation);
            this.f32035b = reviewActivityMultiAndClozeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26691 c26691 = new C26691(this.f32035b, continuation);
            c26691.f32034a = ((Boolean) obj).booleanValue();
            return c26691;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C26691 c26691 = (C26691) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26691.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            boolean z = this.f32034a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32035b;
                C2758f c2758fM9542S0 = reviewActivityMultiAndClozeFragment.m9542S0();
                if (!(c2758fM9542S0.m9609c3() instanceof hb8) && !(c2758fM9542S0.m9609c3() instanceof db8) && !(c2758fM9542S0.m9609c3() instanceof kb8)) {
                    C2750e c2750eM9543T0 = reviewActivityMultiAndClozeFragment.m9543T0();
                    LessonCard lessonCard = (LessonCard) ((C3244l) reviewActivityMultiAndClozeFragment.m9543T0().f32382o.f9311a).getValue();
                    sca.m21224J0(c2750eM9543T0, (lessonCard == null || (str = lessonCard.f19178a) == null) ? "" : AbstractC3352my.m17124i(str), false, 12);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMultiAndClozeFragment$onViewCreated$1$1(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
        super(2, continuation);
        this.f32033b = reviewActivityMultiAndClozeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$1$1(this.f32033b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32032a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32033b;
            c18 c18Var = reviewActivityMultiAndClozeFragment.m9543T0().f32392y;
            C26691 c26691 = new C26691(reviewActivityMultiAndClozeFragment, null);
            c18Var.getClass();
            this.f32032a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26691, this) == coroutineSingletons) {
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
