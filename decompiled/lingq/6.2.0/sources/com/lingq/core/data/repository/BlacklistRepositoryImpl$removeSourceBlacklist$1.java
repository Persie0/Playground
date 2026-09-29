package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {82}, m4293m = "removeSourceBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$removeSourceBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14623a;

    /* JADX INFO: renamed from: b */
    public String f14624b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1286b f14626d;

    /* JADX INFO: renamed from: e */
    public int f14627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$removeSourceBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14626d = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14625c = obj;
        this.f14627e |= Integer.MIN_VALUE;
        return this.f14626d.m7108j(0, null, null, this);
    }
}
