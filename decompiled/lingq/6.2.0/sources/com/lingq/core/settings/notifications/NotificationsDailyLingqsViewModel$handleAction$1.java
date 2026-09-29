package com.lingq.core.settings.notifications;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tn6;
import p000.un1;
import p000.wn6;
import p000.xfa;
import p000.xz8;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsDailyLingqsViewModel$handleAction$1", m4291f = "NotificationsDailyLingqsViewModel.kt", m4292l = {61}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsDailyLingqsViewModel$handleAction$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1876b f22992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wn6 f22993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqsViewModel$handleAction$1(C1876b c1876b, wn6 wn6Var, Continuation continuation) {
        super(2, continuation);
        this.f22992b = c1876b;
        this.f22993c = wn6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsDailyLingqsViewModel$handleAction$1(this.f22992b, this.f22993c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsDailyLingqsViewModel$handleAction$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22991a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C1876b c1876b = this.f22992b;
        xz8 xz8Var = c1876b.f23010b;
        String str = c1876b.f23015g;
        boolean z = ((tn6) this.f22993c).f62570a;
        this.f22991a = 1;
        Object objM7219p = ((C1293i) xz8Var.f69021a).m7219p(str, z, this);
        if (objM7219p != coroutineSingletons) {
            objM7219p = xfaVar;
        }
        return objM7219p == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
