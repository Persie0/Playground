package com.lingq.feature.vocabulary;

import com.lingq.core.domain.model.lesson.LessonCard;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.sxa;
import p000.un1;
import p000.vj6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyViewModel$playTts$1", m4291f = "VocabularyViewModel.kt", m4292l = {110}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyViewModel$playTts$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2824b f33522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sxa f33523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$playTts$1(C2824b c2824b, sxa sxaVar, Continuation continuation) {
        super(2, continuation);
        this.f33522b = c2824b;
        this.f33523c = sxaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyViewModel$playTts$1(this.f33522b, this.f33523c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyViewModel$playTts$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33521a;
        C2824b c2824b = this.f33522b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2824b.f33528f;
            String strMo4589b2 = c2824b.f33524b.mo4589b2();
            sxa sxaVar = this.f33523c;
            LessonCard lessonCard = new LessonCard(sxaVar.f61563b, null, sxaVar.f61566e, null, null, 0, sxaVar.f61568g, sxaVar.f61569h, 268432366);
            this.f33521a = 1;
            obj = vj6Var.m23348x(strMo4589b2, lessonCard);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        sca.m21224J0(c2824b.f33529g, (String) obj, false, 12);
        return xfa.f68157a;
    }
}
