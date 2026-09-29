package com.lingq.core.token.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAvailableTagsUseCase$invoke$$inlined$map$1$2", m4291f = "GetAvailableTagsUseCase.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class GetAvailableTagsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23795a;

    /* JADX INFO: renamed from: b */
    public int f23796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f23797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableTagsUseCase$invoke$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f23797c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23795a = obj;
        this.f23796b |= Integer.MIN_VALUE;
        return this.f23797c.emit(null, this);
    }
}
