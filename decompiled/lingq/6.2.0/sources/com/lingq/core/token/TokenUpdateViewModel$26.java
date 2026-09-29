package com.lingq.core.token;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.c7a;
import p000.e28;
import p000.e7a;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$26", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$26 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$26(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23523b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$26 tokenUpdateViewModel$26 = new TokenUpdateViewModel$26(this.f23523b, continuation);
        tokenUpdateViewModel$26.f23522a = obj;
        return tokenUpdateViewModel$26;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$26 tokenUpdateViewModel$26 = (TokenUpdateViewModel$26) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$26.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Pair pair = (Pair) this.f23522a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        e28 e28Var = (e28) pair.f47623a;
        TokenMeaning tokenMeaning = (TokenMeaning) pair.f47624b;
        C1909e c1909e = this.f23523b;
        e7a e7aVar = c1909e.f23869G;
        C3244l c3244l = c1909e.f23885W;
        if (!((f5a) c3244l.getValue()).f38465W) {
            TooltipStep tooltipStep = TooltipStep.TapTranslation;
            if (e7aVar.mo8753Z0(tooltipStep) && !e7aVar.mo8744P0(tooltipStep)) {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, new c7a(TooltipStep.TapTranslation, e28Var, true, false, 0.0f, 88), true, tokenMeaning, null, null, -1, 1638399)));
            }
        }
        return xfa.f68157a;
    }
}
