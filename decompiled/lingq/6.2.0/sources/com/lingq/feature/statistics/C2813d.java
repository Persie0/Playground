package com.lingq.feature.statistics;

import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$StatDetail;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.p012ui.challenges.ChallengeType;
import p000.fa4;
import p000.hm5;
import p000.ip4;
import p000.lda;
import p000.o96;
import p000.p96;
import p000.w41;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.statistics.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2813d implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f33398b;

    public /* synthetic */ C2813d(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f33397a = i;
        this.f33398b = abstractComponentCallbacksC0635c;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33397a;
        xfa xfaVar = xfa.f68157a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f33398b;
        switch (i) {
            case 0:
                LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj;
                double dDoubleValue = ((Double) obj2).doubleValue();
                languageProgressMetric.getClass();
                C2817e c2817eM9717d0 = ((LanguageStatsUpdateFragment) abstractComponentCallbacksC0635c).m9717d0();
                int i2 = ip4.f44394a[((LanguageProgressPeriod) c2817eM9717d0.f33454t.getValue()).ordinal()];
                LanguageProgressInterval languageProgressInterval = (i2 == 1 || i2 != 2) ? LanguageProgressInterval.Today : LanguageProgressInterval.AllTime;
                wfb.m23926u(lda.m16103C(c2817eM9717d0), null, null, new LanguageStatsUpdateViewModel$addToStat$1(c2817eM9717d0, languageProgressInterval, languageProgressMetric, dDoubleValue, null), 3);
                return xfaVar;
            case 1:
                LanguageStatsUpdateFragment languageStatsUpdateFragment = (LanguageStatsUpdateFragment) abstractComponentCallbacksC0635c;
                Challenge challenge = (Challenge) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                challenge.getClass();
                String str = challenge.f18854b;
                hm5 hm5Var = languageStatsUpdateFragment.f33225D0;
                if (hm5Var == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                if (!zBooleanValue) {
                    w41 w41VarM9716c0 = languageStatsUpdateFragment.m9716c0();
                    String str2 = challenge.f18859g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    w41VarM9716c0.m23737z(new p96(str, str2));
                } else if (fa4.m11650l(str, ChallengeType.BookChallenge.getValue())) {
                    languageStatsUpdateFragment.m9716c0().m23737z(new o96(challenge.f18862j));
                } else {
                    C2817e c2817eM9717d1 = languageStatsUpdateFragment.m9717d0();
                    wfb.m23926u(lda.m16103C(c2817eM9717d1), c2817eM9717d1.f33438d, null, new LanguageStatsUpdateViewModel$joinChallenge$1(c2817eM9717d1, challenge, null), 2);
                }
                return xfaVar;
            default:
                LanguageProgressMetric languageProgressMetric2 = (LanguageProgressMetric) obj;
                double dDoubleValue2 = ((Double) obj2).doubleValue();
                languageProgressMetric2.getClass();
                C2812c c2812c = (C2812c) ((LanguageStatsDetailsFragment) abstractComponentCallbacksC0635c).f33170B0.getValue();
                wfb.m23926u(lda.m16103C(c2812c), null, null, new LanguageStatsDetailsViewModel$addToStat$1(c2812c, LanguageProgressInterval.LastWeek, languageProgressMetric2, dDoubleValue2, null), 3);
                return xfaVar;
        }
    }
}
