package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultFastSearchJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultFastSearch;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultFastSearchJsonAdapter extends AbstractC4949k<ResultFastSearch> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18433a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<FastSearchResult>> f18434b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18435c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Map<String, Integer>> f18436d;

    public ResultFastSearchJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18433a = JsonReader.C4932a.m10513a("results", "total", "total_accents", "total_native", "total_shelves", "total_types");
        C9756b.b bVarM17659d = C9312p.m17659d(List.class, FastSearchResult.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f18434b = c4955q.m10565c(bVarM17659d, emptySet, "results");
        this.f18435c = c4955q.m10565c(Integer.TYPE, emptySet, "total");
        this.f18436d = c4955q.m10565c(C9312p.m17659d(Map.class, String.class, Integer.class), emptySet, "totalAccents");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultFastSearch mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        List<FastSearchResult> listMo9385a = null;
        Map<String, Integer> map = null;
        Map<String, Integer> mapMo9385a = null;
        Map<String, Integer> mapMo9385a2 = null;
        while (true) {
            Map<String, Integer> map2 = mapMo9385a2;
            Map<String, Integer> map3 = mapMo9385a;
            Integer num = numMo9385a;
            if (!jsonReader.mo10511w()) {
                Integer num2 = numMo9385a2;
                Map<String, Integer> map4 = map;
                jsonReader.mo10508q();
                if (listMo9385a == null) {
                    throw C9756b.m18248g("results", "results", jsonReader);
                }
                if (num2 == null) {
                    throw C9756b.m18248g("total", "total", jsonReader);
                }
                int iIntValue = num2.intValue();
                if (map4 == null) {
                    throw C9756b.m18248g("totalAccents", "total_accents", jsonReader);
                }
                if (num == null) {
                    throw C9756b.m18248g("totalNative", "total_native", jsonReader);
                }
                int iIntValue2 = num.intValue();
                if (map3 == null) {
                    throw C9756b.m18248g("totalShelves", "total_shelves", jsonReader);
                }
                if (map2 != null) {
                    return new ResultFastSearch(listMo9385a, iIntValue, map4, iIntValue2, map3, map2);
                }
                throw C9756b.m18248g("totalTypes", "total_types", jsonReader);
            }
            int iMo10512y0 = jsonReader.mo10512y0(this.f18433a);
            Map<String, Integer> map5 = map;
            AbstractC4949k<Integer> abstractC4949k = this.f18435c;
            Integer num3 = numMo9385a2;
            AbstractC4949k<Map<String, Integer>> abstractC4949k2 = this.f18436d;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    numMo9385a = num;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    listMo9385a = this.f18434b.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("results", "results", jsonReader);
                    }
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    numMo9385a = num;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
                case 1:
                    numMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("total", "total", jsonReader);
                    }
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    numMo9385a = num;
                    map = map5;
                    break;
                    break;
                case 2:
                    Map<String, Integer> mapMo9385a3 = abstractC4949k2.mo9385a(jsonReader);
                    if (mapMo9385a3 == null) {
                        throw C9756b.m18254m("totalAccents", "total_accents", jsonReader);
                    }
                    map = mapMo9385a3;
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    numMo9385a = num;
                    numMo9385a2 = num3;
                    break;
                    break;
                case 3:
                    numMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("totalNative", "total_native", jsonReader);
                    }
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
                    break;
                case 4:
                    mapMo9385a = abstractC4949k2.mo9385a(jsonReader);
                    if (mapMo9385a == null) {
                        throw C9756b.m18254m("totalShelves", "total_shelves", jsonReader);
                    }
                    mapMo9385a2 = map2;
                    numMo9385a = num;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
                    break;
                case 5:
                    mapMo9385a2 = abstractC4949k2.mo9385a(jsonReader);
                    if (mapMo9385a2 == null) {
                        throw C9756b.m18254m("totalTypes", "total_types", jsonReader);
                    }
                    mapMo9385a = map3;
                    numMo9385a = num;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
                default:
                    mapMo9385a2 = map2;
                    mapMo9385a = map3;
                    numMo9385a = num;
                    map = map5;
                    numMo9385a2 = num3;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultFastSearch resultFastSearch) throws IOException {
        ResultFastSearch resultFastSearch2 = resultFastSearch;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultFastSearch2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("results");
        this.f18434b.mo9386f(abstractC9310n, resultFastSearch2.f18427a);
        abstractC9310n.mo10551C("total");
        Integer numValueOf = Integer.valueOf(resultFastSearch2.f18428b);
        AbstractC4949k<Integer> abstractC4949k = this.f18435c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("total_accents");
        Map<String, Integer> map = resultFastSearch2.f18429c;
        AbstractC4949k<Map<String, Integer>> abstractC4949k2 = this.f18436d;
        abstractC4949k2.mo9386f(abstractC9310n, map);
        abstractC9310n.mo10551C("total_native");
        C0166e.m775v(resultFastSearch2.f18430d, abstractC4949k, abstractC9310n, "total_shelves");
        abstractC4949k2.mo9386f(abstractC9310n, resultFastSearch2.f18431e);
        abstractC9310n.mo10551C("total_types");
        abstractC4949k2.mo9386f(abstractC9310n, resultFastSearch2.f18432f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ResultFastSearch)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
