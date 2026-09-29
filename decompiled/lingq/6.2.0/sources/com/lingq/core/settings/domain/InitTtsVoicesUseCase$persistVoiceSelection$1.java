package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.InitTtsVoicesUseCase", m4291f = "InitTtsVoicesUseCase.kt", m4292l = {99, 100, 103}, m4293m = "persistVoiceSelection", m4294v = 2)
final class InitTtsVoicesUseCase$persistVoiceSelection$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22774a;

    /* JADX INFO: renamed from: b */
    public boolean f22775b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22776c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1863b f22777d;

    /* JADX INFO: renamed from: e */
    public int f22778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitTtsVoicesUseCase$persistVoiceSelection$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22777d = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22776c = obj;
        this.f22778e |= Integer.MIN_VALUE;
        return this.f22777d.m8623f(null, null, this);
    }
}
