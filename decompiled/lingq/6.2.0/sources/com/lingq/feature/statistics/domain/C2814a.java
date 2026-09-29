package com.lingq.feature.statistics.domain;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3577sk;
import p000.b80;
import p000.oo4;
import p000.zg0;

/* JADX INFO: renamed from: com.lingq.feature.statistics.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2814a {

    /* JADX INFO: renamed from: a */
    public final Object f33431a;

    public C2814a(oo4 oo4Var, int i) {
        oo4Var.getClass();
        switch (i) {
            case 1:
                this.f33431a = oo4Var;
                break;
            default:
                this.f33431a = oo4Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C3235e m9726a(String str) {
        str.getClass();
        return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new C3577sk(21, this, str), new GetBadgesStatsUseCase$invoke$2(this, str, null)), new GetBadgesStatsUseCase$invoke$3(2, null));
    }

    /* JADX INFO: renamed from: b */
    public C3235e m9727b(String str, LanguageProgressInterval languageProgressInterval) {
        str.getClass();
        languageProgressInterval.getClass();
        return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new zg0(this, str, languageProgressInterval, 12), new GetWeekActivityUseCase$invoke$2(this, str, languageProgressInterval, null)), new GetWeekActivityUseCase$invoke$3(2, null));
    }

    /* JADX INFO: renamed from: c */
    public C3235e m9728c(String str, LanguageProgressPeriod languageProgressPeriod) {
        str.getClass();
        languageProgressPeriod.getClass();
        return AbstractC3224d.m15546y(AbstractC1261a.m7043b(new zg0(this, str, languageProgressPeriod, 10), new GetActivityStatsUseCase$invoke$2(this, str, languageProgressPeriod, null)), new GetActivityStatsUseCase$invoke$3(languageProgressPeriod, null));
    }

    public C2814a(b80 b80Var) {
        b80Var.getClass();
        this.f33431a = b80Var;
    }
}
