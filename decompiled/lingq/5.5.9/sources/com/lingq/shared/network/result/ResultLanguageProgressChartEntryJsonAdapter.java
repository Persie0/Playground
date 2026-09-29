package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageProgressChartEntryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLanguageProgressChartEntry;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLanguageProgressChartEntryJsonAdapter extends AbstractC4949k<ResultLanguageProgressChartEntry> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18486a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18487b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f18488c;

    public ResultLanguageProgressChartEntryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18486a = JsonReader.C4932a.m10513a("name", "daily", "cumulative");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18487b = c4955q.m10565c(String.class, emptySet, "name");
        this.f18488c = c4955q.m10565c(Double.TYPE, emptySet, "daily");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLanguageProgressChartEntry mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        String strMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18486a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<Double> abstractC4949k = this.f18488c;
                if (iMo10512y0 == 1) {
                    dMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("daily", "daily", jsonReader);
                    }
                } else if (iMo10512y0 == 2 && (dMo9385a2 = abstractC4949k.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("cumulative", "cumulative", jsonReader);
                }
            } else {
                strMo9385a = this.f18487b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("name", "name", jsonReader);
                }
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        if (dMo9385a == null) {
            throw C9756b.m18248g("daily", "daily", jsonReader);
        }
        double dDoubleValue = dMo9385a.doubleValue();
        if (dMo9385a2 != null) {
            return new ResultLanguageProgressChartEntry(strMo9385a, dDoubleValue, dMo9385a2.doubleValue());
        }
        throw C9756b.m18248g("cumulative", "cumulative", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLanguageProgressChartEntry resultLanguageProgressChartEntry) throws IOException {
        ResultLanguageProgressChartEntry resultLanguageProgressChartEntry2 = resultLanguageProgressChartEntry;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLanguageProgressChartEntry2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("name");
        this.f18487b.mo9386f(abstractC9310n, resultLanguageProgressChartEntry2.f18483a);
        abstractC9310n.mo10551C("daily");
        Double dValueOf = Double.valueOf(resultLanguageProgressChartEntry2.f18484b);
        AbstractC4949k<Double> abstractC4949k = this.f18488c;
        abstractC4949k.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("cumulative");
        abstractC4949k.mo9386f(abstractC9310n, Double.valueOf(resultLanguageProgressChartEntry2.f18485c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(54, "GeneratedJsonAdapter(ResultLanguageProgressChartEntry)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
