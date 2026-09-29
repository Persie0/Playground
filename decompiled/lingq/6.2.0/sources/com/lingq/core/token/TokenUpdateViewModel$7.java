package com.lingq.core.token;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3288l7;
import p000.c32;
import p000.g41;
import p000.lda;
import p000.m83;
import p000.ph2;
import p000.t62;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$7", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$7(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23532b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$7 tokenUpdateViewModel$7 = new TokenUpdateViewModel$7(this.f23532b, continuation);
        tokenUpdateViewModel$7.f23531a = obj;
        return tokenUpdateViewModel$7;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$7 tokenUpdateViewModel$7 = (TokenUpdateViewModel$7) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$7.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = (Triple) this.f23531a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) triple.f47633a;
        TokenPopupData tokenPopupData = (TokenPopupData) triple.f47634b;
        boolean zBooleanValue = ((Boolean) triple.f47635c).booleanValue();
        if (tokenPopupData != null) {
            String str2 = tokenPopupData.f23446b;
            if (zBooleanValue) {
                C3288l7 c3288l7 = new C3288l7(7);
                C1909e c1909e = this.f23532b;
                wfb.m23926u(lda.m16103C(c1909e), null, null, new TokenUpdateViewModel$playTtsIfApplicable$2(zBooleanValue, str2, c1909e, str, c3288l7, null), 3);
                m83 m83Var = new m83(c1909e.f23912z.m8721a(c1909e.f23872J.mo4589b2(), str2), new TokenUpdateViewModel$observeGrammarTags$1(c1909e, null), 2);
                g41 g41VarM16103C = lda.m16103C(c1909e);
                v72 v72Var = ph2.f56212a;
                AbstractC1263a.m7049d(m83Var, g41VarM16103C, "grammar tags", t62.f61909c);
            }
        }
        return xfa.f68157a;
    }
}
