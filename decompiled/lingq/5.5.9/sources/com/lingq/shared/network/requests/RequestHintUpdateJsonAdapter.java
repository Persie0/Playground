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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestHintUpdateJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestHintUpdate;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestHintUpdateJsonAdapter extends AbstractC4949k<RequestHintUpdate> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18074a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Boolean> f18075b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18076c;

    public RequestHintUpdateJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18074a = JsonReader.C4932a.m10513a("is_google_translate", "locale", "term", "text");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18075b = c4955q.m10565c(cls, emptySet, "isGoogleTranslate");
        this.f18076c = c4955q.m10565c(String.class, emptySet, "locale");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestHintUpdate mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Boolean boolMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18074a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<String> abstractC4949k = this.f18076c;
                if (iMo10512y0 == 1) {
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    z10 = true;
                } else if (iMo10512y0 == 2) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                    z11 = true;
                } else if (iMo10512y0 == 3) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    z12 = true;
                }
            } else {
                boolMo9385a = this.f18075b.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isGoogleTranslate", "is_google_translate", jsonReader);
                }
            }
        }
        jsonReader.mo10508q();
        RequestHintUpdate requestHintUpdate = new RequestHintUpdate();
        requestHintUpdate.f18073d = boolMo9385a != null ? boolMo9385a.booleanValue() : requestHintUpdate.f18073d;
        if (z10) {
            requestHintUpdate.f18070a = strMo9385a3;
        }
        if (z11) {
            requestHintUpdate.f18072c = strMo9385a;
        }
        if (z12) {
            requestHintUpdate.f18071b = strMo9385a2;
        }
        return requestHintUpdate;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestHintUpdate requestHintUpdate) throws IOException {
        RequestHintUpdate requestHintUpdate2 = requestHintUpdate;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestHintUpdate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("is_google_translate");
        this.f18075b.mo9386f(abstractC9310n, Boolean.valueOf(requestHintUpdate2.f18073d));
        abstractC9310n.mo10551C("locale");
        String str = requestHintUpdate2.f18070a;
        AbstractC4949k<String> abstractC4949k = this.f18076c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("term");
        abstractC4949k.mo9386f(abstractC9310n, requestHintUpdate2.f18072c);
        abstractC9310n.mo10551C("text");
        abstractC4949k.mo9386f(abstractC9310n, requestHintUpdate2.f18071b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(RequestHintUpdate)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
