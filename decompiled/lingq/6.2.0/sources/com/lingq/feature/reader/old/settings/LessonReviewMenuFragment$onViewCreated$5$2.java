package com.lingq.feature.reader.old.settings;

import com.lingq.feature.reader.R$string;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.Pair;
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
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$2", m4291f = "LessonReviewMenuFragment.kt", m4292l = {220}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$5$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29448b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$5$2$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24161 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29449a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonReviewMenuFragment f29450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24161(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29450b = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24161 c24161 = new C24161(this.f29450b, continuation);
            c24161.f29449a = obj;
            return c24161;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24161 c24161 = (C24161) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24161.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f29449a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            int iIntValue2 = ((Number) pair.f47624b).intValue();
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29450b;
            lessonReviewMenuFragment.m9344R0().f71446c.setText(String.format(Locale.getDefault(), ux5.m22990m(lessonReviewMenuFragment.m2111m(R$string.lingq_page), " %d/%d"), Arrays.copyOf(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$5$2(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29448b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuFragment$onViewCreated$5$2(this.f29448b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuFragment$onViewCreated$5$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29447a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29448b;
            c18 c18Var = lessonReviewMenuFragment.m9345S0().f29370i1;
            C24161 c24161 = new C24161(lessonReviewMenuFragment, null);
            c18Var.getClass();
            this.f29447a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24161, this) == coroutineSingletons) {
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
