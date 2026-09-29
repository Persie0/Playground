package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageProgressChartEntry;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLanguageProgressChartEntry {

    /* JADX INFO: renamed from: a */
    public final String f18483a;

    /* JADX INFO: renamed from: b */
    public final double f18484b;

    /* JADX INFO: renamed from: c */
    public final double f18485c;

    public ResultLanguageProgressChartEntry(String str, double d10, double d11) {
        this.f18483a = str;
        this.f18484b = d10;
        this.f18485c = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageProgressChartEntry)) {
            return false;
        }
        ResultLanguageProgressChartEntry resultLanguageProgressChartEntry = (ResultLanguageProgressChartEntry) obj;
        return C5207g.m11106a(this.f18483a, resultLanguageProgressChartEntry.f18483a) && Double.compare(this.f18484b, resultLanguageProgressChartEntry.f18484b) == 0 && Double.compare(this.f18485c, resultLanguageProgressChartEntry.f18485c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f18485c) + C0141b.m609e(this.f18484b, this.f18483a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ResultLanguageProgressChartEntry(name=" + this.f18483a + ", daily=" + this.f18484b + ", cumulative=" + this.f18485c + ")";
    }
}
