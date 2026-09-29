package com.lingq.core.token;

import com.lingq.core.token.domain.C1906c;
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
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$changePopularMeaningLocale$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {755}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$changePopularMeaningLocale$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23562c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$changePopularMeaningLocale$1(C1909e c1909e, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f23561b = c1909e;
        this.f23562c = str;
        this.f23563d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$changePopularMeaningLocale$1(this.f23561b, this.f23562c, this.f23563d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$changePopularMeaningLocale$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23560a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1906c c1906c = this.f23561b.f23867E;
            this.f23560a = 1;
            if (c1906c.m8725e(this.f23562c, this.f23563d, this) == coroutineSingletons) {
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
