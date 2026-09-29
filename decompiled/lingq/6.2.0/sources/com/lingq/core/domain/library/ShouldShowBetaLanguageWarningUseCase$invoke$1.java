package com.lingq.core.domain.library;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.domain.library.ShouldShowBetaLanguageWarningUseCase", m4291f = "ShouldShowBetaLanguageWarningUseCase.kt", m4292l = {21}, m4293m = "invoke", m4294v = 2)
final class ShouldShowBetaLanguageWarningUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18817a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1386a f18819c;

    /* JADX INFO: renamed from: d */
    public int f18820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShouldShowBetaLanguageWarningUseCase$invoke$1(C1386a c1386a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18819c = c1386a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18818b = obj;
        this.f18820d |= Integer.MIN_VALUE;
        return this.f18819c.m8000d(null, this);
    }
}
