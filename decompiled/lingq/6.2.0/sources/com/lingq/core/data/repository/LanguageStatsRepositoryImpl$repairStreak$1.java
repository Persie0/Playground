package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {68, 70, 71, 72}, m4293m = "repairStreak", m4294v = 2)
final class LanguageStatsRepositoryImpl$repairStreak$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15307a;

    /* JADX INFO: renamed from: b */
    public int f15308b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15309c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1294j f15310d;

    /* JADX INFO: renamed from: e */
    public int f15311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$repairStreak$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15310d = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15309c = obj;
        this.f15311e |= Integer.MIN_VALUE;
        return this.f15310d.m7240n(0, null, this);
    }
}
