package com.lingq.core.notifications;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl", m4291f = "NotificationsController.kt", m4292l = {92, 94}, m4293m = "updateUnreadNotifications", m4294v = 2)
final class NotificationsControllerImpl$updateUnreadNotifications$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f21871a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1799a f21873c;

    /* JADX INFO: renamed from: d */
    public int f21874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$updateUnreadNotifications$1(C1799a c1799a, Continuation continuation) {
        super(continuation);
        this.f21873c = c1799a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21872b = obj;
        this.f21874d |= Integer.MIN_VALUE;
        return this.f21873c.mo7002H0(0, this);
    }
}
