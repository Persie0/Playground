package com.lingq.feature.vocabulary.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2", m4291f = "GetHasCreatedLingqsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33537a;

    /* JADX INFO: renamed from: b */
    public int f33538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f33539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHasCreatedLingqsUseCase$invoke$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f33539c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33537a = obj;
        this.f33538b |= Integer.MIN_VALUE;
        return this.f33539c.emit(null, this);
    }
}
