package com.lingq.feature.library.preview;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.oe6;
import p000.qe6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$2", m4291f = "LessonPreviewFragment.kt", m4292l = {131}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonPreviewFragment$onViewCreated$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPreviewFragment f26722b;

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$2$1 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$2$1", m4291f = "LessonPreviewFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21491 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26723a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonPreviewFragment f26724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21491(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
            super(2, continuation);
            this.f26724b = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21491 c21491 = new C21491(this.f26724b, continuation);
            c21491.f26723a = obj;
            return c21491;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21491 c21491 = (C21491) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21491.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Lesson lesson = (Lesson) this.f26723a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
            LessonPreviewFragment lessonPreviewFragment = this.f26724b;
            C2155b c2155bM9083i0 = lessonPreviewFragment.m9083i0();
            c2155bM9083i0.f26767d.mo8243R1(new qe6(new oe6(lesson.m8027a(), 6, lessonPreviewFragment.m9081g0().f60377e, null, null)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$3$2(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
        super(2, continuation);
        this.f26722b = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonPreviewFragment$onViewCreated$3$2(this.f26722b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonPreviewFragment$onViewCreated$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26721a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
            LessonPreviewFragment lessonPreviewFragment = this.f26722b;
            du0 du0Var = lessonPreviewFragment.m9083i0().f26776m;
            C21491 c21491 = new C21491(lessonPreviewFragment, null);
            this.f26721a = 1;
            if (AbstractC3224d.m15529h(du0Var, c21491, this) == coroutineSingletons) {
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
