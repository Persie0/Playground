package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Language;
import com.lingq.shared.network.requests.RequestAppUsageStat;
import com.lingq.shared.network.requests.RequestLanguageContextEmailNotification;
import com.lingq.shared.network.requests.RequestLanguageContextRepetitionLingqsNotification;
import com.lingq.shared.network.requests.RequestLanguageContextSiteNotification;
import com.lingq.shared.network.requests.RequestLanguageProgress;
import com.lingq.shared.network.result.ResultLanguageContext;
import com.lingq.shared.network.result.ResultLanguageProgress;
import com.lingq.shared.network.result.ResultLanguageProgressChartEntry;
import com.lingq.shared.network.result.ResultStreak;
import com.lingq.shared.network.result.ResultStudyStats;
import com.lingq.shared.network.result.Results;
import java.util.List;
import java.util.Set;
import jp.C6553u;
import kotlin.Metadata;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7426c;
import p250lp.InterfaceC7428e;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7439p;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: wh.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J+\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\u001a2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010#\u001a\u00020\"H§@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b)\u0010(J1\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010*H§@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J1\u00102\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u00101\u001a\u0004\u0018\u000100H§@ø\u0001\u0000¢\u0006\u0004\b2\u00103J1\u00106\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u00105\u001a\u0004\u0018\u000104H§@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u0002082\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b9\u0010(J\u001f\u0010:\u001a\u0002082\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b:\u0010(J1\u0010=\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010;H§@ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m13365d2 = {"Lwh/e;", "", "", "Lcom/lingq/entity/Language;", "j", "(Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultLanguageContext;", "a", "", "id", "", "intensity", "f", "(Ljava/lang/Integer;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "", "tabs", "e", "(Ljava/lang/Integer;Ljava/util/Set;Lwl/c;)Ljava/lang/Object;", "m", "(Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "levels", "h", "(Ljava/lang/Integer;Ljava/util/List;Lwl/c;)Ljava/lang/Object;", "language", "statsInterval", "Lcom/lingq/shared/network/result/ResultLanguageProgress;", "q", "(Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "period", "metric", "Lcom/lingq/shared/network/result/ResultLanguageProgressChartEntry;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestLanguageProgress;", "requestLanguageProgress", "o", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestLanguageProgress;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultStudyStats;", "b", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "p", "Lcom/lingq/shared/network/requests/RequestLanguageContextRepetitionLingqsNotification;", "requestLanguageContextRepetitionLingqsNotification", "Ljp/u;", "Lsl/e;", "c", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestLanguageContextRepetitionLingqsNotification;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestLanguageContextEmailNotification;", "requestLanguageContextEmailNotification", "i", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestLanguageContextEmailNotification;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/requests/RequestLanguageContextSiteNotification;", "languageContextNotification", "n", "(Ljava/lang/Integer;Lcom/lingq/shared/network/requests/RequestLanguageContextSiteNotification;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultStreak;", "l", "g", "Lcom/lingq/shared/network/requests/RequestAppUsageStat;", "requestAppUsageStat", "d", "(Ljava/lang/String;Lcom/lingq/shared/network/requests/RequestAppUsageStat;Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9937e {
    @InterfaceC7429f("api/v2/contexts/")
    /* JADX INFO: renamed from: a */
    Object m18442a(InterfaceC9968c<? super Results<ResultLanguageContext>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/study-stats/")
    /* JADX INFO: renamed from: b */
    Object m18443b(@InterfaceC7442s("language") String str, InterfaceC9968c<? super ResultStudyStats> interfaceC9968c);

    @InterfaceC7437n("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: c */
    Object m18444c(@InterfaceC7442s("id") Integer num, @InterfaceC7424a RequestLanguageContextRepetitionLingqsNotification requestLanguageContextRepetitionLingqsNotification, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/progress/")
    /* JADX INFO: renamed from: d */
    Object m18445d(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestAppUsageStat requestAppUsageStat, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7438o("api/v2/contexts/{id}/tabs/")
    /* JADX INFO: renamed from: e */
    Object m18446e(@InterfaceC7442s("id") Integer num, @InterfaceC7426c("tabs") Set<String> set, InterfaceC9968c<? super Set<String>> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7439p("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: f */
    Object m18447f(@InterfaceC7442s("id") Integer num, @InterfaceC7426c("intense") String str, InterfaceC9968c<? super ResultLanguageContext> interfaceC9968c);

    @InterfaceC7437n("api/v2/{language}/streak/")
    /* JADX INFO: renamed from: g */
    Object m18448g(@InterfaceC7442s("language") String str, InterfaceC9968c<? super ResultStreak> interfaceC9968c);

    @InterfaceC7428e
    @InterfaceC7439p("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: h */
    Object m18449h(@InterfaceC7442s("id") Integer num, @InterfaceC7426c("feed_levels") List<String> list, InterfaceC9968c<? super ResultLanguageContext> interfaceC9968c);

    @InterfaceC7437n("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: i */
    Object m18450i(@InterfaceC7442s("id") Integer num, @InterfaceC7424a RequestLanguageContextEmailNotification requestLanguageContextEmailNotification, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7429f("api/v2/languages/")
    /* JADX INFO: renamed from: j */
    Object m18451j(InterfaceC9968c<? super List<Language>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/progress/chart_data/")
    /* JADX INFO: renamed from: k */
    Object m18452k(@InterfaceC7442s("language") String str, @InterfaceC7443t("period") String str2, @InterfaceC7443t("metric") String str3, InterfaceC9968c<? super List<ResultLanguageProgressChartEntry>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/streak/")
    /* JADX INFO: renamed from: l */
    Object m18453l(@InterfaceC7442s("language") String str, InterfaceC9968c<? super ResultStreak> interfaceC9968c);

    @InterfaceC7429f("api/v2/contexts/{id}/tabs/")
    /* JADX INFO: renamed from: m */
    Object m18454m(@InterfaceC7442s("id") Integer num, InterfaceC9968c<? super Set<String>> interfaceC9968c);

    @InterfaceC7437n("api/v2/contexts/{id}/")
    /* JADX INFO: renamed from: n */
    Object m18455n(@InterfaceC7442s("id") Integer num, @InterfaceC7424a RequestLanguageContextSiteNotification requestLanguageContextSiteNotification, InterfaceC9968c<? super C6553u<C9072e>> interfaceC9968c);

    @InterfaceC7438o("api/v2/{language}/progress/")
    /* JADX INFO: renamed from: o */
    Object m18456o(@InterfaceC7442s("language") String str, @InterfaceC7424a RequestLanguageProgress requestLanguageProgress, InterfaceC9968c<? super ResultLanguageProgress> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/cards/tags/")
    /* JADX INFO: renamed from: p */
    Object m18457p(@InterfaceC7442s("language") String str, InterfaceC9968c<? super List<String>> interfaceC9968c);

    @InterfaceC7429f("api/v2/{language}/progress")
    /* JADX INFO: renamed from: q */
    Object m18458q(@InterfaceC7442s("language") String str, @InterfaceC7443t("interval") String str2, InterfaceC9968c<? super ResultLanguageProgress> interfaceC9968c);
}
