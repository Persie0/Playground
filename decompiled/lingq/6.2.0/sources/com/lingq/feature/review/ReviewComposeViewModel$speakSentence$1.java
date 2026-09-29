package com.lingq.feature.review;

import com.lingq.feature.review.state.C2763c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.se9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$speakSentence$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {552}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$speakSentence$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$speakSentence$1(C2751b c2751b, Continuation continuation) {
        super(2, continuation);
        this.f31742b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$speakSentence$1(this.f31742b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$speakSentence$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31741a;
        C2751b c2751b = this.f31742b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2763c c2763c = c2751b.f32398f;
            int i2 = c2751b.f32403k.f37005c;
            this.f31741a = 1;
            obj = c2763c.m9641g(i2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        se9 se9Var = (se9) obj;
        xfa xfaVar = xfa.f68157a;
        if (se9Var == null) {
            return xfaVar;
        }
        String str = se9Var.f60767d;
        boolean z = se9Var.f60768e;
        sca scaVar = c2751b.f32401i;
        if (z) {
            scaVar.mo8483U0(se9Var.f60764a, se9Var.f60765b, new Double(se9Var.f60766c), 1.0f, str);
            return xfaVar;
        }
        sca.m21224J0(scaVar, str, true, 4);
        return xfaVar;
    }
}
