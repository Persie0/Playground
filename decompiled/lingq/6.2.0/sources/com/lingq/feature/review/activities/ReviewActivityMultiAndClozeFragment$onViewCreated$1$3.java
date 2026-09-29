package com.lingq.feature.review.activities;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.db8;
import p000.lda;
import p000.nb8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$3", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {368}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMultiAndClozeFragment$onViewCreated$1$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nb8 f32042c;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$3$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$3$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26711 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32043a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ nb8 f32044b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26711(nb8 nb8Var, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
            super(2, continuation);
            this.f32044b = nb8Var;
            this.f32045c = reviewActivityMultiAndClozeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26711 c26711 = new C26711(this.f32044b, this.f32045c, continuation);
            c26711.f32043a = obj;
            return c26711;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26711 c26711 = (C26711) create((LessonCard) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26711.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonCard lessonCard = (LessonCard) this.f32043a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            nb8 nb8Var = this.f32044b;
            boolean z = nb8Var instanceof db8;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32045c;
            if (z) {
                bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                C2750e c2750eM9543T0 = reviewActivityMultiAndClozeFragment.m9543T0();
                AbstractC1263a.m7047b(lda.m16103C(c2750eM9543T0), c2750eM9543T0.f32378k, "clozeTest", new ReviewActivityViewModel$clozeTest$1(c2750eM9543T0, null));
            } else if (lessonCard != null) {
                bh4[] bh4VarArr2 = ReviewActivityMultiAndClozeFragment.f32016I0;
                reviewActivityMultiAndClozeFragment.m9544U0(lessonCard, nb8Var, null);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMultiAndClozeFragment$onViewCreated$1$3(nb8 nb8Var, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
        super(2, continuation);
        this.f32041b = reviewActivityMultiAndClozeFragment;
        this.f32042c = nb8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$1$3(this.f32042c, this.f32041b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$1$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32040a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32041b;
            c18 c18Var = reviewActivityMultiAndClozeFragment.m9543T0().f32382o;
            C26711 c26711 = new C26711(this.f32042c, reviewActivityMultiAndClozeFragment, null);
            c18Var.getClass();
            this.f32040a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26711, this) == coroutineSingletons) {
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
