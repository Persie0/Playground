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
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultCardReviewJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultCardReview;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultCardReviewJsonAdapter extends AbstractC4949k<ResultCardReview> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18309a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18310b;

    public ResultCardReviewJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18309a = JsonReader.C4932a.m10513a("srs_due_date", "status_changed_date");
        this.f18310b = c4955q.m10565c(String.class, EmptySet.f38034a, "srsDueDate");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultCardReview mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18309a);
            if (iMo10512y0 != -1) {
                AbstractC4949k<String> abstractC4949k = this.f18310b;
                if (iMo10512y0 == 0) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 1) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                }
            } else {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            }
        }
        jsonReader.mo10508q();
        return new ResultCardReview(strMo9385a, strMo9385a2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultCardReview resultCardReview) throws IOException {
        ResultCardReview resultCardReview2 = resultCardReview;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultCardReview2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("srs_due_date");
        String str = resultCardReview2.f18307a;
        AbstractC4949k<String> abstractC4949k = this.f18310b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("status_changed_date");
        abstractC4949k.mo9386f(abstractC9310n, resultCardReview2.f18308b);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ResultCardReview)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
