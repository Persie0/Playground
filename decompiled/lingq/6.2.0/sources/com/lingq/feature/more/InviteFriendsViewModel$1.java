package com.lingq.feature.more;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.more.InviteFriendsViewModel$1", m4291f = "InviteFriendsViewModel.kt", m4292l = {64}, m4293m = "invokeSuspend", m4294v = 2)
final class InviteFriendsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C3244l f26797a;

    /* JADX INFO: renamed from: b */
    public int f26798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2160a f26799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsViewModel$1(C2160a c2160a, Continuation continuation) {
        super(2, continuation);
        this.f26799c = c2160a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InviteFriendsViewModel$1(this.f26799c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InviteFriendsViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3244l c3244l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26798b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2160a c2160a = this.f26799c;
            C3244l c3244l2 = c2160a.f26835d;
            qm7 qm7Var = ((C1369b) c2160a.f26834c).f18480m;
            this.f26797a = c3244l2;
            this.f26798b = 1;
            obj = AbstractC3224d.m15541t(qm7Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3244l = c3244l2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3244l = this.f26797a;
            AbstractC3193b.m15359b(obj);
        }
        String str = "https://www.lingq.com/?referral=" + ((Profile) obj).f19654c;
        c3244l.getClass();
        c3244l.m15572j(null, str);
        return xfa.f68157a;
    }
}
