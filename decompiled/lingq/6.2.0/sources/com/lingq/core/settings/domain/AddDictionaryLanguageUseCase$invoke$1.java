package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.AddDictionaryLanguageUseCase", m4291f = "AddDictionaryLanguageUseCase.kt", m4292l = {13, 16}, m4293m = "invoke", m4294v = 2)
final class AddDictionaryLanguageUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22752a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1862a f22754c;

    /* JADX INFO: renamed from: d */
    public int f22755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDictionaryLanguageUseCase$invoke$1(C1862a c1862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22754c = c1862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22753b = obj;
        this.f22755d |= Integer.MIN_VALUE;
        return this.f22754c.m8617c(null, this);
    }
}
