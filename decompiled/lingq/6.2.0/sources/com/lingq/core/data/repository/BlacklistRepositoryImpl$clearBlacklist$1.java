package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {104}, m4293m = "clearBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$clearBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14608a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1286b f14610c;

    /* JADX INFO: renamed from: d */
    public int f14611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$clearBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14610c = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14609b = obj;
        this.f14611d |= Integer.MIN_VALUE;
        return this.f14610c.m7101c(0, null, this);
    }
}
