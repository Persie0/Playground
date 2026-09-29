package com.lingq.feature.challenges.cup;

import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.gm5;
import p000.hw1;
import p000.iw1;
import p000.jw1;
import p000.lda;
import p000.uw1;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class CupTeamLeaderboardScreenKt$CupTeamLeaderboardRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        jw1 jw1Var = (jw1) obj;
        jw1Var.getClass();
        C1979f c1979f = (C1979f) this.f47704b;
        C3244l c3244l = c1979f.f24704f;
        if (jw1Var.equals(hw1.f43030a)) {
            int i = uw1.f64457a[((CupLeaderboardTab) c3244l.getValue()).ordinal()];
            if (i == 1) {
                wfb.m23926u(lda.m16103C(c1979f), null, null, new CupTeamLeaderboardViewModel$refreshTeams$1(c1979f, null), 3);
            } else {
                if (i != 2) {
                    gm5.m12750e();
                    return null;
                }
                wfb.m23926u(lda.m16103C(c1979f), null, null, new CupTeamLeaderboardViewModel$loadGlobalContributors$1(c1979f, null), 3);
            }
        } else {
            if (!(jw1Var instanceof iw1)) {
                gm5.m12750e();
                return null;
            }
            CupLeaderboardTab cupLeaderboardTab = ((iw1) jw1Var).f44697a;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, cupLeaderboardTab));
            if (cupLeaderboardTab == CupLeaderboardTab.Global) {
                c1979f.f24703e.m17611b("Top 50 Contributors");
                wfb.m23926u(lda.m16103C(c1979f), null, null, new CupTeamLeaderboardViewModel$loadGlobalContributors$1(c1979f, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
