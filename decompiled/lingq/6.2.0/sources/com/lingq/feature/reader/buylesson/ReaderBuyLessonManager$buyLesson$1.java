package com.lingq.feature.reader.buylesson;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.mk0;
import p000.ry7;
import p000.un1;
import p000.wx4;
import p000.xfa;
import p000.xx4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.buylesson.ReaderBuyLessonManager$buyLesson$1", m4291f = "ReaderBuyLessonManager.kt", m4292l = {55}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderBuyLessonManager$buyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2256a f27851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27852c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27853d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ry7 f27854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderBuyLessonManager$buyLesson$1(C2256a c2256a, int i, int i2, ry7 ry7Var, Continuation continuation) {
        super(2, continuation);
        this.f27851b = c2256a;
        this.f27852c = i;
        this.f27853d = i2;
        this.f27854e = ry7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderBuyLessonManager$buyLesson$1(this.f27851b, this.f27852c, this.f27853d, this.f27854e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderBuyLessonManager$buyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2256a c2256a = this.f27851b;
        mk0 mk0Var = c2256a.f27858a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27850a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            mk0Var.mo9326g2(wx4.f67471a);
            C1525a c1525a = c2256a.f27859b;
            int iMo4584Q0 = c2256a.f27860c.mo4584Q0();
            this.f27850a = 1;
            if (c1525a.m8202a(iMo4584Q0, this.f27852c, this.f27853d, this) == coroutineSingletons) {
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
        this.f27854e.mo0a();
        return xfa.f68157a;
    }
}
