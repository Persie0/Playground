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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestMoreLingQsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestMoreLingQs;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestMoreLingQsJsonAdapter extends AbstractC4949k<RequestMoreLingQs> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18130a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18131b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Long> f18132c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f18133d;

    public RequestMoreLingQsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18130a = JsonReader.C4932a.m10513a("amount", "timestamp", "signature");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18131b = c4955q.m10565c(cls, emptySet, "amount");
        this.f18132c = c4955q.m10565c(Long.TYPE, emptySet, "timestamp");
        this.f18133d = c4955q.m10565c(String.class, emptySet, "signature");
    }

    /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestMoreLingQs mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        Long lMo9385a = null;
        String strMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18130a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18131b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("amount", "amount", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                lMo9385a = this.f18132c.mo9385a(jsonReader);
                if (lMo9385a == null) {
                    throw C9756b.m18254m("timestamp", "timestamp", jsonReader);
                }
            } else if (iMo10512y0 == 2 && (strMo9385a = this.f18133d.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("signature", "signature", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (numMo9385a == null) {
            throw C9756b.m18248g("amount", "amount", jsonReader);
        }
        int iIntValue = numMo9385a.intValue();
        if (lMo9385a == null) {
            throw C9756b.m18248g("timestamp", "timestamp", jsonReader);
        }
        long jLongValue = lMo9385a.longValue();
        if (strMo9385a != null) {
            return new RequestMoreLingQs(strMo9385a, iIntValue, jLongValue);
        }
        throw C9756b.m18248g("signature", "signature", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestMoreLingQs requestMoreLingQs) throws IOException {
        RequestMoreLingQs requestMoreLingQs2 = requestMoreLingQs;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestMoreLingQs2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("amount");
        this.f18131b.mo9386f(abstractC9310n, Integer.valueOf(requestMoreLingQs2.f18127a));
        abstractC9310n.mo10551C("timestamp");
        this.f18132c.mo9386f(abstractC9310n, Long.valueOf(requestMoreLingQs2.f18128b));
        abstractC9310n.mo10551C("signature");
        this.f18133d.mo9386f(abstractC9310n, requestMoreLingQs2.f18129c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(39, "GeneratedJsonAdapter(RequestMoreLingQs)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
