package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.aj3;
import p000.c32;
import p000.f5a;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f23628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3(C1909e c1909e, Continuation continuation) {
        super(3, continuation);
        this.f23629b = c1909e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3 tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3 = new TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3(this.f23629b, (Continuation) obj3);
        tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3.f23628a = (Throwable) obj2;
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Throwable th = this.f23628a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23629b.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, AbstractC3393o1.m17734i("Error loading related phrases: ", th.getMessage()), null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, 2147483631, 2097151)));
        return xfa.f68157a;
    }
}
