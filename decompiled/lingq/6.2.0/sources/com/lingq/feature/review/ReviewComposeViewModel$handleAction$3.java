package com.lingq.feature.review;

import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$handleAction$3", m4291f = "ReviewComposeViewModel.kt", m4292l = {123}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$handleAction$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$handleAction$3(C2751b c2751b, Continuation continuation) {
        super(2, continuation);
        this.f31685b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$handleAction$3(this.f31685b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$handleAction$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31684a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2751b c2751b = this.f31685b;
            Set set = c2751b.f32396d.f32762u;
            this.f31684a = 1;
            if (C2751b.m9564V2(c2751b, set, this) == coroutineSingletons) {
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
