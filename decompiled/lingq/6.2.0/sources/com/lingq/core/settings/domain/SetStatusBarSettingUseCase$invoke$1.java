package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetStatusBarSettingUseCase", m4291f = "SetStatusBarSettingUseCase.kt", m4292l = {13, 14}, m4293m = "invoke", m4294v = 2)
final class SetStatusBarSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22838a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22839b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1869h f22840c;

    /* JADX INFO: renamed from: d */
    public int f22841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetStatusBarSettingUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22840c = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22839b = obj;
        this.f22841d |= Integer.MIN_VALUE;
        return this.f22840c.m8634c(false, this);
    }
}
