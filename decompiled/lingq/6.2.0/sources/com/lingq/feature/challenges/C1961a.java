package com.lingq.feature.challenges;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3489q9;
import p000.bh4;
import p000.fa4;
import p000.fr0;
import p000.gm5;
import p000.lda;
import p000.lq0;
import p000.mq0;
import p000.nq0;
import p000.o96;
import p000.oq0;
import p000.pq0;
import p000.qq0;
import p000.rq0;
import p000.vi3;
import p000.w41;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.challenges.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1961a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f24490b;

    public /* synthetic */ C1961a(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f24489a = i;
        this.f24490b = abstractComponentCallbacksC0635c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        fr0 fr0Var;
        Set set;
        Object value3;
        fr0 fr0Var2;
        Object next;
        Pair pair;
        String str;
        String lowerCase;
        Object value4;
        int i = this.f24489a;
        xfa xfaVar = xfa.f68157a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f24490b;
        switch (i) {
            case 0:
                ChallengeDetailsFragment challengeDetailsFragment = (ChallengeDetailsFragment) abstractComponentCallbacksC0635c;
                rq0 rq0Var = (rq0) obj;
                bh4[] bh4VarArr = ChallengeDetailsFragment.f24346G0;
                rq0Var.getClass();
                if (rq0Var instanceof mq0) {
                    C1962b c1962bM8806R0 = challengeDetailsFragment.m8806R0();
                    LeaderboardMetric leaderboardMetric = ((mq0) rq0Var).f51717a;
                    c1962bM8806R0.getClass();
                    C3244l c3244l = c1962bM8806R0.f24503n;
                    if (leaderboardMetric == c3244l.getValue()) {
                        return xfaVar;
                    }
                    c3244l.m15572j(null, leaderboardMetric);
                    C3244l c3244l2 = c1962bM8806R0.f24509t;
                    do {
                        value4 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value4, fr0.m12004a((fr0) value4, null, null, null, null, null, null, null, null, null, leaderboardMetric, 2047)));
                    c1962bM8806R0.m8809W2();
                    c1962bM8806R0.m8810X2();
                    return xfaVar;
                }
                if (rq0Var instanceof lq0) {
                    C1962b c1962bM8806R1 = challengeDetailsFragment.m8806R0();
                    String str2 = ((lq0) rq0Var).f49996a;
                    c1962bM8806R1.getClass();
                    C3244l c3244l3 = c1962bM8806R1.f24506q;
                    if (str2.equals(c3244l3.getValue())) {
                        return xfaVar;
                    }
                    c3244l3.m15572j(null, str2);
                    C3244l c3244l4 = c1962bM8806R1.f24509t;
                    do {
                        value3 = c3244l4.getValue();
                        fr0Var2 = (fr0) value3;
                        Iterator it = fr0Var2.f39512j.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                lowerCase = ((String) ((Pair) next).f47623a).toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                next = null;
                            }
                            pair = (Pair) next;
                            if (pair != null || (str = (String) pair.f47624b) == null) {
                                str = fr0Var2.f39513k;
                            }
                        } while (!lowerCase.equals(str2));
                        pair = (Pair) next;
                        if (pair != null) {
                            str = fr0Var2.f39513k;
                        } else {
                            str = fr0Var2.f39513k;
                        }
                    } while (!c3244l4.m15570h(value3, fr0.m12004a(fr0Var2, null, null, null, null, null, null, null, null, str, null, 3071)));
                    c1962bM8806R1.m8809W2();
                    c1962bM8806R1.m8810X2();
                    return xfaVar;
                }
                if (rq0Var instanceof pq0) {
                    C1962b c1962bM8806R2 = challengeDetailsFragment.m8806R0();
                    String str3 = ((pq0) rq0Var).f56645a;
                    c1962bM8806R2.getClass();
                    str3.getClass();
                    C3244l c3244l5 = c1962bM8806R2.f24509t;
                    do {
                        value2 = c3244l5.getValue();
                        fr0Var = (fr0) value2;
                        set = fr0Var.f39510h;
                    } while (!c3244l5.m15570h(value2, fr0.m12004a(fr0Var, null, null, null, null, null, null, null, set.contains(str3) ? AbstractC3489q9.m19793w(set, str3) : AbstractC3489q9.m19765B(set, str3), null, null, 3967)));
                    c1962bM8806R2.m8809W2();
                    c1962bM8806R2.m8810X2();
                    return xfaVar;
                }
                if (rq0Var instanceof nq0) {
                    C1962b c1962bM8806R3 = challengeDetailsFragment.m8806R0();
                    int i2 = ((nq0) rq0Var).f53112a;
                    c1962bM8806R3.getClass();
                    AbstractC1263a.m7047b(lda.m16103C(c1962bM8806R3), c1962bM8806R3.f24499j, "removeBookChallengeBook", new ChallengeDetailsViewModel$removeBook$1(c1962bM8806R3, i2, null));
                    return xfaVar;
                }
                if (rq0Var.equals(oq0.f54714a)) {
                    C3244l c3244l6 = challengeDetailsFragment.m8806R0().f24509t;
                    do {
                        value = c3244l6.getValue();
                    } while (!c3244l6.m15570h(value, fr0.m12004a((fr0) value, null, null, null, null, null, null, null, null, null, null, 3839)));
                    return xfaVar;
                }
                if (!rq0Var.equals(qq0.f58038a)) {
                    gm5.m12750e();
                    return null;
                }
                C1962b c1962bM8806R4 = challengeDetailsFragment.m8806R0();
                c1962bM8806R4.getClass();
                wfb.m23926u(lda.m16103C(c1962bM8806R4), c1962bM8806R4.f24499j, null, new ChallengeDetailsViewModel$updateJoin$1(c1962bM8806R4, null), 2);
                return xfaVar;
            default:
                ChallengesFragment challengesFragment = (ChallengesFragment) abstractComponentCallbacksC0635c;
                Challenge challenge = (Challenge) obj;
                bh4[] bh4VarArr2 = ChallengesFragment.f24437G0;
                challenge.getClass();
                if (fa4.m11650l(challenge.f18859g, ChallengeType.BookChallenge.getValue())) {
                    w41 w41Var = challengesFragment.f24441F0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var.m23737z(new o96(challenge.f18862j));
                } else {
                    C1986f c1986f = (C1986f) challengesFragment.f24439D0.getValue();
                    wfb.m23926u(lda.m16103C(c1986f), c1986f.f24765f, null, new ChallengesViewModel$joinChallenge$1(c1986f, challenge, null), 2);
                }
                return xfaVar;
        }
    }
}
