package com.lingq.core.domain.library;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.d51;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryLevelsUseCase$invoke$$inlined$map$1$2", m4291f = "GetLibraryLevelsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18752a;

    /* JADX INFO: renamed from: b */
    public int f18753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d51 f18754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1(d51 d51Var, Continuation continuation) {
        super(continuation);
        this.f18754c = d51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18752a = obj;
        this.f18753b |= Integer.MIN_VALUE;
        return this.f18754c.emit(null, this);
    }
}
