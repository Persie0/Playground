package com.lingq.core.domain.library;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.domain.library.UpdateStreakInfoUseCase", m4291f = "UpdateStreakInfoUseCase.kt", m4292l = {12, 13}, m4293m = "invoke", m4294v = 2)
final class UpdateStreakInfoUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18826a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18827b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1387b f18828c;

    /* JADX INFO: renamed from: d */
    public int f18829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateStreakInfoUseCase$invoke$1(C1387b c1387b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18828c = c1387b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18827b = obj;
        this.f18829d |= Integer.MIN_VALUE;
        return this.f18828c.m8003c(null, this);
    }
}
