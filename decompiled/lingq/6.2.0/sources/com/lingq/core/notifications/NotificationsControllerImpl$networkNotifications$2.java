package com.lingq.core.notifications;

import com.lingq.core.data.repository.C1300p;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.en6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl$networkNotifications$2", m4291f = "NotificationsController.kt", m4292l = {107, 108}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsControllerImpl$networkNotifications$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1799a f21863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$networkNotifications$2(C1799a c1799a, Continuation continuation) {
        super(2, continuation);
        this.f21863b = c1799a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsControllerImpl$networkNotifications$2(this.f21863b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsControllerImpl$networkNotifications$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r2.mo7002H0(r6, r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21862a;
        C1799a c1799a = this.f21863b;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            en6 en6Var = c1799a.f21876b;
            String strMo4589b2 = c1799a.f21875a.mo4589b2();
            this.f21862a = 1;
            obj = ((C1300p) en6Var).m7336c(1, strMo4589b2, this);
            if (obj == coroutineSingletons) {
            }
            return coroutineSingletons;
            int iIntValue = ((Number) ((Pair) obj).f47624b).intValue();
            this.f21862a = 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
