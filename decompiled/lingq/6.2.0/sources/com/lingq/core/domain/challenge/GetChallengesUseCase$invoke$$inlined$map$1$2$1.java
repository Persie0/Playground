package com.lingq.core.domain.challenge;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.challenge.GetChallengesUseCase$invoke$$inlined$map$1$2", m4291f = "GetChallengesUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetChallengesUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18598a;

    /* JADX INFO: renamed from: b */
    public int f18599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f18600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChallengesUseCase$invoke$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f18600c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18598a = obj;
        this.f18599b |= Integer.MIN_VALUE;
        return this.f18600c.emit(null, this);
    }
}
