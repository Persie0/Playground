package com.lingq.core.domain.dictionaries;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.dictionaries.GetAvailableLocalesUseCase$invoke$$inlined$map$1$2", m4291f = "GetAvailableLocalesUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetAvailableLocalesUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18628a;

    /* JADX INFO: renamed from: b */
    public int f18629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f18630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableLocalesUseCase$invoke$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f18630c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18628a = obj;
        this.f18629b |= Integer.MIN_VALUE;
        return this.f18630c.emit(null, this);
    }
}
