package com.lingq.core.settings.notifications;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsDailyLingqsViewModel$1", m4291f = "NotificationsDailyLingqsViewModel.kt", m4292l = {55}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsDailyLingqsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1876b f22990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqsViewModel$1(C1876b c1876b, Continuation continuation) {
        super(2, continuation);
        this.f22990b = c1876b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsDailyLingqsViewModel$1(this.f22990b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsDailyLingqsViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22989a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            t23 t23Var = this.f22990b.f23013e;
            this.f22989a = 1;
            Object objM7225v = ((C1293i) t23Var.f61764a).m7225v(this);
            if (objM7225v != coroutineSingletons) {
                objM7225v = xfaVar;
            }
            if (objM7225v == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
