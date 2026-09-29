package com.lingq.core.domain.phrases;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.hm3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.domain.phrases.GetPhraseCardsUseCase$invoke$$inlined$map$1$2", m4291f = "GetPhraseCardsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19879a;

    /* JADX INFO: renamed from: b */
    public int f19880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hm3 f19881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1(hm3 hm3Var, Continuation continuation) {
        super(continuation);
        this.f19881c = hm3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19879a = obj;
        this.f19880b |= Integer.MIN_VALUE;
        return this.f19881c.emit(null, this);
    }
}
