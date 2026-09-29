package com.lingq.core.token;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.pl3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$updateMeaning$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1396}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$updateMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23704c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23705d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TokenMeaning f23706e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$updateMeaning$1(C1909e c1909e, String str, String str2, TokenMeaning tokenMeaning, String str3, Continuation continuation) {
        super(2, continuation);
        this.f23703b = c1909e;
        this.f23704c = str;
        this.f23705d = str2;
        this.f23706e = tokenMeaning;
        this.f23707f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$updateMeaning$1(this.f23703b, this.f23704c, this.f23705d, this.f23706e, this.f23707f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$updateMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23702a;
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
        pl3 pl3Var = this.f23703b.f23901o;
        this.f23702a = 1;
        Object objM7130t = ((C1287c) pl3Var.f56400a).m7130t(this.f23704c, this.f23705d, this.f23706e, this.f23707f, this);
        if (objM7130t != coroutineSingletons) {
            objM7130t = xfaVar;
        }
        return objM7130t == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
