package com.lingq.core.domain.stats;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.oo4;

/* JADX INFO: renamed from: com.lingq.core.domain.stats.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1526a {

    /* JADX INFO: renamed from: a */
    public final Object f19984a;

    public C1526a(oo4 oo4Var, int i) {
        oo4Var.getClass();
        switch (i) {
            case 1:
                this.f19984a = oo4Var;
                break;
            default:
                this.f19984a = oo4Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C3235e m8203a(String str) {
        str.getClass();
        return AbstractC3224d.m15546y(((C1529d) this.f19984a).m8208a(), new GetStreakUseCase$invoke$1(2, null));
    }

    /* JADX INFO: renamed from: b */
    public C3235e m8204b(String str, LanguageProgressInterval languageProgressInterval) {
        str.getClass();
        languageProgressInterval.getClass();
        return AbstractC3224d.m15546y(((C1294j) ((oo4) this.f19984a)).m7234h(str, languageProgressInterval), new GetWeekActivityUseCase$invoke$1(2, null));
    }

    /* JADX INFO: renamed from: c */
    public C3235e m8205c(String str, LanguageProgressPeriod languageProgressPeriod) {
        str.getClass();
        languageProgressPeriod.getClass();
        return AbstractC3224d.m15546y(((C1294j) ((oo4) this.f19984a)).m7236j(str, languageProgressPeriod), new GetActivityStatsUseCase$invoke$1(languageProgressPeriod, null));
    }

    public C1526a(C1529d c1529d) {
        this.f19984a = c1529d;
    }
}
