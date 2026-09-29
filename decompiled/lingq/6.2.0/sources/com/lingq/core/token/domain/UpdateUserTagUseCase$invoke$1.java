package com.lingq.core.token.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.UpdateUserTagUseCase", m4291f = "UpdateUserTagUseCase.kt", m4292l = {13, 14, 17, 20}, m4293m = "invoke", m4294v = 2)
final class UpdateUserTagUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23845a;

    /* JADX INFO: renamed from: b */
    public String f23846b;

    /* JADX INFO: renamed from: c */
    public boolean f23847c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f23848d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1904a f23849e;

    /* JADX INFO: renamed from: f */
    public int f23850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserTagUseCase$invoke$1(C1904a c1904a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23849e = c1904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23848d = obj;
        this.f23850f |= Integer.MIN_VALUE;
        return this.f23849e.m8712c(null, null, null, false, this);
    }
}
