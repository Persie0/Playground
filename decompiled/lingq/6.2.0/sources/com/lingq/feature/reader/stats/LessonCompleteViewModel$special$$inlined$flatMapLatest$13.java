package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$13", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$13 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30663a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30664b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30665c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$13(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30666d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$13 lessonCompleteViewModel$special$$inlined$flatMapLatest$13 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$13(this.f30666d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$13.f30664b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$13.f30665c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$13.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30664b;
        Object obj2 = this.f30665c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30663a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) obj2).intValue();
            C2535j c2535j = this.f30666d;
            c83 c83VarM7994a = c2535j.f30854t.m7994a(iIntValue, c2535j.f30818b.mo4589b2());
            this.f30664b = null;
            this.f30665c = null;
            this.f30663a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7994a, this) == coroutineSingletons) {
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
