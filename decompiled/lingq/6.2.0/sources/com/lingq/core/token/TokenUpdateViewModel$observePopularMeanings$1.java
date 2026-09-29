package com.lingq.core.token;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.e4a;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observePopularMeanings$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observePopularMeanings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observePopularMeanings$1(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23645b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$observePopularMeanings$1 tokenUpdateViewModel$observePopularMeanings$1 = new TokenUpdateViewModel$observePopularMeanings$1(this.f23645b, continuation);
        tokenUpdateViewModel$observePopularMeanings$1.f23644a = obj;
        return tokenUpdateViewModel$observePopularMeanings$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$observePopularMeanings$1 tokenUpdateViewModel$observePopularMeanings$1 = (TokenUpdateViewModel$observePopularMeanings$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$observePopularMeanings$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object obj2;
        Object value3;
        C1909e c1909e = this.f23645b;
        C3244l c3244l = c1909e.f23885W;
        Pair pair = (Pair) this.f23644a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        e4a e4aVar = (e4a) pair.f47623a;
        if (((Number) pair.f47624b).intValue() == -1 && (e4aVar == null || e4aVar.f36705a.isEmpty())) {
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, f5a.m11558a((f5a) value3, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, true, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1073741825, 2097151)));
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1073741825, 2097151)));
            C3244l c3244l2 = c1909e.f23882T;
            do {
                value2 = c3244l2.getValue();
                if (e4aVar == null || (obj2 = e4aVar.f36705a) == null) {
                    obj2 = EmptyList.f47638a;
                }
            } while (!c3244l2.m15570h(value2, obj2));
        }
        return xfa.f68157a;
    }
}
