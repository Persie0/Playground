package com.lingq.feature.reader.stats.p019ui.words;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.UpgradeReason;
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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$onAddMeaning$1", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {79}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2573c f31097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f31098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteDealBlueViewModel$onAddMeaning$1(C2573c c2573c, LessonWord lessonWord, Continuation continuation) {
        super(2, continuation);
        this.f31097b = c2573c;
        this.f31098c = lessonWord;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteDealBlueViewModel$onAddMeaning$1(this.f31097b, this.f31098c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteDealBlueViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2573c c2573c = this.f31097b;
        cma cmaVar = c2573c.f31120c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31096a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (cmaVar.mo4595s1()) {
                LessonWord lessonWord = this.f31098c;
                TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
                if (tokenMeaning != null) {
                    ao0 ao0Var = c2573c.f31125h;
                    int i2 = c2573c.f31128k.f68959a;
                    String strMo4589b2 = cmaVar.mo4589b2();
                    String str = lessonWord.f19314a;
                    int value = CardStatus.New.getValue();
                    String value2 = LqAnalyticsValues$LingQCreatedLocation.LessonComplete.getValue();
                    this.f31096a = 1;
                    if (((C1287c) ao0Var).m7118h(i2, strMo4589b2, str, tokenMeaning, value, "", value2, false, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                c2573c.mo3737M1(UpgradeReason.LIMIT_WORDS);
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
