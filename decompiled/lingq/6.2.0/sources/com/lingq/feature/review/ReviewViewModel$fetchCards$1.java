package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.u0b;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$fetchCards$1", m4291f = "ReviewViewModel.kt", m4292l = {385}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$fetchCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31879c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f31880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$fetchCards$1(C2758f c2758f, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31878b = c2758f;
        this.f31879c = z;
        this.f31880d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$fetchCards$1(this.f31878b, this.f31879c, this.f31880d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$fetchCards$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReviewViewModel$fetchCards$1 reviewViewModel$fetchCards$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31877a;
        C2758f c2758f = this.f31878b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            u0b u0bVar = c2758f.f32509e;
            String strMo4589b2 = c2758f.f32506b.mo4589b2();
            this.f31877a = 1;
            reviewViewModel$fetchCards$1 = this;
            obj = u0b.m22378a(u0bVar, strMo4589b2, 1, null, false, false, null, reviewViewModel$fetchCards$1, 60);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            reviewViewModel$fetchCards$1 = this;
        }
        Triple triple = (Triple) obj;
        int iIntValue = ((Number) triple.f47633a).intValue();
        int iIntValue2 = ((Number) triple.f47634b).intValue();
        xfa xfaVar = xfa.f68157a;
        if (iIntValue == 0 && iIntValue2 == 0) {
            c2758f.f32488G.mo4677k(xfaVar);
            return xfaVar;
        }
        wfb.m23926u(lda.m16103C(c2758f), c2758f.f32513i, null, new ReviewViewModel$getCards$1(c2758f, reviewViewModel$fetchCards$1.f31879c, reviewViewModel$fetchCards$1.f31880d, null), 2);
        return xfaVar;
    }
}
