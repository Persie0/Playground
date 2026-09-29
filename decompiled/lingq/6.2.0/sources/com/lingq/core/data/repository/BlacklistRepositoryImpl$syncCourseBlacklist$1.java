package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {116}, m4293m = "syncCourseBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$syncCourseBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1286b f14632b;

    /* JADX INFO: renamed from: c */
    public int f14633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$syncCourseBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14632b = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14631a = obj;
        this.f14633c |= Integer.MIN_VALUE;
        return this.f14632b.m7110l(0, 0, null, this);
    }
}
