package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.RemoveDictionaryLanguageUseCase", m4291f = "RemoveDictionaryLanguageUseCase.kt", m4292l = {13, 16}, m4293m = "invoke", m4294v = 2)
final class RemoveDictionaryLanguageUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22789a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1862a f22791c;

    /* JADX INFO: renamed from: d */
    public int f22792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveDictionaryLanguageUseCase$invoke$1(C1862a c1862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22791c = c1862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22790b = obj;
        this.f22792d |= Integer.MIN_VALUE;
        return this.f22791c.m8617c(null, this);
    }
}
