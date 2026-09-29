package com.lingq.feature.challenges;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1288d;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeStatus;
import com.lingq.core.p012ui.challenges.ChallengeType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.a6d;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.fr0;
import p000.is0;
import p000.lda;
import p000.m83;
import p000.nn1;
import p000.ps0;
import p000.qs0;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {148}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$observableChallengeDetail$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24387b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19481 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1962b f24388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19481(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24388a = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19481(this.f24388a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19481 c19481 = (C19481) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19481.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f24388a.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, ps0.f56735a, null, null, null, null, null, null, null, null, 4093)));
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$2 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$observableChallengeDetail$1$2", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19492 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24389a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1962b f24390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19492(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24390b = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19492 c19492 = new C19492(this.f24390b, continuation);
            c19492.f24389a = obj;
            return c19492;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19492 c19492 = (C19492) create((Challenge) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19492.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            ChallengeType challengeType;
            Object value3;
            Challenge challenge = (Challenge) this.f24389a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (challenge != null) {
                String str = challenge.f18859g;
                C1962b c1962b = this.f24390b;
                nn1 nn1Var = c1962b.f24499j;
                C3244l c3244l = c1962b.f24509t;
                C3244l c3244l2 = c1962b.f24508s;
                C3244l c3244l3 = c1962b.f24507r;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, new qs0(challenge), null, null, null, null, null, null, null, null, 4093)));
                c3244l2.getClass();
                c3244l2.m15572j(null, challenge);
                Challenge challenge2 = (Challenge) c3244l2.getValue();
                if ((challenge2 != null ? a6d.m148f(challenge2) : null) == ChallengeStatus.Joined) {
                    wfb.m23926u(lda.m16103C(c1962b), nn1Var, null, new ChallengeDetailsViewModel$observableChallengeDetailStats$1(c1962b, Math.min(challenge.f18863k, challenge.f18860h), null), 2);
                } else {
                    do {
                        value2 = c3244l.getValue();
                    } while (!c3244l.m15570h(value2, fr0.m12004a((fr0) value2, null, null, is0.f44478a, null, null, null, null, null, null, null, 4091)));
                }
                if (c3244l3.getValue() == ChallengeType.Undefined) {
                    String str2 = str == null ? "" : str;
                    ChallengeType[] challengeTypeArr = (ChallengeType[]) ChallengeType.class.getEnumConstants();
                    if (challengeTypeArr != null) {
                        int length = challengeTypeArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                challengeType = null;
                                break;
                            }
                            challengeType = challengeTypeArr[i];
                            if (fa4.m11650l(challengeType.getValue(), str2)) {
                                break;
                            }
                            i++;
                        }
                        if (challengeType == null) {
                            challengeType = ChallengeType.Undefined;
                        }
                    } else {
                        challengeType = ChallengeType.Undefined;
                    }
                    c3244l3.m15571i(challengeType);
                    do {
                        value3 = c3244l.getValue();
                    } while (!c3244l.m15570h(value3, fr0.m12004a((fr0) value3, (ChallengeType) c3244l3.getValue(), null, null, null, null, null, null, null, null, null, 4094)));
                }
                if (((ChallengeType) c3244l3.getValue()).hasRank()) {
                    c1962b.m8809W2();
                    c1962b.m8810X2();
                }
                if (fa4.m11650l(str, ChallengeType.BookChallenge.getValue())) {
                    AbstractC1263a.m7047b(lda.m16103C(c1962b), nn1Var, "networkGetBadges", new ChallengeDetailsViewModel$networkGetBadges$1(c1962b, null));
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$observableChallengeDetail$1(C1962b c1962b, Continuation continuation) {
        super(2, continuation);
        this.f24387b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsViewModel$observableChallengeDetail$1(this.f24387b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsViewModel$observableChallengeDetail$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24386a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1962b c1962b = this.f24387b;
            m83 m83Var = new m83(((C1288d) c1962b.f24493d).m7146m(c1962b.f24491b.mo4589b2(), c1962b.f24500k.f67168a), new C19481(c1962b, null));
            C19492 c19492 = new C19492(c1962b, null);
            this.f24386a = 1;
            if (AbstractC3224d.m15529h(m83Var, c19492, this) == coroutineSingletons) {
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
