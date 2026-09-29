package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageProgressChartEntryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserLanguageProgressChartEntry;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserLanguageProgressChartEntryJsonAdapter extends AbstractC4949k<UserLanguageProgressChartEntry> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21777a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21778b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f21779c;

    public UserLanguageProgressChartEntryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21777a = JsonReader.C4932a.m10513a("metric", "languageCode", "name", "daily", "cumulative");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21778b = c4955q.m10565c(String.class, emptySet, "metric");
        this.f21779c = c4955q.m10565c(Double.TYPE, emptySet, "daily");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserLanguageProgressChartEntry mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21777a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f21778b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("metric", "metric", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("languageCode", "languageCode", jsonReader);
                    }
                } else if (iMo10512y0 != 2) {
                    AbstractC4949k<Double> abstractC4949k2 = this.f21779c;
                    if (iMo10512y0 == 3) {
                        dMo9385a = abstractC4949k2.mo9385a(jsonReader);
                        if (dMo9385a == null) {
                            throw C9756b.m18254m("daily", "daily", jsonReader);
                        }
                    } else if (iMo10512y0 == 4 && (dMo9385a2 = abstractC4949k2.mo9385a(jsonReader)) == null) {
                        throw C9756b.m18254m("cumulative", "cumulative", jsonReader);
                    }
                } else {
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("metric", "metric", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("languageCode", "languageCode", jsonReader);
        }
        if (strMo9385a3 == null) {
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        if (dMo9385a == null) {
            throw C9756b.m18248g("daily", "daily", jsonReader);
        }
        double dDoubleValue = dMo9385a.doubleValue();
        if (dMo9385a2 != null) {
            return new UserLanguageProgressChartEntry(strMo9385a, strMo9385a2, strMo9385a3, dDoubleValue, dMo9385a2.doubleValue());
        }
        throw C9756b.m18248g("cumulative", "cumulative", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserLanguageProgressChartEntry userLanguageProgressChartEntry) throws IOException {
        UserLanguageProgressChartEntry userLanguageProgressChartEntry2 = userLanguageProgressChartEntry;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userLanguageProgressChartEntry2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("metric");
        String str = userLanguageProgressChartEntry2.f21772a;
        AbstractC4949k<String> abstractC4949k = this.f21778b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("languageCode");
        abstractC4949k.mo9386f(abstractC9310n, userLanguageProgressChartEntry2.f21773b);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, userLanguageProgressChartEntry2.f21774c);
        abstractC9310n.mo10551C("daily");
        Double dValueOf = Double.valueOf(userLanguageProgressChartEntry2.f21775d);
        AbstractC4949k<Double> abstractC4949k2 = this.f21779c;
        abstractC4949k2.mo9386f(abstractC9310n, dValueOf);
        abstractC9310n.mo10551C("cumulative");
        abstractC4949k2.mo9386f(abstractC9310n, Double.valueOf(userLanguageProgressChartEntry2.f21776e));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(52, "GeneratedJsonAdapter(UserLanguageProgressChartEntry)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
