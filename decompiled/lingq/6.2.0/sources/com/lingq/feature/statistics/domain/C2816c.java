package com.lingq.feature.statistics.domain;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.stats.C1529d;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3539rk;
import p000.oo4;

/* JADX INFO: renamed from: com.lingq.feature.statistics.domain.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2816c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33433a;

    /* JADX INFO: renamed from: b */
    public final oo4 f33434b;

    /* JADX INFO: renamed from: c */
    public final C1529d f33435c;

    public C2816c(oo4 oo4Var, C1529d c1529d, int i) {
        this.f33433a = i;
        oo4Var.getClass();
        switch (i) {
            case 2:
                this.f33434b = oo4Var;
                this.f33435c = c1529d;
                break;
            default:
                this.f33434b = oo4Var;
                this.f33435c = c1529d;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C3228h m9730a(String str) {
        str.getClass();
        return new C3228h(AbstractC1261a.m7043b(new C3539rk(this, 21), new GetStreakWeekUseCase$invoke$streakFlow$2(this, str, null)), ((C1294j) this.f33434b).m7237k(str), new GetStreakWeekUseCase$invoke$1(3, null));
    }

    /* JADX INFO: renamed from: b */
    public C3235e m9731b(String str) {
        int i = this.f33433a;
        str.getClass();
        switch (i) {
            case 0:
                return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new C3539rk(this, 19), new GetCoinsBalanceUseCase$invoke$2(this, str, null)), new GetCoinsBalanceUseCase$invoke$3(2, null));
            default:
                return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new C3539rk(this, 20), new GetStreakUseCase$invoke$2(this, str, null)), new GetStreakUseCase$invoke$3(2, null));
        }
    }

    public C2816c(oo4 oo4Var, C1529d c1529d) {
        this.f33433a = 0;
        oo4Var.getClass();
        this.f33435c = c1529d;
        this.f33434b = oo4Var;
    }
}
