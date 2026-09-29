package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$onAddMeaning$1", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {79}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2457b f29531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f29532c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f29533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$onAddMeaning$1(C2457b c2457b, LessonWord lessonWord, String str, Continuation continuation) {
        super(2, continuation);
        this.f29531b = c2457b;
        this.f29532c = lessonWord;
        this.f29533d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsViewModel$onAddMeaning$1(this.f29531b, this.f29532c, this.f29533d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2457b c2457b = this.f29531b;
        cma cmaVar = c2457b.f29647c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29530a;
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
        if (!cmaVar.mo4595s1()) {
            c2457b.f29657m.mo4677k(xfaVar);
            return xfaVar;
        }
        LessonWord lessonWord = this.f29532c;
        TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
        if (tokenMeaning != null) {
            ao0 ao0Var = c2457b.f29651g;
            int i2 = c2457b.f29654j;
            String strMo4589b2 = cmaVar.mo4589b2();
            String str = lessonWord.f19314a;
            int value = CardStatus.New.getValue();
            String value2 = LqAnalyticsValues$LingQCreatedLocation.PagingPrompt.getValue();
            this.f29530a = 1;
            if (((C1287c) ao0Var).m7118h(i2, strMo4589b2, str, tokenMeaning, value, this.f29533d, value2, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
