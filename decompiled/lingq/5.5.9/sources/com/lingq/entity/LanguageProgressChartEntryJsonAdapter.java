package com.lingq.entity;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageProgressChartEntryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LanguageProgressChartEntry;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageProgressChartEntryJsonAdapter extends AbstractC4949k<LanguageProgressChartEntry> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17057a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17058b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f17059c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f17060d;

    public LanguageProgressChartEntryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17057a = JsonReader.C4932a.m10513a("metric", "languageCode", "period", "name", "daily", "cumulative", "position");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17058b = c4955q.m10565c(String.class, emptySet, "metric");
        this.f17059c = c4955q.m10565c(Double.TYPE, emptySet, "daily");
        this.f17060d = c4955q.m10565c(Integer.TYPE, emptySet, "position");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageProgressChartEntry mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        Double dMo9385a = null;
        Double d10 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        while (true) {
            Integer num = numMo9385a;
            if (!jsonReader.mo10511w()) {
                Double d11 = dMo9385a;
                Double d12 = d10;
                jsonReader.mo10508q();
                if (strMo9385a == null) {
                    throw C9756b.m18248g("metric", "metric", jsonReader);
                }
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("languageCode", "languageCode", jsonReader);
                }
                if (strMo9385a3 == null) {
                    throw C9756b.m18248g("period", "period", jsonReader);
                }
                if (strMo9385a4 == null) {
                    throw C9756b.m18248g("name", "name", jsonReader);
                }
                if (d11 == null) {
                    throw C9756b.m18248g("daily", "daily", jsonReader);
                }
                double dDoubleValue = d11.doubleValue();
                if (d12 == null) {
                    throw C9756b.m18248g("cumulative", "cumulative", jsonReader);
                }
                double dDoubleValue2 = d12.doubleValue();
                if (num != null) {
                    return new LanguageProgressChartEntry(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, dDoubleValue, dDoubleValue2, num.intValue());
                }
                throw C9756b.m18248g("position", "position", jsonReader);
            }
            int iMo10512y0 = jsonReader.mo10512y0(this.f17057a);
            Double d13 = d10;
            AbstractC4949k<Double> abstractC4949k = this.f17059c;
            Double d14 = dMo9385a;
            AbstractC4949k<String> abstractC4949k2 = this.f17058b;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = abstractC4949k2.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("metric", "metric", jsonReader);
                    }
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                case 1:
                    strMo9385a2 = abstractC4949k2.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("languageCode", "languageCode", jsonReader);
                    }
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                case 2:
                    strMo9385a3 = abstractC4949k2.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("period", "period", jsonReader);
                    }
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                case 3:
                    strMo9385a4 = abstractC4949k2.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                case 4:
                    dMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (dMo9385a == null) {
                        throw C9756b.m18254m("daily", "daily", jsonReader);
                    }
                    numMo9385a = num;
                    d10 = d13;
                    break;
                    break;
                case 5:
                    Double dMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (dMo9385a2 == null) {
                        throw C9756b.m18254m("cumulative", "cumulative", jsonReader);
                    }
                    d10 = dMo9385a2;
                    numMo9385a = num;
                    dMo9385a = d14;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a = this.f17060d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("position", "position", jsonReader);
                    }
                    d10 = d13;
                    dMo9385a = d14;
                    break;
                default:
                    numMo9385a = num;
                    d10 = d13;
                    dMo9385a = d14;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageProgressChartEntry languageProgressChartEntry) throws IOException {
        LanguageProgressChartEntry languageProgressChartEntry2 = languageProgressChartEntry;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageProgressChartEntry2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("metric");
        String str = languageProgressChartEntry2.f17050a;
        AbstractC4949k<String> abstractC4949k = this.f17058b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("languageCode");
        abstractC4949k.mo9386f(abstractC9310n, languageProgressChartEntry2.f17051b);
        abstractC9310n.mo10551C("period");
        abstractC4949k.mo9386f(abstractC9310n, languageProgressChartEntry2.f17052c);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, languageProgressChartEntry2.f17053d);
        abstractC9310n.mo10551C("daily");
        Double dValueOf = Double.valueOf(languageProgressChartEntry2.f17054e);
        AbstractC4949k<Double> abstractC4949k2 = this.f17059c;
        abstractC4949k2.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("cumulative");
        C0204c.m859s(languageProgressChartEntry2.f17055f, abstractC4949k2, abstractC9310n, "position");
        this.f17060d.mo9386f(abstractC9310n, Integer.valueOf(languageProgressChartEntry2.f17056g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(48, "GeneratedJsonAdapter(LanguageProgressChartEntry)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
