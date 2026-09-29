package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.NotificationRepositoryImpl", m4291f = "NotificationRepositoryImpl.kt", m4292l = {42}, m4293m = "updateNotification", m4294v = 2)
final class NotificationRepositoryImpl$updateNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15859a;

    /* JADX INFO: renamed from: b */
    public List f15860b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15861c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1300p f15862d;

    /* JADX INFO: renamed from: e */
    public int f15863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoryImpl$updateNotification$1(C1300p c1300p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15862d = c1300p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15861c = obj;
        this.f15863e |= Integer.MIN_VALUE;
        return this.f15862d.m7337d(null, null, this);
    }
}
