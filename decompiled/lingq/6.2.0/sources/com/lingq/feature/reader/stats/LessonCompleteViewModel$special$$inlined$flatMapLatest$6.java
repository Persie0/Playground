package com.lingq.feature.reader.stats;

import com.lingq.core.domain.chat.C1373a;
import com.lingq.core.settings.theme.C1882b;
import com.lingq.feature.reader.stats.domain.GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.a34;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.e83;
import p000.om3;
import p000.xfa;
import p000.zx4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$6", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$6 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30683a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30684b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30685c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$6(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30686d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$6 lessonCompleteViewModel$special$$inlined$flatMapLatest$6 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$6(this.f30686d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$6.f30684b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$6.f30685c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$6.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2535j c2535j = this.f30686d;
        cma cmaVar = c2535j.f30818b;
        e83 e83Var = this.f30684b;
        Object obj2 = this.f30685c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30683a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            zx4 zx4Var = (zx4) obj2;
            a34 a34Var = c2535j.f30797G;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            int i2 = zx4Var != null ? zx4Var.f72337a : -1;
            int i3 = zx4Var != null ? zx4Var.f72338b : -1;
            a34Var.getClass();
            strMo4589b2.getClass();
            strMo4580K1.getClass();
            c83 om3Var = i2 < 0 ? new om3(((C1882b) a34Var.f178f).m8683a(strMo4589b2, true), 0) : AbstractC3224d.m15536o(AbstractC3224d.m15521C(((C1373a) a34Var.f173a).m7979a(strMo4589b2, i2, strMo4580K1), new GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1(null, i3, a34Var, strMo4589b2)));
            this.f30684b = null;
            this.f30685c = null;
            this.f30683a = 1;
            if (AbstractC3224d.m15537p(e83Var, om3Var, this) == coroutineSingletons) {
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
