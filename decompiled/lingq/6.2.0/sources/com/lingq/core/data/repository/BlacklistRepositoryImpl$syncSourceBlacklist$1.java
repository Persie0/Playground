package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {93}, m4293m = "syncSourceBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$syncSourceBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1286b f14635b;

    /* JADX INFO: renamed from: c */
    public int f14636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$syncSourceBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14635b = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14634a = obj;
        this.f14636c |= Integer.MIN_VALUE;
        return this.f14635b.m7111m(0, null, null, this);
    }
}
