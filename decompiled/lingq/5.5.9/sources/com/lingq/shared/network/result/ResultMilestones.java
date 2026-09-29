package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultMilestones;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultMilestones {

    /* JADX INFO: renamed from: a */
    public final ResultMilestoneStats f18782a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "pending")
    public final List<ResultMilestone> f18783b;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultMilestones() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ResultMilestones(ResultMilestoneStats resultMilestoneStats, List<ResultMilestone> list) {
        this.f18782a = resultMilestoneStats;
        this.f18783b = list;
    }

    public /* synthetic */ ResultMilestones(ResultMilestoneStats resultMilestoneStats, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : resultMilestoneStats, (i10 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestones)) {
            return false;
        }
        ResultMilestones resultMilestones = (ResultMilestones) obj;
        return C5207g.m11106a(this.f18782a, resultMilestones.f18782a) && C5207g.m11106a(this.f18783b, resultMilestones.f18783b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ResultMilestoneStats resultMilestoneStats = this.f18782a;
        int iHashCode2 = (resultMilestoneStats == null ? 0 : resultMilestoneStats.hashCode()) * 31;
        List<ResultMilestone> list = this.f18783b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "ResultMilestones(stats=" + this.f18782a + ", milestones=" + this.f18783b + ")";
    }
}
