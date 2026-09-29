package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.qk9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$fetchCwt$3$timeoutJob$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1029}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$fetchCwt$3$timeoutJob$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qk9 f23589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$fetchCwt$3$timeoutJob$1(C1909e c1909e, qk9 qk9Var, Continuation continuation) {
        super(2, continuation);
        this.f23588b = c1909e;
        this.f23589c = qk9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$fetchCwt$3$timeoutJob$1(this.f23588b, this.f23589c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$fetchCwt$3$timeoutJob$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23587a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f23587a = 1;
            if (AbstractC3208a.m15437d(4000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (((f5a) this.f23588b.f23885W.getValue()).f38452J) {
            this.f23589c.mo0a();
        }
        return xfa.f68157a;
    }
}
