package com.lingq.core.settings.notifications;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sn6;
import p000.un1;
import p000.wn6;
import p000.xfa;
import p000.xz8;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsDailyLingqsViewModel$handleAction$5", m4291f = "NotificationsDailyLingqsViewModel.kt", m4292l = {74}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsDailyLingqsViewModel$handleAction$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1876b f22998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wn6 f22999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqsViewModel$handleAction$5(C1876b c1876b, wn6 wn6Var, Continuation continuation) {
        super(2, continuation);
        this.f22998b = c1876b;
        this.f22999c = wn6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsDailyLingqsViewModel$handleAction$5(this.f22998b, this.f22999c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsDailyLingqsViewModel$handleAction$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22997a;
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
        C1876b c1876b = this.f22998b;
        xz8 xz8Var = c1876b.f23012d;
        String str = c1876b.f23015g;
        int i2 = ((sn6) this.f22999c).f61062a;
        this.f22997a = 1;
        Object objM7222s = ((C1293i) xz8Var.f69021a).m7222s(i2, str, this);
        if (objM7222s != coroutineSingletons) {
            objM7222s = xfaVar;
        }
        return objM7222s == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
