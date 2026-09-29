package com.lingq.shared.network.requests;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslateJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestTranslate;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestTranslateJsonAdapter extends AbstractC4949k<RequestTranslate> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18192a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18193b;

    public RequestTranslateJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18192a = JsonReader.C4932a.m10513a("source", "target", "text");
        this.f18193b = c4955q.m10565c(String.class, EmptySet.f38034a, "source");
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestTranslate mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18192a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f18193b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("source", "source", jsonReader);
                    }
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("target", "target", jsonReader);
                    }
                } else if (iMo10512y0 == 2 && (strMo9385a3 = abstractC4949k.mo9385a(jsonReader)) == null) {
                    throw C9756b.m18254m("text", "text", jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a == null) {
            throw C9756b.m18248g("source", "source", jsonReader);
        }
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("target", "target", jsonReader);
        }
        if (strMo9385a3 != null) {
            return new RequestTranslate(strMo9385a, strMo9385a2, strMo9385a3);
        }
        throw C9756b.m18248g("text", "text", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestTranslate requestTranslate) throws IOException {
        RequestTranslate requestTranslate2 = requestTranslate;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestTranslate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("source");
        String str = requestTranslate2.f18189a;
        AbstractC4949k<String> abstractC4949k = this.f18193b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("target");
        abstractC4949k.mo9386f(abstractC9310n, requestTranslate2.f18190b);
        abstractC9310n.mo10551C("text");
        abstractC4949k.mo9386f(abstractC9310n, requestTranslate2.f18191c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(RequestTranslate)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
