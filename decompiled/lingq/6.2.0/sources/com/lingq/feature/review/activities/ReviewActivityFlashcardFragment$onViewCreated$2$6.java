package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.id3;
import p000.mbd;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$6", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {336}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityFlashcardFragment$onViewCreated$2$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31955b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$6$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$6$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26431 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31956a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26431(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31957b = reviewActivityFlashcardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26431 c26431 = new C26431(this.f31957b, continuation);
            c26431.f31956a = obj;
            return c26431;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26431 c26431 = (C26431) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26431.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f31956a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31957b;
            id3 id3VarM2089Q = reviewActivityFlashcardFragment.m2089Q();
            b34.m3244j(reviewActivityFlashcardFragment);
            mbd.m16755c(id3VarM2089Q, str, null, 26);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$6(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
        super(2, continuation);
        this.f31955b = reviewActivityFlashcardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$6(this.f31955b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31954a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31955b;
            du0 du0Var = reviewActivityFlashcardFragment.m9539U0().f32365C;
            C26431 c26431 = new C26431(reviewActivityFlashcardFragment, null);
            this.f31954a = 1;
            if (AbstractC3224d.m15529h(du0Var, c26431, this) == coroutineSingletons) {
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
