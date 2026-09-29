package com.lingq.core.domain.web2wave;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.web2wave.HandleWeb2WaveDeeplinkUseCase", m4291f = "HandleWeb2WaveDeeplinkUseCase.kt", m4292l = {19, 22, 24}, m4293m = "invoke", m4294v = 2)
final class HandleWeb2WaveDeeplinkUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20167a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1545b f20169c;

    /* JADX INFO: renamed from: d */
    public int f20170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleWeb2WaveDeeplinkUseCase$invoke$1(C1545b c1545b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20169c = c1545b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20168b = obj;
        this.f20170d |= Integer.MIN_VALUE;
        return this.f20169c.m8229a(null, null, this);
    }
}
