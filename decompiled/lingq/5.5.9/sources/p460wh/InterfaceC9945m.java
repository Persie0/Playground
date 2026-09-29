package p460wh;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultReferralStats;
import com.lingq.shared.network.result.ResultUserReferral;
import com.lingq.shared.network.result.Results;
import kotlin.Metadata;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7443t;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: wh.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m13365d2 = {"Lwh/m;", "", "", "page", "pageSize", "Lcom/lingq/shared/network/result/Results;", "Lcom/lingq/shared/network/result/ResultUserReferral;", "b", "(Ljava/lang/Integer;Ljava/lang/Integer;Lwl/c;)Ljava/lang/Object;", "Lcom/lingq/shared/network/result/ResultReferralStats;", "a", "(Lwl/c;)Ljava/lang/Object;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public interface InterfaceC9945m {
    @InterfaceC7429f("api/v2/referrals/stats/")
    /* JADX INFO: renamed from: a */
    Object m18519a(InterfaceC9968c<? super ResultReferralStats> interfaceC9968c);

    @InterfaceC7429f("api/v2/referrals/")
    /* JADX INFO: renamed from: b */
    Object m18520b(@InterfaceC7443t("page") Integer num, @InterfaceC7443t("page_size") Integer num2, InterfaceC9968c<? super Results<ResultUserReferral>> interfaceC9968c);
}
