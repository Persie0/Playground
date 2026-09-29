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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLanguage;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLanguageJsonAdapter extends AbstractC4949k<ResultLanguage> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18462a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18463b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18464c;

    public ResultLanguageJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18462a = JsonReader.C4932a.m10513a("id", "code", "url", "title");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18463b = c4955q.m10565c(cls, emptySet, "id");
        this.f18464c = c4955q.m10565c(String.class, emptySet, "code");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLanguage mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18462a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<String> abstractC4949k = this.f18464c;
                if (iMo10512y0 == 1) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                } else if (iMo10512y0 == 2) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("url", "url", jsonReader);
                    }
                } else if (iMo10512y0 == 3 && (strMo9385a3 = abstractC4949k.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
            } else {
                numMo9385a = this.f18463b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
            }
        }
        jsonReader.mo10508q();
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("url", "url", jsonReader);
        }
        if (strMo9385a3 != null) {
            return new ResultLanguage(strMo9385a, iIntValue, strMo9385a2, strMo9385a3);
        }
        throw C9756b.m18248g("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLanguage resultLanguage) throws IOException {
        ResultLanguage resultLanguage2 = resultLanguage;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLanguage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        this.f18463b.mo9386f(abstractC9310n, Integer.valueOf(resultLanguage2.f18437a));
        abstractC9310n.mo10551C("code");
        String str = resultLanguage2.f18438b;
        AbstractC4949k<String> abstractC4949k = this.f18464c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("url");
        abstractC4949k.mo9386f(abstractC9310n, resultLanguage2.f18439c);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, resultLanguage2.f18440d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(ResultLanguage)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
