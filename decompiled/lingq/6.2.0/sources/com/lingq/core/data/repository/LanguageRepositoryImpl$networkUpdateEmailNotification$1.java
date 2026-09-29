package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {345, 351}, m4293m = "networkUpdateEmailNotification", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateEmailNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15170a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1293i f15172c;

    /* JADX INFO: renamed from: d */
    public int f15173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateEmailNotification$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15172c = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15171b = obj;
        this.f15173d |= Integer.MIN_VALUE;
        return this.f15172c.m7207d(null, null, this);
    }
}
