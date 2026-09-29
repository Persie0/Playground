package com.lingq.feature.chat.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.SetLynxMemoryEnabledUseCase", m4291f = "LynxPrivacyUseCases.kt", m4292l = {46}, m4293m = "invoke", m4294v = 2)
final class SetLynxMemoryEnabledUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25200a;

    /* JADX INFO: renamed from: b */
    public boolean f25201b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25202c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2000e f25203d;

    /* JADX INFO: renamed from: e */
    public int f25204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLynxMemoryEnabledUseCase$invoke$1(C2000e c2000e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25203d = c2000e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25202c = obj;
        this.f25204e |= Integer.MIN_VALUE;
        return this.f25203d.m8866a(null, false, this);
    }
}
