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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$onAddMeaning$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f29628c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f29629d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f29630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$onAddMeaning$1(C2458c c2458c, LessonWord lessonWord, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f29627b = c2458c;
        this.f29628c = lessonWord;
        this.f29629d = i;
        this.f29630e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$onAddMeaning$1(this.f29627b, this.f29628c, this.f29629d, this.f29630e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2458c c2458c = this.f29627b;
        cma cmaVar = c2458c.f29660c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29626a;
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
            c2458c.f29674q.mo4677k(xfaVar);
            return xfaVar;
        }
        LessonWord lessonWord = this.f29628c;
        TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
        if (tokenMeaning != null) {
            ao0 ao0Var = c2458c.f29664g;
            String strMo4589b2 = cmaVar.mo4589b2();
            String str = lessonWord.f19314a;
            int value = CardStatus.New.getValue();
            String value2 = LqAnalyticsValues$LingQCreatedLocation.PagingPrompt.getValue();
            this.f29626a = 1;
            if (((C1287c) ao0Var).m7118h(this.f29629d, strMo4589b2, str, tokenMeaning, value, this.f29630e, value2, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
