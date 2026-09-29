package p000;

import com.lingq.core.network.api.requests.RequestBookChallengeJoin;
import com.lingq.core.network.api.result.ResultBookChallengeBadges;
import com.lingq.core.network.api.result.ResultChallenge;
import com.lingq.core.network.api.result.ResultChallengeRanking;
import com.lingq.core.network.api.result.ResultJoinedChallengeStat;
import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface sr0 {
    @mj3("api/v3/challenges/{challengeCode}/ranking/")
    /* JADX INFO: renamed from: a */
    Object m21656a(@e57("challengeCode") String str, @sp7("language") List<String> list, @sp7("page") int i, @sp7("page_size") int i2, @sp7("metric") String str2, @sp7("members") String str3, @sp7("country") String str4, Continuation<? super Results<ResultChallengeRanking>> continuation);

    @j17("api/v3/challenges/{challengeCode}/leave/")
    /* JADX INFO: renamed from: b */
    Object m21657b(@e57("challengeCode") String str, Continuation<? super m88> continuation);

    @mj3("api/v3/challenges/book_journey/participant-badges/")
    /* JADX INFO: renamed from: e */
    Object m21658e(@sp7("page") int i, @sp7("page_size") int i2, @sp7("sort") String str, Continuation<? super Results<ResultBookChallengeBadges>> continuation);

    @mj3("api/v3/challenges/{challengeCode}/participant/")
    /* JADX INFO: renamed from: g */
    Object m21659g(@e57("challengeCode") String str, @sp7("upd_participant") boolean z, Continuation<? super ResultJoinedChallengeStat> continuation);

    @j17("api/v3/challenges/book_journey/join/")
    /* JADX INFO: renamed from: h */
    Object m21660h(@be0 RequestBookChallengeJoin requestBookChallengeJoin, Continuation<? super m88> continuation);

    @mj3("api/v3/challenges/")
    /* JADX INFO: renamed from: i */
    Object m21661i(@sp7("lang") String str, @sp7("contextual") boolean z, @sp7("page") int i, @sp7("page_size") int i2, @sp7("sort") String str2, @sp7("status") String str3, @sp7("status") String str4, @sp7("start") String str5, Continuation<? super Results<ResultChallenge>> continuation);

    @mj3("api/v3/challenges/{challengeCode}")
    /* JADX INFO: renamed from: j */
    Object m21662j(@e57("challengeCode") String str, Continuation<? super ResultChallenge> continuation);

    @j17("api/v3/challenges/book_journey/leave/")
    /* JADX INFO: renamed from: k */
    Object m21663k(Continuation<? super m88> continuation);

    @mj3("api/v3/challenges/")
    /* JADX INFO: renamed from: n */
    Object m21664n(@sp7("eligibleLang") String str, @sp7("eligibleContextual") boolean z, @sp7("sort") String str2, @sp7("status") String str3, @sp7("status") String str4, @sp7("status") String str5, Continuation<? super Results<ResultChallenge>> continuation);

    @j17("api/v3/challenges/book_journey/participant-book-remove/")
    /* JADX INFO: renamed from: o */
    Object m21665o(@be0 RequestBookChallengeJoin requestBookChallengeJoin, Continuation<? super m88> continuation);

    @j17("api/v3/challenges/book_journey/participant-book/")
    /* JADX INFO: renamed from: p */
    Object m21666p(@be0 RequestBookChallengeJoin requestBookChallengeJoin, Continuation<? super m88> continuation);

    @j17("api/v3/challenges/{challengeCode}/join/")
    /* JADX INFO: renamed from: q */
    Object m21667q(@e57("challengeCode") String str, Continuation<? super m88> continuation);
}
