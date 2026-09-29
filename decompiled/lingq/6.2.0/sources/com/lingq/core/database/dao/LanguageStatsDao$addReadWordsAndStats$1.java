package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LanguageStatsDao", m4291f = "LanguageStatsDao.kt", m4292l = {112, 113}, m4293m = "addReadWordsAndStats$suspendImpl", m4294v = 2)
final class LanguageStatsDao$addReadWordsAndStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1319g f16937a;

    /* JADX INFO: renamed from: b */
    public String f16938b;

    /* JADX INFO: renamed from: c */
    public String f16939c;

    /* JADX INFO: renamed from: d */
    public int f16940d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16941e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1319g f16942f;

    /* JADX INFO: renamed from: g */
    public int f16943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao$addReadWordsAndStats$1(C1319g c1319g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16942f = c1319g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16941e = obj;
        this.f16943g |= Integer.MIN_VALUE;
        return C1319g.m7478B0(this.f16942f, null, null, null, 0, this);
    }
}
