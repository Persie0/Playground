package com.lingq.core.token;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xa2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$removeMeaning$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1405}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$removeMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23662b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23663c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23664d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TokenMeaning f23665e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f23666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$removeMeaning$1(C1909e c1909e, String str, String str2, TokenMeaning tokenMeaning, int i, Continuation continuation) {
        super(2, continuation);
        this.f23662b = c1909e;
        this.f23663c = str;
        this.f23664d = str2;
        this.f23665e = tokenMeaning;
        this.f23666f = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$removeMeaning$1(this.f23662b, this.f23663c, this.f23664d, this.f23665e, this.f23666f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$removeMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23661a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        xa2 xa2Var = this.f23662b.f23902p;
        this.f23661a = 1;
        Object objM7124n = ((C1287c) xa2Var.f67988a).m7124n(this.f23663c, this.f23664d, this.f23665e, -1, this);
        if (objM7124n != coroutineSingletons) {
            objM7124n = xfaVar;
        }
        return objM7124n == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
