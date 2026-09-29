package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.LessonWord;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.s7b;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getGrammarTags$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$getGrammarTags$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2750e f32296a;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityViewModel$getGrammarTags$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$getGrammarTags$1$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {244}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27441 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f32297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2750e f32298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27441(C2750e c2750e, Continuation continuation) {
            super(2, continuation);
            this.f32298b = c2750e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C27441(this.f32298b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C27441) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f32297a;
            C2750e c2750e = this.f32298b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                s7b s7bVar = c2750e.f32373f;
                String strMo4589b2 = c2750e.f32369b.mo4589b2();
                String str = c2750e.f32380m;
                this.f32297a = 1;
                obj = ((C1310z) s7bVar).m7425d(strMo4589b2, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            LessonWord lessonWord = (LessonWord) obj;
            if (lessonWord != null) {
                c2750e.f32366D.m15571i(lessonWord.f19316c);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$getGrammarTags$1(C2750e c2750e, Continuation continuation) {
        super(1, continuation);
        this.f32296a = c2750e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReviewActivityViewModel$getGrammarTags$1(this.f32296a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        ReviewActivityViewModel$getGrammarTags$1 reviewActivityViewModel$getGrammarTags$1 = (ReviewActivityViewModel$getGrammarTags$1) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        reviewActivityViewModel$getGrammarTags$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2750e c2750e = this.f32296a;
        wfb.m23926u(lda.m16103C(c2750e), c2750e.f32378k, null, new C27441(c2750e, null), 2);
        return xfa.f68157a;
    }
}
