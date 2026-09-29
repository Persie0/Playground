package com.lingq.core.notifications;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl$_unreadNotificationsCount$1", m4291f = "NotificationsController.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsControllerImpl$_unreadNotificationsCount$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f21855a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f21856b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f21857c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1799a f21858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$_unreadNotificationsCount$1(C1799a c1799a, Continuation continuation) {
        super(3, continuation);
        this.f21858d = c1799a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NotificationsControllerImpl$_unreadNotificationsCount$1 notificationsControllerImpl$_unreadNotificationsCount$1 = new NotificationsControllerImpl$_unreadNotificationsCount$1(this.f21858d, (Continuation) obj3);
        notificationsControllerImpl$_unreadNotificationsCount$1.f21856b = (e83) obj;
        notificationsControllerImpl$_unreadNotificationsCount$1.f21857c = (Map) obj2;
        return notificationsControllerImpl$_unreadNotificationsCount$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f21856b;
        Map map = this.f21857c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21855a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = map.get(this.f21858d.f21875a.mo4589b2());
            this.f21856b = null;
            this.f21857c = null;
            this.f21855a = 1;
            if (e83Var.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
