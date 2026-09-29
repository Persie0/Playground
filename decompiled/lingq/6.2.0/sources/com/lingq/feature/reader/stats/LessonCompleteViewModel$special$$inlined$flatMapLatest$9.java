package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$9", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$9 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30695a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30696b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30697c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$9(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30698d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$9 lessonCompleteViewModel$special$$inlined$flatMapLatest$9 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$9(this.f30698d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$9.f30696b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$9.f30697c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$9.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30696b;
        Object obj2 = this.f30697c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30695a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3235e c3235eM8204b = this.f30698d.f30840m.m8204b(((Language) obj2).f19024a, LanguageProgressInterval.LastWeek);
            this.f30696b = null;
            this.f30697c = null;
            this.f30695a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3235eM8204b, this) == coroutineSingletons) {
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
