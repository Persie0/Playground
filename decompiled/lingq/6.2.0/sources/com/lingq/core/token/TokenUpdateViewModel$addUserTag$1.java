package com.lingq.core.token;

import com.lingq.core.token.domain.C1904a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$addUserTag$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1513}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$addUserTag$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23552c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23553d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$addUserTag$1(C1909e c1909e, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f23551b = c1909e;
        this.f23552c = str;
        this.f23553d = str2;
        this.f23554e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$addUserTag$1(this.f23551b, this.f23552c, this.f23553d, this.f23554e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$addUserTag$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23550a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1904a c1904a = this.f23551b.f23910x;
            this.f23550a = 1;
            if (c1904a.m8712c(this.f23552c, this.f23553d, this.f23554e, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
