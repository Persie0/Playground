package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {99}, m4293m = "removeCourseBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$removeCourseBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14618a;

    /* JADX INFO: renamed from: b */
    public int f14619b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14620c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1286b f14621d;

    /* JADX INFO: renamed from: e */
    public int f14622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$removeCourseBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14621d = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14620c = obj;
        this.f14622e |= Integer.MIN_VALUE;
        return this.f14621d.m7107i(0, 0, null, this);
    }
}
