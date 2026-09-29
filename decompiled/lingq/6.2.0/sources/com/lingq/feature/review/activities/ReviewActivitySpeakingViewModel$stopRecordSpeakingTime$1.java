package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.un1;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {262}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32208b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1(this.f32208b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$stopRecordSpeakingTime$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32207a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long jM24805c = y02.m24805c();
            C2748c c2748c = this.f32208b;
            Long l = c2748c.f32349v;
            double dLongValue = (jM24805c - (l != null ? l.longValue() : 0L)) / 3600000.0d;
            c2748c.f32349v = null;
            oo4 oo4Var = c2748c.f32333f;
            String strMo4589b2 = c2748c.f32329b.mo4589b2();
            LanguageProgressInterval languageProgressInterval = LanguageProgressInterval.Today;
            String key = LanguageProgressUpdate.HoursSpeaking.getKey();
            this.f32207a = 1;
            if (((C1294j) oo4Var).m7239m(strMo4589b2, languageProgressInterval, key, dLongValue, this) == coroutineSingletons) {
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
