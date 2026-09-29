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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestBookmarkLessonJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestBookmarkLesson;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestBookmarkLessonJsonAdapter extends AbstractC4949k<RequestBookmarkLesson> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18033a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18034b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18035c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18036d;

    public RequestBookmarkLessonJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18033a = JsonReader.C4932a.m10513a("client", "timestamp", "wordIndex");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18034b = c4955q.m10565c(String.class, emptySet, "client");
        this.f18035c = c4955q.m10565c(String.class, emptySet, "timestamp");
        this.f18036d = c4955q.m10565c(Integer.TYPE, emptySet, "wordIndex");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestBookmarkLesson mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Integer numMo9385a = null;
        boolean z10 = false;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18033a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18034b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("client", "client", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f18035c.mo9385a(jsonReader);
                z10 = true;
            } else if (iMo10512y0 == 2 && (numMo9385a = this.f18036d.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("wordIndex", "wordIndex", jsonReader);
            }
        }
        jsonReader.mo10508q();
        RequestBookmarkLesson requestBookmarkLesson = new RequestBookmarkLesson();
        if (strMo9385a == null) {
            strMo9385a = requestBookmarkLesson.f18032c;
        }
        C5207g.m11111f(strMo9385a, "<set-?>");
        requestBookmarkLesson.f18032c = strMo9385a;
        if (z10) {
            requestBookmarkLesson.f18031b = strMo9385a2;
        }
        requestBookmarkLesson.f18030a = numMo9385a != null ? numMo9385a.intValue() : requestBookmarkLesson.f18030a;
        return requestBookmarkLesson;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestBookmarkLesson requestBookmarkLesson) throws IOException {
        RequestBookmarkLesson requestBookmarkLesson2 = requestBookmarkLesson;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestBookmarkLesson2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("client");
        this.f18034b.mo9386f(abstractC9310n, requestBookmarkLesson2.f18032c);
        abstractC9310n.mo10551C("timestamp");
        this.f18035c.mo9386f(abstractC9310n, requestBookmarkLesson2.f18031b);
        abstractC9310n.mo10551C("wordIndex");
        this.f18036d.mo9386f(abstractC9310n, Integer.valueOf(requestBookmarkLesson2.f18030a));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(RequestBookmarkLesson)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
