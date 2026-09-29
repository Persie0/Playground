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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestDictionariesAddJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestDictionariesAdd;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestDictionariesAddJsonAdapter extends AbstractC4949k<RequestDictionariesAdd> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18061a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18062b;

    public RequestDictionariesAddJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18061a = JsonReader.C4932a.m10513a("translationId");
        this.f18062b = c4955q.m10565c(Integer.TYPE, EmptySet.f38034a, "translationId");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestDictionariesAdd mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18061a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0 && (numMo9385a = this.f18062b.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("translationId", "translationId", jsonReader);
            }
        }
        jsonReader.mo10508q();
        RequestDictionariesAdd requestDictionariesAdd = new RequestDictionariesAdd();
        requestDictionariesAdd.f18060a = numMo9385a != null ? numMo9385a.intValue() : requestDictionariesAdd.f18060a;
        return requestDictionariesAdd;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestDictionariesAdd requestDictionariesAdd) throws IOException {
        RequestDictionariesAdd requestDictionariesAdd2 = requestDictionariesAdd;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestDictionariesAdd2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("translationId");
        this.f18062b.mo9386f(abstractC9310n, Integer.valueOf(requestDictionariesAdd2.f18060a));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(RequestDictionariesAdd)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
