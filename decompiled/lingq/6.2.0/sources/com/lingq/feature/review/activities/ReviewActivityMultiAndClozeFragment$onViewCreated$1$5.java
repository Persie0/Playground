package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.C2758f;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.db8;
import p000.gb8;
import p000.jfa;
import p000.nb8;
import p000.pk9;
import p000.sc8;
import p000.u91;
import p000.um5;
import p000.un1;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$5", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {368}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMultiAndClozeFragment$onViewCreated$1$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nb8 f32052c;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$5$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$5$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26731 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32054b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ nb8 f32055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26731(nb8 nb8Var, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
            super(2, continuation);
            this.f32054b = reviewActivityMultiAndClozeFragment;
            this.f32055c = nb8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26731 c26731 = new C26731(this.f32055c, this.f32054b, continuation);
            c26731.f32053a = obj;
            return c26731;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26731 c26731 = (C26731) create((ym5) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26731.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sc8 sc8Var;
            ym5 ym5Var = (ym5) this.f32053a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32054b;
            if (ym5Var != null && (sc8Var = (sc8) pk9.m19381x(ym5Var)) != null) {
                if (sc8Var.f60686d) {
                    bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                    C2758f c2758fM9542S0 = reviewActivityMultiAndClozeFragment.m9542S0();
                    C3244l c3244l = c2758fM9542S0.f32521q;
                    nb8 nb8VarM9609c3 = c2758fM9542S0.m9609c3();
                    if (nb8VarM9609c3 instanceof db8) {
                        gb8 gb8Var = new gb8(((db8) nb8VarM9609c3).f35360a);
                        ArrayList arrayListM22624p1 = u91.m22624p1((Collection) c3244l.getValue());
                        arrayListM22624p1.set(((Number) c2758fM9542S0.f32527w.getValue()).intValue(), gb8Var);
                        c3244l.m15572j(null, arrayListM22624p1);
                        c2758fM9542S0.f32485D.mo4677k(gb8Var);
                    }
                } else {
                    bh4[] bh4VarArr2 = ReviewActivityMultiAndClozeFragment.f32016I0;
                    jfa.m14429l(reviewActivityMultiAndClozeFragment.m9541R0().f35557i);
                    jfa.m14425h(reviewActivityMultiAndClozeFragment.m9541R0().f35558j);
                    LessonCard lessonCard = (LessonCard) ((C3244l) reviewActivityMultiAndClozeFragment.m9543T0().f32382o.f9311a).getValue();
                    if (lessonCard != null) {
                        reviewActivityMultiAndClozeFragment.m9544U0(lessonCard, this.f32055c, sc8Var);
                    }
                }
            }
            xfa xfaVar = xfa.f68157a;
            if (ym5Var != null && (ym5Var instanceof um5)) {
                bh4[] bh4VarArr3 = ReviewActivityMultiAndClozeFragment.f32016I0;
                reviewActivityMultiAndClozeFragment.m9542S0().f32484C.mo4677k(xfaVar);
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMultiAndClozeFragment$onViewCreated$1$5(nb8 nb8Var, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
        super(2, continuation);
        this.f32051b = reviewActivityMultiAndClozeFragment;
        this.f32052c = nb8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$1$5(this.f32052c, this.f32051b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$1$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32050a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32051b;
            c18 c18Var = reviewActivityMultiAndClozeFragment.m9543T0().f32384q;
            C26731 c26731 = new C26731(this.f32052c, reviewActivityMultiAndClozeFragment, null);
            c18Var.getClass();
            this.f32050a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26731, this) == coroutineSingletons) {
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
