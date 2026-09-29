package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.eda;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.NoticeRepositoryImpl", m4291f = "NoticeRepositoryImpl.kt", m4292l = {eda.f37086g, 51}, m4293m = "fetchNotices", m4294v = 2)
final class NoticeRepositoryImpl$fetchNotices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15839a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1299o f15841c;

    /* JADX INFO: renamed from: d */
    public int f15842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeRepositoryImpl$fetchNotices$1(C1299o c1299o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15841c = c1299o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15840b = obj;
        this.f15842d |= Integer.MIN_VALUE;
        return this.f15841c.m7332a(null, this);
    }
}
