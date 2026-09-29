package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/MilestoneStats;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class MilestoneStats {

    /* JADX INFO: renamed from: a */
    public final String f17315a;

    /* JADX INFO: renamed from: b */
    public final int f17316b;

    /* JADX INFO: renamed from: c */
    public final int f17317c;

    /* JADX INFO: renamed from: d */
    public final int f17318d;

    public MilestoneStats(String str, int i10, int i11, int i12) {
        C5207g.m11111f(str, "language");
        this.f17315a = str;
        this.f17316b = i10;
        this.f17317c = i11;
        this.f17318d = i12;
    }

    public /* synthetic */ MilestoneStats(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MilestoneStats)) {
            return false;
        }
        MilestoneStats milestoneStats = (MilestoneStats) obj;
        if (C5207g.m11106a(this.f17315a, milestoneStats.f17315a) && this.f17316b == milestoneStats.f17316b && this.f17317c == milestoneStats.f17317c && this.f17318d == milestoneStats.f17318d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17318d) + C0009a.m16d(this.f17317c, C0009a.m16d(this.f17316b, this.f17315a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MilestoneStats(language=");
        sb2.append(this.f17315a);
        sb2.append(", knownWords=");
        sb2.append(this.f17316b);
        sb2.append(", lingqs=");
        sb2.append(this.f17317c);
        sb2.append(", dailyScore=");
        return C0166e.m768o(sb2, this.f17318d, ")");
    }
}
