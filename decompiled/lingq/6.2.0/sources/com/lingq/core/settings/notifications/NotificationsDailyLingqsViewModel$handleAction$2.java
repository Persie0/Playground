package com.lingq.core.settings.notifications;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lm4;
import p000.un1;
import p000.un6;
import p000.vj6;
import p000.wn6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsDailyLingqsViewModel$handleAction$2", m4291f = "NotificationsDailyLingqsViewModel.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsDailyLingqsViewModel$handleAction$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1876b f22995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wn6 f22996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqsViewModel$handleAction$2(C1876b c1876b, wn6 wn6Var, Continuation continuation) {
        super(2, continuation);
        this.f22995b = c1876b;
        this.f22996c = wn6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsDailyLingqsViewModel$handleAction$2(this.f22995b, this.f22996c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsDailyLingqsViewModel$handleAction$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22994a;
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
        C1876b c1876b = this.f22995b;
        vj6 vj6Var = c1876b.f23011c;
        String str = c1876b.f23015g;
        boolean z = ((un6) this.f22996c).f64108a;
        this.f22994a = 1;
        Object objM7223t = ((C1293i) ((lm4) vj6Var.f65506b)).m7223t(str, z, this);
        if (objM7223t != coroutineSingletons) {
            objM7223t = xfaVar;
        }
        return objM7223t == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
