package com.lingq.feature.chat.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.SetLynxDataImprovementOptInUseCase", m4291f = "LynxPrivacyUseCases.kt", m4292l = {56}, m4293m = "invoke", m4294v = 2)
final class SetLynxDataImprovementOptInUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25195a;

    /* JADX INFO: renamed from: b */
    public boolean f25196b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2000e f25198d;

    /* JADX INFO: renamed from: e */
    public int f25199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLynxDataImprovementOptInUseCase$invoke$1(C2000e c2000e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25198d = c2000e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25197c = obj;
        this.f25199e |= Integer.MIN_VALUE;
        return this.f25198d.m8866a(null, false, this);
    }
}
