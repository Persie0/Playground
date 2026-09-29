package com.lingq.core.settings.domain;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.InitTtsVoicesUseCase", m4291f = "InitTtsVoicesUseCase.kt", m4292l = {49, 51, 55, 57}, m4293m = "initLocalVoice", m4294v = 2)
final class InitTtsVoicesUseCase$initLocalVoice$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22762a;

    /* JADX INFO: renamed from: b */
    public Map f22763b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22764c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1863b f22765d;

    /* JADX INFO: renamed from: e */
    public int f22766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitTtsVoicesUseCase$initLocalVoice$1(C1863b c1863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22765d = c1863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22764c = obj;
        this.f22766e |= Integer.MIN_VALUE;
        return this.f22765d.m8619b(null, this);
    }
}
