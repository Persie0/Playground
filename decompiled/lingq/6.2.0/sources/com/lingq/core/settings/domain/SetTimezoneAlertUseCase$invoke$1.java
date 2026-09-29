package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetTimezoneAlertUseCase", m4291f = "SetTimezoneAlertUseCase.kt", m4292l = {13, 14}, m4293m = "invoke", m4294v = 2)
final class SetTimezoneAlertUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22846a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1869h f22848c;

    /* JADX INFO: renamed from: d */
    public int f22849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTimezoneAlertUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22848c = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22847b = obj;
        this.f22849d |= Integer.MIN_VALUE;
        return this.f22848c.m8634c(false, this);
    }
}
