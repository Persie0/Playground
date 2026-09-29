package com.lingq.feature.notifications;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$1", m4291f = "NotificationsViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2168b f26860b;

    /* JADX INFO: renamed from: com.lingq.feature.notifications.NotificationsViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$1$1", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21621 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2168b f26861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21621(C2168b c2168b, Continuation continuation) {
            super(2, continuation);
            this.f26861a = c2168b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21621(this.f26861a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21621 c21621 = (C21621) create((Language) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21621.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26861a;
            C3244l c3244l = c2168b.f26891k;
            c3244l.getClass();
            c3244l.m15572j(null, EmptyList.f47638a);
            c2168b.m9101V2();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$1(C2168b c2168b, Continuation continuation) {
        super(2, continuation);
        this.f26860b = c2168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsViewModel$1(this.f26860b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26859a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26860b;
            eh9 eh9VarMo4572B0 = c2168b.f26882b.mo4572B0();
            C21621 c21621 = new C21621(c2168b, null);
            eh9VarMo4572B0.getClass();
            this.f26859a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c21621, this) == coroutineSingletons) {
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
