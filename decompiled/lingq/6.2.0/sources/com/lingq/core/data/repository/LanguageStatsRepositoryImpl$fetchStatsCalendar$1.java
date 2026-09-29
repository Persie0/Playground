package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {267, 268}, m4293m = "fetchStatsCalendar", m4294v = 2)
final class LanguageStatsRepositoryImpl$fetchStatsCalendar$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15294a;

    /* JADX INFO: renamed from: b */
    public int f15295b;

    /* JADX INFO: renamed from: c */
    public int f15296c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15297d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1294j f15298e;

    /* JADX INFO: renamed from: f */
    public int f15299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$fetchStatsCalendar$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15298e = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15297d = obj;
        this.f15299f |= Integer.MIN_VALUE;
        return this.f15298e.m7232f(0, 0, null, null, null, this);
    }
}
