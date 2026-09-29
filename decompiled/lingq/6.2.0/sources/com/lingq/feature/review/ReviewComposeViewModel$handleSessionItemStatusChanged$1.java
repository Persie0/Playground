package com.lingq.feature.review;

import com.lingq.feature.review.state.C2761a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ma8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$handleSessionItemStatusChanged$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {439, 440}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$handleSessionItemStatusChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ma8 f31709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$handleSessionItemStatusChanged$1(C2751b c2751b, ma8 ma8Var, Continuation continuation) {
        super(2, continuation);
        this.f31708b = c2751b;
        this.f31709c = ma8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$handleSessionItemStatusChanged$1(this.f31708b, this.f31709c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$handleSessionItemStatusChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r3.m9573e3(r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31707a;
        C2751b c2751b = this.f31708b;
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
        C2761a c2761a = c2751b.f32397e;
        ma8 ma8Var = this.f31709c;
        String str = ma8Var.f50842a;
        int i2 = ma8Var.f50843b;
        this.f31707a = 1;
        if (c2761a.m9633q(str, i2, null, this) != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f31707a = 2;
    }
}
