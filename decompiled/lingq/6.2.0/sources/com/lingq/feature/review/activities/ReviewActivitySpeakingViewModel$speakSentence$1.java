package com.lingq.feature.review.activities;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.un1;
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$speakSentence$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {218}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$speakSentence$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2748c f32201a;

    /* JADX INFO: renamed from: b */
    public LessonTranslationSentence f32202b;

    /* JADX INFO: renamed from: c */
    public double f32203c;

    /* JADX INFO: renamed from: d */
    public double f32204d;

    /* JADX INFO: renamed from: e */
    public int f32205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2748c f32206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$speakSentence$1(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32206f = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$speakSentence$1(this.f32206f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$speakSentence$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2748c c2748c;
        C2748c c2748c2;
        double d;
        LessonTranslationSentence lessonTranslationSentence;
        double d2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32205e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c2748c = this.f32206f;
            LessonTranslationSentence lessonTranslationSentence2 = (LessonTranslationSentence) c2748c.f32340m.getValue();
            if (lessonTranslationSentence2 != null) {
                Double d3 = lessonTranslationSentence2.f19294c;
                double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
                Double d4 = lessonTranslationSentence2.f19295d;
                double dDoubleValue2 = d4 != null ? d4.doubleValue() : 0.0d;
                if (((int) dDoubleValue2) != 0) {
                    vi7 vi7Var = ((C1368a) c2748c.f32335h).f18371Q0;
                    this.f32201a = c2748c;
                    this.f32202b = lessonTranslationSentence2;
                    this.f32203c = dDoubleValue;
                    this.f32204d = dDoubleValue2;
                    this.f32205e = 1;
                    Object objM15541t = AbstractC3224d.m15541t(vi7Var, this);
                    if (objM15541t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objM15541t;
                    c2748c2 = c2748c;
                    d = dDoubleValue2;
                    lessonTranslationSentence = lessonTranslationSentence2;
                    d2 = dDoubleValue;
                } else {
                    LessonTranslationSentence lessonTranslationSentence3 = (LessonTranslationSentence) c2748c.f32340m.getValue();
                    str = lessonTranslationSentence3 != null ? lessonTranslationSentence3.f19296e : null;
                    sca scaVar = c2748c.f32334g;
                    if (str == null) {
                        str = "";
                    }
                    sca.m21224J0(scaVar, str, true, 4);
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d = this.f32204d;
        double d5 = this.f32203c;
        LessonTranslationSentence lessonTranslationSentence4 = this.f32202b;
        c2748c2 = this.f32201a;
        AbstractC3193b.m15359b(obj);
        lessonTranslationSentence = lessonTranslationSentence4;
        d2 = d5;
        if (((Boolean) obj).booleanValue()) {
            c2748c2.f32334g.mo8483U0(c2748c2.f32338k, d2, new Double(d), 1.0f, lessonTranslationSentence.f19296e);
        } else {
            c2748c = c2748c2;
            LessonTranslationSentence lessonTranslationSentence5 = (LessonTranslationSentence) c2748c.f32340m.getValue();
            if (lessonTranslationSentence5 != null) {
            }
            sca scaVar2 = c2748c.f32334g;
            if (str == null) {
                str = "";
            }
            sca.m21224J0(scaVar2, str, true, 4);
        }
        return xfa.f68157a;
    }
}
