package com.lingq.feature.reader.old.settings;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.i65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuViewModel$showReviewTooltip$1", m4291f = "LessonReviewMenuViewModel.kt", m4292l = {30}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuViewModel$showReviewTooltip$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i65 f29485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuViewModel$showReviewTooltip$1(i65 i65Var, Continuation continuation) {
        super(2, continuation);
        this.f29485b = i65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuViewModel$showReviewTooltip$1(this.f29485b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuViewModel$showReviewTooltip$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29484a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29484a = 1;
            if (AbstractC3208a.m15437d(320L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        i65 i65Var = this.f29485b;
        i65Var.mo8733A0(false);
        i65Var.mo8745Q();
        i65Var.f43591c.mo4677k(TooltipStep.ReviewMenu);
        return xfa.f68157a;
    }
}
