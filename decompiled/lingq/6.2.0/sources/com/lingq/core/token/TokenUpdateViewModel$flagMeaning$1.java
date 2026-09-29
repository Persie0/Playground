package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1534b;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$flagMeaning$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1414}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$flagMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23602c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23603d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TokenMeaning f23604e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$flagMeaning$1(C1909e c1909e, String str, String str2, TokenMeaning tokenMeaning, String str3, Continuation continuation) {
        super(2, continuation);
        this.f23601b = c1909e;
        this.f23602c = str;
        this.f23603d = str2;
        this.f23604e = tokenMeaning;
        this.f23605f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$flagMeaning$1(this.f23601b, this.f23602c, this.f23603d, this.f23604e, this.f23605f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$flagMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23600a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1534b c1534b = this.f23601b.f23905s;
            this.f23600a = 1;
            if (c1534b.m8213b(this.f23602c, this.f23603d, this.f23604e, this.f23605f, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            ((Result) obj).getClass();
        }
        return xfa.f68157a;
    }
}
