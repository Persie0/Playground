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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonUpdateSaveJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestLessonUpdateSave;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestLessonUpdateSaveJsonAdapter extends AbstractC4949k<RequestLessonUpdateSave> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18112a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18113b;

    public RequestLessonUpdateSaveJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18112a = JsonReader.C4932a.m10513a("lesson");
        this.f18113b = c4955q.m10565c(Integer.TYPE, EmptySet.f38034a, "lesson");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestLessonUpdateSave mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18112a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0 && (numMo9385a = this.f18113b.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("lesson", "lesson", jsonReader);
            }
        }
        jsonReader.mo10508q();
        RequestLessonUpdateSave requestLessonUpdateSave = new RequestLessonUpdateSave();
        requestLessonUpdateSave.f18111a = numMo9385a != null ? numMo9385a.intValue() : requestLessonUpdateSave.f18111a;
        return requestLessonUpdateSave;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestLessonUpdateSave requestLessonUpdateSave) throws IOException {
        RequestLessonUpdateSave requestLessonUpdateSave2 = requestLessonUpdateSave;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestLessonUpdateSave2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("lesson");
        this.f18113b.mo9386f(abstractC9310n, Integer.valueOf(requestLessonUpdateSave2.f18111a));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(45, "GeneratedJsonAdapter(RequestLessonUpdateSave)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
