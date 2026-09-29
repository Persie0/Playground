package com.lingq.feature.notifications;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.no6;
import p000.oo6;
import p000.po6;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$uiState$1", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$uiState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f26875a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f26876b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f26877c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        NotificationsViewModel$uiState$1 notificationsViewModel$uiState$1 = new NotificationsViewModel$uiState$1(4, (Continuation) obj4);
        notificationsViewModel$uiState$1.f26875a = (List) obj;
        notificationsViewModel$uiState$1.f26876b = zBooleanValue;
        notificationsViewModel$uiState$1.f26877c = zBooleanValue2;
        return notificationsViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f26875a;
        boolean z = this.f26876b;
        boolean z2 = this.f26877c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (z2 && list.isEmpty()) {
            return no6.f53060a;
        }
        return (z && list.isEmpty()) ? oo6.f54654a : new po6(list);
    }
}
