package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y13;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$9", m4291f = "LessonCompleteViewModel.kt", m4292l = {848}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$9 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$9(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30564b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$9(this.f30564b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$9) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30563a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2535j c2535j = this.f30564b;
                y13 y13Var = c2535j.f30850r;
                String strMo4589b2 = c2535j.f30818b.mo4589b2();
                LanguageProgressMetric languageProgressMetric = LanguageProgressMetric.StudyTime;
                LanguageProgressPeriod languageProgressPeriod = LanguageProgressPeriod.Last7Days;
                this.f30563a = 1;
                Object objM7229c = ((C1294j) y13Var.f69090a).m7229c(strMo4589b2, languageProgressMetric, languageProgressPeriod, this);
                if (objM7229c != coroutineSingletons) {
                    objM7229c = xfaVar;
                }
                if (objM7229c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfaVar;
    }
}
