package com.lingq.feature.review.state;

import com.lingq.core.data.repository.C1287c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eg8;
import p000.ql3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder$ensureCardReviewed$1", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {166}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewCardContentStateHolder$ensureCardReviewed$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2761a f32586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eg8 f32587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$ensureCardReviewed$1(C2761a c2761a, eg8 eg8Var, Continuation continuation) {
        super(2, continuation);
        this.f32586b = c2761a;
        this.f32587c = eg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewCardContentStateHolder$ensureCardReviewed$1(this.f32586b, this.f32587c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewCardContentStateHolder$ensureCardReviewed$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32585a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2761a c2761a = this.f32586b;
        ql3 ql3Var = c2761a.f32710g;
        String strMo4589b2 = c2761a.f32704a.mo4589b2();
        eg8 eg8Var = this.f32587c;
        String str = eg8Var.mo10270a().f64672b;
        int i2 = eg8Var.mo10270a().f64671a;
        this.f32585a = 1;
        Object objM7126p = ((C1287c) ql3Var.f57897a).m7126p(i2, strMo4589b2, str, this);
        if (objM7126p != coroutineSingletons) {
            objM7126p = xfaVar;
        }
        return objM7126p == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
