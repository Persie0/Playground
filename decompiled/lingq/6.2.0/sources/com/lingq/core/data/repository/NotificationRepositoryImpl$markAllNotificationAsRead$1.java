package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.NotificationRepositoryImpl", m4291f = "NotificationRepositoryImpl.kt", m4292l = {47}, m4293m = "markAllNotificationAsRead", m4294v = 2)
final class NotificationRepositoryImpl$markAllNotificationAsRead$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15847a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1300p f15849c;

    /* JADX INFO: renamed from: d */
    public int f15850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoryImpl$markAllNotificationAsRead$1(C1300p c1300p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15849c = c1300p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15848b = obj;
        this.f15850d |= Integer.MIN_VALUE;
        return this.f15849c.m7335b(null, this);
    }
}
