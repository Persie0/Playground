package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultReferralStats;", "", "", "earnedPoints", "lastMonthPoints", "referralsCount", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/lingq/shared/network/result/ResultReferralStats;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultReferralStats {

    /* JADX INFO: renamed from: a */
    public final Integer f18912a;

    /* JADX INFO: renamed from: b */
    public final Integer f18913b;

    /* JADX INFO: renamed from: c */
    public final Integer f18914c;

    public ResultReferralStats() {
        this(null, null, null, 7, null);
    }

    public ResultReferralStats(@InterfaceC9303g(name = "earned_points") Integer num, @InterfaceC9303g(name = "last_month_points") Integer num2, @InterfaceC9303g(name = "referrals_count") Integer num3) {
        this.f18912a = num;
        this.f18913b = num2;
        this.f18914c = num3;
    }

    public /* synthetic */ ResultReferralStats(Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3);
    }

    public final ResultReferralStats copy(@InterfaceC9303g(name = "earned_points") Integer earnedPoints, @InterfaceC9303g(name = "last_month_points") Integer lastMonthPoints, @InterfaceC9303g(name = "referrals_count") Integer referralsCount) {
        return new ResultReferralStats(earnedPoints, lastMonthPoints, referralsCount);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultReferralStats)) {
            return false;
        }
        ResultReferralStats resultReferralStats = (ResultReferralStats) obj;
        return C5207g.m11106a(this.f18912a, resultReferralStats.f18912a) && C5207g.m11106a(this.f18913b, resultReferralStats.f18913b) && C5207g.m11106a(this.f18914c, resultReferralStats.f18914c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f18912a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f18913b;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18914c;
        if (num3 != null) {
            iHashCode = num3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        return "ResultReferralStats(earnedPoints=" + this.f18912a + ", lastMonthPoints=" + this.f18913b + ", referralsCount=" + this.f18914c + ")";
    }
}
