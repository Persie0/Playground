package com.lingq.feature.notifications;

import com.lingq.core.data.repository.C1300p;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.dn6;
import p000.e83;
import p000.en6;
import p000.ld0;
import p000.m83;
import p000.ux5;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$observableNotifications$1", m4291f = "NotificationsViewModel.kt", m4292l = {108}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$observableNotifications$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2168b f26871b;

    /* JADX INFO: renamed from: com.lingq.feature.notifications.NotificationsViewModel$observableNotifications$1$1 */
    @c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$observableNotifications$1$1", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21651 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2168b f26872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21651(C2168b c2168b, Continuation continuation) {
            super(2, continuation);
            this.f26872a = c2168b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21651(this.f26872a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21651 c21651 = (C21651) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21651.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26872a;
            ux5.m22977D(((Number) c2168b.f26889i.getValue()).intValue() == 1, c2168b.f26887g, null);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.notifications.NotificationsViewModel$observableNotifications$1$2 */
    @c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$observableNotifications$1$2", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21662 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2168b f26874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21662(C2168b c2168b, Continuation continuation) {
            super(2, continuation);
            this.f26874b = c2168b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21662 c21662 = new C21662(this.f26874b, continuation);
            c21662.f26873a = obj;
            return c21662;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21662 c21662 = (C21662) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21662.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f26873a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26874b;
            c2168b.f26891k.m15571i(list);
            ux5.m22977D(!((Boolean) c2168b.f26888h.getValue()).booleanValue() && list.isEmpty(), c2168b.f26887g, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$observableNotifications$1(C2168b c2168b, Continuation continuation) {
        super(1, continuation);
        this.f26871b = c2168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NotificationsViewModel$observableNotifications$1(this.f26871b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((NotificationsViewModel$observableNotifications$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26870a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26871b;
            en6 en6Var = c2168b.f26883c;
            String strMo4589b2 = c2168b.f26882b.mo4589b2();
            int iIntValue = ((Number) c2168b.f26889i.getValue()).intValue() * 20;
            C1300p c1300p = (C1300p) en6Var;
            c1300p.getClass();
            strMo4589b2.getClass();
            dn6 dn6Var = c1300p.f16527a;
            dn6Var.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(dn6Var.f35897K, true, new String[]{"NotificationEntity"}, new ld0(strMo4589b2, iIntValue, 16))), new C21651(c2168b, null));
            C21662 c21662 = new C21662(c2168b, null);
            this.f26870a = 1;
            if (AbstractC3224d.m15529h(m83Var, c21662, this) == coroutineSingletons) {
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
