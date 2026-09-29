package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.r13;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$6", m4291f = "LessonCompleteViewModel.kt", m4292l = {824}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$6(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30558b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$6(this.f30558b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30557a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C2535j c2535j = this.f30558b;
            r13 r13Var = c2535j.f30844o;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            LanguageProgressPeriod languageProgressPeriod = LanguageProgressPeriod.Today;
            this.f30557a = 1;
            Object objM7230d = ((C1294j) r13Var.f58483a).m7230d(strMo4589b2, languageProgressPeriod, this);
            if (objM7230d != coroutineSingletons) {
                objM7230d = xfaVar;
            }
            return objM7230d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }
}
