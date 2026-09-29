package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\u000fJo\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0003\u0010\n\u001a\u00020\u00052\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultFastSearch;", "", "", "Lcom/lingq/shared/network/result/FastSearchResult;", "results", "", "total", "", "", "totalAccents", "totalNative", "totalShelves", "totalTypes", "copy", "<init>", "(Ljava/util/List;ILjava/util/Map;ILjava/util/Map;Ljava/util/Map;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultFastSearch {

    /* JADX INFO: renamed from: a */
    public final List<FastSearchResult> f18427a;

    /* JADX INFO: renamed from: b */
    public final int f18428b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f18429c;

    /* JADX INFO: renamed from: d */
    public final int f18430d;

    /* JADX INFO: renamed from: e */
    public final Map<String, Integer> f18431e;

    /* JADX INFO: renamed from: f */
    public final Map<String, Integer> f18432f;

    public ResultFastSearch(@InterfaceC9303g(name = "results") List<FastSearchResult> list, @InterfaceC9303g(name = "total") int i10, @InterfaceC9303g(name = "total_accents") Map<String, Integer> map, @InterfaceC9303g(name = "total_native") int i11, @InterfaceC9303g(name = "total_shelves") Map<String, Integer> map2, @InterfaceC9303g(name = "total_types") Map<String, Integer> map3) {
        C5207g.m11111f(list, "results");
        C5207g.m11111f(map, "totalAccents");
        C5207g.m11111f(map2, "totalShelves");
        C5207g.m11111f(map3, "totalTypes");
        this.f18427a = list;
        this.f18428b = i10;
        this.f18429c = map;
        this.f18430d = i11;
        this.f18431e = map2;
        this.f18432f = map3;
    }

    public final ResultFastSearch copy(@InterfaceC9303g(name = "results") List<FastSearchResult> results, @InterfaceC9303g(name = "total") int total, @InterfaceC9303g(name = "total_accents") Map<String, Integer> totalAccents, @InterfaceC9303g(name = "total_native") int totalNative, @InterfaceC9303g(name = "total_shelves") Map<String, Integer> totalShelves, @InterfaceC9303g(name = "total_types") Map<String, Integer> totalTypes) {
        C5207g.m11111f(results, "results");
        C5207g.m11111f(totalAccents, "totalAccents");
        C5207g.m11111f(totalShelves, "totalShelves");
        C5207g.m11111f(totalTypes, "totalTypes");
        return new ResultFastSearch(results, total, totalAccents, totalNative, totalShelves, totalTypes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultFastSearch)) {
            return false;
        }
        ResultFastSearch resultFastSearch = (ResultFastSearch) obj;
        return C5207g.m11106a(this.f18427a, resultFastSearch.f18427a) && this.f18428b == resultFastSearch.f18428b && C5207g.m11106a(this.f18429c, resultFastSearch.f18429c) && this.f18430d == resultFastSearch.f18430d && C5207g.m11106a(this.f18431e, resultFastSearch.f18431e) && C5207g.m11106a(this.f18432f, resultFastSearch.f18432f);
    }

    public final int hashCode() {
        return this.f18432f.hashCode() + ((this.f18431e.hashCode() + C0009a.m16d(this.f18430d, (this.f18429c.hashCode() + C0009a.m16d(this.f18428b, this.f18427a.hashCode() * 31, 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ResultFastSearch(results=" + this.f18427a + ", total=" + this.f18428b + ", totalAccents=" + this.f18429c + ", totalNative=" + this.f18430d + ", totalShelves=" + this.f18431e + ", totalTypes=" + this.f18432f + ")";
    }
}
