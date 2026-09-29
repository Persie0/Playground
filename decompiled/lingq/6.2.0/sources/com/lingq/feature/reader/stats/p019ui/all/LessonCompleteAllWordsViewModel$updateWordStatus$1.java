package com.lingq.feature.reader.stats.p019ui.all;

import com.lingq.core.data.repository.C1310z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$updateWordStatus$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {222}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$updateWordStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30948c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f30949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$updateWordStatus$1(C2556c c2556c, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f30947b = c2556c;
        this.f30948c = str;
        this.f30949d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$updateWordStatus$1(this.f30947b, this.f30948c, this.f30949d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$updateWordStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30946a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30947b;
            s7b s7bVar = c2556c.f30959g;
            String strMo4589b2 = c2556c.f30955c.mo4589b2();
            int iIntValue = ((Number) ((C3244l) c2556c.f30966n.f9311a).getValue()).intValue();
            this.f30946a = 1;
            if (((C1310z) s7bVar).m7429h(iIntValue, strMo4589b2, this.f30948c, this.f30949d, "", this) == coroutineSingletons) {
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
