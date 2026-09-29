package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import com.lingq.core.domain.model.challenge.Challenge;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.or0;
import p000.ue4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$joinChallenge$1", m4291f = "ChallengesViewModel.kt", m4292l = {138}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$joinChallenge$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1986f f24476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Challenge f24477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$joinChallenge$1(C1986f c1986f, Challenge challenge, Continuation continuation) {
        super(2, continuation);
        this.f24476b = c1986f;
        this.f24477c = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengesViewModel$joinChallenge$1(this.f24476b, this.f24477c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengesViewModel$joinChallenge$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24475a;
        xfa xfaVar = xfa.f68157a;
        C1986f c1986f = this.f24476b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ue4 ue4Var = c1986f.f24764e;
            String strMo4589b2 = c1986f.f24761b.mo4589b2();
            this.f24475a = 1;
            or0 or0Var = ue4Var.f63808a;
            Challenge challenge = this.f24477c;
            Object objM7135b = ((C1288d) or0Var).m7135b(strMo4589b2, challenge.f18854b, challenge.f18859g, "all_members", this);
            if (objM7135b != coroutineSingletons) {
                objM7135b = xfaVar;
            }
            if (objM7135b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c1986f.f24768i;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.TRUE));
        return xfaVar;
    }
}
