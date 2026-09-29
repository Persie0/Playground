package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.l83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentence$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {127}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$fetchSentence$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32195b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentence$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentence$1$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27181 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f32196a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C27181 c27181 = new C27181(3, (Continuation) obj3);
            c27181.f32196a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c27181.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f32196a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentence$1$2 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$fetchSentence$1$2", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27192 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32197a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2748c f32198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27192(C2748c c2748c, Continuation continuation) {
            super(2, continuation);
            this.f32198b = c2748c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27192 c27192 = new C27192(this.f32198b, continuation);
            c27192.f32197a = obj;
            return c27192;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27192 c27192 = (C27192) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27192.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f32197a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f32198b.f32340m.m15571i(lessonTranslationSentence);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$fetchSentence$1(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32195b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$fetchSentence$1(this.f32195b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$fetchSentence$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32194a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2748c c2748c = this.f32195b;
            l83 l83Var = new l83(((C1295k) c2748c.f32331d).m7253K(c2748c.f32338k, c2748c.f32339l - 1), new C27181(3, null), 1);
            C27192 c27192 = new C27192(c2748c, null);
            this.f32194a = 1;
            if (AbstractC3224d.m15529h(l83Var, c27192, this) == coroutineSingletons) {
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
