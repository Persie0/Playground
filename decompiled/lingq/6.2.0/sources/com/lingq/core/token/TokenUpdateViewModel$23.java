package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$23", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$23 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$23(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23520b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$23 tokenUpdateViewModel$23 = new TokenUpdateViewModel$23(this.f23520b, continuation);
        tokenUpdateViewModel$23.f23519a = ((Boolean) obj).booleanValue();
        return tokenUpdateViewModel$23;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        TokenUpdateViewModel$23 tokenUpdateViewModel$23 = (TokenUpdateViewModel$23) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$23.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23519a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23520b.f23885W;
        while (true) {
            Object value = c3244l.getValue();
            boolean z2 = z;
            if (c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, z2, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -16777217, 2097151))) {
                return xfa.f68157a;
            }
            z = z2;
        }
    }
}
