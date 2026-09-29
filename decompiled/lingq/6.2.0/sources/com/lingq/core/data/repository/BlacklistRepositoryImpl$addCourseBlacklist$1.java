package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {72}, m4293m = "addCourseBlacklist", m4294v = 2)
final class BlacklistRepositoryImpl$addCourseBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14598a;

    /* JADX INFO: renamed from: b */
    public int f14599b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1286b f14601d;

    /* JADX INFO: renamed from: e */
    public int f14602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$addCourseBlacklist$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14601d = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14600c = obj;
        this.f14602e |= Integer.MIN_VALUE;
        return this.f14601d.m7099a(0, 0, null, null, this);
    }
}
