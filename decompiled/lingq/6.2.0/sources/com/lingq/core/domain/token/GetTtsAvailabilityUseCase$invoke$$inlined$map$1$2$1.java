package com.lingq.core.domain.token;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2", m4291f = "GetTtsAvailabilityUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20073a;

    /* JADX INFO: renamed from: b */
    public int f20074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f20075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTtsAvailabilityUseCase$invoke$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f20075c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20073a = obj;
        this.f20074b |= Integer.MIN_VALUE;
        return this.f20075c.emit(null, this);
    }
}
