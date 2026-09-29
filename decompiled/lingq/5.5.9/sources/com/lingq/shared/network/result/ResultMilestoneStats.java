package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultMilestoneStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultMilestoneStats {

    /* JADX INFO: renamed from: a */
    @InterfaceC9303g(name = "known_words")
    public final int f18776a;

    /* JADX INFO: renamed from: b */
    public final int f18777b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "daily_score")
    public final int f18778c;

    public ResultMilestoneStats() {
        this(0, 0, 0, 7, null);
    }

    public ResultMilestoneStats(int i10, int i11, int i12) {
        this.f18776a = i10;
        this.f18777b = i11;
        this.f18778c = i12;
    }

    public /* synthetic */ ResultMilestoneStats(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestoneStats)) {
            return false;
        }
        ResultMilestoneStats resultMilestoneStats = (ResultMilestoneStats) obj;
        return this.f18776a == resultMilestoneStats.f18776a && this.f18777b == resultMilestoneStats.f18777b && this.f18778c == resultMilestoneStats.f18778c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18778c) + C0009a.m16d(this.f18777b, Integer.hashCode(this.f18776a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultMilestoneStats(knownWords=");
        sb2.append(this.f18776a);
        sb2.append(", lingqs=");
        sb2.append(this.f18777b);
        sb2.append(", dailyScore=");
        return C0166e.m768o(sb2, this.f18778c, ")");
    }
}
