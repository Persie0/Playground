package com.lingq.core.domain.language;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.language.DeleteLanguageUseCase", m4291f = "DeleteLanguageUseCase.kt", m4292l = {12, 13}, m4293m = "invoke", m4294v = 2)
final class DeleteLanguageUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18636a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1377a f18638c;

    /* JADX INFO: renamed from: d */
    public int f18639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteLanguageUseCase$invoke$1(C1377a c1377a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18638c = c1377a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18637b = obj;
        this.f18639d |= Integer.MIN_VALUE;
        return this.f18638c.m7983a(null, this);
    }
}
