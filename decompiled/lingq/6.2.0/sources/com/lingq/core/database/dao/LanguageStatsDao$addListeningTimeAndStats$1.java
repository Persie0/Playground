package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LanguageStatsDao", m4291f = "LanguageStatsDao.kt", m4292l = {101, 102}, m4293m = "addListeningTimeAndStats$suspendImpl", m4294v = 2)
final class LanguageStatsDao$addListeningTimeAndStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1319g f16930a;

    /* JADX INFO: renamed from: b */
    public String f16931b;

    /* JADX INFO: renamed from: c */
    public String f16932c;

    /* JADX INFO: renamed from: d */
    public double f16933d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16934e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1319g f16935f;

    /* JADX INFO: renamed from: g */
    public int f16936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao$addListeningTimeAndStats$1(C1319g c1319g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16935f = c1319g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16934e = obj;
        this.f16936g |= Integer.MIN_VALUE;
        return C1319g.m7480z0(this.f16935f, null, null, null, 0.0d, this);
    }
}
