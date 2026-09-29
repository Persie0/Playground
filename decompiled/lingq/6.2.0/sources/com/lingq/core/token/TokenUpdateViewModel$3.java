package com.lingq.core.token;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f23524a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ TokenPopupData f23525b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TokenUpdateViewModel$3 tokenUpdateViewModel$3 = new TokenUpdateViewModel$3(3, (Continuation) obj3);
        tokenUpdateViewModel$3.f23524a = (List) obj;
        tokenUpdateViewModel$3.f23525b = (TokenPopupData) obj2;
        return tokenUpdateViewModel$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f23524a;
        TokenPopupData tokenPopupData = this.f23525b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = tokenPopupData.f23442P;
        return (str == null || list.contains(str)) ? list : u91.m22604V0(list, str);
    }
}
