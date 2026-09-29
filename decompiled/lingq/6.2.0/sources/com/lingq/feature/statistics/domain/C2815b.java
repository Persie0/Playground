package com.lingq.feature.statistics.domain;

import com.lingq.core.common.AbstractC1261a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3577sk;
import p000.or0;
import p000.rl3;

/* JADX INFO: renamed from: com.lingq.feature.statistics.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2815b {
    private static final rl3 Companion = new rl3();

    /* JADX INFO: renamed from: a */
    public final or0 f33432a;

    public C2815b(or0 or0Var) {
        or0Var.getClass();
        this.f33432a = or0Var;
    }

    /* JADX INFO: renamed from: a */
    public final C3235e m9729a(String str) {
        str.getClass();
        return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new C3577sk(22, this, str), new GetChallengesStatsUseCase$invoke$2(this, str, null)), new GetChallengesStatsUseCase$invoke$3(2, null));
    }
}
