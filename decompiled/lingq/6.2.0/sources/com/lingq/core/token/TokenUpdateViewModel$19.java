package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.h5a;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$19", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$19 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f23508a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ TokenMeaning f23509b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f23510c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f23511d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f23512e;

    public TokenUpdateViewModel$19(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        TokenUpdateViewModel$19 tokenUpdateViewModel$19 = new TokenUpdateViewModel$19((Continuation) obj6);
        tokenUpdateViewModel$19.f23508a = (List) obj;
        tokenUpdateViewModel$19.f23509b = (TokenMeaning) obj2;
        tokenUpdateViewModel$19.f23510c = (List) obj3;
        tokenUpdateViewModel$19.f23511d = (String) obj4;
        tokenUpdateViewModel$19.f23512e = (List) obj5;
        return tokenUpdateViewModel$19.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f23508a;
        TokenMeaning tokenMeaning = this.f23509b;
        List list2 = this.f23510c;
        String str = this.f23511d;
        List list3 = this.f23512e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new h5a(list, tokenMeaning, list2, str, list3);
    }
}
