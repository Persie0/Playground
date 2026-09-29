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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonBookmarkJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLessonBookmark;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLessonBookmarkJsonAdapter extends AbstractC4949k<ResultLessonBookmark> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18565a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18566b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18567c;

    public ResultLessonBookmarkJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18565a = JsonReader.C4932a.m10513a("wordIndex", "client", "timestamp", "languageTimestamp");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18566b = c4955q.m10565c(Integer.class, emptySet, "wordIndex");
        this.f18567c = c4955q.m10565c(String.class, emptySet, "client");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLessonBookmark mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        String strMo9385a3 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18565a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<String> abstractC4949k = this.f18567c;
                if (iMo10512y0 == 1) {
                    strMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 2) {
                    strMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 3) {
                    strMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                }
            } else {
                numMo9385a = this.f18566b.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        return new ResultLessonBookmark(strMo9385a, strMo9385a2, numMo9385a, strMo9385a3);
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLessonBookmark resultLessonBookmark) throws IOException {
        ResultLessonBookmark resultLessonBookmark2 = resultLessonBookmark;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLessonBookmark2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("wordIndex");
        this.f18566b.mo9386f(abstractC9310n, resultLessonBookmark2.f18561a);
        abstractC9310n.mo10551C("client");
        String str = resultLessonBookmark2.f18562b;
        AbstractC4949k<String> abstractC4949k = this.f18567c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("timestamp");
        abstractC4949k.mo9386f(abstractC9310n, resultLessonBookmark2.f18563c);
        abstractC9310n.mo10551C("languageTimestamp");
        abstractC4949k.mo9386f(abstractC9310n, resultLessonBookmark2.f18564d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultLessonBookmark)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
