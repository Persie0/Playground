package p000;

import com.lingq.core.network.api.result.ResultReferralStats;
import com.lingq.core.network.api.result.ResultUserReferral;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface v38 {
    @mj3("api/v2/referrals/stats/")
    /* JADX INFO: renamed from: a */
    Object m23081a(Continuation<? super ResultReferralStats> continuation);

    @mj3("api/v2/referrals/")
    /* JADX INFO: renamed from: b */
    Object m23082b(@sp7("page") Integer num, @sp7("page_size") Integer num2, Continuation<? super Results<ResultUserReferral>> continuation);
}
