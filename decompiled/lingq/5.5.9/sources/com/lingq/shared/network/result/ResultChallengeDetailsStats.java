package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeDetailsStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultChallengeDetailsStats {

    /* JADX INFO: renamed from: a */
    public final String f18333a;

    /* JADX INFO: renamed from: b */
    public final int f18334b;

    /* JADX INFO: renamed from: c */
    public final String f18335c;

    public ResultChallengeDetailsStats(String str, int i10, String str2) {
        this.f18333a = str;
        this.f18334b = i10;
        this.f18335c = str2;
    }

    public /* synthetic */ ResultChallengeDetailsStats(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i10, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallengeDetailsStats)) {
            return false;
        }
        ResultChallengeDetailsStats resultChallengeDetailsStats = (ResultChallengeDetailsStats) obj;
        return C5207g.m11106a(this.f18333a, resultChallengeDetailsStats.f18333a) && this.f18334b == resultChallengeDetailsStats.f18334b && C5207g.m11106a(this.f18335c, resultChallengeDetailsStats.f18335c);
    }

    public final int hashCode() {
        String str = this.f18333a;
        int iM16d = C0009a.m16d(this.f18334b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f18335c;
        return iM16d + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultChallengeDetailsStats(code=");
        sb2.append(this.f18333a);
        sb2.append(", value=");
        sb2.append(this.f18334b);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f18335c, ")");
    }
}
