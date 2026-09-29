package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eg8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$handleCorrect$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {368, 370}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$handleCorrect$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eg8 f31697b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2751b f31698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$handleCorrect$1(eg8 eg8Var, C2751b c2751b, Continuation continuation) {
        super(2, continuation);
        this.f31697b = eg8Var;
        this.f31698c = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$handleCorrect$1(this.f31697b, this.f31698c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$handleCorrect$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r2.m9568Z2(r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31696a;
        C2751b c2751b = this.f31698c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        eg8 eg8Var = this.f31697b;
        if (eg8Var != null) {
            String str = eg8Var.mo10270a().f64672b;
            this.f31696a = 1;
            if (C2751b.m9565W2(c2751b, str, this) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
        this.f31696a = 2;
    }
}
