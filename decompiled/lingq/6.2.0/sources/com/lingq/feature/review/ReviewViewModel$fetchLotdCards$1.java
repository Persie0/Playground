package com.lingq.feature.review;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.u0b;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$fetchLotdCards$1", m4291f = "ReviewViewModel.kt", m4292l = {400}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$fetchLotdCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31883c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f31884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$fetchLotdCards$1(C2758f c2758f, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31882b = c2758f;
        this.f31883c = z;
        this.f31884d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$fetchLotdCards$1(this.f31882b, this.f31883c, this.f31884d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$fetchLotdCards$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReviewViewModel$fetchLotdCards$1 reviewViewModel$fetchLotdCards$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31881a;
        C2758f c2758f = this.f31882b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            u0b u0bVar = c2758f.f32509e;
            String strMo4589b2 = c2758f.f32506b.mo4589b2();
            String str = c2758f.f32516l.f43984g;
            this.f31881a = 1;
            reviewViewModel$fetchLotdCards$1 = this;
            obj = u0b.m22378a(u0bVar, strMo4589b2, 1, null, false, false, str, reviewViewModel$fetchLotdCards$1, 28);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            reviewViewModel$fetchLotdCards$1 = this;
        }
        List list = (List) ((Triple) obj).f47635c;
        boolean zIsEmpty = list.isEmpty();
        xfa xfaVar = xfa.f68157a;
        if (zIsEmpty) {
            c2758f.f32488G.mo4677k(xfaVar);
            return xfaVar;
        }
        C2758f.m9605Y2(c2758f, u91.m22627s1(list), reviewViewModel$fetchLotdCards$1.f31883c, reviewViewModel$fetchLotdCards$1.f31884d);
        return xfaVar;
    }
}
