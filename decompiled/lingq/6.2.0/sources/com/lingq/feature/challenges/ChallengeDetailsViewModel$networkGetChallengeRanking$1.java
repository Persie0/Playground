package com.lingq.feature.challenges;

import com.lingq.core.data.repository.C1288d;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fr0;
import p000.kr0;
import p000.lr0;
import p000.or0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$networkGetChallengeRanking$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {252}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$networkGetChallengeRanking$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f24384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$networkGetChallengeRanking$1(C1962b c1962b, Continuation continuation) {
        super(1, continuation);
        this.f24385b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChallengeDetailsViewModel$networkGetChallengeRanking$1(this.f24385b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChallengeDetailsViewModel$networkGetChallengeRanking$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM7141h;
        Object value2;
        ChallengeDetailsViewModel$networkGetChallengeRanking$1 challengeDetailsViewModel$networkGetChallengeRanking$1 = this;
        C1962b c1962b = challengeDetailsViewModel$networkGetChallengeRanking$1.f24385b;
        C3244l c3244l = c1962b.f24507r;
        C3244l c3244l2 = c1962b.f24503n;
        C3244l c3244l3 = c1962b.f24509t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = challengeDetailsViewModel$networkGetChallengeRanking$1.f24384a;
        kr0 kr0Var = kr0.f48354a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                while (true) {
                    Object value3 = c3244l3.getValue();
                    if (c3244l3.m15570h(value3, fr0.m12004a((fr0) value3, null, null, null, lr0.f50025a, null, null, null, null, null, null, 4087))) {
                        break;
                    }
                    challengeDetailsViewModel$networkGetChallengeRanking$1 = this;
                }
                or0 or0Var = c1962b.f24493d;
                String strMo4589b2 = c1962b.f24491b.mo4589b2();
                String str = c1962b.f24500k.f67168a;
                ((ChallengeType) c3244l.getValue()).getValue();
                String metric = ((ChallengeType) c3244l.getValue()).getMetric();
                String key = c3244l2.getValue() == LeaderboardMetric.Following ? ((LeaderboardMetric) c3244l2.getValue()).getKey() : null;
                String str2 = c3244l2.getValue() == LeaderboardMetric.Country ? (String) c1962b.f24506q.getValue() : null;
                Set set = ((fr0) c3244l3.getValue()).m12005b() ? ((fr0) c3244l3.getValue()).f39510h : null;
                challengeDetailsViewModel$networkGetChallengeRanking$1.f24384a = 1;
                objM7141h = ((C1288d) or0Var).m7141h(strMo4589b2, str, metric, key, str2, set, challengeDetailsViewModel$networkGetChallengeRanking$1);
                if (objM7141h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM7141h = obj;
            }
            if (((Number) objM7141h).intValue() == 0) {
                do {
                    value2 = c3244l3.getValue();
                } while (!c3244l3.m15570h(value2, fr0.m12004a((fr0) value2, null, null, null, kr0Var, null, null, null, null, null, null, 4087)));
            }
        } catch (Exception unused) {
            do {
                value = c3244l3.getValue();
            } while (!c3244l3.m15570h(value, fr0.m12004a((fr0) value, null, null, null, kr0Var, null, null, null, null, null, null, 4087)));
        }
        return xfa.f68157a;
    }
}
