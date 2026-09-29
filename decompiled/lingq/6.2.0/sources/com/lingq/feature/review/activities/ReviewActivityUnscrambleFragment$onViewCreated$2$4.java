package com.lingq.feature.review.activities;

import com.lingq.feature.review.data.ReviewActivityShow;
import com.lingq.feature.review.views.result.ReviewResultType;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.h98;
import p000.jc8;
import p000.kw8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$4", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {143}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onViewCreated$2$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32237b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$4$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$4$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27251 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f32238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27251(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
            super(2, continuation);
            this.f32238a = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C27251(this.f32238a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27251 c27251 = (C27251) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27251.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            ReviewResultType reviewResultType;
            String str;
            String str2;
            String str3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32238a;
            SentenceBuilderView sentenceBuilderView = reviewActivityUnscrambleFragment.m9552S0().f40702b;
            sentenceBuilderView.f32806e.clear();
            sentenceBuilderView.f32808g.clear();
            sentenceBuilderView.f32809h.clear();
            sentenceBuilderView.f32802a.removeAllViews();
            sentenceBuilderView.f32803b.removeAllViews();
            sentenceBuilderView.f32804c.removeAllViews();
            sentenceBuilderView.m9665d(sentenceBuilderView.f32805d, true);
            kw8 kw8Var = sentenceBuilderView.f32807f;
            if (kw8Var != null) {
                kw8Var.mo257b("");
            }
            C3244l c3244l = reviewActivityUnscrambleFragment.m9553T0().f32504W;
            do {
                value = c3244l.getValue();
                h98 h98Var = (h98) value;
                reviewResultType = h98Var.f42043a;
                str = h98Var.f42044b;
                str2 = h98Var.f42046d;
                str3 = h98Var.f42047e;
                reviewResultType.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
            } while (!c3244l.m15570h(value, new h98(reviewResultType, str, false, str2, str3)));
            reviewActivityUnscrambleFragment.m9553T0().m9606Z2(new jc8(ReviewActivityShow.SubmitSkipDisabled));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$2$4(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32237b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$2$4(this.f32237b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$2$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32236a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32237b;
            du0 du0Var = reviewActivityUnscrambleFragment.m9553T0().f32505X;
            C27251 c27251 = new C27251(reviewActivityUnscrambleFragment, null);
            this.f32236a = 1;
            if (AbstractC3224d.m15529h(du0Var, c27251, this) == coroutineSingletons) {
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
