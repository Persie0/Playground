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
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLanguageProgressJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestLanguageProgress;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestLanguageProgressJsonAdapter extends AbstractC4949k<RequestLanguageProgress> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18095a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Double> f18096b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18097c;

    public RequestLanguageProgressJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18095a = JsonReader.C4932a.m10513a("listeningTime", "readWords", "speakingTime", "writtenWords");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18096b = c4955q.m10565c(Double.class, emptySet, "listeningTime");
        this.f18097c = c4955q.m10565c(Integer.class, emptySet, "readWords");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestLanguageProgress mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        Integer numMo9385a = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        Integer numMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18095a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<Double> abstractC4949k = this.f18096b;
                if (iMo10512y0 != 0) {
                    AbstractC4949k<Integer> abstractC4949k2 = this.f18097c;
                    if (iMo10512y0 == 1) {
                        numMo9385a2 = abstractC4949k2.mo9385a(jsonReader);
                        z11 = true;
                    } else if (iMo10512y0 == 2) {
                        dMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                        z12 = true;
                    } else if (iMo10512y0 == 3) {
                        numMo9385a = abstractC4949k2.mo9385a(jsonReader);
                        z13 = true;
                    }
                } else {
                    dMo9385a = abstractC4949k.mo9385a(jsonReader);
                    z10 = true;
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        RequestLanguageProgress requestLanguageProgress = new RequestLanguageProgress();
        if (z10) {
            requestLanguageProgress.f18091a = dMo9385a;
        }
        if (z11) {
            requestLanguageProgress.f18094d = numMo9385a2;
        }
        if (z12) {
            requestLanguageProgress.f18092b = dMo9385a2;
        }
        if (z13) {
            requestLanguageProgress.f18093c = numMo9385a;
        }
        return requestLanguageProgress;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestLanguageProgress requestLanguageProgress) throws IOException {
        RequestLanguageProgress requestLanguageProgress2 = requestLanguageProgress;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestLanguageProgress2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("listeningTime");
        Double d10 = requestLanguageProgress2.f18091a;
        AbstractC4949k<Double> abstractC4949k = this.f18096b;
        abstractC4949k.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("readWords");
        Integer num = requestLanguageProgress2.f18094d;
        AbstractC4949k<Integer> abstractC4949k2 = this.f18097c;
        abstractC4949k2.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("speakingTime");
        abstractC4949k.mo9386f(abstractC9310n, requestLanguageProgress2.f18092b);
        abstractC9310n.mo10551C("writtenWords");
        abstractC4949k2.mo9386f(abstractC9310n, requestLanguageProgress2.f18093c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(45, "GeneratedJsonAdapter(RequestLanguageProgress)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
