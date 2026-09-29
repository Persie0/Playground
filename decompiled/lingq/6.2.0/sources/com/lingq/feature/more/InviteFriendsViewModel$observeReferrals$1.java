package com.lingq.feature.more;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.qv7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.InviteFriendsViewModel$observeReferrals$1", m4291f = "InviteFriendsViewModel.kt", m4292l = {74}, m4293m = "invokeSuspend", m4294v = 2)
final class InviteFriendsViewModel$observeReferrals$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2160a f26805b;

    /* JADX INFO: renamed from: com.lingq.feature.more.InviteFriendsViewModel$observeReferrals$1$1 */
    @c32(m4290c = "com.lingq.feature.more.InviteFriendsViewModel$observeReferrals$1$1", m4291f = "InviteFriendsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21561 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26806a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2160a f26807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21561(C2160a c2160a, Continuation continuation) {
            super(2, continuation);
            this.f26807b = c2160a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21561 c21561 = new C21561(this.f26807b, continuation);
            c21561.f26806a = obj;
            return c21561;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21561 c21561 = (C21561) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21561.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f26806a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f26807b.f26839h.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsViewModel$observeReferrals$1(C2160a c2160a, Continuation continuation) {
        super(2, continuation);
        this.f26805b = c2160a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InviteFriendsViewModel$observeReferrals$1(this.f26805b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InviteFriendsViewModel$observeReferrals$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26804a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2160a c2160a = this.f26805b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c2160a.f26833b.f16544a.f63359K, true, new String[]{"ReferralEntity"}, new qv7(5)));
            C21561 c21561 = new C21561(c2160a, null);
            this.f26804a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c21561, this) == coroutineSingletons) {
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
