package com.lingq.core.token.domain;

import com.lingq.core.data.repository.C1306v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.vi3;
import p000.w3a;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetPopularMeaningsUseCase$invoke$2", m4291f = "GetPopularMeaningsUseCase.kt", m4292l = {22}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPopularMeaningsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f23812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1907d f23813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPopularMeaningsUseCase$invoke$2(C1907d c1907d, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f23813b = c1907d;
        this.f23814c = str;
        this.f23815d = str2;
        this.f23816e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetPopularMeaningsUseCase$invoke$2(this.f23813b, this.f23814c, this.f23815d, this.f23816e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetPopularMeaningsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23812a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = this.f23813b.f23861a;
            this.f23812a = 1;
            obj = ((C1306v) w3aVar).m7377c(this.f23814c, this.f23815d, this.f23816e, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return new Integer(!fa4.m11650l((Boolean) obj, Boolean.FALSE) ? 1 : 0);
    }
}
