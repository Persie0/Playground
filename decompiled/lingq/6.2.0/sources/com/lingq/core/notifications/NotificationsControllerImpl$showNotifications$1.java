package com.lingq.core.notifications;

import java.util.LinkedHashSet;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.h24;
import p000.u91;
import p000.un1;
import p000.vfd;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl$showNotifications$1", m4291f = "NotificationsController.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsControllerImpl$showNotifications$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public h24 f21864a;

    /* JADX INFO: renamed from: b */
    public int f21865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1799a f21866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$showNotifications$1(C1799a c1799a, Continuation continuation) {
        super(2, continuation);
        this.f21866c = c1799a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsControllerImpl$showNotifications$1(this.f21866c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsControllerImpl$showNotifications$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        h24 h24Var;
        C1799a c1799a = this.f21866c;
        C3211a c3211a = c1799a.f21881g;
        LinkedHashSet linkedHashSet = c1799a.f21880f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21865b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (linkedHashSet.isEmpty()) {
                c3211a.mo4677k(null);
            } else {
                h24 h24Var2 = (h24) u91.m22590H0(linkedHashSet);
                if (h24Var2 != null) {
                    this.f21864a = h24Var2;
                    this.f21865b = 1;
                    if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h24Var = h24Var2;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h24Var = this.f21864a;
        AbstractC3193b.m15359b(obj);
        c3211a.mo4677k(h24Var);
        if (vfd.m23266a(h24Var.f41695a) > 0) {
            c1799a.f21888n.put(h24Var, wfb.m23926u(c1799a.f21878d, null, null, new NotificationsControllerImpl$startDismissTimer$1(vfd.m23266a(h24Var.f41695a), c1799a, h24Var, null), 3));
        }
        return xfa.f68157a;
    }
}
