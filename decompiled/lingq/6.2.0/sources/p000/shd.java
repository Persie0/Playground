package p000;

import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: loaded from: classes2.dex */
public abstract class shd {
    /* JADX INFO: renamed from: a */
    public static final boolean m21391a(LanguageProgressMetric languageProgressMetric) {
        languageProgressMetric.getClass();
        return languageProgressMetric == LanguageProgressMetric.KnownWords || languageProgressMetric == LanguageProgressMetric.LingQsCreated || languageProgressMetric == LanguageProgressMetric.LearnedLingQs || languageProgressMetric == LanguageProgressMetric.CoinsEarned || languageProgressMetric == LanguageProgressMetric.WordsOfReading || languageProgressMetric == LanguageProgressMetric.WrittenWords;
    }

    /* JADX INFO: renamed from: b */
    public static final LanguageProgressPeriod m21392b(LanguageProgressInterval languageProgressInterval) {
        languageProgressInterval.getClass();
        switch (bm4.f8684b[languageProgressInterval.ordinal()]) {
            case 1:
                return LanguageProgressPeriod.Today;
            case 2:
                return LanguageProgressPeriod.Today;
            case 3:
                return LanguageProgressPeriod.Last7Days;
            case 4:
                return LanguageProgressPeriod.Last14Days;
            case 5:
                return LanguageProgressPeriod.LastMonth;
            case 6:
                return LanguageProgressPeriod.Last3Months;
            case 7:
                return LanguageProgressPeriod.Last6Months;
            case 8:
                return LanguageProgressPeriod.AllTime;
            case 9:
                return LanguageProgressPeriod.AllTime;
            default:
                gm5.m12750e();
                return null;
        }
    }
}
