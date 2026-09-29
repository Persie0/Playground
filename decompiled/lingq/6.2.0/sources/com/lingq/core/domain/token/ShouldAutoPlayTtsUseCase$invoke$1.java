package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.ShouldAutoPlayTtsUseCase", m4291f = "ShouldAutoPlayTtsUseCase.kt", m4292l = {11}, m4293m = "invoke", m4294v = 2)
final class ShouldAutoPlayTtsUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f20092a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1534b f20094c;

    /* JADX INFO: renamed from: d */
    public int f20095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShouldAutoPlayTtsUseCase$invoke$1(C1534b c1534b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20094c = c1534b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20093b = obj;
        this.f20095d |= Integer.MIN_VALUE;
        return this.f20094c.m8212a(false, this);
    }
}
