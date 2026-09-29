package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {123}, m4293m = "syncClearBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$syncClearBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1286b f14629b;

    /* JADX INFO: renamed from: c */
    public int f14630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$syncClearBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14629b = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14628a = obj;
        this.f14630c |= Integer.MIN_VALUE;
        return this.f14629b.m7109k(0, this);
    }
}
