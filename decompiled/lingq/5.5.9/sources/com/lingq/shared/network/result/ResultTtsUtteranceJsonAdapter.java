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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTtsUtteranceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultTtsUtterance;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultTtsUtteranceJsonAdapter extends AbstractC4949k<ResultTtsUtterance> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19027a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f19028b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f19029c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<ResultLanguage> f19030d;

    public ResultTtsUtteranceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19027a = JsonReader.C4932a.m10513a("id", "audio", "app_name", "voice", "text", "language");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f19028b = c4955q.m10565c(cls, emptySet, "id");
        this.f19029c = c4955q.m10565c(String.class, emptySet, "audio");
        this.f19030d = c4955q.m10565c(ResultLanguage.class, emptySet, "language");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultTtsUtterance mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ResultLanguage resultLanguageMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f19027a);
            ResultLanguage resultLanguage = resultLanguageMo9385a;
            AbstractC4949k<String> abstractC4949k = this.f19029c;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f19028b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    String strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("audio", "audio", jsonReader);
                    }
                    str = strMo9385a;
                    break;
                    break;
                case 2:
                    String strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("appName", "app_name", jsonReader);
                    }
                    str2 = strMo9385a2;
                    break;
                    break;
                case 3:
                    String strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("voice", "voice", jsonReader);
                    }
                    str3 = strMo9385a3;
                    break;
                    break;
                case 4:
                    String strMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("text", "text", jsonReader);
                    }
                    str4 = strMo9385a4;
                    break;
                    break;
                case 5:
                    resultLanguageMo9385a = this.f19030d.mo9385a(jsonReader);
                    if (resultLanguageMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    continue;
                    break;
            }
            resultLanguageMo9385a = resultLanguage;
        }
        ResultLanguage resultLanguage2 = resultLanguageMo9385a;
        jsonReader.mo10508q();
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (str == null) {
            throw C9756b.m18248g("audio", "audio", jsonReader);
        }
        if (str2 == null) {
            throw C9756b.m18248g("appName", "app_name", jsonReader);
        }
        if (str3 == null) {
            throw C9756b.m18248g("voice", "voice", jsonReader);
        }
        if (str4 == null) {
            throw C9756b.m18248g("text", "text", jsonReader);
        }
        if (resultLanguage2 != null) {
            return new ResultTtsUtterance(iIntValue, str, str2, str3, str4, resultLanguage2);
        }
        throw C9756b.m18248g("language", "language", jsonReader);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultTtsUtterance resultTtsUtterance) throws IOException {
        ResultTtsUtterance resultTtsUtterance2 = resultTtsUtterance;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultTtsUtterance2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f19028b.mo9386f(abstractC9310n, Integer.valueOf(resultTtsUtterance2.f19021a));
        abstractC9310n.mo10551C("audio");
        String str = resultTtsUtterance2.f19022b;
        AbstractC4949k<String> abstractC4949k = this.f19029c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("app_name");
        abstractC4949k.mo9386f(abstractC9310n, resultTtsUtterance2.f19023c);
        abstractC9310n.mo10551C("voice");
        abstractC4949k.mo9386f(abstractC9310n, resultTtsUtterance2.f19024d);
        abstractC9310n.mo10551C("text");
        abstractC4949k.mo9386f(abstractC9310n, resultTtsUtterance2.f19025e);
        abstractC9310n.mo10551C("language");
        this.f19030d.mo9386f(abstractC9310n, resultTtsUtterance2.f19026f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ResultTtsUtterance)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
