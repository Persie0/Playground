package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestWordsUpdateJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestWordsUpdate;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestWordsUpdateJsonAdapter extends AbstractC4949k<RequestWordsUpdate> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18237a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18238b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Integer>> f18239c;

    public RequestWordsUpdateJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18237a = JsonReader.C4932a.m10513a("content_id", "words");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18238b = c4955q.m10565c(cls, emptySet, "contentId");
        this.f18239c = c4955q.m10565c(C9312p.m17659d(List.class, Integer.class), emptySet, "words");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestWordsUpdate mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        List<Integer> listMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18237a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18238b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("contentId", "content_id", jsonReader);
                }
            } else if (iMo10512y0 == 1 && (listMo9385a = this.f18239c.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("words", "words", jsonReader);
            }
        }
        jsonReader.mo10508q();
        RequestWordsUpdate requestWordsUpdate = new RequestWordsUpdate();
        requestWordsUpdate.f18236b = numMo9385a != null ? numMo9385a.intValue() : requestWordsUpdate.f18236b;
        if (listMo9385a == null) {
            listMo9385a = requestWordsUpdate.f18235a;
        }
        C5207g.m11111f(listMo9385a, "<set-?>");
        requestWordsUpdate.f18235a = listMo9385a;
        return requestWordsUpdate;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestWordsUpdate requestWordsUpdate) throws IOException {
        RequestWordsUpdate requestWordsUpdate2 = requestWordsUpdate;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestWordsUpdate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("content_id");
        this.f18238b.mo9386f(abstractC9310n, Integer.valueOf(requestWordsUpdate2.f18236b));
        abstractC9310n.mo10551C("words");
        this.f18239c.mo9386f(abstractC9310n, requestWordsUpdate2.f18235a);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(RequestWordsUpdate)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
