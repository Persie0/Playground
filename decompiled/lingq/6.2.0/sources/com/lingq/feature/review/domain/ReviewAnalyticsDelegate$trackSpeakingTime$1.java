package com.lingq.feature.review.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y02;
import p000.zi3;
import p000.zm3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewAnalyticsDelegate$trackSpeakingTime$1", m4291f = "ReviewAnalyticsDelegate.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewAnalyticsDelegate$trackSpeakingTime$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f32420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2756b f32421c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f32422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewAnalyticsDelegate$trackSpeakingTime$1(long j, C2756b c2756b, String str, Continuation continuation) {
        super(2, continuation);
        this.f32420b = j;
        this.f32421c = c2756b;
        this.f32422d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewAnalyticsDelegate$trackSpeakingTime$1(this.f32420b, this.f32421c, this.f32422d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewAnalyticsDelegate$trackSpeakingTime$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32419a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        double dM24805c = (y02.m24805c() - this.f32420b) / 3600000.0d;
        zm3 zm3Var = this.f32421c.f32469b;
        this.f32419a = 1;
        Object objM7239m = ((C1294j) zm3Var.f71762a).m7239m(this.f32422d, LanguageProgressInterval.Today, LanguageProgressUpdate.HoursSpeaking.getKey(), dM24805c, this);
        if (objM7239m != coroutineSingletons) {
            objM7239m = xfaVar;
        }
        return objM7239m == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
