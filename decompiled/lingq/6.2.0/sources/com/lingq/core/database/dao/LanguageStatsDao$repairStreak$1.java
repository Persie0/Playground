package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LanguageStatsDao", m4291f = "LanguageStatsDao.kt", m4292l = {136, 137}, m4293m = "repairStreak$suspendImpl", m4294v = 2)
final class LanguageStatsDao$repairStreak$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1319g f16944a;

    /* JADX INFO: renamed from: b */
    public String f16945b;

    /* JADX INFO: renamed from: c */
    public int f16946c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16947d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1319g f16948e;

    /* JADX INFO: renamed from: f */
    public int f16949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao$repairStreak$1(C1319g c1319g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16948e = c1319g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16947d = obj;
        this.f16949f |= Integer.MIN_VALUE;
        return C1319g.m7479D0(this.f16948e, null, 0, this);
    }
}
