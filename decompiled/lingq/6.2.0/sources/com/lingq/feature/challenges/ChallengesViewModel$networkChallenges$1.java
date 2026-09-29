package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.x13;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$networkChallenges$1", m4291f = "ChallengesViewModel.kt", m4292l = {128}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$networkChallenges$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1986f f24479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$networkChallenges$1(C1986f c1986f, Continuation continuation) {
        super(1, continuation);
        this.f24479b = c1986f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengesViewModel$networkChallenges$1(this.f24479b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengesViewModel$networkChallenges$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24478a;
        xfa xfaVar = xfa.f68157a;
        C1986f c1986f = this.f24479b;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            x13 x13Var = c1986f.f24763d;
            String strMo4589b2 = c1986f.f24761b.mo4589b2();
            this.f24478a = 1;
            Object objM7139f = ((C1288d) x13Var.f67627a).m7139f(strMo4589b2, "bookJourney", this);
            if (objM7139f != coroutineSingletons) {
                objM7139f = xfaVar;
            }
            return objM7139f == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception unused) {
            C3244l c3244l = c1986f.f24770k;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.FALSE));
            C3244l c3244l2 = c1986f.f24769j;
            do {
                value2 = c3244l2.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        }
    }
}
