package com.lingq.feature.review.activities;

import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.views.result.ReviewResultType;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random$Default;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3329mb;
import p000.C3386nv;
import p000.bc8;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.gm5;
import p000.h98;
import p000.jq7;
import p000.u91;
import p000.un1;
import p000.xb8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$3", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {104}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32234b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$3$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27241 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f32235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27241(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
            super(2, continuation);
            this.f32235a = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C27241(this.f32235a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27241 c27241 = (C27241) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27241.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ReviewResultType reviewResultType;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32235a;
            if (reviewActivityUnscrambleFragment.m9552S0().f40702b.m9662a()) {
                ReviewActivityUnscrambleFragment.m9551R0(reviewActivityUnscrambleFragment);
            } else {
                Locale localeForLanguageTag = Locale.forLanguageTag(reviewActivityUnscrambleFragment.m9554U0().f32350b.mo4580K1());
                localeForLanguageTag.getClass();
                int iM16728e = new C3329mb(reviewActivityUnscrambleFragment.m9552S0().f40702b.getSentence(), reviewActivityUnscrambleFragment.m9552S0().f40702b.getAnswer(), localeForLanguageTag).m16728e();
                if (70 > iM16728e || iM16728e >= 99) {
                    reviewResultType = iM16728e == 100 ? ReviewResultType.CORRECT : ReviewResultType.INCORRECT;
                } else {
                    reviewResultType = ReviewResultType.ALMOST;
                }
                ReviewResultType reviewResultType2 = reviewResultType;
                C2758f c2758fM9553T0 = reviewActivityUnscrambleFragment.m9553T0();
                int i = bc8.f8336a[reviewResultType2.ordinal()];
                if (i == 1) {
                    List list = xb8.f68031a;
                    Random$Default random$Default = jq7.f46010a;
                    str = (String) u91.m22605W0(list);
                } else if (i == 2) {
                    List list2 = xb8.f68032b;
                    Random$Default random$Default2 = jq7.f46010a;
                    str = (String) u91.m22605W0(list2);
                } else {
                    if (i != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    List list3 = xb8.f68033c;
                    Random$Default random$Default3 = jq7.f46010a;
                    str = (String) u91.m22605W0(list3);
                }
                h98 h98Var = new h98(reviewResultType2, str, true, reviewActivityUnscrambleFragment.m9552S0().f40702b.getSentence(), reviewActivityUnscrambleFragment.m9552S0().f40702b.getAnswer());
                C3244l c3244l = c2758fM9553T0.f32504W;
                c3244l.getClass();
                c3244l.m15572j(null, h98Var);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$2$3(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32234b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$2$3(this.f32234b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32233a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32234b;
            du0 du0Var = reviewActivityUnscrambleFragment.m9553T0().f32502U;
            C27241 c27241 = new C27241(reviewActivityUnscrambleFragment, null);
            this.f32233a = 1;
            if (AbstractC3224d.m15529h(du0Var, c27241, this) == coroutineSingletons) {
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
