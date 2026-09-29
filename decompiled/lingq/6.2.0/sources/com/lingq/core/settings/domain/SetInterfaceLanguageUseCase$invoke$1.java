package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetInterfaceLanguageUseCase", m4291f = "SetInterfaceLanguageUseCase.kt", m4292l = {14, 15, 16}, m4293m = "invoke", m4294v = 2)
final class SetInterfaceLanguageUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22808a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1863b f22810c;

    /* JADX INFO: renamed from: d */
    public int f22811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetInterfaceLanguageUseCase$invoke$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22810c = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22809b = obj;
        this.f22811d |= Integer.MIN_VALUE;
        return this.f22810c.m8622e(null, this);
    }
}
