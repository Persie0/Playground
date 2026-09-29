package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.dm3;
import p000.g23;
import p000.g41;
import p000.hi8;
import p000.lda;
import p000.m58;
import p000.n83;
import p000.ns1;
import p000.tw1;
import p000.web;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1979f extends wta {

    /* JADX INFO: renamed from: b */
    public final g23 f24700b;

    /* JADX INFO: renamed from: c */
    public final hi8 f24701c;

    /* JADX INFO: renamed from: d */
    public final m58 f24702d;

    /* JADX INFO: renamed from: e */
    public final ns1 f24703e;

    /* JADX INFO: renamed from: f */
    public final C3244l f24704f;

    /* JADX INFO: renamed from: g */
    public final c18 f24705g;

    public C1979f(dm3 dm3Var, web webVar, dm3 dm3Var2, g23 g23Var, hi8 hi8Var, m58 m58Var, ns1 ns1Var) {
        this.f24700b = g23Var;
        this.f24701c = hi8Var;
        this.f24702d = m58Var;
        this.f24703e = ns1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(CupLeaderboardTab.Teams);
        this.f24704f = c3244lM17114d;
        n83 n83VarM15531j = AbstractC3224d.m15531j(dm3Var.m10472a(), webVar.m23870G(), ((C1291g) dm3Var2.f35822a).m7194g(null), c3244lM17114d, new CupTeamLeaderboardViewModel$state$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        boolean z = (2047 & 1) != 0;
        CupLeaderboardTab cupLeaderboardTab = (2047 & 2) != 0 ? CupLeaderboardTab.Teams : null;
        String str = (2047 & 4) != 0 ? null : "es";
        Integer num = (8 & 2047) != 0 ? null : 8;
        int i = (2047 & 16) != 0 ? 0 : 42;
        int i2 = 2047 & 32;
        EmptyList emptyList = EmptyList.f47638a;
        this.f24705g = AbstractC3224d.m15520B(n83VarM15531j, g41VarM16103C, c3243k, new tw1(z, cupLeaderboardTab, str, num, i, i2 != 0 ? emptyList : null, false, (2047 & 128) != 0 ? null : 73, (2047 & 256) != 0 ? null : 23, (2047 & 512) == 0, (2047 & 1024) == 0 ? null : emptyList));
        wfb.m23926u(lda.m16103C(this), null, null, new CupTeamLeaderboardViewModel$refreshTeams$1(this, null), 3);
        ns1Var.m17611b("Team Leaderboard");
    }
}
