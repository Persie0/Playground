package com.lingq.feature.notifications;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$3", m4291f = "NotificationsViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2168b f26866b;

    /* JADX INFO: renamed from: com.lingq.feature.notifications.NotificationsViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$3$1", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21641 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2168b f26867a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21641(C2168b c2168b, Continuation continuation) {
            super(2, continuation);
            this.f26867a = c2168b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21641(this.f26867a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21641 c21641 = (C21641) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21641.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f26867a.m9101V2();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$3(C2168b c2168b, Continuation continuation) {
        super(2, continuation);
        this.f26866b = c2168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsViewModel$3(this.f26866b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26865a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26866b;
            C3244l c3244l = c2168b.f26889i;
            C21641 c21641 = new C21641(c2168b, null);
            c3244l.getClass();
            this.f26865a = 1;
            if (AbstractC3224d.m15529h(c3244l, c21641, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
