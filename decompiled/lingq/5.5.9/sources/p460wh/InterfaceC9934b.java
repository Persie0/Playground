package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultChallenge;
import com.lingq.shared.network.result.ResultChallengeDetailsStats;
import com.lingq.shared.network.result.ResultChallengeJoinedStats;
import com.lingq.shared.network.result.ResultChallengeRanking;
import com.lingq.shared.network.result.Results;
import java.util.List;
import kotlin.Metadata;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;
import so.AbstractC9107y;

/* JADX INFO: renamed from: wh.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJI\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0016JW\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m13365d2 = {"Lwh/b;", "", "", "language", "", "byContext", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultChallenge;", "f", "(Ljava/lang/String;ZLwl/c;)Ljava/lang/Object;", "", "pageSize", "b", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lwl/c;)Ljava/lang/Object;", "challengeCode", "metric", "page", "Lcom/lingq/shared/network/result/ResultChallengeRanking;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lso/y;", "h", "(Ljava/lang/String;Lwl/c;)Ljava/lang/Object;", "a", "Lcom/lingq/shared/network/result/ResultChallengeJoinedStats;", "d", "", "Lcom/lingq/shared/network/result/ResultChallengeDetailsStats;", "i", "c", "sort", "", "start", "e", "(Ljava/lang/String;IIZLjava/lang/String;JLwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9934b {
    @InterfaceC7438o("api/challenges/{challengeCode}/leave/")
    /* JADX INFO: renamed from: a */
    Object m18423a(@InterfaceC7442s("challengeCode") String str, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/challenges/past_challenges/")
    /* JADX INFO: renamed from: b */
    Object m18424b(@InterfaceC7443t("language") String str, @InterfaceC7443t("page_size") Integer num, @InterfaceC7443t("by_context") Boolean bool, InterfaceC9968c<? super Results<ResultChallenge>> interfaceC9968c);

    @InterfaceC7429f("api/challenges/{challengeCode}")
    /* JADX INFO: renamed from: c */
    Object m18425c(@InterfaceC7442s("challengeCode") String str, InterfaceC9968c<? super ResultChallenge> interfaceC9968c);

    @InterfaceC7429f("api/challenges/{challengeCode}/profile_membership/")
    /* JADX INFO: renamed from: d */
    Object m18426d(@InterfaceC7442s("challengeCode") String str, InterfaceC9968c<? super ResultChallengeJoinedStats> interfaceC9968c);

    @InterfaceC7429f("api/challenges/active_challenges/")
    /* JADX INFO: renamed from: e */
    Object m18427e(@InterfaceC7443t("language") String str, @InterfaceC7443t("page") int i10, @InterfaceC7443t("page_size") int i11, @InterfaceC7443t("by_context") boolean z10, @InterfaceC7443t("sort") String str2, @InterfaceC7443t("start") long j10, InterfaceC9968c<? super Results<ResultChallenge>> interfaceC9968c);

    @InterfaceC7429f("api/challenges/active_challenges/")
    /* JADX INFO: renamed from: f */
    Object m18428f(@InterfaceC7443t("language") String str, @InterfaceC7443t("by_context") boolean z10, InterfaceC9968c<? super Results<ResultChallenge>> interfaceC9968c);

    @InterfaceC7429f("api/v2/challenges/{challengeCode}/ranking/")
    /* JADX INFO: renamed from: g */
    Object m18429g(@InterfaceC7442s("challengeCode") String str, @InterfaceC7443t("metric") String str2, @InterfaceC7443t("language") String str3, @InterfaceC7443t("page") Integer num, InterfaceC9968c<? super Results<ResultChallengeRanking>> interfaceC9968c);

    @InterfaceC7438o("api/challenges/{challengeCode}/signup/")
    /* JADX INFO: renamed from: h */
    Object m18430h(@InterfaceC7442s("challengeCode") String str, InterfaceC9968c<? super AbstractC9107y> interfaceC9968c);

    @InterfaceC7429f("api/challenges/{challengeCode}/stats/")
    /* JADX INFO: renamed from: i */
    Object m18431i(@InterfaceC7442s("challengeCode") String str, InterfaceC9968c<? super List<ResultChallengeDetailsStats>> interfaceC9968c);
}
