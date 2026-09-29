package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {376, 382}, m4293m = "networkUpdateSiteNotification", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateSiteNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15196a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1293i f15198c;

    /* JADX INFO: renamed from: d */
    public int f15199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateSiteNotification$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15198c = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15197b = obj;
        this.f15199d |= Integer.MIN_VALUE;
        return this.f15198c.m7212i(null, null, this);
    }
}
