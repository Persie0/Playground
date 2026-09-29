package com.lingq.feature.notifications;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$2", m4291f = "NotificationsViewModel.kt", m4292l = {79}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2168b f26863b;

    /* JADX INFO: renamed from: com.lingq.feature.notifications.NotificationsViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$2$1", m4291f = "NotificationsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21631 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2168b f26864a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21631(C2168b c2168b, Continuation continuation) {
            super(2, continuation);
            this.f26864a = c2168b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21631(this.f26864a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21631 c21631 = (C21631) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21631.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26864a.f26889i;
            c3244l.m15572j(null, new Integer(((Number) c3244l.getValue()).intValue() + 1));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$2(C2168b c2168b, Continuation continuation) {
        super(2, continuation);
        this.f26863b = c2168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsViewModel$2(this.f26863b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26862a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2168b c2168b = this.f26863b;
            du0 du0VarM15519A = AbstractC3224d.m15519A(c2168b.f26890j);
            C21631 c21631 = new C21631(c2168b, null);
            this.f26862a = 1;
            if (AbstractC3224d.m15529h(du0VarM15519A, c21631, this) == coroutineSingletons) {
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
