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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {75}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleViewModel$fetchSentence$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2749d f32262b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$1", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27371 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f32263a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C27371 c27371 = new C27371(3, (Continuation) obj3);
            c27371.f32263a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c27371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f32263a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$2 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$2", m4291f = "ReviewActivityUnscrambleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27382 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32264a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2749d f32265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27382(C2749d c2749d, Continuation continuation) {
            super(2, continuation);
            this.f32265b = c2749d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27382 c27382 = new C27382(this.f32265b, continuation);
            c27382.f32264a = obj;
            return c27382;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27382 c27382 = (C27382) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27382.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f32264a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f32265b.f32357i.m15571i(lessonTranslationSentence);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$fetchSentence$1(C2749d c2749d, Continuation continuation) {
        super(2, continuation);
        this.f32262b = c2749d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleViewModel$fetchSentence$1(this.f32262b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleViewModel$fetchSentence$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32261a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2749d c2749d = this.f32262b;
            l83 l83Var = new l83(((C1295k) c2749d.f32351c).m7253K(c2749d.f32355g, c2749d.f32356h - 1), new C27371(3, null), 1);
            C27382 c27382 = new C27382(c2749d, null);
            this.f32261a = 1;
            if (AbstractC3224d.m15529h(l83Var, c27382, this) == coroutineSingletons) {
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
