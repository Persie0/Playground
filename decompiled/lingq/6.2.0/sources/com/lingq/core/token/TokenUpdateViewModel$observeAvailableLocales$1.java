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
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observeAvailableLocales$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observeAvailableLocales$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f23638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observeAvailableLocales$1(C1909e c1909e, Continuation continuation) {
        super(3, continuation);
        this.f23639b = c1909e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        TokenUpdateViewModel$observeAvailableLocales$1 tokenUpdateViewModel$observeAvailableLocales$1 = new TokenUpdateViewModel$observeAvailableLocales$1(this.f23639b, (Continuation) obj3);
        tokenUpdateViewModel$observeAvailableLocales$1.f23638a = (Throwable) obj2;
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$observeAvailableLocales$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Throwable th = this.f23638a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f23639b.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, AbstractC3393o1.m17734i("Locale Load Error: ", th.getMessage()), null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -17, 2097151)));
        return xfa.f68157a;
    }
}
