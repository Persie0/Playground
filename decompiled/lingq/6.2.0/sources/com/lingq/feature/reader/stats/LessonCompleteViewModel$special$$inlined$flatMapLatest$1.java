package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.h05;
import p000.q05;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30647a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30648b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$1(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30650d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$1 lessonCompleteViewModel$special$$inlined$flatMapLatest$1 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$1(this.f30650d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$1.f30648b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$1.f30649c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30648b;
        Object obj2 = this.f30649c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30647a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) obj2).intValue();
            q05 q05Var = (q05) ((C1295k) this.f30650d.f30859y.f50448a).f16498b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(iIntValue, q05Var, i2)), 12));
            this.f30648b = null;
            this.f30649c = null;
            this.f30647a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
