package com.lingq.feature.reader.old.settings;

import com.lingq.feature.reader.R$string;
import java.util.Arrays;
import java.util.Locale;
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
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$3", m4291f = "LessonReviewMenuFragment.kt", m4292l = {220}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$5$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29452b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$3$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24171 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f29453a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonReviewMenuFragment f29454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24171(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29454b = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24171 c24171 = new C24171(this.f29454b, continuation);
            c24171.f29453a = ((Number) obj).intValue();
            return c24171;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24171 c24171 = (C24171) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24171.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f29453a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29454b;
            lessonReviewMenuFragment.m9344R0().f71449f.setText(String.format(Locale.getDefault(), ux5.m22990m(lessonReviewMenuFragment.m2111m(R$string.lesson_review_page), " (%d)"), Arrays.copyOf(new Object[]{new Integer(i)}, 1)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$5$3(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29452b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuFragment$onViewCreated$5$3(this.f29452b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuFragment$onViewCreated$5$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29451a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29452b;
            c18 c18Var = lessonReviewMenuFragment.m9345S0().f29354e1;
            C24171 c24171 = new C24171(lessonReviewMenuFragment, null);
            c18Var.getClass();
            this.f29451a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24171, this) == coroutineSingletons) {
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
