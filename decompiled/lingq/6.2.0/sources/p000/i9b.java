package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.worldcup.ResultCupClaim;
import com.lingq.core.network.api.result.worldcup.ResultCupJoin;
import com.lingq.core.network.api.result.worldcup.ResultCupJoinRequest;
import com.lingq.core.network.api.result.worldcup.ResultCupPrizes;
import com.lingq.core.network.api.result.worldcup.ResultCupSummary;
import com.lingq.core.network.api.result.worldcup.ResultCupTopContributors;
import com.lingq.core.network.api.result.worldcup.ResultCupTopTeams;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface i9b {
    @j17("api/v3/world-cup/prizes/claim/")
    /* JADX INFO: renamed from: a */
    Object m13737a(Continuation<? super i88<ResultCupClaim>> continuation);

    @mj3("api/v3/world-cup/top-contributors/")
    /* JADX INFO: renamed from: b */
    Object m13738b(Continuation<? super NetworkResponse<ResultCupTopContributors>> continuation);

    @j17("api/v3/world-cup/join/")
    /* JADX INFO: renamed from: c */
    Object m13739c(@be0 ResultCupJoinRequest resultCupJoinRequest, Continuation<? super i88<ResultCupJoin>> continuation);

    @mj3("api/v3/world-cup/top-contributors/{languageCode}/")
    /* JADX INFO: renamed from: d */
    Object m13740d(@e57("languageCode") String str, Continuation<? super NetworkResponse<ResultCupTopContributors>> continuation);

    @mj3("api/v3/world-cup/top-teams/")
    /* JADX INFO: renamed from: e */
    Object m13741e(Continuation<? super NetworkResponse<ResultCupTopTeams>> continuation);

    @mj3("api/v3/world-cup/")
    /* JADX INFO: renamed from: f */
    Object m13742f(Continuation<? super NetworkResponse<ResultCupSummary>> continuation);

    @mj3("api/v3/world-cup/prizes/")
    /* JADX INFO: renamed from: g */
    Object m13743g(Continuation<? super NetworkResponse<ResultCupPrizes>> continuation);
}
