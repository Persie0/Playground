package com.lingq.feature.reader.old.settings;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {220}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29444b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$1$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24151 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonReviewMenuFragment f29446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24151(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29446b = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24151 c24151 = new C24151(this.f29446b, continuation);
            c24151.f29445a = obj;
            return c24151;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24151 c24151 = (C24151) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24151.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Lesson lesson = (Lesson) this.f29445a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            this.f29446b.m9344R0().f71444a.setText(lesson != null ? lesson.f19143b : null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$5$1(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29444b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuFragment$onViewCreated$5$1(this.f29444b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuFragment$onViewCreated$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29443a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29444b;
            c18 c18Var = lessonReviewMenuFragment.m9345S0().f29385m0;
            C24151 c24151 = new C24151(lessonReviewMenuFragment, null);
            c18Var.getClass();
            this.f29443a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24151, this) == coroutineSingletons) {
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
