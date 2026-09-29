package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.ef0;
import p000.fr0;
import p000.or0;
import p000.vi3;
import p000.vqb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$networkGetChallenge$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {312}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$networkGetChallenge$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$networkGetChallenge$1(C1962b c1962b, Continuation continuation) {
        super(1, continuation);
        this.f24383b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengeDetailsViewModel$networkGetChallenge$1(this.f24383b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengeDetailsViewModel$networkGetChallenge$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7140g;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24382a;
        C1962b c1962b = this.f24383b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vqb vqbVar = c1962b.f24496g;
                String strMo4589b2 = c1962b.f24491b.mo4589b2();
                String str = c1962b.f24500k.f67168a;
                this.f24382a = 1;
                objM7140g = ((C1288d) ((or0) vqbVar.f65802b)).m7140g(strMo4589b2, str, this);
                if (objM7140g == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM7140g = obj;
            }
            ef0 ef0Var = (ef0) objM7140g;
            C3244l c3244l = c1962b.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, null, null, ef0Var, null, null, null, null, 4063)));
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
