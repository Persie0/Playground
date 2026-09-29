package com.lingq.feature.more;

import com.lingq.core.data.repository.C1304t;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.InviteFriendsViewModel$fetchReferrals$1", m4291f = "InviteFriendsViewModel.kt", m4292l = {82}, m4293m = "invokeSuspend", m4294v = 2)
final class InviteFriendsViewModel$fetchReferrals$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2160a f26803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsViewModel$fetchReferrals$1(C2160a c2160a, Continuation continuation) {
        super(2, continuation);
        this.f26803b = c2160a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InviteFriendsViewModel$fetchReferrals$1(this.f26803b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InviteFriendsViewModel$fetchReferrals$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26802a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1304t c1304t = this.f26803b.f26833b;
            this.f26802a = 1;
            if (c1304t.m7369b(this) == coroutineSingletons) {
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
