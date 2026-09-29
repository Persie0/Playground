package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.jz1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {227, 229, 236}, m4293m = "setDailyStreakTarget", m4294v = 2)
final class LanguageRepositoryImpl$setDailyStreakTarget$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15219a;

    /* JADX INFO: renamed from: b */
    public jz1 f15220b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15221c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15222d;

    /* JADX INFO: renamed from: e */
    public int f15223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$setDailyStreakTarget$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15222d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15221c = obj;
        this.f15223e |= Integer.MIN_VALUE;
        return this.f15222d.m7217n(null, null, this);
    }
}
