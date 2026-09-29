package com.lingq.feature.reader.stats;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.mk0;
import p000.vi3;
import p000.wx4;
import p000.xfa;
import p000.xx4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$buyLesson$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {1040}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$buyLesson$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f30565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f30567c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$buyLesson$1(C2535j c2535j, int i, int i2, Continuation continuation) {
        super(1, continuation);
        this.f30566b = c2535j;
        this.f30567c = i;
        this.f30568d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonCompleteViewModel$buyLesson$1(this.f30566b, this.f30567c, this.f30568d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonCompleteViewModel$buyLesson$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2535j c2535j = this.f30566b;
        mk0 mk0Var = c2535j.f30820c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30565a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            mk0Var.mo9326g2(wx4.f67471a);
            C1525a c1525a = c2535j.f30834j;
            int iMo4584Q0 = c2535j.f30818b.mo4584Q0();
            this.f30565a = 1;
            if (c1525a.m8202a(iMo4584Q0, this.f30567c, this.f30568d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        mk0Var.mo9326g2(xx4.f68925a);
        C3244l c3244l = c2535j.f30835j0;
        Boolean bool = Boolean.TRUE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        return xfa.f68157a;
    }
}
