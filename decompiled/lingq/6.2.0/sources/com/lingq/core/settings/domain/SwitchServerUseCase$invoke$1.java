package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SwitchServerUseCase", m4291f = "SwitchServerUseCase.kt", m4292l = {12, 13}, m4293m = "invoke", m4294v = 2)
final class SwitchServerUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1862a f22861b;

    /* JADX INFO: renamed from: c */
    public int f22862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchServerUseCase$invoke$1(C1862a c1862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22861b = c1862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22860a = obj;
        this.f22862c |= Integer.MIN_VALUE;
        return this.f22861b.m8615a(null, this);
    }
}
