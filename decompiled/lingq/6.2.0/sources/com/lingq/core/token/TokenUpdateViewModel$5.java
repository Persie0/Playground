package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenControllerType;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$5", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23528a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$5(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23529b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$5 tokenUpdateViewModel$5 = new TokenUpdateViewModel$5(this.f23529b, continuation);
        tokenUpdateViewModel$5.f23528a = obj;
        return tokenUpdateViewModel$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$5 tokenUpdateViewModel$5 = (TokenUpdateViewModel$5) create((TokenPopupData) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TokenPopupData tokenPopupData = (TokenPopupData) this.f23528a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1909e c1909e = this.f23529b;
        C3244l c3244l = c1909e.f23885W;
        while (true) {
            Object value = c3244l.getValue();
            f5a f5aVar = (f5a) value;
            boolean z = tokenPopupData.f23452h != TokenControllerType.Vocabulary;
            boolean z2 = !c1909e.f23876N.m19362a();
            EmptyList emptyList = EmptyList.f47638a;
            C1909e c1909e2 = c1909e;
            if (c3244l.m15570h(value, f5a.m11558a(f5aVar, null, null, true, null, null, tokenPopupData, "", null, false, z, null, null, 0, null, null, null, emptyList, emptyList, emptyList, null, emptyList, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, z2, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -3016169, 1048519))) {
                c1909e2.f23881S.m15571i(null);
                C3244l c3244l2 = c1909e2.f23882T;
                c3244l2.getClass();
                c3244l2.m15572j(null, emptyList);
                C3244l c3244l3 = c1909e2.f23883U;
                c3244l3.getClass();
                c3244l3.m15572j(null, emptyList);
                return xfa.f68157a;
            }
            c1909e = c1909e2;
        }
    }
}
