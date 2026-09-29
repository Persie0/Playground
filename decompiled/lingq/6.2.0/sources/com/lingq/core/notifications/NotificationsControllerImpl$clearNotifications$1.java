package com.lingq.core.notifications;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl", m4291f = "NotificationsController.kt", m4292l = {98, 100}, m4293m = "clearNotifications", m4294v = 2)
final class NotificationsControllerImpl$clearNotifications$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1799a f21860b;

    /* JADX INFO: renamed from: c */
    public int f21861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$clearNotifications$1(C1799a c1799a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f21860b = c1799a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21859a = obj;
        this.f21861c |= Integer.MIN_VALUE;
        return this.f21860b.mo7003O(this);
    }
}
