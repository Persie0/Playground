package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.InitTtsVoicesUseCase", m4291f = "InitTtsVoicesUseCase.kt", m4292l = {69, 69}, m4293m = "getWebVoices", m4294v = 2)
final class InitTtsVoicesUseCase$getWebVoices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1863b f22760b;

    /* JADX INFO: renamed from: c */
    public int f22761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitTtsVoicesUseCase$getWebVoices$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22760b = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22759a = obj;
        this.f22761c |= Integer.MIN_VALUE;
        return this.f22760b.m8618a(null, this);
    }
}
