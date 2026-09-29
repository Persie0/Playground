package com.lingq.shared.network.requests;

import android.support.v4.media.C0141b;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonUpdateStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestLessonUpdateStats {

    /* JADX INFO: renamed from: a */
    public final double f18114a;

    /* JADX INFO: renamed from: b */
    public final double f18115b;

    /* JADX INFO: renamed from: c */
    public final boolean f18116c;

    public RequestLessonUpdateStats(double d10, double d11, boolean z10) {
        this.f18114a = d10;
        this.f18115b = d11;
        this.f18116c = z10;
    }

    public /* synthetic */ RequestLessonUpdateStats(double d10, double d11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLessonUpdateStats)) {
            return false;
        }
        RequestLessonUpdateStats requestLessonUpdateStats = (RequestLessonUpdateStats) obj;
        return Double.compare(this.f18114a, requestLessonUpdateStats.f18114a) == 0 && Double.compare(this.f18115b, requestLessonUpdateStats.f18115b) == 0 && this.f18116c == requestLessonUpdateStats.f18116c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM609e = C0141b.m609e(this.f18115b, Double.hashCode(this.f18114a) * 31, 31);
        boolean z10 = this.f18116c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM609e + r10;
    }

    public final String toString() {
        return "RequestLessonUpdateStats(readTimes=" + this.f18114a + ", listenTimes=" + this.f18115b + ", automatic=" + this.f18116c + ")";
    }
}
