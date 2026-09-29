package p000;

import com.lingq.core.network.api.requests.RequestAppUsageStat;
import com.lingq.core.network.api.requests.RequestDailyStreakTarget;
import com.lingq.core.network.api.requests.RequestFeedLevels;
import com.lingq.core.network.api.requests.RequestLanguageContextEmailNotification;
import com.lingq.core.network.api.requests.RequestLanguageContextRepetitionLingqsNotification;
import com.lingq.core.network.api.requests.RequestLanguageContextSiteNotification;
import com.lingq.core.network.api.requests.RequestLanguageProgress;
import com.lingq.core.network.api.requests.RequestTopics;
import com.lingq.core.network.api.result.ResultLanguage;
import com.lingq.core.network.api.result.ResultLanguageContext;
import com.lingq.core.network.api.result.ResultLanguageProgress;
import com.lingq.core.network.api.result.ResultLanguageProgressChartEntry;
import com.lingq.core.network.api.result.ResultLanguageStats;
import com.lingq.core.network.api.result.ResultStatsCalendar;
import com.lingq.core.network.api.result.ResultStreak;
import com.lingq.core.network.api.result.ResultStudyStats;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface bn4 {
    @ay1("api/v2/languages/{id}/")
    /* JADX INFO: renamed from: a */
    Object m3886a(@e57("id") int i, Continuation<? super xfa> continuation);

    @g17("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: b */
    Object m3887b(@e57("id") Integer num, @be0 RequestLanguageContextEmailNotification requestLanguageContextEmailNotification, Continuation<? super i88<xfa>> continuation);

    @j17("api/v2/{language}/progress/{lessonId}/")
    /* JADX INFO: renamed from: c */
    Object m3888c(@e57("language") String str, @e57("lessonId") int i, @be0 RequestAppUsageStat requestAppUsageStat, Continuation<? super i88<xfa>> continuation);

    @g17("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: d */
    Object m3889d(@e57("id") Integer num, @be0 RequestDailyStreakTarget requestDailyStreakTarget, Continuation<? super ResultLanguageContext> continuation);

    @j17("api/v2/contexts/{id}/tabs/")
    /* JADX INFO: renamed from: e */
    Object m3890e(@e57("id") Integer num, @be0 RequestTopics requestTopics, Continuation<? super Set<String>> continuation);

    @g17("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: f */
    Object m3891f(@e57("id") Integer num, @be0 RequestFeedLevels requestFeedLevels, Continuation<? super ResultLanguageContext> continuation);

    @mj3("api/v2/contexts/{id}")
    /* JADX INFO: renamed from: g */
    Object m3892g(@e57("id") Integer num, Continuation<? super ResultLanguageContext> continuation);

    @g17("api/v2/{language}/streak/")
    /* JADX INFO: renamed from: h */
    Object m3893h(@e57("language") String str, Continuation<? super ResultStreak> continuation);

    @mj3("api/v2/languages/")
    /* JADX INFO: renamed from: i */
    Object m3894i(Continuation<? super List<ResultLanguage>> continuation);

    @mj3("api/v2/contexts/")
    /* JADX INFO: renamed from: j */
    Object m3895j(Continuation<? super Results<ResultLanguageContext>> continuation);

    @mj3("api/v3/{language}/progress/stats/")
    /* JADX INFO: renamed from: k */
    Object m3896k(@e57("language") String str, @sp7("period") String str2, Continuation<? super ResultLanguageStats> continuation);

    @mj3("api/v3/{language}/progress/chart_data/")
    /* JADX INFO: renamed from: l */
    Object m3897l(@e57("language") String str, @sp7("period") String str2, @sp7("metric") String str3, Continuation<? super List<ResultLanguageProgressChartEntry>> continuation);

    @mj3("api/v2/{language}/streak/")
    /* JADX INFO: renamed from: m */
    Object m3898m(@e57("language") String str, Continuation<? super ResultStreak> continuation);

    @g17("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: n */
    Object m3899n(@e57("id") Integer num, @be0 RequestLanguageContextRepetitionLingqsNotification requestLanguageContextRepetitionLingqsNotification, Continuation<? super i88<xfa>> continuation);

    @g17("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: o */
    Object m3900o(@e57("id") Integer num, @be0 RequestLanguageContextSiteNotification requestLanguageContextSiteNotification, Continuation<? super i88<xfa>> continuation);

    @mj3("api/v2/{language}/cards/tags/")
    /* JADX INFO: renamed from: p */
    Object m3901p(@e57("language") String str, Continuation<? super List<String>> continuation);

    @j17("api/v2/{language}/progress/")
    /* JADX INFO: renamed from: q */
    Object m3902q(@e57("language") String str, @be0 RequestLanguageProgress requestLanguageProgress, Continuation<? super ResultLanguageProgress> continuation);

    @mj3("api/v2/{language}/study-stats/")
    /* JADX INFO: renamed from: r */
    Object m3903r(@e57("language") String str, Continuation<? super ResultStudyStats> continuation);

    @j17("api/v2/{language}/progress/")
    /* JADX INFO: renamed from: s */
    Object m3904s(@e57("language") String str, @be0 RequestAppUsageStat requestAppUsageStat, Continuation<? super i88<xfa>> continuation);

    @mj3("api/v2/{language}/streak/stats/")
    /* JADX INFO: renamed from: t */
    Object m3905t(@e57("language") String str, @sp7("start_date") String str2, @sp7("end_date") String str3, Continuation<? super ResultStatsCalendar> continuation);

    @mj3("api/v2/{language}/progress")
    /* JADX INFO: renamed from: u */
    Object m3906u(@e57("language") String str, @sp7("interval") String str2, Continuation<? super ResultLanguageProgress> continuation);
}
